package com.scoremg.api;

import com.scoremg.entity.contants.Constants;
import com.scoremg.entity.dto.CreateImageCode;
import com.scoremg.entity.dto.WebSessionUserDto;
import com.scoremg.entity.vo.ResponseVO;
import com.scoremg.exception.BusinessException;
import com.scoremg.service.UserInfoService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;
import java.io.IOException;

/**
 * @program: scoremg
 * @description:
 * @author: 陈程猿
 * @create: 2024-12-18 23:23
 **/

@RestController("accountController")
@RequestMapping("/account")
public class AccountController extends  ABaseController{

    private static final Logger logger = LoggerFactory.getLogger(AccountController.class);


    @Autowired
    private UserInfoService userInfoService;

    /**
     * 获取图形验证码
     * @param response
     * @param session
     * @throws IOException
     */
    @GetMapping("/checkCode")
    public void checkCode(HttpServletResponse response,
                          HttpSession session) throws IOException {
        CreateImageCode vCode = new CreateImageCode();
        response.setHeader("Pragma", "no-cache");
        response.setHeader("Cache-Control", "no-cache");
        response.setDateHeader("Expires", 0);
        response.setContentType("image/jpeg");
        String code = vCode.getCode();
        session.setAttribute(Constants.CHECK_CODE, code);
        vCode.write(response.getOutputStream());
    }


    /**
     * 登录
     * @param account 账户 用户名\学工号
     * @param password 密码
     * @param checkCode 验证码
     * @return
     */
    @PostMapping("/login")
    public ResponseVO login(HttpSession session,
                            @NotEmpty String account,
                            @NotEmpty String password,
                            @NotEmpty String checkCode,
                            @NotNull Integer roleType){
        try{
            if (!session.getAttribute(Constants.CHECK_CODE).toString().equalsIgnoreCase(checkCode)){
                throw new BusinessException("验证码错误");
            }
            WebSessionUserDto webSessionUserDto=userInfoService.login(account,password,roleType);
            return getSuccessResponseVO(webSessionUserDto);
        }finally {
            session.removeAttribute(Constants.CHECK_CODE);
        }
    }
}

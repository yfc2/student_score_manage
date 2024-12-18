package com.scoremg.api;


import java.util.List;

import com.scoremg.entity.po.UserInfo;

import com.scoremg.entity.query.UserInfoQuery;

import com.scoremg.entity.vo.PaginationResultVO;

import com.scoremg.entity.vo.ResponseVO;

 import org.springframework.web.bind.annotation.RequestBody;

import org.springframework.web.bind.annotation.RequestMapping;

import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;

import com.scoremg.service.UserInfoService;

/**
 * @Description:Controller
 * @Date:2024-12-18
 * @author：author
*/
@RestController
@RequestMapping("/userInfo")
public class UserInfoController extends ABaseController {

	@Resource
	private UserInfoService userInfoService;

	/**
	 * 分页查询
	 */
	@RequestMapping("/loadDataList")
	public ResponseVO loadDataList(UserInfoQuery query) {
		return getSuccessResponseVO(userInfoService.findListByPage(query));
	}
	/**
	 * 新增
	 */
	@RequestMapping("/add")
	public ResponseVO add(UserInfo bean) { 
		this.userInfoService.add(bean);
		return getSuccessResponseVO(null);	}

	/**
	 * 批量新增
	 */
	@RequestMapping("/addBatch")
	public ResponseVO addBatch(@RequestBody List<UserInfo> listBean) { 
		this.userInfoService.addBatch(listBean);
		return getSuccessResponseVO(null);
	}

	@RequestMapping("/addOrUpdateBatch")
	/**
	 * 批量新增或者修改
	 */
	public ResponseVO addOrUpdateBatch(@RequestBody List<UserInfo> listBean) { 
		this.userInfoService.addOrUpdateBatch(listBean);
		return getSuccessResponseVO(null);
	}

	/**
	 * 根据UserId查询
	 */
	@RequestMapping("/getUserInfoByUserId")
	public  ResponseVO getUserInfoByUserId(String userId) { 
		return getSuccessResponseVO(this.userInfoService.getUserInfoByUserId(userId));
	}

	/**
	 * 根据UserId更新
	 */
	@RequestMapping("/updateUserInfoByUserId")
	public ResponseVO updateUserInfoByUserId(UserInfo bean, String userId) { 
		this.userInfoService.updateUserInfoByUserId(bean,userId);
		return getSuccessResponseVO(null);
	}

	/**
	 * 根据UserId删除
	 */
	@RequestMapping("/deleteUserInfoByUserId")
	public ResponseVO deleteUserInfoByUserId(String userId) { 
		this.userInfoService.deleteUserInfoByUserId(userId);
		return getSuccessResponseVO(null);
	}

	/**
	 * 根据Eamil查询
	 */
	@RequestMapping("/getUserInfoByEamil")
	public  ResponseVO getUserInfoByEamil(String eamil) { 
		return getSuccessResponseVO(this.userInfoService.getUserInfoByEamil(eamil));
	}

	/**
	 * 根据Eamil更新
	 */
	@RequestMapping("/updateUserInfoByEamil")
	public ResponseVO updateUserInfoByEamil(UserInfo bean, String eamil) { 
		this.userInfoService.updateUserInfoByEamil(bean,eamil);
		return getSuccessResponseVO(null);
	}

	/**
	 * 根据Eamil删除
	 */
	@RequestMapping("/deleteUserInfoByEamil")
	public ResponseVO deleteUserInfoByEamil(String eamil) { 
		this.userInfoService.deleteUserInfoByEamil(eamil);
		return getSuccessResponseVO(null);
	}

	/**
	 * 根据StuJobNo查询
	 */
	@RequestMapping("/getUserInfoByStuJobNo")
	public  ResponseVO getUserInfoByStuJobNo(String stuJobNo) { 
		return getSuccessResponseVO(this.userInfoService.getUserInfoByStuJobNo(stuJobNo));
	}

	/**
	 * 根据StuJobNo更新
	 */
	@RequestMapping("/updateUserInfoByStuJobNo")
	public ResponseVO updateUserInfoByStuJobNo(UserInfo bean, String stuJobNo) { 
		this.userInfoService.updateUserInfoByStuJobNo(bean,stuJobNo);
		return getSuccessResponseVO(null);
	}

	/**
	 * 根据StuJobNo删除
	 */
	@RequestMapping("/deleteUserInfoByStuJobNo")
	public ResponseVO deleteUserInfoByStuJobNo(String stuJobNo) { 
		this.userInfoService.deleteUserInfoByStuJobNo(stuJobNo);
		return getSuccessResponseVO(null);
	}

	/**
	 * 根据Username查询
	 */
	@RequestMapping("/getUserInfoByUsername")
	public  ResponseVO getUserInfoByUsername(String username) { 
		return getSuccessResponseVO(this.userInfoService.getUserInfoByUsername(username));
	}

	/**
	 * 根据Username更新
	 */
	@RequestMapping("/updateUserInfoByUsername")
	public ResponseVO updateUserInfoByUsername(UserInfo bean, String username) { 
		this.userInfoService.updateUserInfoByUsername(bean,username);
		return getSuccessResponseVO(null);
	}

	/**
	 * 根据Username删除
	 */
	@RequestMapping("/deleteUserInfoByUsername")
	public ResponseVO deleteUserInfoByUsername(String username) { 
		this.userInfoService.deleteUserInfoByUsername(username);
		return getSuccessResponseVO(null);
	}

	/**
	 * 根据Phone查询
	 */
	@RequestMapping("/getUserInfoByPhone")
	public  ResponseVO getUserInfoByPhone(String phone) { 
		return getSuccessResponseVO(this.userInfoService.getUserInfoByPhone(phone));
	}

	/**
	 * 根据Phone更新
	 */
	@RequestMapping("/updateUserInfoByPhone")
	public ResponseVO updateUserInfoByPhone(UserInfo bean, String phone) { 
		this.userInfoService.updateUserInfoByPhone(bean,phone);
		return getSuccessResponseVO(null);
	}

	/**
	 * 根据Phone删除
	 */
	@RequestMapping("/deleteUserInfoByPhone")
	public ResponseVO deleteUserInfoByPhone(String phone) { 
		this.userInfoService.deleteUserInfoByPhone(phone);
		return getSuccessResponseVO(null);
	}
}
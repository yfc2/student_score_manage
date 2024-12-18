package com.scoremg.api;

import com.scoremg.entity.vo.ResponseVO;

import com.scoremg.entity.enums.ResponseCodeEnum;


public class ABaseController {

    protected static final String STATUS_SUCCESS = "success";
    protected static final String STATUS_ERROR = "error";

    protected <T> ResponseVO getSuccessResponseVO(T t) {
        ResponseVO<T> responseVO = new ResponseVO<T>();
        responseVO.setStatus(STATUS_SUCCESS);
        responseVO.setCode(ResponseCodeEnum.CODE_200.getCode());
        responseVO.setInfo(ResponseCodeEnum.CODE_200.getMsg());
        responseVO.setData(t);
        return responseVO;
    }
}

package com.scoremg.entity.dto;

import lombok.Data;

import java.io.Serializable;

/**
 * @program: scoremg
 * @description:
 * @author: 陈程猿
 * @create: 2024-12-19 22:37
 **/

@Data
public class WebSessionUserDto implements Serializable {

    private static final long serialVersionUID = 1L;

    private String userId;// 用户id

    private String userName;//用户名

    private Integer roleType; //角色类型

}

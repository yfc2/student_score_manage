package com.scoremg.service;


import java.util.List;

import com.scoremg.entity.dto.WebSessionUserDto;
import com.scoremg.entity.po.UserInfo;

import com.scoremg.entity.query.UserInfoQuery;

import com.scoremg.entity.vo.PaginationResultVO;

import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;

/**
 * @Description:service
 * @Date:2024-12-18
 * @author：author
*/
public interface UserInfoService{

	/**
	 * 根据条件查询列表
	 */
	List<UserInfo> findListByParam(UserInfoQuery query);

	/**
	 * 根据条件查询数量
	 */
	Integer findCountByParam(UserInfoQuery query);

	/**
	 * 分页查询
	 */
	PaginationResultVO<UserInfo> findListByPage(UserInfoQuery  query);

	/**
	 * 新增
	 */
	Integer  add(UserInfo bean);

	/**
	 * 批量新增
	 */
	Integer  addBatch(List<UserInfo> listBean);

	/**
	 * 批量新增或者修改
	 */
	Integer  addOrUpdateBatch(List<UserInfo> listBean);


	/**
	 * 根据UserId查询
	 */
	UserInfo getUserInfoByUserId(String userId);

	/**
	 * 根据UserId更新
	 */
	Integer updateUserInfoByUserId(UserInfo bean, String userId);

	/**
	 * 根据UserId删除
	 */
	Integer deleteUserInfoByUserId(String userId);


	/**
	 * 根据Eamil查询
	 */
	UserInfo getUserInfoByEamil(String eamil);

	/**
	 * 根据Eamil更新
	 */
	Integer updateUserInfoByEamil(UserInfo bean, String eamil);

	/**
	 * 根据Eamil删除
	 */
	Integer deleteUserInfoByEamil(String eamil);


	/**
	 * 根据StuJobNo查询
	 */
	UserInfo getUserInfoByStuJobNo(String stuJobNo);

	/**
	 * 根据StuJobNo更新
	 */
	Integer updateUserInfoByStuJobNo(UserInfo bean, String stuJobNo);

	/**
	 * 根据StuJobNo删除
	 */
	Integer deleteUserInfoByStuJobNo(String stuJobNo);


	/**
	 * 根据Username查询
	 */
	UserInfo getUserInfoByUsername(String username);

	/**
	 * 根据Username更新
	 */
	Integer updateUserInfoByUsername(UserInfo bean, String username);

	/**
	 * 根据Username删除
	 */
	Integer deleteUserInfoByUsername(String username);


	/**
	 * 根据Phone查询
	 */
	UserInfo getUserInfoByPhone(String phone);

	/**
	 * 根据Phone更新
	 */
	Integer updateUserInfoByPhone(UserInfo bean, String phone);

	/**
	 * 根据Phone删除
	 */
	Integer deleteUserInfoByPhone(String phone);

	/**
	 * 等可以
	 * @param account
	 * @param password
	 * @return
	 */
    WebSessionUserDto login(@NotEmpty String account, @NotEmpty String password, @NotNull Integer roleType);
}
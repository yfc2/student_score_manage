package com.scoremg.service;


import java.util.List;

import com.scoremg.entity.po.DepartmentInfo;

import com.scoremg.entity.query.DepartmentInfoQuery;

import com.scoremg.entity.vo.PaginationResultVO;

/**
 * @Description:service
 * @Date:2024-12-18
 * @author：author
*/
public interface DepartmentInfoService{

	/**
	 * 根据条件查询列表
	 */
	List<DepartmentInfo> findListByParam(DepartmentInfoQuery query);

	/**
	 * 根据条件查询数量
	 */
	Integer findCountByParam(DepartmentInfoQuery query);

	/**
	 * 分页查询
	 */
	PaginationResultVO<DepartmentInfo> findListByPage(DepartmentInfoQuery  query);

	/**
	 * 新增
	 */
	Integer  add(DepartmentInfo bean);

	/**
	 * 批量新增
	 */
	Integer  addBatch(List<DepartmentInfo> listBean);

	/**
	 * 批量新增或者修改
	 */
	Integer  addOrUpdateBatch(List<DepartmentInfo> listBean);


	/**
	 * 根据DepartmentId查询
	 */
	DepartmentInfo getDepartmentInfoByDepartmentId(Integer departmentId);

	/**
	 * 根据DepartmentId更新
	 */
	Integer updateDepartmentInfoByDepartmentId(DepartmentInfo bean, Integer departmentId);

	/**
	 * 根据DepartmentId删除
	 */
	Integer deleteDepartmentInfoByDepartmentId(Integer departmentId);


	/**
	 * 根据DepartmentName查询
	 */
	DepartmentInfo getDepartmentInfoByDepartmentName(String departmentName);

	/**
	 * 根据DepartmentName更新
	 */
	Integer updateDepartmentInfoByDepartmentName(DepartmentInfo bean, String departmentName);

	/**
	 * 根据DepartmentName删除
	 */
	Integer deleteDepartmentInfoByDepartmentName(String departmentName);

}
package com.scoremg.service;


import java.util.List;

import com.scoremg.entity.po.ClassInfo;

import com.scoremg.entity.query.ClassInfoQuery;

import com.scoremg.entity.vo.PaginationResultVO;

/**
 * @Description:service
 * @Date:2024-12-18
 * @author：author
*/
public interface ClassInfoService{

	/**
	 * 根据条件查询列表
	 */
	List<ClassInfo> findListByParam(ClassInfoQuery query);

	/**
	 * 根据条件查询数量
	 */
	Integer findCountByParam(ClassInfoQuery query);

	/**
	 * 分页查询
	 */
	PaginationResultVO<ClassInfo> findListByPage(ClassInfoQuery  query);

	/**
	 * 新增
	 */
	Integer  add(ClassInfo bean);

	/**
	 * 批量新增
	 */
	Integer  addBatch(List<ClassInfo> listBean);

	/**
	 * 批量新增或者修改
	 */
	Integer  addOrUpdateBatch(List<ClassInfo> listBean);


	/**
	 * 根据ClassId查询
	 */
	ClassInfo getClassInfoByClassId(Integer classId);

	/**
	 * 根据ClassId更新
	 */
	Integer updateClassInfoByClassId(ClassInfo bean, Integer classId);

	/**
	 * 根据ClassId删除
	 */
	Integer deleteClassInfoByClassId(Integer classId);

}
package com.scoremg.service;


import java.util.List;

import com.scoremg.entity.po.CourseInfo;

import com.scoremg.entity.query.CourseInfoQuery;

import com.scoremg.entity.vo.PaginationResultVO;

/**
 * @Description:service
 * @Date:2024-12-18
 * @author：author
*/
public interface CourseInfoService{

	/**
	 * 根据条件查询列表
	 */
	List<CourseInfo> findListByParam(CourseInfoQuery query);

	/**
	 * 根据条件查询数量
	 */
	Integer findCountByParam(CourseInfoQuery query);

	/**
	 * 分页查询
	 */
	PaginationResultVO<CourseInfo> findListByPage(CourseInfoQuery  query);

	/**
	 * 新增
	 */
	Integer  add(CourseInfo bean);

	/**
	 * 批量新增
	 */
	Integer  addBatch(List<CourseInfo> listBean);

	/**
	 * 批量新增或者修改
	 */
	Integer  addOrUpdateBatch(List<CourseInfo> listBean);


	/**
	 * 根据CourseId查询
	 */
	CourseInfo getCourseInfoByCourseId(Integer courseId);

	/**
	 * 根据CourseId更新
	 */
	Integer updateCourseInfoByCourseId(CourseInfo bean, Integer courseId);

	/**
	 * 根据CourseId删除
	 */
	Integer deleteCourseInfoByCourseId(Integer courseId);

}
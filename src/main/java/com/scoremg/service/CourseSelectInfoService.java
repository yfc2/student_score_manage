package com.scoremg.service;


import java.util.List;

import com.scoremg.entity.po.CourseSelectInfo;

import com.scoremg.entity.query.CourseSelectInfoQuery;

import com.scoremg.entity.vo.PaginationResultVO;

/**
 * @Description:service
 * @Date:2024-12-18
 * @author：author
*/
public interface CourseSelectInfoService{

	/**
	 * 根据条件查询列表
	 */
	List<CourseSelectInfo> findListByParam(CourseSelectInfoQuery query);

	/**
	 * 根据条件查询数量
	 */
	Integer findCountByParam(CourseSelectInfoQuery query);

	/**
	 * 分页查询
	 */
	PaginationResultVO<CourseSelectInfo> findListByPage(CourseSelectInfoQuery  query);

	/**
	 * 新增
	 */
	Integer  add(CourseSelectInfo bean);

	/**
	 * 批量新增
	 */
	Integer  addBatch(List<CourseSelectInfo> listBean);

	/**
	 * 批量新增或者修改
	 */
	Integer  addOrUpdateBatch(List<CourseSelectInfo> listBean);


	/**
	 * 根据Id查询
	 */
	CourseSelectInfo getCourseSelectInfoById(Integer id);

	/**
	 * 根据Id更新
	 */
	Integer updateCourseSelectInfoById(CourseSelectInfo bean, Integer id);

	/**
	 * 根据Id删除
	 */
	Integer deleteCourseSelectInfoById(Integer id);


	/**
	 * 根据StudentIdAndCourseId查询
	 */
	CourseSelectInfo getCourseSelectInfoByStudentIdAndCourseId(String studentId,Integer courseId);

	/**
	 * 根据StudentIdAndCourseId更新
	 */
	Integer updateCourseSelectInfoByStudentIdAndCourseId(CourseSelectInfo bean, String studentId,Integer courseId);

	/**
	 * 根据StudentIdAndCourseId删除
	 */
	Integer deleteCourseSelectInfoByStudentIdAndCourseId(String studentId,Integer courseId);

}
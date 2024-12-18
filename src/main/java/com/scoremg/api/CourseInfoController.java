package com.scoremg.api;


import java.util.List;

import com.scoremg.entity.po.CourseInfo;

import com.scoremg.entity.query.CourseInfoQuery;

import com.scoremg.entity.vo.PaginationResultVO;

import com.scoremg.entity.vo.ResponseVO;

 import org.springframework.web.bind.annotation.RequestBody;

import org.springframework.web.bind.annotation.RequestMapping;

import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;

import com.scoremg.service.CourseInfoService;

/**
 * @Description:Controller
 * @Date:2024-12-18
 * @author：author
*/
@RestController
@RequestMapping("/courseInfo")
public class CourseInfoController extends ABaseController {

	@Resource
	private CourseInfoService courseInfoService;

	/**
	 * 分页查询
	 */
	@RequestMapping("/loadDataList")
	public ResponseVO loadDataList(CourseInfoQuery query) {
		return getSuccessResponseVO(courseInfoService.findListByPage(query));
	}
	/**
	 * 新增
	 */
	@RequestMapping("/add")
	public ResponseVO add(CourseInfo bean) { 
		this.courseInfoService.add(bean);
		return getSuccessResponseVO(null);	}

	/**
	 * 批量新增
	 */
	@RequestMapping("/addBatch")
	public ResponseVO addBatch(@RequestBody List<CourseInfo> listBean) { 
		this.courseInfoService.addBatch(listBean);
		return getSuccessResponseVO(null);
	}

	@RequestMapping("/addOrUpdateBatch")
	/**
	 * 批量新增或者修改
	 */
	public ResponseVO addOrUpdateBatch(@RequestBody List<CourseInfo> listBean) { 
		this.courseInfoService.addOrUpdateBatch(listBean);
		return getSuccessResponseVO(null);
	}

	/**
	 * 根据CourseId查询
	 */
	@RequestMapping("/getCourseInfoByCourseId")
	public  ResponseVO getCourseInfoByCourseId(Integer courseId) { 
		return getSuccessResponseVO(this.courseInfoService.getCourseInfoByCourseId(courseId));
	}

	/**
	 * 根据CourseId更新
	 */
	@RequestMapping("/updateCourseInfoByCourseId")
	public ResponseVO updateCourseInfoByCourseId(CourseInfo bean, Integer courseId) { 
		this.courseInfoService.updateCourseInfoByCourseId(bean,courseId);
		return getSuccessResponseVO(null);
	}

	/**
	 * 根据CourseId删除
	 */
	@RequestMapping("/deleteCourseInfoByCourseId")
	public ResponseVO deleteCourseInfoByCourseId(Integer courseId) { 
		this.courseInfoService.deleteCourseInfoByCourseId(courseId);
		return getSuccessResponseVO(null);
	}
}
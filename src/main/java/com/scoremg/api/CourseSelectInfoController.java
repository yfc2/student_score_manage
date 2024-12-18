package com.scoremg.api;


import java.util.List;

import com.scoremg.entity.po.CourseSelectInfo;

import com.scoremg.entity.query.CourseSelectInfoQuery;

import com.scoremg.entity.vo.PaginationResultVO;

import com.scoremg.entity.vo.ResponseVO;

 import org.springframework.web.bind.annotation.RequestBody;

import org.springframework.web.bind.annotation.RequestMapping;

import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;

import com.scoremg.service.CourseSelectInfoService;

/**
 * @Description:Controller
 * @Date:2024-12-18
 * @author：author
*/
@RestController
@RequestMapping("/courseSelectInfo")
public class CourseSelectInfoController extends ABaseController {

	@Resource
	private CourseSelectInfoService courseSelectInfoService;

	/**
	 * 分页查询
	 */
	@RequestMapping("/loadDataList")
	public ResponseVO loadDataList(CourseSelectInfoQuery query) {
		return getSuccessResponseVO(courseSelectInfoService.findListByPage(query));
	}
	/**
	 * 新增
	 */
	@RequestMapping("/add")
	public ResponseVO add(CourseSelectInfo bean) { 
		this.courseSelectInfoService.add(bean);
		return getSuccessResponseVO(null);	}

	/**
	 * 批量新增
	 */
	@RequestMapping("/addBatch")
	public ResponseVO addBatch(@RequestBody List<CourseSelectInfo> listBean) { 
		this.courseSelectInfoService.addBatch(listBean);
		return getSuccessResponseVO(null);
	}

	@RequestMapping("/addOrUpdateBatch")
	/**
	 * 批量新增或者修改
	 */
	public ResponseVO addOrUpdateBatch(@RequestBody List<CourseSelectInfo> listBean) { 
		this.courseSelectInfoService.addOrUpdateBatch(listBean);
		return getSuccessResponseVO(null);
	}

	/**
	 * 根据Id查询
	 */
	@RequestMapping("/getCourseSelectInfoById")
	public  ResponseVO getCourseSelectInfoById(Integer id) { 
		return getSuccessResponseVO(this.courseSelectInfoService.getCourseSelectInfoById(id));
	}

	/**
	 * 根据Id更新
	 */
	@RequestMapping("/updateCourseSelectInfoById")
	public ResponseVO updateCourseSelectInfoById(CourseSelectInfo bean, Integer id) { 
		this.courseSelectInfoService.updateCourseSelectInfoById(bean,id);
		return getSuccessResponseVO(null);
	}

	/**
	 * 根据Id删除
	 */
	@RequestMapping("/deleteCourseSelectInfoById")
	public ResponseVO deleteCourseSelectInfoById(Integer id) { 
		this.courseSelectInfoService.deleteCourseSelectInfoById(id);
		return getSuccessResponseVO(null);
	}

	/**
	 * 根据StudentIdAndCourseId查询
	 */
	@RequestMapping("/getCourseSelectInfoByStudentIdAndCourseId")
	public  ResponseVO getCourseSelectInfoByStudentIdAndCourseId(String studentId,Integer courseId) { 
		return getSuccessResponseVO(this.courseSelectInfoService.getCourseSelectInfoByStudentIdAndCourseId(studentId,courseId));
	}

	/**
	 * 根据StudentIdAndCourseId更新
	 */
	@RequestMapping("/updateCourseSelectInfoByStudentIdAndCourseId")
	public ResponseVO updateCourseSelectInfoByStudentIdAndCourseId(CourseSelectInfo bean, String studentId,Integer courseId) { 
		this.courseSelectInfoService.updateCourseSelectInfoByStudentIdAndCourseId(bean,studentId,courseId);
		return getSuccessResponseVO(null);
	}

	/**
	 * 根据StudentIdAndCourseId删除
	 */
	@RequestMapping("/deleteCourseSelectInfoByStudentIdAndCourseId")
	public ResponseVO deleteCourseSelectInfoByStudentIdAndCourseId(String studentId,Integer courseId) { 
		this.courseSelectInfoService.deleteCourseSelectInfoByStudentIdAndCourseId(studentId,courseId);
		return getSuccessResponseVO(null);
	}
}
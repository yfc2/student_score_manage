package com.scoremg.api;


import java.util.List;

import com.scoremg.entity.po.StudentClassInfo;

import com.scoremg.entity.query.StudentClassInfoQuery;

import com.scoremg.entity.vo.PaginationResultVO;

import com.scoremg.entity.vo.ResponseVO;

 import org.springframework.web.bind.annotation.RequestBody;

import org.springframework.web.bind.annotation.RequestMapping;

import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;

import com.scoremg.service.StudentClassInfoService;

/**
 * @Description:Controller
 * @Date:2024-12-18
 * @author：author
*/
@RestController
@RequestMapping("/studentClassInfo")
public class StudentClassInfoController extends ABaseController {

	@Resource
	private StudentClassInfoService studentClassInfoService;

	/**
	 * 分页查询
	 */
	@RequestMapping("/loadDataList")
	public ResponseVO loadDataList(StudentClassInfoQuery query) {
		return getSuccessResponseVO(studentClassInfoService.findListByPage(query));
	}
	/**
	 * 新增
	 */
	@RequestMapping("/add")
	public ResponseVO add(StudentClassInfo bean) { 
		this.studentClassInfoService.add(bean);
		return getSuccessResponseVO(null);	}

	/**
	 * 批量新增
	 */
	@RequestMapping("/addBatch")
	public ResponseVO addBatch(@RequestBody List<StudentClassInfo> listBean) { 
		this.studentClassInfoService.addBatch(listBean);
		return getSuccessResponseVO(null);
	}

	@RequestMapping("/addOrUpdateBatch")
	/**
	 * 批量新增或者修改
	 */
	public ResponseVO addOrUpdateBatch(@RequestBody List<StudentClassInfo> listBean) { 
		this.studentClassInfoService.addOrUpdateBatch(listBean);
		return getSuccessResponseVO(null);
	}

	/**
	 * 根据Id查询
	 */
	@RequestMapping("/getStudentClassInfoById")
	public  ResponseVO getStudentClassInfoById(Integer id) { 
		return getSuccessResponseVO(this.studentClassInfoService.getStudentClassInfoById(id));
	}

	/**
	 * 根据Id更新
	 */
	@RequestMapping("/updateStudentClassInfoById")
	public ResponseVO updateStudentClassInfoById(StudentClassInfo bean, Integer id) { 
		this.studentClassInfoService.updateStudentClassInfoById(bean,id);
		return getSuccessResponseVO(null);
	}

	/**
	 * 根据Id删除
	 */
	@RequestMapping("/deleteStudentClassInfoById")
	public ResponseVO deleteStudentClassInfoById(Integer id) { 
		this.studentClassInfoService.deleteStudentClassInfoById(id);
		return getSuccessResponseVO(null);
	}

	/**
	 * 根据StudentIdAndClassId查询
	 */
	@RequestMapping("/getStudentClassInfoByStudentIdAndClassId")
	public  ResponseVO getStudentClassInfoByStudentIdAndClassId(String studentId,Integer classId) { 
		return getSuccessResponseVO(this.studentClassInfoService.getStudentClassInfoByStudentIdAndClassId(studentId,classId));
	}

	/**
	 * 根据StudentIdAndClassId更新
	 */
	@RequestMapping("/updateStudentClassInfoByStudentIdAndClassId")
	public ResponseVO updateStudentClassInfoByStudentIdAndClassId(StudentClassInfo bean, String studentId,Integer classId) { 
		this.studentClassInfoService.updateStudentClassInfoByStudentIdAndClassId(bean,studentId,classId);
		return getSuccessResponseVO(null);
	}

	/**
	 * 根据StudentIdAndClassId删除
	 */
	@RequestMapping("/deleteStudentClassInfoByStudentIdAndClassId")
	public ResponseVO deleteStudentClassInfoByStudentIdAndClassId(String studentId,Integer classId) { 
		this.studentClassInfoService.deleteStudentClassInfoByStudentIdAndClassId(studentId,classId);
		return getSuccessResponseVO(null);
	}
}
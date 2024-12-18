package com.scoremg.api;


import java.util.List;

import com.scoremg.entity.po.DepartmentInfo;

import com.scoremg.entity.query.DepartmentInfoQuery;

import com.scoremg.entity.vo.PaginationResultVO;

import com.scoremg.entity.vo.ResponseVO;

 import org.springframework.web.bind.annotation.RequestBody;

import org.springframework.web.bind.annotation.RequestMapping;

import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;

import com.scoremg.service.DepartmentInfoService;

/**
 * @Description:Controller
 * @Date:2024-12-18
 * @author：author
*/
@RestController
@RequestMapping("/departmentInfo")
public class DepartmentInfoController extends ABaseController {

	@Resource
	private DepartmentInfoService departmentInfoService;

	/**
	 * 分页查询
	 */
	@RequestMapping("/loadDataList")
	public ResponseVO loadDataList(DepartmentInfoQuery query) {
		return getSuccessResponseVO(departmentInfoService.findListByPage(query));
	}
	/**
	 * 新增
	 */
	@RequestMapping("/add")
	public ResponseVO add(DepartmentInfo bean) { 
		this.departmentInfoService.add(bean);
		return getSuccessResponseVO(null);	}

	/**
	 * 批量新增
	 */
	@RequestMapping("/addBatch")
	public ResponseVO addBatch(@RequestBody List<DepartmentInfo> listBean) { 
		this.departmentInfoService.addBatch(listBean);
		return getSuccessResponseVO(null);
	}

	@RequestMapping("/addOrUpdateBatch")
	/**
	 * 批量新增或者修改
	 */
	public ResponseVO addOrUpdateBatch(@RequestBody List<DepartmentInfo> listBean) { 
		this.departmentInfoService.addOrUpdateBatch(listBean);
		return getSuccessResponseVO(null);
	}

	/**
	 * 根据DepartmentId查询
	 */
	@RequestMapping("/getDepartmentInfoByDepartmentId")
	public  ResponseVO getDepartmentInfoByDepartmentId(Integer departmentId) { 
		return getSuccessResponseVO(this.departmentInfoService.getDepartmentInfoByDepartmentId(departmentId));
	}

	/**
	 * 根据DepartmentId更新
	 */
	@RequestMapping("/updateDepartmentInfoByDepartmentId")
	public ResponseVO updateDepartmentInfoByDepartmentId(DepartmentInfo bean, Integer departmentId) { 
		this.departmentInfoService.updateDepartmentInfoByDepartmentId(bean,departmentId);
		return getSuccessResponseVO(null);
	}

	/**
	 * 根据DepartmentId删除
	 */
	@RequestMapping("/deleteDepartmentInfoByDepartmentId")
	public ResponseVO deleteDepartmentInfoByDepartmentId(Integer departmentId) { 
		this.departmentInfoService.deleteDepartmentInfoByDepartmentId(departmentId);
		return getSuccessResponseVO(null);
	}

	/**
	 * 根据DepartmentName查询
	 */
	@RequestMapping("/getDepartmentInfoByDepartmentName")
	public  ResponseVO getDepartmentInfoByDepartmentName(String departmentName) { 
		return getSuccessResponseVO(this.departmentInfoService.getDepartmentInfoByDepartmentName(departmentName));
	}

	/**
	 * 根据DepartmentName更新
	 */
	@RequestMapping("/updateDepartmentInfoByDepartmentName")
	public ResponseVO updateDepartmentInfoByDepartmentName(DepartmentInfo bean, String departmentName) { 
		this.departmentInfoService.updateDepartmentInfoByDepartmentName(bean,departmentName);
		return getSuccessResponseVO(null);
	}

	/**
	 * 根据DepartmentName删除
	 */
	@RequestMapping("/deleteDepartmentInfoByDepartmentName")
	public ResponseVO deleteDepartmentInfoByDepartmentName(String departmentName) { 
		this.departmentInfoService.deleteDepartmentInfoByDepartmentName(departmentName);
		return getSuccessResponseVO(null);
	}
}
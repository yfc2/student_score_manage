package com.scoremg.api;


import java.util.List;

import com.scoremg.entity.po.MajorInfo;

import com.scoremg.entity.query.MajorInfoQuery;

import com.scoremg.entity.vo.PaginationResultVO;

import com.scoremg.entity.vo.ResponseVO;

 import org.springframework.web.bind.annotation.RequestBody;

import org.springframework.web.bind.annotation.RequestMapping;

import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;

import com.scoremg.service.MajorInfoService;

/**
 * @Description:Controller
 * @Date:2024-12-18
 * @author：author
*/
@RestController
@RequestMapping("/majorInfo")
public class MajorInfoController extends ABaseController {

	@Resource
	private MajorInfoService majorInfoService;

	/**
	 * 分页查询
	 */
	@RequestMapping("/loadDataList")
	public ResponseVO loadDataList(MajorInfoQuery query) {
		return getSuccessResponseVO(majorInfoService.findListByPage(query));
	}
	/**
	 * 新增
	 */
	@RequestMapping("/add")
	public ResponseVO add(MajorInfo bean) { 
		this.majorInfoService.add(bean);
		return getSuccessResponseVO(null);	}

	/**
	 * 批量新增
	 */
	@RequestMapping("/addBatch")
	public ResponseVO addBatch(@RequestBody List<MajorInfo> listBean) { 
		this.majorInfoService.addBatch(listBean);
		return getSuccessResponseVO(null);
	}

	@RequestMapping("/addOrUpdateBatch")
	/**
	 * 批量新增或者修改
	 */
	public ResponseVO addOrUpdateBatch(@RequestBody List<MajorInfo> listBean) { 
		this.majorInfoService.addOrUpdateBatch(listBean);
		return getSuccessResponseVO(null);
	}

	/**
	 * 根据Id查询
	 */
	@RequestMapping("/getMajorInfoById")
	public  ResponseVO getMajorInfoById(Integer id) { 
		return getSuccessResponseVO(this.majorInfoService.getMajorInfoById(id));
	}

	/**
	 * 根据Id更新
	 */
	@RequestMapping("/updateMajorInfoById")
	public ResponseVO updateMajorInfoById(MajorInfo bean, Integer id) { 
		this.majorInfoService.updateMajorInfoById(bean,id);
		return getSuccessResponseVO(null);
	}

	/**
	 * 根据Id删除
	 */
	@RequestMapping("/deleteMajorInfoById")
	public ResponseVO deleteMajorInfoById(Integer id) { 
		this.majorInfoService.deleteMajorInfoById(id);
		return getSuccessResponseVO(null);
	}
}
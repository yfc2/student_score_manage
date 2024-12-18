package com.scoremg.api;


import java.util.List;

import com.scoremg.entity.po.NoteInfo;

import com.scoremg.entity.query.NoteInfoQuery;

import com.scoremg.entity.vo.PaginationResultVO;

import com.scoremg.entity.vo.ResponseVO;

 import org.springframework.web.bind.annotation.RequestBody;

import org.springframework.web.bind.annotation.RequestMapping;

import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;

import com.scoremg.service.NoteInfoService;

/**
 * @Description:Controller
 * @Date:2024-12-18
 * @author：author
*/
@RestController
@RequestMapping("/noteInfo")
public class NoteInfoController extends ABaseController {

	@Resource
	private NoteInfoService noteInfoService;

	/**
	 * 分页查询
	 */
	@RequestMapping("/loadDataList")
	public ResponseVO loadDataList(NoteInfoQuery query) {
		return getSuccessResponseVO(noteInfoService.findListByPage(query));
	}
	/**
	 * 新增
	 */
	@RequestMapping("/add")
	public ResponseVO add(NoteInfo bean) { 
		this.noteInfoService.add(bean);
		return getSuccessResponseVO(null);	}

	/**
	 * 批量新增
	 */
	@RequestMapping("/addBatch")
	public ResponseVO addBatch(@RequestBody List<NoteInfo> listBean) { 
		this.noteInfoService.addBatch(listBean);
		return getSuccessResponseVO(null);
	}

	@RequestMapping("/addOrUpdateBatch")
	/**
	 * 批量新增或者修改
	 */
	public ResponseVO addOrUpdateBatch(@RequestBody List<NoteInfo> listBean) { 
		this.noteInfoService.addOrUpdateBatch(listBean);
		return getSuccessResponseVO(null);
	}

	/**
	 * 根据Id查询
	 */
	@RequestMapping("/getNoteInfoById")
	public  ResponseVO getNoteInfoById(Integer id) { 
		return getSuccessResponseVO(this.noteInfoService.getNoteInfoById(id));
	}

	/**
	 * 根据Id更新
	 */
	@RequestMapping("/updateNoteInfoById")
	public ResponseVO updateNoteInfoById(NoteInfo bean, Integer id) { 
		this.noteInfoService.updateNoteInfoById(bean,id);
		return getSuccessResponseVO(null);
	}

	/**
	 * 根据Id删除
	 */
	@RequestMapping("/deleteNoteInfoById")
	public ResponseVO deleteNoteInfoById(Integer id) { 
		this.noteInfoService.deleteNoteInfoById(id);
		return getSuccessResponseVO(null);
	}
}
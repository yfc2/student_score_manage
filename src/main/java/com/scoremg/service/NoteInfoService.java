package com.scoremg.service;


import java.util.List;

import com.scoremg.entity.po.NoteInfo;

import com.scoremg.entity.query.NoteInfoQuery;

import com.scoremg.entity.vo.PaginationResultVO;

/**
 * @Description:service
 * @Date:2024-12-18
 * @author：author
*/
public interface NoteInfoService{

	/**
	 * 根据条件查询列表
	 */
	List<NoteInfo> findListByParam(NoteInfoQuery query);

	/**
	 * 根据条件查询数量
	 */
	Integer findCountByParam(NoteInfoQuery query);

	/**
	 * 分页查询
	 */
	PaginationResultVO<NoteInfo> findListByPage(NoteInfoQuery  query);

	/**
	 * 新增
	 */
	Integer  add(NoteInfo bean);

	/**
	 * 批量新增
	 */
	Integer  addBatch(List<NoteInfo> listBean);

	/**
	 * 批量新增或者修改
	 */
	Integer  addOrUpdateBatch(List<NoteInfo> listBean);


	/**
	 * 根据Id查询
	 */
	NoteInfo getNoteInfoById(Integer id);

	/**
	 * 根据Id更新
	 */
	Integer updateNoteInfoById(NoteInfo bean, Integer id);

	/**
	 * 根据Id删除
	 */
	Integer deleteNoteInfoById(Integer id);

}
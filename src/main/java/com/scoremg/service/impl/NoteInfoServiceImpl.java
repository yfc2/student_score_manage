package com.scoremg.service.impl;


import java.util.List;

import com.scoremg.entity.po.NoteInfo;

import com.scoremg.entity.query.NoteInfoQuery;

import com.scoremg.entity.vo.PaginationResultVO;

import com.scoremg.service.NoteInfoService;

import org.springframework.stereotype.Service;

import javax.annotation.Resource;

import com.scoremg.entity.query.SimplePage;

import com.scoremg.mappers.NoteInfoMapper;

import com.scoremg.entity.enums.PageSize;

/**
 * @Description:serviceImpl
 * @Date:2024-12-18
 * @author：author
*/
@Service("noteInfoService")
public class NoteInfoServiceImpl implements NoteInfoService{

	@Resource
	private NoteInfoMapper<NoteInfo,NoteInfoQuery> noteInfoMapper;

	/**
	 * 根据条件查询列表
	 */
	public List<NoteInfo> findListByParam(NoteInfoQuery query) { 
		return this.noteInfoMapper.selectList(query);
	}

	/**
	 * 根据条件查询数量
	 */
	public Integer findCountByParam(NoteInfoQuery query){
		return this.noteInfoMapper.selectCount(query);
	}

	/**
	 * 分页查询
	 */
	public PaginationResultVO<NoteInfo> findListByPage(NoteInfoQuery  query) { 
		int count = this.findCountByParam(query);
		int pageSize = query.getPageSize()==null?PageSize.SIZE15.getSize():query.getPageSize();
		SimplePage page = new SimplePage(query.getPageNo(),count,pageSize);
		query.setSimplePage(page);
		List<NoteInfo> list = this.findListByParam(query);
		return new PaginationResultVO(count,page.getPageSize(),page.getPageNo(),page.getPageTotal(),list);
	}

	/**
	 * 新增
	 */
	public Integer add(NoteInfo bean) { 
		return this.noteInfoMapper.insert(bean);
	}

	/**
	 * 批量新增
	 */
	public Integer addBatch(List<NoteInfo> listBean) { 
		if (listBean == null || listBean.isEmpty()) {
			return 0;
		}
		return this.noteInfoMapper.insertBatch(listBean);
	}

	/**
	 * 批量新增或者修改
	 */
	public Integer addOrUpdateBatch(List<NoteInfo> listBean) { 
		if (listBean == null || listBean.isEmpty()) {
			return 0;
		}
		return this.noteInfoMapper.insertOrUpdateBatch(listBean);
	}

	/**
	 * 根据Id查询
	 */
	public NoteInfo getNoteInfoById(Integer id) { 
		return this.noteInfoMapper.selectById(id);
	}

	/**
	 * 根据Id更新
	 */
	public Integer updateNoteInfoById(NoteInfo bean, Integer id) { 
		return this.noteInfoMapper.updateById(bean,id);
	}

	/**
	 * 根据Id删除
	 */
	public Integer deleteNoteInfoById(Integer id) { 
		return this.noteInfoMapper.deleteById(id);
	}
}
package com.scoremg.service.impl;


import java.util.List;

import com.scoremg.entity.po.ClassInfo;

import com.scoremg.entity.query.ClassInfoQuery;

import com.scoremg.entity.vo.PaginationResultVO;

import com.scoremg.service.ClassInfoService;

import org.springframework.stereotype.Service;

import javax.annotation.Resource;

import com.scoremg.entity.query.SimplePage;

import com.scoremg.mappers.ClassInfoMapper;

import com.scoremg.entity.enums.PageSize;

/**
 * @Description:serviceImpl
 * @Date:2024-12-18
 * @author：author
*/
@Service("classInfoService")
public class ClassInfoServiceImpl implements ClassInfoService{

	@Resource
	private ClassInfoMapper<ClassInfo,ClassInfoQuery> classInfoMapper;

	/**
	 * 根据条件查询列表
	 */
	public List<ClassInfo> findListByParam(ClassInfoQuery query) { 
		return this.classInfoMapper.selectList(query);
	}

	/**
	 * 根据条件查询数量
	 */
	public Integer findCountByParam(ClassInfoQuery query){
		return this.classInfoMapper.selectCount(query);
	}

	/**
	 * 分页查询
	 */
	public PaginationResultVO<ClassInfo> findListByPage(ClassInfoQuery  query) { 
		int count = this.findCountByParam(query);
		int pageSize = query.getPageSize()==null?PageSize.SIZE15.getSize():query.getPageSize();
		SimplePage page = new SimplePage(query.getPageNo(),count,pageSize);
		query.setSimplePage(page);
		List<ClassInfo> list = this.findListByParam(query);
		return new PaginationResultVO(count,page.getPageSize(),page.getPageNo(),page.getPageTotal(),list);
	}

	/**
	 * 新增
	 */
	public Integer add(ClassInfo bean) { 
		return this.classInfoMapper.insert(bean);
	}

	/**
	 * 批量新增
	 */
	public Integer addBatch(List<ClassInfo> listBean) { 
		if (listBean == null || listBean.isEmpty()) {
			return 0;
		}
		return this.classInfoMapper.insertBatch(listBean);
	}

	/**
	 * 批量新增或者修改
	 */
	public Integer addOrUpdateBatch(List<ClassInfo> listBean) { 
		if (listBean == null || listBean.isEmpty()) {
			return 0;
		}
		return this.classInfoMapper.insertOrUpdateBatch(listBean);
	}

	/**
	 * 根据ClassId查询
	 */
	public ClassInfo getClassInfoByClassId(Integer classId) { 
		return this.classInfoMapper.selectByClassId(classId);
	}

	/**
	 * 根据ClassId更新
	 */
	public Integer updateClassInfoByClassId(ClassInfo bean, Integer classId) { 
		return this.classInfoMapper.updateByClassId(bean,classId);
	}

	/**
	 * 根据ClassId删除
	 */
	public Integer deleteClassInfoByClassId(Integer classId) { 
		return this.classInfoMapper.deleteByClassId(classId);
	}
}
package com.scoremg.service.impl;


import java.util.List;

import com.scoremg.entity.po.CourseInfo;

import com.scoremg.entity.query.CourseInfoQuery;

import com.scoremg.entity.vo.PaginationResultVO;

import com.scoremg.service.CourseInfoService;

import org.springframework.stereotype.Service;

import javax.annotation.Resource;

import com.scoremg.entity.query.SimplePage;

import com.scoremg.mappers.CourseInfoMapper;

import com.scoremg.entity.enums.PageSize;

/**
 * @Description:serviceImpl
 * @Date:2024-12-18
 * @author：author
*/
@Service("courseInfoService")
public class CourseInfoServiceImpl implements CourseInfoService{

	@Resource
	private CourseInfoMapper<CourseInfo,CourseInfoQuery> courseInfoMapper;

	/**
	 * 根据条件查询列表
	 */
	public List<CourseInfo> findListByParam(CourseInfoQuery query) { 
		return this.courseInfoMapper.selectList(query);
	}

	/**
	 * 根据条件查询数量
	 */
	public Integer findCountByParam(CourseInfoQuery query){
		return this.courseInfoMapper.selectCount(query);
	}

	/**
	 * 分页查询
	 */
	public PaginationResultVO<CourseInfo> findListByPage(CourseInfoQuery  query) { 
		int count = this.findCountByParam(query);
		int pageSize = query.getPageSize()==null?PageSize.SIZE15.getSize():query.getPageSize();
		SimplePage page = new SimplePage(query.getPageNo(),count,pageSize);
		query.setSimplePage(page);
		List<CourseInfo> list = this.findListByParam(query);
		return new PaginationResultVO(count,page.getPageSize(),page.getPageNo(),page.getPageTotal(),list);
	}

	/**
	 * 新增
	 */
	public Integer add(CourseInfo bean) { 
		return this.courseInfoMapper.insert(bean);
	}

	/**
	 * 批量新增
	 */
	public Integer addBatch(List<CourseInfo> listBean) { 
		if (listBean == null || listBean.isEmpty()) {
			return 0;
		}
		return this.courseInfoMapper.insertBatch(listBean);
	}

	/**
	 * 批量新增或者修改
	 */
	public Integer addOrUpdateBatch(List<CourseInfo> listBean) { 
		if (listBean == null || listBean.isEmpty()) {
			return 0;
		}
		return this.courseInfoMapper.insertOrUpdateBatch(listBean);
	}

	/**
	 * 根据CourseId查询
	 */
	public CourseInfo getCourseInfoByCourseId(Integer courseId) { 
		return this.courseInfoMapper.selectByCourseId(courseId);
	}

	/**
	 * 根据CourseId更新
	 */
	public Integer updateCourseInfoByCourseId(CourseInfo bean, Integer courseId) { 
		return this.courseInfoMapper.updateByCourseId(bean,courseId);
	}

	/**
	 * 根据CourseId删除
	 */
	public Integer deleteCourseInfoByCourseId(Integer courseId) { 
		return this.courseInfoMapper.deleteByCourseId(courseId);
	}
}
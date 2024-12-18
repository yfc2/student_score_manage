package com.scoremg.service.impl;


import java.util.List;

import com.scoremg.entity.po.CourseSelectInfo;

import com.scoremg.entity.query.CourseSelectInfoQuery;

import com.scoremg.entity.vo.PaginationResultVO;

import com.scoremg.service.CourseSelectInfoService;

import org.springframework.stereotype.Service;

import javax.annotation.Resource;

import com.scoremg.entity.query.SimplePage;

import com.scoremg.mappers.CourseSelectInfoMapper;

import com.scoremg.entity.enums.PageSize;

/**
 * @Description:serviceImpl
 * @Date:2024-12-18
 * @author：author
*/
@Service("courseSelectInfoService")
public class CourseSelectInfoServiceImpl implements CourseSelectInfoService{

	@Resource
	private CourseSelectInfoMapper<CourseSelectInfo,CourseSelectInfoQuery> courseSelectInfoMapper;

	/**
	 * 根据条件查询列表
	 */
	public List<CourseSelectInfo> findListByParam(CourseSelectInfoQuery query) { 
		return this.courseSelectInfoMapper.selectList(query);
	}

	/**
	 * 根据条件查询数量
	 */
	public Integer findCountByParam(CourseSelectInfoQuery query){
		return this.courseSelectInfoMapper.selectCount(query);
	}

	/**
	 * 分页查询
	 */
	public PaginationResultVO<CourseSelectInfo> findListByPage(CourseSelectInfoQuery  query) { 
		int count = this.findCountByParam(query);
		int pageSize = query.getPageSize()==null?PageSize.SIZE15.getSize():query.getPageSize();
		SimplePage page = new SimplePage(query.getPageNo(),count,pageSize);
		query.setSimplePage(page);
		List<CourseSelectInfo> list = this.findListByParam(query);
		return new PaginationResultVO(count,page.getPageSize(),page.getPageNo(),page.getPageTotal(),list);
	}

	/**
	 * 新增
	 */
	public Integer add(CourseSelectInfo bean) { 
		return this.courseSelectInfoMapper.insert(bean);
	}

	/**
	 * 批量新增
	 */
	public Integer addBatch(List<CourseSelectInfo> listBean) { 
		if (listBean == null || listBean.isEmpty()) {
			return 0;
		}
		return this.courseSelectInfoMapper.insertBatch(listBean);
	}

	/**
	 * 批量新增或者修改
	 */
	public Integer addOrUpdateBatch(List<CourseSelectInfo> listBean) { 
		if (listBean == null || listBean.isEmpty()) {
			return 0;
		}
		return this.courseSelectInfoMapper.insertOrUpdateBatch(listBean);
	}

	/**
	 * 根据Id查询
	 */
	public CourseSelectInfo getCourseSelectInfoById(Integer id) { 
		return this.courseSelectInfoMapper.selectById(id);
	}

	/**
	 * 根据Id更新
	 */
	public Integer updateCourseSelectInfoById(CourseSelectInfo bean, Integer id) { 
		return this.courseSelectInfoMapper.updateById(bean,id);
	}

	/**
	 * 根据Id删除
	 */
	public Integer deleteCourseSelectInfoById(Integer id) { 
		return this.courseSelectInfoMapper.deleteById(id);
	}

	/**
	 * 根据StudentIdAndCourseId查询
	 */
	public CourseSelectInfo getCourseSelectInfoByStudentIdAndCourseId(String studentId,Integer courseId) { 
		return this.courseSelectInfoMapper.selectByStudentIdAndCourseId(studentId,courseId);
	}

	/**
	 * 根据StudentIdAndCourseId更新
	 */
	public Integer updateCourseSelectInfoByStudentIdAndCourseId(CourseSelectInfo bean, String studentId,Integer courseId) { 
		return this.courseSelectInfoMapper.updateByStudentIdAndCourseId(bean,studentId,courseId);
	}

	/**
	 * 根据StudentIdAndCourseId删除
	 */
	public Integer deleteCourseSelectInfoByStudentIdAndCourseId(String studentId,Integer courseId) { 
		return this.courseSelectInfoMapper.deleteByStudentIdAndCourseId(studentId,courseId);
	}
}
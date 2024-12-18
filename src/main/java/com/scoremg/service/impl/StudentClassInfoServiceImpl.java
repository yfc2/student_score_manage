package com.scoremg.service.impl;


import java.util.List;

import com.scoremg.entity.po.StudentClassInfo;

import com.scoremg.entity.query.StudentClassInfoQuery;

import com.scoremg.entity.vo.PaginationResultVO;

import com.scoremg.service.StudentClassInfoService;

import org.springframework.stereotype.Service;

import javax.annotation.Resource;

import com.scoremg.entity.query.SimplePage;

import com.scoremg.mappers.StudentClassInfoMapper;

import com.scoremg.entity.enums.PageSize;

/**
 * @Description:serviceImpl
 * @Date:2024-12-18
 * @author：author
*/
@Service("studentClassInfoService")
public class StudentClassInfoServiceImpl implements StudentClassInfoService{

	@Resource
	private StudentClassInfoMapper<StudentClassInfo,StudentClassInfoQuery> studentClassInfoMapper;

	/**
	 * 根据条件查询列表
	 */
	public List<StudentClassInfo> findListByParam(StudentClassInfoQuery query) { 
		return this.studentClassInfoMapper.selectList(query);
	}

	/**
	 * 根据条件查询数量
	 */
	public Integer findCountByParam(StudentClassInfoQuery query){
		return this.studentClassInfoMapper.selectCount(query);
	}

	/**
	 * 分页查询
	 */
	public PaginationResultVO<StudentClassInfo> findListByPage(StudentClassInfoQuery  query) { 
		int count = this.findCountByParam(query);
		int pageSize = query.getPageSize()==null?PageSize.SIZE15.getSize():query.getPageSize();
		SimplePage page = new SimplePage(query.getPageNo(),count,pageSize);
		query.setSimplePage(page);
		List<StudentClassInfo> list = this.findListByParam(query);
		return new PaginationResultVO(count,page.getPageSize(),page.getPageNo(),page.getPageTotal(),list);
	}

	/**
	 * 新增
	 */
	public Integer add(StudentClassInfo bean) { 
		return this.studentClassInfoMapper.insert(bean);
	}

	/**
	 * 批量新增
	 */
	public Integer addBatch(List<StudentClassInfo> listBean) { 
		if (listBean == null || listBean.isEmpty()) {
			return 0;
		}
		return this.studentClassInfoMapper.insertBatch(listBean);
	}

	/**
	 * 批量新增或者修改
	 */
	public Integer addOrUpdateBatch(List<StudentClassInfo> listBean) { 
		if (listBean == null || listBean.isEmpty()) {
			return 0;
		}
		return this.studentClassInfoMapper.insertOrUpdateBatch(listBean);
	}

	/**
	 * 根据Id查询
	 */
	public StudentClassInfo getStudentClassInfoById(Integer id) { 
		return this.studentClassInfoMapper.selectById(id);
	}

	/**
	 * 根据Id更新
	 */
	public Integer updateStudentClassInfoById(StudentClassInfo bean, Integer id) { 
		return this.studentClassInfoMapper.updateById(bean,id);
	}

	/**
	 * 根据Id删除
	 */
	public Integer deleteStudentClassInfoById(Integer id) { 
		return this.studentClassInfoMapper.deleteById(id);
	}

	/**
	 * 根据StudentIdAndClassId查询
	 */
	public StudentClassInfo getStudentClassInfoByStudentIdAndClassId(String studentId,Integer classId) { 
		return this.studentClassInfoMapper.selectByStudentIdAndClassId(studentId,classId);
	}

	/**
	 * 根据StudentIdAndClassId更新
	 */
	public Integer updateStudentClassInfoByStudentIdAndClassId(StudentClassInfo bean, String studentId,Integer classId) { 
		return this.studentClassInfoMapper.updateByStudentIdAndClassId(bean,studentId,classId);
	}

	/**
	 * 根据StudentIdAndClassId删除
	 */
	public Integer deleteStudentClassInfoByStudentIdAndClassId(String studentId,Integer classId) { 
		return this.studentClassInfoMapper.deleteByStudentIdAndClassId(studentId,classId);
	}
}
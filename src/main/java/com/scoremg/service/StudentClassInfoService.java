package com.scoremg.service;


import java.util.List;

import com.scoremg.entity.po.StudentClassInfo;

import com.scoremg.entity.query.StudentClassInfoQuery;

import com.scoremg.entity.vo.PaginationResultVO;

/**
 * @Description:service
 * @Date:2024-12-18
 * @author：author
*/
public interface StudentClassInfoService{

	/**
	 * 根据条件查询列表
	 */
	List<StudentClassInfo> findListByParam(StudentClassInfoQuery query);

	/**
	 * 根据条件查询数量
	 */
	Integer findCountByParam(StudentClassInfoQuery query);

	/**
	 * 分页查询
	 */
	PaginationResultVO<StudentClassInfo> findListByPage(StudentClassInfoQuery  query);

	/**
	 * 新增
	 */
	Integer  add(StudentClassInfo bean);

	/**
	 * 批量新增
	 */
	Integer  addBatch(List<StudentClassInfo> listBean);

	/**
	 * 批量新增或者修改
	 */
	Integer  addOrUpdateBatch(List<StudentClassInfo> listBean);


	/**
	 * 根据Id查询
	 */
	StudentClassInfo getStudentClassInfoById(Integer id);

	/**
	 * 根据Id更新
	 */
	Integer updateStudentClassInfoById(StudentClassInfo bean, Integer id);

	/**
	 * 根据Id删除
	 */
	Integer deleteStudentClassInfoById(Integer id);


	/**
	 * 根据StudentIdAndClassId查询
	 */
	StudentClassInfo getStudentClassInfoByStudentIdAndClassId(String studentId,Integer classId);

	/**
	 * 根据StudentIdAndClassId更新
	 */
	Integer updateStudentClassInfoByStudentIdAndClassId(StudentClassInfo bean, String studentId,Integer classId);

	/**
	 * 根据StudentIdAndClassId删除
	 */
	Integer deleteStudentClassInfoByStudentIdAndClassId(String studentId,Integer classId);

}
package com.scoremg.service;


import java.util.List;

import com.scoremg.entity.po.MajorInfo;

import com.scoremg.entity.query.MajorInfoQuery;

import com.scoremg.entity.vo.PaginationResultVO;

/**
 * @Description:service
 * @Date:2024-12-18
 * @author：author
*/
public interface MajorInfoService{

	/**
	 * 根据条件查询列表
	 */
	List<MajorInfo> findListByParam(MajorInfoQuery query);

	/**
	 * 根据条件查询数量
	 */
	Integer findCountByParam(MajorInfoQuery query);

	/**
	 * 分页查询
	 */
	PaginationResultVO<MajorInfo> findListByPage(MajorInfoQuery  query);

	/**
	 * 新增
	 */
	Integer  add(MajorInfo bean);

	/**
	 * 批量新增
	 */
	Integer  addBatch(List<MajorInfo> listBean);

	/**
	 * 批量新增或者修改
	 */
	Integer  addOrUpdateBatch(List<MajorInfo> listBean);


	/**
	 * 根据Id查询
	 */
	MajorInfo getMajorInfoById(Integer id);

	/**
	 * 根据Id更新
	 */
	Integer updateMajorInfoById(MajorInfo bean, Integer id);

	/**
	 * 根据Id删除
	 */
	Integer deleteMajorInfoById(Integer id);

}
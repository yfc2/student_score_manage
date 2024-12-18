package com.scoremg.service.impl;


import java.util.List;

import com.scoremg.entity.po.DepartmentInfo;

import com.scoremg.entity.query.DepartmentInfoQuery;

import com.scoremg.entity.vo.PaginationResultVO;

import com.scoremg.service.DepartmentInfoService;

import org.springframework.stereotype.Service;

import javax.annotation.Resource;

import com.scoremg.entity.query.SimplePage;

import com.scoremg.mappers.DepartmentInfoMapper;

import com.scoremg.entity.enums.PageSize;

/**
 * @Description:serviceImpl
 * @Date:2024-12-18
 * @author：author
*/
@Service("departmentInfoService")
public class DepartmentInfoServiceImpl implements DepartmentInfoService{

	@Resource
	private DepartmentInfoMapper<DepartmentInfo,DepartmentInfoQuery> departmentInfoMapper;

	/**
	 * 根据条件查询列表
	 */
	public List<DepartmentInfo> findListByParam(DepartmentInfoQuery query) { 
		return this.departmentInfoMapper.selectList(query);
	}

	/**
	 * 根据条件查询数量
	 */
	public Integer findCountByParam(DepartmentInfoQuery query){
		return this.departmentInfoMapper.selectCount(query);
	}

	/**
	 * 分页查询
	 */
	public PaginationResultVO<DepartmentInfo> findListByPage(DepartmentInfoQuery  query) { 
		int count = this.findCountByParam(query);
		int pageSize = query.getPageSize()==null?PageSize.SIZE15.getSize():query.getPageSize();
		SimplePage page = new SimplePage(query.getPageNo(),count,pageSize);
		query.setSimplePage(page);
		List<DepartmentInfo> list = this.findListByParam(query);
		return new PaginationResultVO(count,page.getPageSize(),page.getPageNo(),page.getPageTotal(),list);
	}

	/**
	 * 新增
	 */
	public Integer add(DepartmentInfo bean) { 
		return this.departmentInfoMapper.insert(bean);
	}

	/**
	 * 批量新增
	 */
	public Integer addBatch(List<DepartmentInfo> listBean) { 
		if (listBean == null || listBean.isEmpty()) {
			return 0;
		}
		return this.departmentInfoMapper.insertBatch(listBean);
	}

	/**
	 * 批量新增或者修改
	 */
	public Integer addOrUpdateBatch(List<DepartmentInfo> listBean) { 
		if (listBean == null || listBean.isEmpty()) {
			return 0;
		}
		return this.departmentInfoMapper.insertOrUpdateBatch(listBean);
	}

	/**
	 * 根据DepartmentId查询
	 */
	public DepartmentInfo getDepartmentInfoByDepartmentId(Integer departmentId) { 
		return this.departmentInfoMapper.selectByDepartmentId(departmentId);
	}

	/**
	 * 根据DepartmentId更新
	 */
	public Integer updateDepartmentInfoByDepartmentId(DepartmentInfo bean, Integer departmentId) { 
		return this.departmentInfoMapper.updateByDepartmentId(bean,departmentId);
	}

	/**
	 * 根据DepartmentId删除
	 */
	public Integer deleteDepartmentInfoByDepartmentId(Integer departmentId) { 
		return this.departmentInfoMapper.deleteByDepartmentId(departmentId);
	}

	/**
	 * 根据DepartmentName查询
	 */
	public DepartmentInfo getDepartmentInfoByDepartmentName(String departmentName) { 
		return this.departmentInfoMapper.selectByDepartmentName(departmentName);
	}

	/**
	 * 根据DepartmentName更新
	 */
	public Integer updateDepartmentInfoByDepartmentName(DepartmentInfo bean, String departmentName) { 
		return this.departmentInfoMapper.updateByDepartmentName(bean,departmentName);
	}

	/**
	 * 根据DepartmentName删除
	 */
	public Integer deleteDepartmentInfoByDepartmentName(String departmentName) { 
		return this.departmentInfoMapper.deleteByDepartmentName(departmentName);
	}
}
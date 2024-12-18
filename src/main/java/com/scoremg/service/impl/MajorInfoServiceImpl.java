package com.scoremg.service.impl;


import java.util.List;

import com.scoremg.entity.po.MajorInfo;

import com.scoremg.entity.query.MajorInfoQuery;

import com.scoremg.entity.vo.PaginationResultVO;

import com.scoremg.service.MajorInfoService;

import org.springframework.stereotype.Service;

import javax.annotation.Resource;

import com.scoremg.entity.query.SimplePage;

import com.scoremg.mappers.MajorInfoMapper;

import com.scoremg.entity.enums.PageSize;

/**
 * @Description:serviceImpl
 * @Date:2024-12-18
 * @author：author
*/
@Service("majorInfoService")
public class MajorInfoServiceImpl implements MajorInfoService{

	@Resource
	private MajorInfoMapper<MajorInfo,MajorInfoQuery> majorInfoMapper;

	/**
	 * 根据条件查询列表
	 */
	public List<MajorInfo> findListByParam(MajorInfoQuery query) { 
		return this.majorInfoMapper.selectList(query);
	}

	/**
	 * 根据条件查询数量
	 */
	public Integer findCountByParam(MajorInfoQuery query){
		return this.majorInfoMapper.selectCount(query);
	}

	/**
	 * 分页查询
	 */
	public PaginationResultVO<MajorInfo> findListByPage(MajorInfoQuery  query) { 
		int count = this.findCountByParam(query);
		int pageSize = query.getPageSize()==null?PageSize.SIZE15.getSize():query.getPageSize();
		SimplePage page = new SimplePage(query.getPageNo(),count,pageSize);
		query.setSimplePage(page);
		List<MajorInfo> list = this.findListByParam(query);
		return new PaginationResultVO(count,page.getPageSize(),page.getPageNo(),page.getPageTotal(),list);
	}

	/**
	 * 新增
	 */
	public Integer add(MajorInfo bean) { 
		return this.majorInfoMapper.insert(bean);
	}

	/**
	 * 批量新增
	 */
	public Integer addBatch(List<MajorInfo> listBean) { 
		if (listBean == null || listBean.isEmpty()) {
			return 0;
		}
		return this.majorInfoMapper.insertBatch(listBean);
	}

	/**
	 * 批量新增或者修改
	 */
	public Integer addOrUpdateBatch(List<MajorInfo> listBean) { 
		if (listBean == null || listBean.isEmpty()) {
			return 0;
		}
		return this.majorInfoMapper.insertOrUpdateBatch(listBean);
	}

	/**
	 * 根据Id查询
	 */
	public MajorInfo getMajorInfoById(Integer id) { 
		return this.majorInfoMapper.selectById(id);
	}

	/**
	 * 根据Id更新
	 */
	public Integer updateMajorInfoById(MajorInfo bean, Integer id) { 
		return this.majorInfoMapper.updateById(bean,id);
	}

	/**
	 * 根据Id删除
	 */
	public Integer deleteMajorInfoById(Integer id) { 
		return this.majorInfoMapper.deleteById(id);
	}
}
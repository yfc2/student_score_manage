package com.scoremg.service.impl;


import java.util.List;

import com.scoremg.entity.po.UserInfo;

import com.scoremg.entity.query.UserInfoQuery;

import com.scoremg.entity.vo.PaginationResultVO;

import com.scoremg.service.UserInfoService;

import org.springframework.stereotype.Service;

import javax.annotation.Resource;

import com.scoremg.entity.query.SimplePage;

import com.scoremg.mappers.UserInfoMapper;

import com.scoremg.entity.enums.PageSize;

/**
 * @Description:serviceImpl
 * @Date:2024-12-18
 * @author：author
*/
@Service("userInfoService")
public class UserInfoServiceImpl implements UserInfoService{

	@Resource
	private UserInfoMapper<UserInfo,UserInfoQuery> userInfoMapper;

	/**
	 * 根据条件查询列表
	 */
	public List<UserInfo> findListByParam(UserInfoQuery query) { 
		return this.userInfoMapper.selectList(query);
	}

	/**
	 * 根据条件查询数量
	 */
	public Integer findCountByParam(UserInfoQuery query){
		return this.userInfoMapper.selectCount(query);
	}

	/**
	 * 分页查询
	 */
	public PaginationResultVO<UserInfo> findListByPage(UserInfoQuery  query) { 
		int count = this.findCountByParam(query);
		int pageSize = query.getPageSize()==null?PageSize.SIZE15.getSize():query.getPageSize();
		SimplePage page = new SimplePage(query.getPageNo(),count,pageSize);
		query.setSimplePage(page);
		List<UserInfo> list = this.findListByParam(query);
		return new PaginationResultVO(count,page.getPageSize(),page.getPageNo(),page.getPageTotal(),list);
	}

	/**
	 * 新增
	 */
	public Integer add(UserInfo bean) { 
		return this.userInfoMapper.insert(bean);
	}

	/**
	 * 批量新增
	 */
	public Integer addBatch(List<UserInfo> listBean) { 
		if (listBean == null || listBean.isEmpty()) {
			return 0;
		}
		return this.userInfoMapper.insertBatch(listBean);
	}

	/**
	 * 批量新增或者修改
	 */
	public Integer addOrUpdateBatch(List<UserInfo> listBean) { 
		if (listBean == null || listBean.isEmpty()) {
			return 0;
		}
		return this.userInfoMapper.insertOrUpdateBatch(listBean);
	}

	/**
	 * 根据UserId查询
	 */
	public UserInfo getUserInfoByUserId(String userId) { 
		return this.userInfoMapper.selectByUserId(userId);
	}

	/**
	 * 根据UserId更新
	 */
	public Integer updateUserInfoByUserId(UserInfo bean, String userId) { 
		return this.userInfoMapper.updateByUserId(bean,userId);
	}

	/**
	 * 根据UserId删除
	 */
	public Integer deleteUserInfoByUserId(String userId) { 
		return this.userInfoMapper.deleteByUserId(userId);
	}

	/**
	 * 根据Eamil查询
	 */
	public UserInfo getUserInfoByEamil(String eamil) { 
		return this.userInfoMapper.selectByEamil(eamil);
	}

	/**
	 * 根据Eamil更新
	 */
	public Integer updateUserInfoByEamil(UserInfo bean, String eamil) { 
		return this.userInfoMapper.updateByEamil(bean,eamil);
	}

	/**
	 * 根据Eamil删除
	 */
	public Integer deleteUserInfoByEamil(String eamil) { 
		return this.userInfoMapper.deleteByEamil(eamil);
	}

	/**
	 * 根据StuJobNo查询
	 */
	public UserInfo getUserInfoByStuJobNo(String stuJobNo) { 
		return this.userInfoMapper.selectByStuJobNo(stuJobNo);
	}

	/**
	 * 根据StuJobNo更新
	 */
	public Integer updateUserInfoByStuJobNo(UserInfo bean, String stuJobNo) { 
		return this.userInfoMapper.updateByStuJobNo(bean,stuJobNo);
	}

	/**
	 * 根据StuJobNo删除
	 */
	public Integer deleteUserInfoByStuJobNo(String stuJobNo) { 
		return this.userInfoMapper.deleteByStuJobNo(stuJobNo);
	}

	/**
	 * 根据Username查询
	 */
	public UserInfo getUserInfoByUsername(String username) { 
		return this.userInfoMapper.selectByUsername(username);
	}

	/**
	 * 根据Username更新
	 */
	public Integer updateUserInfoByUsername(UserInfo bean, String username) { 
		return this.userInfoMapper.updateByUsername(bean,username);
	}

	/**
	 * 根据Username删除
	 */
	public Integer deleteUserInfoByUsername(String username) { 
		return this.userInfoMapper.deleteByUsername(username);
	}

	/**
	 * 根据Phone查询
	 */
	public UserInfo getUserInfoByPhone(String phone) { 
		return this.userInfoMapper.selectByPhone(phone);
	}

	/**
	 * 根据Phone更新
	 */
	public Integer updateUserInfoByPhone(UserInfo bean, String phone) { 
		return this.userInfoMapper.updateByPhone(bean,phone);
	}

	/**
	 * 根据Phone删除
	 */
	public Integer deleteUserInfoByPhone(String phone) { 
		return this.userInfoMapper.deleteByPhone(phone);
	}
}
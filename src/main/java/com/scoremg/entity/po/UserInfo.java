package com.scoremg.entity.po;

import java.io.Serializable;

import java.util.Date;

import com.fasterxml.jackson.annotation.JsonFormat;

import org.springframework.format.annotation.DateTimeFormat;

/**
 * @Description:
 * @Date:2024-12-18
 * @author：author
*/
public class UserInfo implements Serializable {

	/**
	 * 用户id
	 */
	private String userId;

	/**
	 * 用户名
	 */
	private String username;

	/**
	 * 密码
	 */
	private String password;

	/**
	 * 角色 0:学生 1：教师 2：管理员
	 */
	private Integer roleType;

	/**
	 * 姓名
	 */
	private String name;

	/**
	 * 邮箱
	 */
	private String eamil;

	/**
	 * 创建时间 1男 0女
	 */
	@JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss",timezone="GMT+8")
	@DateTimeFormat(pattern = "yyyy-MM-dd HH:mm:ss")
	private Date createTime;

	/**
	 * 性别1男 0女
	 */
	private Integer sex;

	/**
	 * 别名
	 */
	private String nickName;

	/**
	 * 电话
	 */
	private String phone;

	/**
	 * 工作签名
	 */
	private String signature;

	/**
	 * 学工号
	 */
	private String stuJobNo;

	public void setUserId(String userId) {
		this.userId = userId;
	}

	public String getUserId() {
		return this.userId;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public String getUsername() {
		return this.username;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getPassword() {
		return this.password;
	}

	public void setRoleType(Integer roleType) {
		this.roleType = roleType;
	}

	public Integer getRoleType() {
		return this.roleType;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getName() {
		return this.name;
	}

	public void setEamil(String eamil) {
		this.eamil = eamil;
	}

	public String getEamil() {
		return this.eamil;
	}

	public void setCreateTime(Date createTime) {
		this.createTime = createTime;
	}

	public Date getCreateTime() {
		return this.createTime;
	}

	public void setSex(Integer sex) {
		this.sex = sex;
	}

	public Integer getSex() {
		return this.sex;
	}

	public void setNickName(String nickName) {
		this.nickName = nickName;
	}

	public String getNickName() {
		return this.nickName;
	}

	public void setPhone(String phone) {
		this.phone = phone;
	}

	public String getPhone() {
		return this.phone;
	}

	public void setSignature(String signature) {
		this.signature = signature;
	}

	public String getSignature() {
		return this.signature;
	}

	public void setStuJobNo(String stuJobNo) {
		this.stuJobNo = stuJobNo;
	}

	public String getStuJobNo() {
		return this.stuJobNo;
	}

	@Override
	public String toString() {
		return "用户id:" + userId + ",用户名:" + username + ",密码:" + password + ",角色 0:学生 1：教师 2：管理员:" + roleType + ",姓名:" + name + ",邮箱:" + eamil + ",创建时间 1男 0女:" + createTime + ",性别1男 0女:" + sex + ",别名:" + nickName + ",电话:" + phone + ",工作签名:" + signature + ",学工号:" + stuJobNo + "";
	}

}
package com.scoremg.entity.query;

import java.util.Date;

/**
 * @Description:查询
 * @Date:2024-12-18
 * @author：author
*/
public class UserInfoQuery extends BaseQuery{

	/**
	 * 用户id
	 */
	private String userId;

	private String userIdFuzzy;

	/**
	 * 用户名
	 */
	private String username;

	private String usernameFuzzy;

	/**
	 * 密码
	 */
	private String password;

	private String passwordFuzzy;

	/**
	 * 角色 0:学生 1：教师 2：管理员
	 */
	private Integer roleType;

	/**
	 * 姓名
	 */
	private String name;

	private String nameFuzzy;

	/**
	 * 邮箱
	 */
	private String eamil;

	private String eamilFuzzy;

	/**
	 * 创建时间 1男 0女
	 */
	private Date createTime;

	private String createTimeStart;

	private String createTimeEnd;

	/**
	 * 性别1男 0女
	 */
	private Integer sex;

	/**
	 * 别名
	 */
	private String nickName;

	private String nickNameFuzzy;

	/**
	 * 电话
	 */
	private String phone;

	private String phoneFuzzy;

	/**
	 * 工作签名
	 */
	private String signature;

	private String signatureFuzzy;

	/**
	 * 学工号
	 */
	private String stuJobNo;

	private String stuJobNoFuzzy;

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

	public void setUserIdFuzzy(String userIdFuzzy) {
		this.userIdFuzzy = userIdFuzzy;
	}

	public String getUserIdFuzzy() {
		return this.userIdFuzzy;
	}

	public void setUsernameFuzzy(String usernameFuzzy) {
		this.usernameFuzzy = usernameFuzzy;
	}

	public String getUsernameFuzzy() {
		return this.usernameFuzzy;
	}

	public void setPasswordFuzzy(String passwordFuzzy) {
		this.passwordFuzzy = passwordFuzzy;
	}

	public String getPasswordFuzzy() {
		return this.passwordFuzzy;
	}

	public void setNameFuzzy(String nameFuzzy) {
		this.nameFuzzy = nameFuzzy;
	}

	public String getNameFuzzy() {
		return this.nameFuzzy;
	}

	public void setEamilFuzzy(String eamilFuzzy) {
		this.eamilFuzzy = eamilFuzzy;
	}

	public String getEamilFuzzy() {
		return this.eamilFuzzy;
	}

	public void setCreateTimeStart(String createTimeStart) {
		this.createTimeStart = createTimeStart;
	}

	public String getCreateTimeStart() {
		return this.createTimeStart;
	}

	public void setCreateTimeEnd(String createTimeEnd) {
		this.createTimeEnd = createTimeEnd;
	}

	public String getCreateTimeEnd() {
		return this.createTimeEnd;
	}

	public void setNickNameFuzzy(String nickNameFuzzy) {
		this.nickNameFuzzy = nickNameFuzzy;
	}

	public String getNickNameFuzzy() {
		return this.nickNameFuzzy;
	}

	public void setPhoneFuzzy(String phoneFuzzy) {
		this.phoneFuzzy = phoneFuzzy;
	}

	public String getPhoneFuzzy() {
		return this.phoneFuzzy;
	}

	public void setSignatureFuzzy(String signatureFuzzy) {
		this.signatureFuzzy = signatureFuzzy;
	}

	public String getSignatureFuzzy() {
		return this.signatureFuzzy;
	}

	public void setStuJobNoFuzzy(String stuJobNoFuzzy) {
		this.stuJobNoFuzzy = stuJobNoFuzzy;
	}

	public String getStuJobNoFuzzy() {
		return this.stuJobNoFuzzy;
	}

}
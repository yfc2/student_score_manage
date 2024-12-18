package com.scoremg.entity.query;

import java.util.Date;

/**
 * @Description:查询
 * @Date:2024-12-18
 * @author：author
*/
public class CourseInfoQuery extends BaseQuery{

	/**
	 * 自增id
	 */
	private Integer courseId;

	/**
	 * 课程名称
	 */
	private String courseName;

	private String courseNameFuzzy;

	/**
	 * 教师id
	 */
	private String teacherId;

	private String teacherIdFuzzy;

	/**
	 * 课程描述
	 */
	private String description;

	private String descriptionFuzzy;

	/**
	 * 开始时间
	 */
	private Date startTime;

	private String startTimeStart;

	private String startTimeEnd;

	/**
	 * 结束时间
	 */
	private Date endTime;

	private String endTimeStart;

	private String endTimeEnd;

	/**
	 * 上课班级
	 */
	private String classRoom;

	private String classRoomFuzzy;

	/**
	 * 上课方式
	 */
	private Integer teachMethod;

	/**
	 * 最大上课人数
	 */
	private Integer maxEnrollment;

	/**
	 * 考核方式
	 */
	private String assesMethod;

	private String assesMethodFuzzy;

	public void setCourseId(Integer courseId) {
		this.courseId = courseId;
	}

	public Integer getCourseId() {
		return this.courseId;
	}

	public void setCourseName(String courseName) {
		this.courseName = courseName;
	}

	public String getCourseName() {
		return this.courseName;
	}

	public void setTeacherId(String teacherId) {
		this.teacherId = teacherId;
	}

	public String getTeacherId() {
		return this.teacherId;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public String getDescription() {
		return this.description;
	}

	public void setStartTime(Date startTime) {
		this.startTime = startTime;
	}

	public Date getStartTime() {
		return this.startTime;
	}

	public void setEndTime(Date endTime) {
		this.endTime = endTime;
	}

	public Date getEndTime() {
		return this.endTime;
	}

	public void setClassRoom(String classRoom) {
		this.classRoom = classRoom;
	}

	public String getClassRoom() {
		return this.classRoom;
	}

	public void setTeachMethod(Integer teachMethod) {
		this.teachMethod = teachMethod;
	}

	public Integer getTeachMethod() {
		return this.teachMethod;
	}

	public void setMaxEnrollment(Integer maxEnrollment) {
		this.maxEnrollment = maxEnrollment;
	}

	public Integer getMaxEnrollment() {
		return this.maxEnrollment;
	}

	public void setAssesMethod(String assesMethod) {
		this.assesMethod = assesMethod;
	}

	public String getAssesMethod() {
		return this.assesMethod;
	}

	public void setCourseNameFuzzy(String courseNameFuzzy) {
		this.courseNameFuzzy = courseNameFuzzy;
	}

	public String getCourseNameFuzzy() {
		return this.courseNameFuzzy;
	}

	public void setTeacherIdFuzzy(String teacherIdFuzzy) {
		this.teacherIdFuzzy = teacherIdFuzzy;
	}

	public String getTeacherIdFuzzy() {
		return this.teacherIdFuzzy;
	}

	public void setDescriptionFuzzy(String descriptionFuzzy) {
		this.descriptionFuzzy = descriptionFuzzy;
	}

	public String getDescriptionFuzzy() {
		return this.descriptionFuzzy;
	}

	public void setStartTimeStart(String startTimeStart) {
		this.startTimeStart = startTimeStart;
	}

	public String getStartTimeStart() {
		return this.startTimeStart;
	}

	public void setStartTimeEnd(String startTimeEnd) {
		this.startTimeEnd = startTimeEnd;
	}

	public String getStartTimeEnd() {
		return this.startTimeEnd;
	}

	public void setEndTimeStart(String endTimeStart) {
		this.endTimeStart = endTimeStart;
	}

	public String getEndTimeStart() {
		return this.endTimeStart;
	}

	public void setEndTimeEnd(String endTimeEnd) {
		this.endTimeEnd = endTimeEnd;
	}

	public String getEndTimeEnd() {
		return this.endTimeEnd;
	}

	public void setClassRoomFuzzy(String classRoomFuzzy) {
		this.classRoomFuzzy = classRoomFuzzy;
	}

	public String getClassRoomFuzzy() {
		return this.classRoomFuzzy;
	}

	public void setAssesMethodFuzzy(String assesMethodFuzzy) {
		this.assesMethodFuzzy = assesMethodFuzzy;
	}

	public String getAssesMethodFuzzy() {
		return this.assesMethodFuzzy;
	}

}
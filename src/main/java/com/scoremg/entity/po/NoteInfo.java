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
public class NoteInfo implements Serializable {

	/**
	 * id
	 */
	private Integer id;

	/**
	 * 课程id
	 */
	private Integer courseId;

	/**
	 * 标题
	 */
	private String title;

	/**
	 * 内容
	 */
	private String content;

	/**
	 * 发布人
	 */
	private String postBy;

	/**
	 * 发布时间
	 */
	@JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss",timezone="GMT+8")
	@DateTimeFormat(pattern = "yyyy-MM-dd HH:mm:ss")
	private Date postTime;

	/**
	 * 0: 教师 1：管理员
	 */
	private Integer type;

	public void setId(Integer id) {
		this.id = id;
	}

	public Integer getId() {
		return this.id;
	}

	public void setCourseId(Integer courseId) {
		this.courseId = courseId;
	}

	public Integer getCourseId() {
		return this.courseId;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getTitle() {
		return this.title;
	}

	public void setContent(String content) {
		this.content = content;
	}

	public String getContent() {
		return this.content;
	}

	public void setPostBy(String postBy) {
		this.postBy = postBy;
	}

	public String getPostBy() {
		return this.postBy;
	}

	public void setPostTime(Date postTime) {
		this.postTime = postTime;
	}

	public Date getPostTime() {
		return this.postTime;
	}

	public void setType(Integer type) {
		this.type = type;
	}

	public Integer getType() {
		return this.type;
	}

	@Override
	public String toString() {
		return "id:" + id + ",课程id:" + courseId + ",标题:" + title + ",内容:" + content + ",发布人:" + postBy + ",发布时间:" + postTime + ",0: 教师 1：管理员:" + type + "";
	}

}
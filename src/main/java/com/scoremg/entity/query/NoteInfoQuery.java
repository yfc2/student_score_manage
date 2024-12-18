package com.scoremg.entity.query;

import java.util.Date;

/**
 * @Description:查询
 * @Date:2024-12-18
 * @author：author
*/
public class NoteInfoQuery extends BaseQuery{

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

	private String titleFuzzy;

	/**
	 * 内容
	 */
	private String content;

	private String contentFuzzy;

	/**
	 * 发布人
	 */
	private String postBy;

	private String postByFuzzy;

	/**
	 * 发布时间
	 */
	private Date postTime;

	private String postTimeStart;

	private String postTimeEnd;

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

	public void setTitleFuzzy(String titleFuzzy) {
		this.titleFuzzy = titleFuzzy;
	}

	public String getTitleFuzzy() {
		return this.titleFuzzy;
	}

	public void setContentFuzzy(String contentFuzzy) {
		this.contentFuzzy = contentFuzzy;
	}

	public String getContentFuzzy() {
		return this.contentFuzzy;
	}

	public void setPostByFuzzy(String postByFuzzy) {
		this.postByFuzzy = postByFuzzy;
	}

	public String getPostByFuzzy() {
		return this.postByFuzzy;
	}

	public void setPostTimeStart(String postTimeStart) {
		this.postTimeStart = postTimeStart;
	}

	public String getPostTimeStart() {
		return this.postTimeStart;
	}

	public void setPostTimeEnd(String postTimeEnd) {
		this.postTimeEnd = postTimeEnd;
	}

	public String getPostTimeEnd() {
		return this.postTimeEnd;
	}

}
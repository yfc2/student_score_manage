package com.scoremg.mappers;
import org.apache.ibatis.annotations.Param;



/**
 * @Description::mapper
 * @Date:2024-12-18
 * @author：author
*/
public interface CourseInfoMapper<T,P> extends BaseMapper {


	/**
	 * 根据CourseId查询
	 */
	 T selectByCourseId(@Param("courseId") Integer courseId);

	/**
	 * 根据CourseId更新
	 */
	 Integer updateByCourseId(@Param("bean")T t, @Param("courseId") Integer courseId);

	/**
	 * 根据CourseId删除
	 */
	 Integer deleteByCourseId(@Param("courseId") Integer courseId);

}
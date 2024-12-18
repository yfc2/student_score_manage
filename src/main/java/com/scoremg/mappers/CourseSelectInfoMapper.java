package com.scoremg.mappers;
import org.apache.ibatis.annotations.Param;



/**
 * @Description::mapper
 * @Date:2024-12-18
 * @author：author
*/
public interface CourseSelectInfoMapper<T,P> extends BaseMapper {


	/**
	 * 根据Id查询
	 */
	 T selectById(@Param("id") Integer id);

	/**
	 * 根据Id更新
	 */
	 Integer updateById(@Param("bean")T t, @Param("id") Integer id);

	/**
	 * 根据Id删除
	 */
	 Integer deleteById(@Param("id") Integer id);


	/**
	 * 根据StudentIdAndCourseId查询
	 */
	 T selectByStudentIdAndCourseId(@Param("studentId") String studentId,@Param("courseId") Integer courseId);

	/**
	 * 根据StudentIdAndCourseId更新
	 */
	 Integer updateByStudentIdAndCourseId(@Param("bean")T t, @Param("studentId") String studentId,@Param("courseId") Integer courseId);

	/**
	 * 根据StudentIdAndCourseId删除
	 */
	 Integer deleteByStudentIdAndCourseId(@Param("studentId") String studentId,@Param("courseId") Integer courseId);

}
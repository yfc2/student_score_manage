package com.scoremg.mappers;
import org.apache.ibatis.annotations.Param;



/**
 * @Description::mapper
 * @Date:2024-12-18
 * @author：author
*/
public interface StudentClassInfoMapper<T,P> extends BaseMapper {


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
	 * 根据StudentIdAndClassId查询
	 */
	 T selectByStudentIdAndClassId(@Param("studentId") String studentId,@Param("classId") Integer classId);

	/**
	 * 根据StudentIdAndClassId更新
	 */
	 Integer updateByStudentIdAndClassId(@Param("bean")T t, @Param("studentId") String studentId,@Param("classId") Integer classId);

	/**
	 * 根据StudentIdAndClassId删除
	 */
	 Integer deleteByStudentIdAndClassId(@Param("studentId") String studentId,@Param("classId") Integer classId);

}
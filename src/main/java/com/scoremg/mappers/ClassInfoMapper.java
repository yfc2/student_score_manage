package com.scoremg.mappers;
import org.apache.ibatis.annotations.Param;



/**
 * @Description::mapper
 * @Date:2024-12-18
 * @author：author
*/
public interface ClassInfoMapper<T,P> extends BaseMapper {


	/**
	 * 根据ClassId查询
	 */
	 T selectByClassId(@Param("classId") Integer classId);

	/**
	 * 根据ClassId更新
	 */
	 Integer updateByClassId(@Param("bean")T t, @Param("classId") Integer classId);

	/**
	 * 根据ClassId删除
	 */
	 Integer deleteByClassId(@Param("classId") Integer classId);

}
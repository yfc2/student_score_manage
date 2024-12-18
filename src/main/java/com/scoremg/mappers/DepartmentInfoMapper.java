package com.scoremg.mappers;
import org.apache.ibatis.annotations.Param;



/**
 * @Description::mapper
 * @Date:2024-12-18
 * @author：author
*/
public interface DepartmentInfoMapper<T,P> extends BaseMapper {


	/**
	 * 根据DepartmentId查询
	 */
	 T selectByDepartmentId(@Param("departmentId") Integer departmentId);

	/**
	 * 根据DepartmentId更新
	 */
	 Integer updateByDepartmentId(@Param("bean")T t, @Param("departmentId") Integer departmentId);

	/**
	 * 根据DepartmentId删除
	 */
	 Integer deleteByDepartmentId(@Param("departmentId") Integer departmentId);


	/**
	 * 根据DepartmentName查询
	 */
	 T selectByDepartmentName(@Param("departmentName") String departmentName);

	/**
	 * 根据DepartmentName更新
	 */
	 Integer updateByDepartmentName(@Param("bean")T t, @Param("departmentName") String departmentName);

	/**
	 * 根据DepartmentName删除
	 */
	 Integer deleteByDepartmentName(@Param("departmentName") String departmentName);

}
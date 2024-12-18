package com.scoremg.mappers;
import org.apache.ibatis.annotations.Param;



/**
 * @Description::mapper
 * @Date:2024-12-18
 * @author：author
*/
public interface MajorInfoMapper<T,P> extends BaseMapper {


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

}
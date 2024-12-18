package com.scoremg.mappers;
import org.apache.ibatis.annotations.Param;



/**
 * @Description::mapper
 * @Date:2024-12-18
 * @author：author
*/
public interface UserInfoMapper<T,P> extends BaseMapper {


	/**
	 * 根据UserId查询
	 */
	 T selectByUserId(@Param("userId") String userId);

	/**
	 * 根据UserId更新
	 */
	 Integer updateByUserId(@Param("bean")T t, @Param("userId") String userId);

	/**
	 * 根据UserId删除
	 */
	 Integer deleteByUserId(@Param("userId") String userId);


	/**
	 * 根据Eamil查询
	 */
	 T selectByEamil(@Param("eamil") String eamil);

	/**
	 * 根据Eamil更新
	 */
	 Integer updateByEamil(@Param("bean")T t, @Param("eamil") String eamil);

	/**
	 * 根据Eamil删除
	 */
	 Integer deleteByEamil(@Param("eamil") String eamil);


	/**
	 * 根据StuJobNo查询
	 */
	 T selectByStuJobNo(@Param("stuJobNo") String stuJobNo);

	/**
	 * 根据StuJobNo更新
	 */
	 Integer updateByStuJobNo(@Param("bean")T t, @Param("stuJobNo") String stuJobNo);

	/**
	 * 根据StuJobNo删除
	 */
	 Integer deleteByStuJobNo(@Param("stuJobNo") String stuJobNo);


	/**
	 * 根据Username查询
	 */
	 T selectByUsername(@Param("username") String username);

	/**
	 * 根据Username更新
	 */
	 Integer updateByUsername(@Param("bean")T t, @Param("username") String username);

	/**
	 * 根据Username删除
	 */
	 Integer deleteByUsername(@Param("username") String username);


	/**
	 * 根据Phone查询
	 */
	 T selectByPhone(@Param("phone") String phone);

	/**
	 * 根据Phone更新
	 */
	 Integer updateByPhone(@Param("bean")T t, @Param("phone") String phone);

	/**
	 * 根据Phone删除
	 */
	 Integer deleteByPhone(@Param("phone") String phone);

}
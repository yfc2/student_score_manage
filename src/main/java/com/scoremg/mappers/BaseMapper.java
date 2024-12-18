package com.scoremg.mappers;


import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface BaseMapper<T, P> {

    /**
     * insert:(插入),</br>
     *
     * @param t
     * @return 返回结果集
     */
    Integer insert(@Param("bean") T t);

    /**
     * 插入或者更新
     *
     * @param t
     * @return
     */
    Integer insertOrUpdate(@Param("bean") T t);

    /**
     * 批量插入
     *
     * @param list
     * @return
     */
    Integer insertBatch(@Param("list") List<T> list);

    /**
     * 批量插入或者更新
     *
     * @param list
     * @return
     */
    Integer insertOrUpdateBatch(@Param("list") List<T> list);

    /**
     * 根据参数查询集合
     *
     * @param p
     * @return
     */
    List<T> selectList(@Param("query") P p);

    /**
     * 根据参数查询数量
     *
     * @param p
     * @return
     */
    Integer selectCount(@Param("query") P p);

     /**
      * deleteByParam:(多条件删除)
     */
     Integer deleteByParam(@Param("query") P p);



      /**
        * updateByParams:(多条件更新)
       */
      Integer updateByParam(@Param("bean") T t,@Param("query") P p);



}

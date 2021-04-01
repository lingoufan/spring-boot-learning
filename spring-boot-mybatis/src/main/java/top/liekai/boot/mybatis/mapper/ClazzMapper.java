package top.liekai.boot.mybatis.mapper;

import top.liekai.boot.mybatis.domain.Clazz;

/**
 * @author admin
 */
public interface ClazzMapper {
//    /**
//     *
//     * @param clazzId
//     * @return
//     */
//    Clazz getClazzOneToMany(int  clazzId);

   /**
    *
    * @param clazzId 对象
    * @return   返回
    */
   Clazz getClazz(int clazzId);

}
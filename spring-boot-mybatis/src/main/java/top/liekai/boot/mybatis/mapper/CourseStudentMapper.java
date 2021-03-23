package top.liekai.boot.mybatis.mapper;

import top.liekai.boot.mybatis.domain.CourseStudent;

/**
 * @author admin
 */
public interface CourseStudentMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(CourseStudent record);

    int insertSelective(CourseStudent record);

    CourseStudent selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(CourseStudent record);

    int updateByPrimaryKey(CourseStudent record);
}
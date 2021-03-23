package top.liekai.boot.mybatis.mapper;

import top.liekai.boot.mybatis.domain.Course;

/**
 * @author admin
 */
public interface CourseMapper {
    int deleteByPrimaryKey(Integer courseId);

    int insert(Course record);

    int insertSelective(Course record);

    Course selectByPrimaryKey(Integer courseId);

    int updateByPrimaryKeySelective(Course record);

    int updateByPrimaryKey(Course record);
}
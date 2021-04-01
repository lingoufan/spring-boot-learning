package top.liekai.boot.mybatis.mapper;

import top.liekai.boot.mybatis.domain.Course;

import java.util.List;

/**
 * @author admin
 */
public interface CourseMapper {
    List<Course> selectAll();
}
package top.liekai.boot.mybatis.mapper;

import top.liekai.boot.mybatis.domain.Teacher;

/**
 * @author admin
 */
public interface TeacherMapper {
    /**
     *
     * @return teacher 对象
     */
    Teacher  getTeacherOneByone( int teacherId);
}
package top.liekai.boot.mybatis.mapper;

import org.apache.ibatis.annotations.Select;import top.liekai.boot.mybatis.domain.Teacher;import java.util.List;

public interface TeacherMapper {
    int deleteByPrimaryKey(Integer teacherId);

    int insert(Teacher record);

    int insertSelective(Teacher record);

    Teacher selectByPrimaryKey(Integer teacherId);

    int updateByPrimaryKeySelective(Teacher record);

    int updateByPrimaryKey(Teacher record);

    /**
     * 返回所有的teacher，用注解实现
     *
     * @return List<Teacher>
     */
    @Select("SELECT  * FROM t_teacher ")
    List<Teacher> selectAll();

    /**
     * 返回所有的Teacher,用xml实现
     *
     * @Return List<Teacher>
     */
    List<Teacher> findAll();
}
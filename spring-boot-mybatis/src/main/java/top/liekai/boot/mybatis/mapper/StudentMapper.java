package top.liekai.boot.mybatis.mapper;


import top.liekai.boot.mybatis.domain.Student;

/**
 * @author admin
 */
public interface StudentMapper {
//    /**
//     *
//     * @param studentId
//     * @return
//     */
//    Student  getStidentManyToOne(int  studentId);

    Student getStudent(int studentId);
}

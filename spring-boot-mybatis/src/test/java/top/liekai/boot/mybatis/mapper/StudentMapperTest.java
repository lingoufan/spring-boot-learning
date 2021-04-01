package top.liekai.boot.mybatis.mapper;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit.jupiter.SpringExtension;
import top.liekai.boot.mybatis.domain.Student;

import javax.annotation.Resource;

import static org.junit.jupiter.api.Assertions.assertEquals;

@SpringBootTest
@ExtendWith(SpringExtension.class)
class StudentMapperTest {
    @Resource
    private StudentMapper studentMapper;

//    @Test
//    void getStidentManyToOne() {
//        Student student = studentMapper.getStidentManyToOne(1011);
//        System.out.println(student);
//    }

    @Test
    void getStudentManyToOne() {
        Student student = studentMapper.getStudent(1011);
        System.out.println(student);
        assertEquals(1011,student.getStudentId());
        assertEquals("林欣怡",student.getStudentName());
        assertEquals(1,student.getClazz().getClazzId());
        assertEquals("软件1921",student.getClazz().getClazzName());
        assertEquals(1,student.getCourses().size());
    }
}
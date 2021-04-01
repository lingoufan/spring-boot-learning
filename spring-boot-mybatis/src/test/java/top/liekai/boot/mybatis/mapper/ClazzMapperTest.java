package top.liekai.boot.mybatis.mapper;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit.jupiter.SpringExtension;
import top.liekai.boot.mybatis.domain.Clazz;

import javax.annotation.Resource;

import static org.junit.jupiter.api.Assertions.assertEquals;

@SpringBootTest
@ExtendWith(SpringExtension.class)
class ClazzMapperTest {
    @Resource
    private ClazzMapper clazzMapper;

    @Test
    void getClazz(){
        Clazz clazz = clazzMapper.getClazz(1);
        assertEquals("软件1921",clazz.getClazzName());
        assertEquals(1,clazz.getClazzId());
        assertEquals(1,clazz.getTeacher().getTeacherId());
        assertEquals("许老师",clazz.getTeacher().getTeacherName());
        assertEquals(21,clazz.getStudents().size());
        System.out.println("班级信息：");
        System.out.println(clazz.getClazzId()+","+clazz.getClazzName());
        System.out.println("班级教师信息：");
        System.out.println(clazz.getTeacher().getTeacherId()+","+clazz.getTeacher().getTeacherName());
        System.out.println("班级学生：");
        clazz.getStudents().forEach(student -> System.out.println(student.getStudentName()+","+student.getHometown()));

    }
}

//    @Test
//    void getClazzOneToMany() {
//        Clazz clazz = clazzMapper.getClazzOneToMany(1);
//        System.out.println(clazz);
////        assertEquals("软件1921",clazz.getClazzName());
////        assertEquals(1,clazz.getClazzId());
////        assertEquals(21,clazz.getStudents().size());
//    }





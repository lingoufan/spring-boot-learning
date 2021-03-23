package top.liekai.boot.mybatis.mapper;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit.jupiter.SpringExtension;
import top.liekai.boot.mybatis.domain.Teacher;

import javax.annotation.Resource;
import java.util.List;
@SpringBootTest
@ExtendWith(SpringExtension.class)
class TeacherMapperTest {
    @Resource
    private  TeacherMapper teacherMapper;
    @Test
    void selectAll() {
        List<Teacher> teachers = teacherMapper.selectAll();
        System.out.println(teachers);
    }

    @Test
    void findAll() {
        List<Teacher> teachers = teacherMapper.findAll();
        System.out.println(teachers);
    }

    @Test
    void testSelectAll() {
    }

    @Test
    void testFindAll() {
    }
}
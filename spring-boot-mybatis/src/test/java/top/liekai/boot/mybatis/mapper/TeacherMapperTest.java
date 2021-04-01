package top.liekai.boot.mybatis.mapper;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit.jupiter.SpringExtension;
import top.liekai.boot.mybatis.domain.Teacher;

import javax.annotation.Resource;
@SpringBootTest
@ExtendWith(SpringExtension.class)
class TeacherMapperTest {
    @Resource
    private  TeacherMapper teacherMapper;
    @Test
    void getTeacherOneByone() {
        Teacher teacher= teacherMapper.getTeacherOneByone(1);
        System.out.println(teacher);

    }
}
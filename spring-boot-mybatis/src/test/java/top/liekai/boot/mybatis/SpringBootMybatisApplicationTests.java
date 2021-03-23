package top.liekai.boot.mybatis;

import org.junit.jupiter.api.Test;
import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
@MapperScan("top.liekai.boot.mybatis.mapper")
class SpringBootMybatisApplicationTests {

    @Test
    void contextLoads() {
    }

}

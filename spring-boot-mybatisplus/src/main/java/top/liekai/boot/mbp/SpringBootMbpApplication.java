package top.liekai.boot.mbp;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@MapperScan(basePackages = {"top.liekai.boot.mbp.mapper"})
public class SpringBootMbpApplication {

    public static void main(String[] args) {
        SpringApplication.run(SpringBootMbpApplication.class, args);
    }

}

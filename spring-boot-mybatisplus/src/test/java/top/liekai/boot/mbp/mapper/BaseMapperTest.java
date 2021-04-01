package top.liekai.boot.mbp.mapper;

import com.baomidou.mybatisplus.core.conditions.query.LambdaQueryWrapper;
import com.baomidou.mybatisplus.core.toolkit.Wrappers;
import com.baomidou.mybatisplus.extension.conditions.query.LambdaQueryChainWrapper;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit.jupiter.SpringExtension;
import top.liekai.boot.mbp.entity.User;

import javax.annotation.Resource;
import java.util.List;

@SpringBootTest
@ExtendWith(SpringExtension.class)
class BaseMapperTest {
    @Resource
    private UserMapper userMapper;

    @Test
    void delete() {
    }

    @Test
    void update() {

    }

//    @Test
//    //  1 、like条件构造
//    void selectOne() {
//        String name = "";
//        String email = "test5@baomidou.com";
//        QueryWrapper<User> query = new QueryWrapper<>();
//        query.like(StringUtils.isNotEmpty(name), "name", name).like(StringUtils.isNotEmpty(email), "email", email);
//        List<User> list = userMapper.selectList(query);
//        list.forEach(System.out::println);
//    }
//    @Test
//    //2 、allEq条件构造器
//    void selectOne() {
//        QueryWrapper<User> query = new QueryWrapper<>();
//        Map<String, Object> params = new HashMap<>();
//        params.put("name", "Jack");
//        params.put("age", 18);
//        params.put("email", null);
//        //参数不能是name，所以查询条件被过滤掉
//        query.allEq((k, v) -> !k.equals("name"), params, false);
//        List<User> list = userMapper.selectList(query);
//        list.forEach(System.out::println);
//    }

    @Test
    void selectCount() {
        LambdaQueryWrapper<User> lambdaQ = Wrappers.lambdaQuery();
        //lt -->  小于
        lambdaQ.like(User::getName, "Jack").lt(User::getAge, 18);
        List<User> list = userMapper.selectList(lambdaQ);
        System.out.println(list);
    }

    //    @Test
//    void selectOne() {
//        //3  、lambda条件构造器（1）
//        LambdaQueryWrapper<User> lambdaQ= Wrappers.lambdaQuery();
//        //lt -->  小于
//        lambdaQ.like(User::getName, "Jack").lt(User::getAge, 18);
//        List<User>list=userMapper.selectList(lambdaQ);
//        list.forEach(System.out::println)
//    }
    @Test
    void selectOne() {
        //3  、lambda条件构造器 （2）
        List<User> list = new LambdaQueryChainWrapper< User >
                (userMapper)
                        .likeRight(User::getName, "Jack")
                        //and 表示嵌套
                        .and(q -> q.lt(User::getAge, 40)
                                //主动调用or表示紧接着下一个方法，而不是用and连接
                                .or()
                                .isNotNull(User::getEmail))
                        .list();
        list.forEach(System.out::println);
    }

    @Test
    void selectList() {
    }

    @Test
    void selectMaps() {
    }

    @Test
    void selectObjs() {
    }

    @Test
    void selectPage() {
    }

    @Test
    void selectMapsPage() {
    }
}
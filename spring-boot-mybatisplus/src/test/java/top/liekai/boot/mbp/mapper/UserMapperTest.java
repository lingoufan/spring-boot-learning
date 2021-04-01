package top.liekai.boot.mbp.mapper;

import com.baomidou.mybatisplus.core.conditions.update.UpdateWrapper;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;
import top.liekai.boot.mbp.entity.User;

import javax.annotation.Resource;
import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;
@SpringBootTest
class UserMapperTest {

    @Resource
    private  UserMapper userMapper;

    @Test
    void save(){
        User user = User.builder().name("fanfanfan").age(19).email("fanfanfan@gmail.com").build();

        int row = userMapper.insert(user);
        assertEquals(1, row);

        System.out.println("ID " + user.getId());
        
    }
    @Test
    void  deleteByid() {
        int row= userMapper.deleteById(2);
        assertEquals(1,row);
        System.out.println();
    }

    @Test
    void update() {
        User user = User.builder()
                .id(2L)
                .name("林凡")
                .age(20)
                .email("1400695792@qq.com")
                .build();
        int row = userMapper.updateById(user);
        assertEquals(1,row);
        System.out.println(""+user.getName());
    }

    @Test
    void deleteBatchIds(){
        List list = new ArrayList();
        list.add(2);
        list.add(3);
       int rows= userMapper.deleteBatchIds(list);
       assertEquals(2,rows);
    }
    @Test
    void  selectByid(){
        User user = userMapper.selectById(1);
        System.out.println(user);
    }
    @Test
    void updateByAgeAndName() {
        UpdateWrapper<User> update = new UpdateWrapper<>();
        update.eq("name","lin").eq("age",20);

        User  user =new User();
        user.setAge(21);
        user.setEmail("1400695792@qq.com");
        int rows = userMapper.update(user, update);
        System.out.println(rows);
    }
}
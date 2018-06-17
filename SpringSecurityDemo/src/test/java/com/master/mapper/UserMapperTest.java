package com.master.mapper;

import com.master.domain.SysRole;
import com.master.domain.SysUser;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.List;
import java.util.Map;

@RunWith(SpringRunner.class)
@SpringBootTest
public class UserMapperTest {
    @Autowired
    private UserMapper userMapper;

    @Test
    public void testFindUserById() {
        SysUser user = userMapper.findUserById(1);
        System.out.println(user);
    }

    @Test
    public void testFindByUserName() {
        SysUser user = userMapper.findByUserName("admin");
        System.out.println(user);
        if (user.getRoles() != null) {
            List<SysRole> roles = user.getRoles();
            for (int i = 0; i < roles.size(); i++)
                System.out.println(roles.get(i));
        } else {
            System.out.println("null");
        }
    }

    @Test
    public void testFindAllUser() {
        List<Map<String, Object>> users = userMapper.findAllUser();
        if (users != null) {
            for (int i = 0; i < users.size(); i++) {
                Map<String, Object> user = users.get(i);
                System.out.println(user.get("id"));
                System.out.println(user.get("username"));
                System.out.println(user.get("password"));
            }
        }
    }
}


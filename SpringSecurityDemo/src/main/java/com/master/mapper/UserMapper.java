package com.master.mapper;

import com.master.domain.SysRole;
import com.master.domain.SysUser;
import org.apache.ibatis.annotations.*;

import java.util.List;
import java.util.Map;

public interface UserMapper {

    @Select("select u.id, " +
            "u.username, " +
            "u.password, " +
            "r.name from " +
            "sys_user u " +
            "left join sys_role_user ru on u.id = ru.sys_user_id " +
            "left join sys_role r on ru.sys_role_id = r.id " +
            "where username = #{username}")
    @ResultMap({"userMap"})
    SysUser findByUserName(String username);

    @Select("select * from sys_user where id=#{id}")
    SysUser findUserById(int id);

    List<Map<String, Object>> findAllUser();
}

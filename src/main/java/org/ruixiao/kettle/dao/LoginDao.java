package org.ruixiao.kettle.dao;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;
import org.ruixiao.kettle.pojo.User;

/**
 * @author Rui Shaw
 * @version 1.0
 * @date 2020/5/17 20:36
 * @desc
 */
@Mapper
public interface LoginDao {
    /**
     * find user by username and password
     * @param username
     * @param password
     * @return exists login user
     */
    @Select("select * from user where username = #{username} and password = #{password}")
    User findUserByUP(@Param("username") String username, @Param("password") String password);
}

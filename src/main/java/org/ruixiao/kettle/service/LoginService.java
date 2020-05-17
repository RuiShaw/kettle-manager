package org.ruixiao.kettle.service;

import org.ruixiao.kettle.dao.LoginDao;
import org.ruixiao.kettle.pojo.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * @author Rui Shaw
 * @version 1.0
 * @date 2020/5/17 20:47
 * @desc
 */
@Service
public class LoginService {

    @Autowired
    private LoginDao loginDao;

    /**
     * query user
     * @param username
     * @param password
     * @return
     */
    public User queryUser(String username, String password) {
        return loginDao.findUserByUP(username, password);
    }
}

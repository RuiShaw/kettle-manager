package org.ruixiao.kettle.controller;

import org.ruixiao.kettle.pojo.User;
import org.ruixiao.kettle.result.Result;
import org.springframework.web.bind.annotation.*;

/**
 * @author Rui Shaw
 * @version 1.0
 * @date 2020/5/17 20:29
 * @desc
 */
@RestController
@RequestMapping("/api")
public class LoginController {
    /**
     * administrator username
     */
    private static final String ADMIN = "admin";

    @CrossOrigin
    @RequestMapping("/login")
    @ResponseBody
    public Result login(@RequestBody User requestUser) {
        String username = requestUser.getUsername();

        //TODO need to validate the user
        if (ADMIN.equals(username)) {
            System.out.println("administrator");
        } else {
            System.out.println("other users");
        }
        return new Result(200);
    }
}

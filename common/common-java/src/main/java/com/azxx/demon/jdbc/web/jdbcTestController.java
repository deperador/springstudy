package com.azxx.demon.jdbc.web;

import com.azxx.demon.jdbc.entity.User;
import com.azxx.demon.jdbc.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.logging.Logger;

@RestController
@RequestMapping("jdbctest")
public class jdbcTestController {

    private static Logger logger = Logger.getLogger(jdbcTestController.class.getName());

    @Autowired
    private UserService userService;

    @GetMapping("insert")
    public String testInsert(@RequestParam String name,@RequestParam(required = true) int age){
        logger.info("enter the insert method!");
        User user = new User(name,age);
        userService.insert(user);
        return "插入成功！";
    }
}

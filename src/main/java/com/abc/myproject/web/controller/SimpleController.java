package com.abc.myproject.web.controller;

import com.abc.myproject.service.TestService;
import com.abc.myproject.vo.User;
import com.abc.myproject.vo.UserInput;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;


@RestController
@RequestMapping( value = "")
public class SimpleController {

    @Autowired
    TestService testService;

    @RequestMapping(method = RequestMethod.GET, value = "/hello")
    public String getString() {
        return "Kanchu";
    }


    @RequestMapping(method = RequestMethod.GET, value = "/user")
    public User getUser() {
        User anupamaUser = testService.getUser("Anu","anu@test.com");
        return anupamaUser;
    }
    @RequestMapping(method = RequestMethod.POST, value = "/user")
    public User saveUser(@RequestBody UserInput userInput) {
        User anupamaUser = testService.getUser(userInput);
        return anupamaUser;
    }
}

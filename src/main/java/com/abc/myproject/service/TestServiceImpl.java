package com.abc.myproject.service;

import com.abc.myproject.vo.User;
import com.abc.myproject.vo.UserInput;
import org.springframework.stereotype.Service;

@Service
public class TestServiceImpl implements TestService {
    @Override
    public User getUser(String name, String email) {
        User user = new User(email, name);
        return user;
    }

    @Override
    public User getUser(UserInput userInput) {
        User user = new User();
        String email =userInput.getFirstName()+userInput.getLastName();
        user.setEmail(email);
        user.setName(userInput.getFirstName());
        return user;
    }
}

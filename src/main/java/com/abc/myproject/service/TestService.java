package com.abc.myproject.service;

import com.abc.myproject.vo.User;
import com.abc.myproject.vo.UserInput;

public interface TestService {

    User getUser(String name, String email);

    User getUser(UserInput userInput);

}

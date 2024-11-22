package com.spring.Application.Controller;

import com.spring.Application.Model.User;
import com.spring.Application.Service.AuthService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class loginController {
    @Autowired
    private AuthService authService;

    @PostMapping("/save")
    public String save(@RequestBody User user)
    {
        return authService.authenticate(user);
    }


}

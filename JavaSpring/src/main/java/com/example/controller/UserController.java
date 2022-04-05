package com.example.controller;

import com.example.accessingdatamysql.User;
import com.example.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;


@RestController
@RequestMapping("/rest")
public class UserController {
    @Autowired
    private UserService userService;

    @RequestMapping(value = "/user",method = RequestMethod.GET,
            produces = {
                MediaType.APPLICATION_JSON_VALUE,
                MediaType.APPLICATION_XML_VALUE
    })
    @ResponseBody
    public List<User> getUser(Model model){
        List<User> userList = userService.getAllUser();
//        model.addAttribute("personForm",userList);
//
        return userList;
    }


}

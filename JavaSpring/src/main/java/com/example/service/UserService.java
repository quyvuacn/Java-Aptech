package com.example.service;

import com.example.accessingdatamysql.User;
import com.example.dao.UserDao;
import org.hibernate.Session;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;
import java.util.List;

@Service
@Transactional
public class UserService {
    @Autowired
    private UserDao userDao;

    public User getUser(Integer id){
        return userDao.getUser(id);
    }


    public User addUser(User userForm){
        return  userDao.addUser(userForm);
    }

    public User updateUser(User form){
        return userDao.updateUser(form);
    }

    public void deleteUser(Integer id){
        userDao.deleteUser(id);
    }

    public List<User> getAllUser(){
        List<User> listUser = userDao.getAllUser();
        return listUser;
    }


}

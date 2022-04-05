package com.example.dao;

import com.example.accessingdatamysql.User;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public class UserDao {
    @Autowired
    private SessionFactory sessionFactory;

    public User getUser(Integer id){
        Session session = sessionFactory.getCurrentSession();
        User user = (User) session.get(User.class,id);
        return  user;
    }

    public User addUser(User userForm){
        Session session = sessionFactory.getCurrentSession();
        session.save(userForm);
        return  userForm;
    }

    public User updateUser(User form){
        Session session = sessionFactory.getCurrentSession();
        User user = (User) session.get(User.class,form.getId());
        user.setName(form.getName());
        user.setAge(form.getAge());
        session.update(user);
        return user;
    }

    public void deleteUser(Integer id){
        Session session = sessionFactory.getCurrentSession();
        User user = (User) session.get(User.class,id);
        session.delete(user);
    }

    public List<User> getAllUser(){
        Session session = sessionFactory.getCurrentSession();
        @SuppressWarnings("unchecked")
        List<User> listUser = (List<User>) session.createQuery("From" + User.class.getName()).list();
        return listUser;
    }




}

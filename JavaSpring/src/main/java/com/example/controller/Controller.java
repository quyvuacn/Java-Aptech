package com.example.controller;
import com.example.model.Person;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;


@org.springframework.stereotype.Controller
public class Controller {


    private static List<Person> personList = new ArrayList<Person>();
    static{
        personList.add(new Person("Vu Viet Quy",20));
        personList.add(new Person("Dang Kim Thi",40));
    }


    @RequestMapping(value = {"/PersonList"},method = RequestMethod.GET)
    public String  PersonList(final Model model){
        model.addAttribute("personList",personList);
        return "personList";
    }

    @RequestMapping(value = {"/AddPerson"},method = RequestMethod.GET)
    public String  ShowAddPerson(final Model model){
        Person personForm = new Person();
        model.addAttribute("personForm",personForm);
       return "addPerson";
    }


    @RequestMapping(value = {"/AddPerson"},method = RequestMethod.POST)
    public String  SaveAddPerson(Model model,@ModelAttribute("personForm") Person personForm){
        personList.add(personForm);
        return "redirect:/PersonList";
    }


    @RequestMapping("/")
    public String welcome(final Model model){
        model.addAttribute("message","Hello Spring");
        return "index";
    }

    @RequestMapping("/hello/{param}")
    @ResponseBody
    public String hello(@PathVariable("param") String param){
        return "Hello " + param;
    }


}

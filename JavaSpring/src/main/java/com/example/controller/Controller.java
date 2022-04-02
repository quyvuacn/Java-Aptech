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
        personList.add(new Person(1,"Vu Viet Quy",20));
        personList.add(new Person(2,"Dang Kim Thi",40));
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

    @RequestMapping(value = {"/UpdatePerson/{id}"},method = RequestMethod.GET)
    public String  SaveAddPerson(Model model,@ModelAttribute("personForm") Person personForm,@PathVariable("id") int id){
        for (Person item:personList) {
            if(item.getId()==id){
                personForm.setId(item.getId());
                personForm.setName(item.getName());
                personForm.setAge(item.getAge());
            }
        }
        model.addAttribute("personForm",personForm);

        return "updatePerson";
    }
    @RequestMapping(value = {"/UpdatePerson/{id}"},method = RequestMethod.PUT)
    public String  UpdatePerson(Model model,@ModelAttribute("personForm") Person personForm,@PathVariable("id") int id){
        for (Person item:personList) {
            if(item.getId()==id){
                item.setName(personForm.getName());
                item.setAge(personForm.getAge() );
            }
        }

        return "redirect:/PersonList";
    }
    @RequestMapping(value = {"/DeletePerson/{id}"})
    public String  DeletePerson(Model model,@ModelAttribute("personForm") Person personForm,@PathVariable("id") int id){
        for (Person item:personList) {
            if(item.getId()==id){
                personList.remove(item);
            }
        }

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

package com.example.demo;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.ModelAndView;

import java.util.List;

@RestController
public class ContactController {

    @Autowired
    public ContactServiceImpl contactService;

    /*@RequestMapping("/")
    public ModelAndView index()
    {

        return new ModelAndView("/WEB_INF/index.html");
    }*/

    @RequestMapping("/")
    public ModelAndView index()
    {
        return new ModelAndView("index");
    }

    @RequestMapping("/showContacts")
    public List<Contact> getAllContacts()
    {
        return  contactService.getAllContacts();
    }

    @RequestMapping(value = "/addUser", method = RequestMethod.POST)
    public List<Contact> addContact(@RequestParam("firstName") String firstName,
                           @RequestParam("lastName") String lastName,
                           @RequestParam("email") String email,
                           @RequestParam("cellNo") String cellNo)
    {
        Contact contact = new Contact();
        contact.setFirstname(firstName);
        contact.setLastname(lastName);
        contact.setEmail(email);
        contact.setCellno(cellNo);

        contactService.addContact(contact);
        return getAllContacts();
    }

}

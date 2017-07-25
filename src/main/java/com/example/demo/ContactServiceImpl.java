package com.example.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class ContactServiceImpl {

    @Autowired
    private ContactRepository contactRepository;

    public List<Contact> getAllContacts()
    {
        List<Contact> contacts=new ArrayList<>();
        contactRepository.findAll().forEach(contacts::add);
        return contacts;
    }

    public void addContact(Contact contact)
    {
        contactRepository.save(contact);
    }


}

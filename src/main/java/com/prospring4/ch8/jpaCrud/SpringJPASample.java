package com.prospring4.ch8.jpaCrud;

import java.util.List;
import java.util.Date;
import java.util.Set;

import org.springframework.context.support.GenericXmlApplicationContext;

public class SpringJPASample {
    public static void main(String[] args) {
        GenericXmlApplicationContext ctx = new GenericXmlApplicationContext();
        ctx.load("classpath:spring/app-context-jpaCrud-annotation.xml");
        ctx.refresh();

        ContactService contactService = ctx.getBean(
            "jpaContactService", ContactService.class);
        
        List<Contact> contacts = contactService.findAllByNativeQuery();

        for(Contact contact : contacts) {
            System.out.println(contact);
        }
    }
}

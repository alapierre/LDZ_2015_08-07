/*
 * Copyright 2015-08-07the original author or authors.
 */
package pl.altkom.ldz.crm.web.controller;

import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import pl.altkom.ldz.crm.web.model.Person;

/**
 *
 * @author Adrian Lapierre <adrian@soft-project.pl>
 */
@RestController
@RequestMapping("/rest")
public class MyRestController {
    
    @RequestMapping(value = "/person", 
            method = RequestMethod.GET, 
            produces = MediaType.APPLICATION_JSON_VALUE)
    public Person loadPerson() {
        
        Person p = new Person();
        p.setLastName("Kowalski");
        p.setName("Jan");
        
        return p;
        
    }
    
    @RequestMapping(value = "/person",
                    method = RequestMethod.POST)
    private Person save(@RequestBody Person person) {
        
        System.out.println(person);
        
        return person;
        
    }
    
}

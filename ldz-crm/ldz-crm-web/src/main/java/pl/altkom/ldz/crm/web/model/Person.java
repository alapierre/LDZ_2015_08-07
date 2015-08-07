/*
 * Copyright 2015-08-07the original author or authors.
 */
package pl.altkom.ldz.crm.web.model;

/**
 *
 * @author Adrian Lapierre <adrian@soft-project.pl>
 */
public class Person {
   
    private String name;
    private String lastName;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    @Override
    public String toString() {
        return "Person{" + "name=" + name + ", lastName=" + lastName + '}';
    }
    
    
    
}

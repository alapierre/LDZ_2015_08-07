/*
 * Copyright 2015-08-07the original author or authors.
 */
package pl.altkom.ldz.crm.core.model;

import java.io.Serializable;
import javax.persistence.Embeddable;

/**
 *
 * @author Adrian Lapierre <adrian@soft-project.pl>
 */
@Embeddable
public class Address implements Serializable {
    
    private String city;
    private String postCode;
    private String street;

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getPostCode() {
        return postCode;
    }

    public void setPostCode(String postCode) {
        this.postCode = postCode;
    }

    public String getStreet() {
        return street;
    }

    public void setStreet(String street) {
        this.street = street;
    }
    
    
    
}

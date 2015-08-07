/*
 * Copyright 2015-08-07the original author or authors.
 */
package pl.altkom.ldz.crm.core.model;

import javax.persistence.Embedded;
import javax.persistence.Entity;
import javax.validation.constraints.Size;

/**
 *
 * @author Adrian Lapierre <adrian@soft-project.pl>
 */
@Entity
public class Company extends BaseEntity{
    
    private String name;
    
    @Embedded
    private Address address;
    
    @Size(max = 15)
    private String nip;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Address getAddress() {
        return address;
    }

    public void setAddress(Address address) {
        this.address = address;
    }

    public String getNip() {
        return nip;
    }

    public void setNip(String nip) {
        this.nip = nip;
    }
    
}

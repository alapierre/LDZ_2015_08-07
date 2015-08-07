/*
 * Copyright 2015-08-07the original author or authors.
 */
package pl.altkom.ldz.crm.core.model;

import javax.persistence.Entity;

/**
 *
 * @author Adrian Lapierre <adrian@soft-project.pl>
 */
@Entity
public class Commodity extends BaseEntity{
    
    private String name;
    private double price;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }
    
}

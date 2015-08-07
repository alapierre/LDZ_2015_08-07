/*
 * Copyright 2015-08-07the original author or authors.
 */
package pl.altkom.ldz.crm.core.model;

import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

/**
 *
 * @author Adrian Lapierre <adrian@soft-project.pl>
 */
@Entity
public class InvoiceItem extends BaseEntity {
    
    private int lp;
    private double price;
    private int volume;
    
    @ManyToOne
    @JoinColumn(name = "commodity_id")
    private Commodity commodity;
    
    
    public int getLp() {
        return lp;
    }

    public void setLp(int lp) {
        this.lp = lp;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public int getVolume() {
        return volume;
    }

    public void setVolume(int volume) {
        this.volume = volume;
    }

    public Commodity getCommodity() {
        return commodity;
    }

    public void setCommodity(Commodity commodity) {
        this.commodity = commodity;
    }
    
}

/*
 * Copyright 2015-08-07the original author or authors.
 */
package pl.altkom.ldz.crm.core.model;

import java.util.Date;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.Set;
import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.OrderBy;
import javax.validation.constraints.Size;

/**
 *
 * @author Adrian Lapierre <adrian@soft-project.pl>
 */
@Entity
public class Invoice extends BaseEntity {
    
    private int number;
    
    @Size(max = 128)
    private String placeOfIssue;
    
    private Date issuedDate;

    @ManyToOne
    @JoinColumn(name = "seller_id")
    private Company seller;
    
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "invoice")
    @OrderBy("lp")
    private Set<InvoiceItem> items = new LinkedHashSet<>();
    
    public int getNumber() {
        return number;
    }

    public void setNumber(int number) {
        this.number = number;
    }

    public String getPlaceOfIssue() {
        return placeOfIssue;
    }

    public void setPlaceOfIssue(String placeOfIssue) {
        this.placeOfIssue = placeOfIssue;
    }

    public Date getIssuedDate() {
        return issuedDate;
    }

    public void setIssuedDate(Date issuedDate) {
        this.issuedDate = issuedDate;
    }

    public Company getSeller() {
        return seller;
    }

    public void setSeller(Company seller) {
        this.seller = seller;
    }

    public Set<InvoiceItem> getItems() {
        return items;
    }

    public Invoice addItem(InvoiceItem item) {
        item.setInvoice(this);
        items.add(item);
        return this;
    }
    
}

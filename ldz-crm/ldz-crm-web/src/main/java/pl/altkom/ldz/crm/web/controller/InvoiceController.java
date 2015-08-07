/*
 * Copyright 2015-08-07the original author or authors.
 */
package pl.altkom.ldz.crm.web.controller;

import java.util.Date;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import pl.altkom.ldz.crm.core.dao.InvoiceDAO;
import pl.altkom.ldz.crm.core.model.Invoice;

/**
 *
 * @author Adrian Lapierre <adrian@soft-project.pl>
 */
@RestController
@RequestMapping("/rest")
public class InvoiceController {
    
    @Autowired
    private InvoiceDAO invoiceDAO;
    
    @RequestMapping(value = "/invoice/{id}")
    public Invoice load(@PathVariable("id") long id) {
        
        return invoiceDAO.findOne(id);
        
    }
    
    @RequestMapping("/initInv")
    private void init() {
        
        Invoice invoice = new Invoice();
        
        invoice.setNumber(1);
        invoice.setIssuedDate(new Date());
        invoice.setPlaceOfIssue("Łódź");
        
        invoiceDAO.save(invoice);
        
    }
    
}

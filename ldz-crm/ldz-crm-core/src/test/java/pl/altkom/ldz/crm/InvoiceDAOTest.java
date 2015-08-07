/*
 * Copyright 2015-08-07the original author or authors.
 */
package pl.altkom.ldz.crm;

import java.util.Date;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.transaction.annotation.Transactional;
import pl.altkom.ldz.crm.core.dao.InvoiceDAO;
import pl.altkom.ldz.crm.core.dao.InvoiceItemDAO;
import pl.altkom.ldz.crm.core.model.Invoice;
import pl.altkom.ldz.crm.core.model.InvoiceItem;

/**
 *
 * @author Adrian Lapierre <adrian@soft-project.pl>
 */
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration("/ldz-crm-core.xml")
public class InvoiceDAOTest {
    
    @Autowired    
    private InvoiceDAO invoiceDAO;
    
    @Autowired
    private InvoiceItemDAO invoiceItemDAO;
    
    @Test
    @Transactional
    public void testCreate() {
        
        Invoice invoice = new Invoice();
        
        invoice.setNumber(1);
        invoice.setIssuedDate(new Date());
        invoice.setPlaceOfIssue("Łódź");
        
        InvoiceItem item = new InvoiceItem();
        item.setLp(1);
        item.setPrice(123);
        item.setVolume(1);
        
        invoice
                .addItem(new InvoiceItem(1, 123, 1))
                .addItem(new InvoiceItem(2, 234, 1));
        
        //invoiceItemDAO.save(item);
        invoiceDAO.save(invoice);
        
        Invoice invoiceFromDB = invoiceDAO.findOne(1L);
        
        for(InvoiceItem tmp : invoiceFromDB.getItems()) {
            System.out.println(tmp.getId());
        }
        
        
    }
    
}

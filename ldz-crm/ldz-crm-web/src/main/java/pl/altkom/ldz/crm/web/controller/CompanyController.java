/*
 * Copyright 2015-08-07the original author or authors.
 */
package pl.altkom.ldz.crm.web.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import pl.altkom.ldz.crm.core.dao.CompanyDAO;
import pl.altkom.ldz.crm.core.model.Company;

/**
 *
 * @author Adrian Lapierre <adrian@soft-project.pl>
 */
@RestController
@RequestMapping("/rest")
public class CompanyController {
    
    @Autowired
    private CompanyDAO companyDAO;
    
    @RequestMapping(value = "/company", 
            method = RequestMethod.GET,
            produces = MediaType.APPLICATION_JSON_VALUE
            )
    public Company loadCompany(@RequestParam long id) {
        
        return companyDAO.findOne(id);
        
    }
    
    @RequestMapping("/init")
    public void init() {
        
        Company company = new Company();
        
        company.setName("Firma");
        company.setNip("12345566");
        
        companyDAO.save(company);
        
    }
    
}

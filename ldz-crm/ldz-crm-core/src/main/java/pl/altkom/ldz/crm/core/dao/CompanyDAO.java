/*
 * Copyright 2015-08-07the original author or authors.
 */
package pl.altkom.ldz.crm.core.dao;

import java.util.List;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import pl.altkom.ldz.crm.core.model.Company;

/**
 *
 * @author Adrian Lapierre <adrian@soft-project.pl>
 */
public interface CompanyDAO extends CrudRepository<Company, Long> {
    
    public List<Company> findByNameLikeOrderByIdDesc(String name);
    
    @Query("select c from Company c where c.name like ?")
    public List<Company> findByJPQL(String name);
    
}

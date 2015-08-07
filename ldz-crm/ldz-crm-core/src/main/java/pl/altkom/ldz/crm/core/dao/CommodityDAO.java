/*
 * Copyright 2015-08-07the original author or authors.
 */
package pl.altkom.ldz.crm.core.dao;

import org.springframework.data.repository.CrudRepository;
import pl.altkom.ldz.crm.core.model.Commodity;

/**
 *
 * @author Adrian Lapierre <adrian@soft-project.pl>
 */
public interface CommodityDAO extends CrudRepository<Commodity, Long>{
    
}

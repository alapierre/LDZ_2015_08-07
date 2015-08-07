package pl.altkom.ldz.crm;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import pl.altkom.ldz.crm.core.dao.CompanyDAO;
import pl.altkom.ldz.crm.core.model.Company;

/**
 *
 * @author Adrian Lapierre <adrian@soft-project.pl>
 */
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration("/ldz-crm-core.xml")
public class TestContext {
 
    @Autowired
    private CompanyDAO companyDAO;
 
    @Before
    public void init() {
        System.out.println("init......");
    }
    
    @Test
    public void test() {
        System.out.println("!!!");
    }
    
    @Test
    public void testLoadCompany() {
    
        Company c = companyDAO.findOne(1L);
        
        System.out.println(c);
    } 
         
    @Test
    public void testCreateCompany() {
        
        Company c = new Company();
        c.setName("Nazwa");
        
        companyDAO.save(c);
        
    }
    
    @Test
    public void testFindCompanyByName() {
        
        companyDAO.findByNameLikeOrderByIdDesc("Nazwa");
        
        
        
    }
            
}

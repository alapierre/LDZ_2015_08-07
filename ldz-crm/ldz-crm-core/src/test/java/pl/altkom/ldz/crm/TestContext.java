package pl.altkom.ldz.crm;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

/**
 *
 * @author Adrian Lapierre <adrian@soft-project.pl>
 */
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration("/ldz-crm-core.xml")
public class TestContext {
 
    @Test
    public void test() {
        System.out.println("!!!");
    }
}

package techStaffTest;

import org.junit.Before;
import org.junit.Test;
import staff.techstaff.Developer;

import static org.junit.Assert.assertEquals;

public class DeveloperTest {
    Developer developer;

    @Before
    public void setUp(){
        developer = new Developer("Gavin", 666666666, 32000.00);
    }

    @Test
    public void canGetName(){
        assertEquals("Gavin", developer.getName());
    }

    @Test
    public void canGetNINumber(){
        assertEquals(666666666, developer.getNINumber());
    }

    @Test
    public void canGetSalary(){
        assertEquals(32000.00, developer.getSalary(), 0.01);
    }

    @Test
    public void canRaiseSalary(){
        developer.raiseSalary(0.1);
        assertEquals(35200.00, developer.getSalary(), 0.01);
    }

    @Test
    public void canPayBonus(){
        assertEquals(320, developer.payBonus(), 0.01);
    }
}

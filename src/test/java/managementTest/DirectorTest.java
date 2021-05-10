package managementTest;

import org.junit.Before;
import org.junit.Test;
import staff.management.Director;

import static org.junit.Assert.assertEquals;

public class DirectorTest {
     Director director;

    @Before
    public void setUp(){
        director = new Director("Wendy", 11111112, 99000.00, "Management", 100000.00);
    }

    @Test
    public void canGetDeptName(){
        assertEquals("Management", director.getDeptName());
    }

    @Test
    public void canGetName(){
        assertEquals("Wendy", director.getName());
    }

    @Test
    public void canGetNINumber(){
        assertEquals(11111112, director.getNINumber());
    }

    @Test
    public void canGetSalary(){
        assertEquals(99000.00, director.getSalary(), 0.01);
    }

    @Test
    public void canRaiseSalary(){
        director.raiseSalary(0.1);
        assertEquals(108900.00, director.getSalary(), 0.01);
    }

    @Test
    public void canPayBonus(){
        assertEquals(1980, director.payBonus(), 0.01);
    }

    @Test
    public void canGetBudget(){
        assertEquals(100000.00, director.getBudget(), 0.01);
    }
}

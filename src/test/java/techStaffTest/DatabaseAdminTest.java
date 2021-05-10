package techStaffTest;

import org.junit.Before;
import org.junit.Test;
import staff.techstaff.DatabaseAdmin;

import static org.junit.Assert.assertEquals;

public class DatabaseAdminTest {

    DatabaseAdmin databaseAdmin;

    @Before
    public void setUp() {
        databaseAdmin = new DatabaseAdmin("Ron", 43525634, 30000.00);
    }

    @Test
    public void canGetName(){
        assertEquals("Ron", databaseAdmin.getName());
    }

    @Test
    public void canGetNINumber(){
        assertEquals(43525634, databaseAdmin.getNINumber());
    }

    @Test
    public void canGetSalary(){
        assertEquals(30000.00, databaseAdmin.getSalary(), 0.01);
    }

    @Test
    public void canRaiseSalary(){
        databaseAdmin.raiseSalary(0.1);
        assertEquals(33000.00, databaseAdmin.getSalary(), 0.01);
    }

    @Test
    public void canPayBonus(){
        assertEquals(300, databaseAdmin.payBonus(), 0.01);
    }
}


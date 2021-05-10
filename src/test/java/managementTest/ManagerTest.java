package managementTest;

import org.junit.Before;
import org.junit.Test;
import staff.management.Manager;

import static org.junit.Assert.assertEquals;

public class ManagerTest {

    Manager manager;
    
    @Before
    public void setUp(){
        manager = new Manager("Sheila", 435234623, 45000.00, "Management");
    }

    @Test
    public void canGetDeptName(){
        assertEquals("Management", manager.getDeptName());
    }

    @Test
    public void canGetName(){
        assertEquals("Sheila", manager.getName());
    }

    @Test
    public void canGetNINumber(){
        assertEquals(435234623, manager.getNINumber());
    }

    @Test
    public void canGetSalary(){
        assertEquals(45000.00, manager.getSalary(), 0.01);
    }

   @Test
   public void canSetName(){
       manager.setName("Andrea");
       assertEquals("Andrea", manager.getName());
       manager.setName(null);
       assertEquals("Andrea", manager.getName());
       manager.setName("");
       assertEquals("Andrea", manager.getName());
   }

    @Test
    public void canRaiseSalary(){
        manager.raiseSalary(0.1);
        assertEquals(49500.00, manager.getSalary(), 0.01);
    }

    @Test
    public void cantRaiseSalary(){
        manager.raiseSalary(-0.1);
        assertEquals(45000.00, manager.getSalary(), 0.01);
    }

    @Test
    public void canPayBonus(){
        assertEquals(450, manager.payBonus(), 0.01);
    }
}

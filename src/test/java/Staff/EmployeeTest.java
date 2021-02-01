package Staff;

import Management.Manager;
import org.junit.Before;
import org.junit.Test;

import static junit.framework.TestCase.assertEquals;

public class EmployeeTest {

    Manager manager;

    @Before
    public void setUp(){
        manager = new Manager("Bob", 1234, 20000, "Harrrrods");
    }

    @Test
    public void testGetName() {
        assertEquals("Bob", manager.getName());

    }

    @Test
    public void testGetNI_number() {
        assertEquals(1234, manager.getNI_number());
    }

    @Test
    public void canRaiseSalary() {
        manager.raiseSalary(5000.00);
        assertEquals(25000.00, manager.getSalary(), 0.0);
    }

    @Test
    public void wontAccidentallyReduceSalary() {
        manager.raiseSalary(-100.00);
        assertEquals(20000, manager.getSalary(), 0.0);
    }

    @Test
    public void canGetBonus() {
        assertEquals(200, manager.payBonus(), 0.0);
    }

}
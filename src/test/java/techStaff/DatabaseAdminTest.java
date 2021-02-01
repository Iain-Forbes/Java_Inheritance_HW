package techStaff;

import techStaff.DatabaseAdmin;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class DatabaseAdminTest {

    DatabaseAdmin databaseAdmin;

    @Before
    public void before() {
        databaseAdmin = new DatabaseAdmin("Steven", 345432, 30000);
    }

    @Test
    public void hasName() {
        assertEquals("Steven", databaseAdmin.getName());
    }

    @Test
    public void hasNiNumber() {
        assertEquals(345432, databaseAdmin.getNI_number());
    }

    @Test
    public void hasSalary() {
        assertEquals(30000.00, databaseAdmin.getSalary(), 0.0);
    }


    @Test
    public void canRaiseSalary() {
        databaseAdmin.raiseSalary(2000.00);
        assertEquals(32000.00, databaseAdmin.getSalary(), 0.0);
    }

    @Test
    public void canGetBonus() {
        assertEquals(300.00, databaseAdmin.payBonus(), 0.0);
    }

}
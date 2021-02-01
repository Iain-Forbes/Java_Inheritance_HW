package techStaff;


import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class DeveloperTest {

    Developer developer;

    @Before
    public void before() {
        developer = new Developer("Psycho Gorman", 5636627, 50000);
    }

    @Test
    public void hasName() {
        assertEquals("Psycho Gorman", developer.getName());
    }

    @Test
    public void hasNiNumber() {
        assertEquals(5636627, developer.getNI_number());
    }

    @Test
    public void hasSalary() {
        assertEquals(50000.00, developer.getSalary(), 0.0);
    }


    @Test
    public void canRaiseSalary() {
        developer.raiseSalary(1000.00);
        assertEquals(51000.00, developer.getSalary(), 0.0);
    }

    @Test
    public void canGetBonus() {
        assertEquals(500.00, developer.payBonus(), 0.0);
    }

}
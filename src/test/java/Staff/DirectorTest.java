package Staff;
import Management.Director;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class DirectorTest {

    Director director;

    @Before
    public void before() {
        director = new Director("Charlie Chips", 456789, 100000, "Management Team", 400000.00);
    }

    @Test
    public void hasName() {
        assertEquals("Charlie Chips", director.getName());
    }

    @Test
    public void hasNiNumber() {
        assertEquals(456789, director.getNI_number());
    }

    @Test
    public void hasSalary() {
        assertEquals(100000.00, director.getSalary(), 0.0);
    }

    @Test
    public void hasDeptName() {
        assertEquals("Management Team", director.getDeptName());
    }

    @Test
    public void canRaiseSalary() {
        director.raiseSalary(1000.00);
        assertEquals(101000.00, director.getSalary(), 0.0);
    }

    @Test
    public void canGetBonus() {
        assertEquals(2000.00, director.payBonus(), 0.0);
    }

}
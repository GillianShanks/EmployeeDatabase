package techStaff;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class DeveloperTest {
    Developer developer;

    @Before
    public void before(){
        developer = new Developer("Tina","PD97283D", 25000);
    }

    @Test
    public void hasName() {
        assertEquals("Tina", developer.getName());
    }

    @Test
    public void hasNINumber() {
        assertEquals("PD97283D", developer.getNiNumber());
    }

    @Test
    public void hasSalary() {
        assertEquals(25000, developer.getSalary(), 0.01);
    }

    @Test
    public void canRaiseSalary() {
        developer.raiseSalary(5000);
        assertEquals(30000, developer.getSalary(), 0.01);
    }

    @Test
    public void canGetPayBonus() {
        assertEquals(250, developer.payBonus(), 0.01);
    }
}

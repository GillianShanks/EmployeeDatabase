package management;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;

public class DirectorTest {

    Director director;

    @Before
    public void before(){
        director = new Director("Cole", "SN9735R", 45000, "Testing", 10000);
    }

    @Test
    public void hasName() {
        assertEquals("Cole", director.getName());
    }

    @Test
    public void hasNINumber() {
        assertEquals("SN9735R", director.getNiNumber());
    }

    @Test
    public void hasSalary() {
        assertEquals(45000, director.getSalary(), 0.01);
    }

    @Test
    public void canRaiseSalary() {
        director.raiseSalary(5000);
        assertEquals(50000, director.getSalary(), 0.01);
    }

    @Test
    public void canGetPayBonus() {
        assertEquals(900, director.payBonus(), 0.01);
    }

    @Test
    public void hasDepartmentName() {
        assertEquals("Testing", director.getDeptName());
    }

    @Test
    public void hasBudget(){
        assertEquals(10000, director.getBudget(), 0.01);
    }
}

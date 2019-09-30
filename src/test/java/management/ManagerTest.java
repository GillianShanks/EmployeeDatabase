package management;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class ManagerTest {

    Manager manager;

    @Before
    public void before(){
        manager = new Manager("James", "IF9763P", 40000, "Testing");
    }

    @Test
    public void hasName() {
        assertEquals("James", manager.getName());
    }

    @Test
    public void hasNINumber() {
        assertEquals("IF9763P", manager.getNiNumber());
    }

    @Test
    public void hasSalary() {
        assertEquals(40000, manager.getSalary(), 0.01);
    }

    @Test
    public void canRaiseSalary() {
        manager.raiseSalary(5000);
        assertEquals(45000, manager.getSalary(), 0.01);
    }

    @Test
    public void canGetPayBonus() {
        assertEquals(400, manager.payBonus(), 0.01);
    }

    @Test
    public void hasDepartmentName() {
        assertEquals("Testing", manager.getDeptName());
    }

    @Test
    public void doesNotRaiseNegative(){
        manager.raiseSalary(-5000);
        assertEquals(40000, manager.getSalary(), 0.01);
    }
}

package techStaff;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class DatabaseAdminTest {

    DatabaseAdmin databaseAdmin;

    @Before
    public void before(){
        databaseAdmin = new DatabaseAdmin("Eggbert", "EL390473W", 25000);
    }

    @Test
    public void hasName() {
        assertEquals("Eggbert", databaseAdmin.getName());
    }

    @Test
    public void hasNINumber() {
        assertEquals("EL390473W", databaseAdmin.getNiNumber());
    }

    @Test
    public void hasSalary() {
        assertEquals(25000, databaseAdmin.getSalary(), 0.01);
    }

    @Test
    public void canRaiseSalary() {
        databaseAdmin.raiseSalary(5000);
        assertEquals(30000, databaseAdmin.getSalary(), 0.01);
    }

    @Test
    public void canGetPayBonus() {
        assertEquals(250, databaseAdmin.payBonus(), 0.01);
    }
}

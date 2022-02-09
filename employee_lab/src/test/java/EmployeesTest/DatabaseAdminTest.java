package EmployeesTest;

import Employees.DatabaseAdmin;
import Employees.Developer;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class DatabaseAdminTest {

    DatabaseAdmin databaseAdmin;
    @Before
    public void before(){
        databaseAdmin = new DatabaseAdmin("Mordaunt","JG073973B",16000);
    }

    @Test
    public void hasName(){
        assertEquals("Mordaunt", databaseAdmin.getName());
    }
    @Test
    public void hasNino(){
        assertEquals("JG073973B", databaseAdmin.getNino());
    }
    @Test
    public void hasSalary(){
        assertEquals(16000, databaseAdmin.getSalary(), 0.0);
    }

    @Test
    public void canRaiseSalary(){
        databaseAdmin.raiseSalary(10);
        assertEquals(17600, databaseAdmin.getSalary(), 0.0);
    }
    @Test
    public void canPayBonus(){
        assertEquals(160, databaseAdmin.payBonus(), 0.0);
    }
}

package EmployeesTest;

import Employees.Developer;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class DatabaseAdminTest {

    Developer developer;
    @Before
    public void before(){
        developer = new Developer("Williams","SK243767B",200000);
    }

    @Test
    public void hasName(){
        assertEquals("Williams", developer.getName());
    }
    @Test
    public void hasNino(){
        assertEquals("SK243767B", developer.getNino());
    }
    @Test
    public void hasSalary(){
        assertEquals(200000.00, developer.getSalary(), 0.0);
    }

    @Test
    public void canRaiseSalary(){
        developer.raiseSalary(10);
        assertEquals(220000, developer.getSalary(), 0.0);
    }
    @Test
    public void canPayBonus(){

        assertEquals(2000, developer.payBonus(), 0.0);
    }
}

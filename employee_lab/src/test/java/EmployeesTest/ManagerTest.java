package EmployeesTest;

import Employees.Manager;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class ManagerTest {

    Manager manager;
    @Before
    public void before(){
        manager = new Manager("Smith","SK474314Z",50000);
    }

    @Test
    public void hasName(){
        assertEquals("Smith",manager.getName());
    }
    @Test
    public void hasNino(){
        assertEquals("SK474314Z",manager.getNino());
    }
    @Test
    public void hasSalary(){
        assertEquals(50000.00,manager.getSalary(),0.0);
    }

    @Test
    public void canRaiseSalary(){
        manager.raiseSalary(1);
        assertEquals(50500.00,manager.getSalary(),0.0);
    }
    @Test
    public void canPayBonus(){

        assertEquals(500.00,manager.payBonus(),0.0);
    }

    @Test
    public void payRiseCantBeNegative(){
        manager.raiseSalary(-1);
        assertEquals(50500.00,manager.getSalary(),0.0);
    }

    @Test
    public void cantChangeNameWithInvalidInput(){
        manager.setName("");
        assertEquals("Smith",manager.getName());

    }
}

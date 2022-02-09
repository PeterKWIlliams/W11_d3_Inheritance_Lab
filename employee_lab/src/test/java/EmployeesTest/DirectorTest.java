package EmployeesTest;

import Employees.Director;
import Employees.Manager;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class DirectorTest {

    Director director;
    @Before
    public void before(){
        director = new Director("Green","SK4743143",500000,2000000);
    }

    @Test
    public void hasName(){
        assertEquals("Green",director.getName());
    }
    @Test
    public void hasNino(){
        assertEquals("SK4743143",director.getNino());
    }
    @Test
    public void hasSalary(){
        assertEquals(500000.00,director.getSalary(),0.0);
    }

    @Test
    public void hasBudget(){
        assertEquals(2000000,director.getBudget(),0.0);
    }

    @Test
    public void canRaiseSalary(){director.raiseSalary(0.05);
        assertEquals(500250,director.getSalary(),0.0);
    }
    @Test
    public void canPayBonus(){
        assertEquals(10000.00,director.payBonus(),0.0);
    }


}

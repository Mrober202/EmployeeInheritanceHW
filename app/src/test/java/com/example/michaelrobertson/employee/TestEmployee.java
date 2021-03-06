package com.example.michaelrobertson.employee;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class TestEmployee {

Employee employee;

    @Before
    public void before() {
        employee = new Employee(1, "John", "ssn", 30000.0 );
    }

    @Test
    public void hasEmpId() {
        assertEquals(1, employee.getEmpId());
    }

    @Test
    public void hasName() {
        assertEquals("John", employee.getName());
    }

    @Test
    public void hasSsn() {
        assertEquals("ssn", employee.getSsn());
    }

    @Test
    public void hasSalary() {
        assertEquals(30000.0, employee.getSalary(), 0.01);
    }

    @Test
    public void canRaiseSalary() {
        employee.raiseSalary(1000);
        assertEquals(31000.0, employee.getSalary(), 0.01);
    }

    @Test
    public void canSetName() {
        employee.setName("Allan");
        assertEquals("Allan", employee.getName());
    }

    @Test
    public void negativeSalary() {
        employee.raiseSalary(-1000.0);
        assertEquals(30000.0, employee.getSalary(), 0.01);
    }

    @Test
    public void notNull() {
        employee.setName(null);
        assertEquals("John", employee.getName());
    }

    @Test
    public void emptyString() {
        employee.setName("");
        assertEquals("John", employee.getName());
    }
}

package com.example.michaelrobertson.employee;

/**
 * Created by michaelrobertson on 20/06/2017.
 */

public class Director extends Manager {
    private double budget;

    public Director(int empId, String name, String ssn, double salary, double budget) {
        super(empId, name, ssn, salary);

    }
}

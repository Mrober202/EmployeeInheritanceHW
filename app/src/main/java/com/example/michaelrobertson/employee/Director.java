package com.example.michaelrobertson.employee;

/**
 * Created by michaelrobertson on 20/06/2017.
 */

public class Director extends Manager {
    private double budget;

    public Director(int empId, String name, String ssn, double salary, String deptName, double budget) {
        super(empId, name, ssn, salary, deptName);

        this.budget = budget;
    }

    public double getBudget() {
        return this.budget;
    }
}

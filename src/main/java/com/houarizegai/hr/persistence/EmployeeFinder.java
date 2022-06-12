package com.houarizegai.hr.persistence;

import com.houarizegai.hr.personnel.Employee;
import com.houarizegai.hr.personnel.FullTimeEmployee;
import com.houarizegai.hr.personnel.Intern;
import com.houarizegai.hr.personnel.PartTimeEmployee;

import java.util.Arrays;
import java.util.List;

public class EmployeeFinder {

    public List<Employee> findAll() {

        // Employees are kept in memory for simplicity
        Employee anna = new FullTimeEmployee("Anna Smith", 2000);
        Employee billy = new FullTimeEmployee("Billy Leech", 920);

        Employee steve = new PartTimeEmployee("Steve Jones", 800);
        Employee magda = new PartTimeEmployee("Magda Iovan", 920);

        Employee john = new Intern("John Lee", 300, 10);
        Employee catherine = new Intern("Catherine Allison", 500, 15);

        return Arrays.asList(anna, billy, steve, magda, john, catherine);
    }
}

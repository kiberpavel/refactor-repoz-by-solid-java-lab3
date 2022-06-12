package com.houarizegai.hr.persistence;

import com.houarizegai.hr.personnel.Employee;

public interface EmployeeSerializer {
    String serialize(Employee employee);
}

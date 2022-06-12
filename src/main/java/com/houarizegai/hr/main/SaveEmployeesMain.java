package com.houarizegai.hr.main;

import com.houarizegai.hr.logging.ConsoleLogger;
import com.houarizegai.hr.persistence.EmployeeFileSerializer;
import com.houarizegai.hr.persistence.EmployeeFinder;
import com.houarizegai.hr.persistence.EmployeeSaver;
import com.houarizegai.hr.personnel.Employee;

import java.io.IOException;
import java.util.List;

public class SaveEmployeesMain {
    public static void main(String[] args) {
        // Grab employees
        EmployeeFileSerializer employeeFileSerializer = new EmployeeFileSerializer();
        ConsoleLogger consoleLogger = new ConsoleLogger();

        EmployeeFinder finder = new EmployeeFinder();
        EmployeeSaver saver = new EmployeeSaver(employeeFileSerializer);
        List<Employee> employees = finder.findAll();

        // Save all
        for (Employee e : employees){
            try {
                saver.save(e);
                consoleLogger.writeInfo("Saved employee " + e.toString());
            } catch (IOException exception) {
                consoleLogger.writeError("Error saving employee", exception);
            }
        }
    }
}

package com.houarizegai.hr.main;

import com.houarizegai.hr.documents.Payslip;
import com.houarizegai.hr.logging.ConsoleLogger;
import com.houarizegai.hr.persistence.EmployeeFinder;
import com.houarizegai.hr.personnel.Employee;

import java.time.Month;
import java.util.List;

public class ExportPayslipMain {
    public static void main(String[] args) {
        // Create dependencies
        ConsoleLogger consoleLogger = new ConsoleLogger();
        EmployeeFinder finder = new EmployeeFinder();

        // Grab employees
        List<Employee> employees = finder.findAll();

        for (Employee employee : employees){
            Payslip payslip = new Payslip(employee , Month.AUGUST);

            String exportableText = payslip.toTxt().toUpperCase();
            System.out.println(exportableText);
        }
    }
}

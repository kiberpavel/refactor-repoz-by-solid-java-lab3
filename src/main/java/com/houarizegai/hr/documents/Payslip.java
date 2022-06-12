package com.houarizegai.hr.documents;

import com.houarizegai.hr.personnel.Employee;

import java.time.Month;

public class Payslip implements ExportableText {
    private String employeeName;
    private int monthlyIncome;
    private Month month;

    public Payslip(Employee employee, Month month) {
        this.employeeName = employee.getFullName();
        this.monthlyIncome = employee.getMonthlyIncome();
        this.month = month;
    }

    public Month getMonth() {
        return this.month;
    }

    public int getMonthlyIncome() {
        return this.monthlyIncome;
    }

    public String getEmployeeName() {
        return this.employeeName;
    }

    @Override
    public String toTxt() {
        StringBuilder sb = new StringBuilder();
        sb.append("MONTH: ").append(this.getMonth());
        sb.append(System.lineSeparator());
        sb.append("NAME: ").append(this.getEmployeeName());
        sb.append(System.lineSeparator());
        sb.append("INCOME: ").append(this.getMonthlyIncome());
        sb.append(System.lineSeparator());

        return sb.toString();
    }
}

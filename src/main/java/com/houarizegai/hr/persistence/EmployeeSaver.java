package com.houarizegai.hr.persistence;

import com.houarizegai.hr.personnel.Employee;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

public class EmployeeSaver {

    private EmployeeSerializer serializer;

    public EmployeeSaver(EmployeeSerializer serializer) {
        this.serializer = serializer;
    }

    public void save(Employee employee) throws IOException {
        String serializedString = this.serializer.serialize(employee);

        Path path = Paths.get(employee.getFullName()
                .replace(" ", "_") + ".rec");
        Files.write(path, serializedString.getBytes());
    }
}

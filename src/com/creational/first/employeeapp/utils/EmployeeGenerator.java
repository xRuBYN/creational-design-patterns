package com.creational.first.employeeapp.utils;

import com.creational.first.employeeapp.builder.Employee;
import com.creational.first.employeeapp.singleton.impl.EmployeeRepositoryImpl;
import com.creational.first.employeeapp.singleton.EmployeeRepository;

public class EmployeeGenerator {

  static {
    EmployeeRepository employeeRepository = EmployeeRepositoryImpl.getInstance();
    Employee employee = Employee.builder()
        .id(1L)
        .firstName("Rubin")
        .lastName("Ursu")
        .build();

    Employee employee1 = Employee.builder()
        .id(2L)
        .firstName("Tudor")
        .lastName("Duca")
        .build();

    Employee employee2 = Employee.builder()
        .id(3L)
        .firstName("Catalin")
        .lastName("Plesu")
        .build();

    Employee employee3 = Employee.builder()
        .id(4L)
        .firstName("Dorin")
        .lastName("Racovet")
        .build();
    employeeRepository.save(employee);
    employeeRepository.save(employee1);
    employeeRepository.save(employee2);
    employeeRepository.save(employee3);
  }
}

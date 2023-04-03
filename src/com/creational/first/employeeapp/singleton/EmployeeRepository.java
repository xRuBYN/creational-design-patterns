package com.creational.first.employeeapp.singleton;

import com.creational.first.employeeapp.builder.Employee;
import java.util.List;

public interface EmployeeRepository {
  void deleteById(Long id);
  Employee save(Employee employee);
  Employee findById(Long id);

  List<Employee> findAll();
}

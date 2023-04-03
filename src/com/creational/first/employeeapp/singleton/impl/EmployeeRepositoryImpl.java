package com.creational.first.employeeapp.singleton.impl;

import com.creational.first.employeeapp.builder.Employee;
import com.creational.first.employeeapp.singleton.EmployeeRepository;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Objects;

public class EmployeeRepositoryImpl implements EmployeeRepository {

  private final Map<Long, Employee> dataBase = new HashMap<>();

  private static EmployeeRepositoryImpl employeeRepository;

  private EmployeeRepositoryImpl() {

  }

  public static EmployeeRepositoryImpl getInstance() {
    if (Objects.isNull(employeeRepository)) {
      employeeRepository = new EmployeeRepositoryImpl();
    }
    return employeeRepository;
  }

  @Override
  public void deleteById(Long id) {
    dataBase.remove(id);
    System.out.println("Employee with id: " + id + " is delete.");
  }

  @Override
  public Employee save(Employee employee) {
    System.out.println(employee + " Saved.");
    return dataBase.put(employee.getId(), employee);
  }

  @Override
  public Employee findById(Long id) {
    Employee employee = dataBase.get(id);
    if (Objects.isNull(employee)) {
      throw new RuntimeException("EMPLOYEE NOT FOUND");
    } else {
      return dataBase.get(id);
    }
  }

  @Override
  public List<Employee> findAll() {
    List<Employee> list = new ArrayList<>(dataBase.values());
    return list;
  }
}

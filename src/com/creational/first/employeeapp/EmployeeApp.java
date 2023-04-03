package com.creational.first.employeeapp;

import com.creational.first.employeeapp.builder.Employee;
import com.creational.first.employeeapp.singleton.impl.EmployeeRepositoryImpl;
import com.creational.first.employeeapp.singleton.EmployeeRepository;
import com.creational.first.employeeapp.utils.EmployeeGenerator;
import com.creational.first.employeeapp.utils.Menu;
import java.util.Scanner;

public class EmployeeApp {

  public static void main(String[] args) {
    EmployeeRepository employeeRepository = EmployeeRepositoryImpl.getInstance();
    EmployeeGenerator employeeGenerator = new EmployeeGenerator();
    int choice;
    Scanner scanner = new Scanner(System.in);
    while (true) {
      Menu.create();
      choice = scanner.nextInt();
      switch (choice) {
        case 1 -> System.out.println(employeeRepository.findAll());
        case 2 -> {
          System.out.println("Press an id: ");
          System.out.println(employeeRepository.findById(scanner.nextLong()));
        }
        case 3 -> {
          System.out.println("Press an id: ");
          employeeRepository.deleteById(scanner.nextLong());
        }
        case 4 -> {
          Employee employee = new Employee();
          System.out.println("Write id: ");
          employee.setId(scanner.nextLong());
          scanner.nextLine();
          System.out.println("Write firstName: ");
          String firstName = scanner.nextLine();
          employee.setFirstName(firstName);
          System.out.println("Write lastName: ");
          String lastName = scanner.nextLine();
          employee.setLastName(lastName);
          employeeRepository.save(employee);
        }

        case 5 -> {
          System.out.println("Press an id: ");
          Employee employee = employeeRepository.findById(scanner.nextLong());
          Employee cloneEmployee = employee.clone();

          System.out.println(employee + "Hash : " + employee.hashCode());
          System.out.println(cloneEmployee + "Hash : " + cloneEmployee.hashCode());
        }
        default -> System.out.println("Try another number.");
      }
    }
  }
}
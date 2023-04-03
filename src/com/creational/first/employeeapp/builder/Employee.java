package com.creational.first.employeeapp.builder;

import java.util.Objects;

public class Employee implements Cloneable{
  private Long id;

  private String firstName;

  private String lastName;

  public Long getId() {
    return id;
  }

  public void setId(Long id) {
    this.id = id;
  }

  public String getFirstName() {
    return firstName;
  }

  public void setFirstName(String firstName) {
    this.firstName = firstName;
  }

  public String getLastName() {
    return lastName;
  }

  public void setLastName(String lastName) {
    this.lastName = lastName;
  }

  public Employee() {

  }

  private Employee(Employee employee) {
    this.id = employee.id;
    this.firstName = employee.firstName;
    this.lastName = employee.lastName;
  }

  @Override
  public Employee clone() {
    return new Employee(this);
  }

  @Override
  public String toString() {
    return "Employee{" +
        "id=" + id +
        ", firstName='" + firstName + '\'' +
        ", lastName='" + lastName + '\'' +
        '}';
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Employee employee = (Employee) o;
    return Objects.equals(id, employee.id) && Objects.equals(firstName,
        employee.firstName) && Objects.equals(lastName, employee.lastName);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, firstName, lastName);
  }

  public static EmployeeBuilder builder() {
    return new EmployeeBuilder();
  }
  public static class EmployeeBuilder {
    private Employee employee = new Employee();

    public EmployeeBuilder id(Long id) {
      employee.id = id;
      return this;
    }

    public EmployeeBuilder firstName(String firsName) {
      employee.firstName = firsName;
      return this;
    }

    public EmployeeBuilder lastName(String lastName) {
      employee.lastName = lastName;
      return this;
    }

    public Employee build() {
      return employee;
    }
  }

}

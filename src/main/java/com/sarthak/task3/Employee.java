/*
 * Author Name: Sarthak Agarwal
 * Date: 31/08/22
 * Created With: IntelliJ IDEA Community Edition
 */
package com.sarthak.task3;

import java.util.Objects;

public class Employee {
    private short id;
    private String name;
    private double salary;
    private byte numberOfLeavesTaken;

    public Employee(short id, String name, double salary, byte numberOfLeavesTaken) {
        this.id = id;
        this.name = name;
        this.salary = salary;
        this.numberOfLeavesTaken = numberOfLeavesTaken;
    }

    public Employee() {
    }

    public short getId() {
        return id;
    }

    public void setId(short id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    public byte getNumberOfLeavesTaken() {
        return numberOfLeavesTaken;
    }

    public void setNumberOfLeavesTaken(byte numberOfLeavesTaken) {
        this.numberOfLeavesTaken = numberOfLeavesTaken;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", salary=" + salary +
                ", numberOfLeavesTaken=" + numberOfLeavesTaken +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Employee)) return false;
        Employee employee = (Employee) o;
        return getId() == employee.getId() && Double.compare(employee.getSalary(), getSalary()) == 0 && getNumberOfLeavesTaken() == employee.getNumberOfLeavesTaken() && getName().equals(employee.getName());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getId(), getName(), getSalary(), getNumberOfLeavesTaken());
    }
}

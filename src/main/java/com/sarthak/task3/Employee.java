/*
 * Author Name: Sarthak Agarwal
 * Date: 31/08/22
 * Created With: IntelliJ IDEA Community Edition
 */
package com.sarthak.task3;

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
}

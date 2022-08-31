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
}

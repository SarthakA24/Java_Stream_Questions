/*
 * Author Name: Sarthak Agarwal
 * Date: 28/08/22
 * Created With: IntelliJ IDEA Community Edition
 */
package com.sarthak.task2;

public class Student {
    private byte rollNumber;
    private String name;
    private long guardiansContactNumber;
    private double marks;

    public Student() {
    }

    public Student(byte rollNumber, String name, long guardiansContactNumber, double marks) {
        this.rollNumber = rollNumber;
        this.name = name;
        this.guardiansContactNumber = guardiansContactNumber;
        this.marks = marks;
    }
}

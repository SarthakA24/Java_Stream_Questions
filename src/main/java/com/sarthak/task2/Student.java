/*
 * Author Name: Sarthak Agarwal
 * Date: 28/08/22
 * Created With: IntelliJ IDEA Community Edition
 */
package com.sarthak.task2;

import java.util.Objects;

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

    public byte getRollNumber() {
        return rollNumber;
    }

    public void setRollNumber(byte rollNumber) {
        this.rollNumber = rollNumber;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public long getGuardiansContactNumber() {
        return guardiansContactNumber;
    }

    public void setGuardiansContactNumber(long guardiansContactNumber) {
        this.guardiansContactNumber = guardiansContactNumber;
    }

    public double getMarks() {
        return marks;
    }

    public void setMarks(double marks) {
        this.marks = marks;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Student)) return false;
        Student student = (Student) o;
        return getRollNumber() == student.getRollNumber() && getGuardiansContactNumber() == student.getGuardiansContactNumber() && Double.compare(student.getMarks(), getMarks()) == 0 && Objects.equals(getName(), student.getName());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getRollNumber(), getName(), getGuardiansContactNumber(), getMarks());
    }
}

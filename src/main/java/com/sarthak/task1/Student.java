/*
 * Author Name: Sarthak Agarwal
 * Date: 28/08/22
 * Created With: IntelliJ IDEA Community Edition
 */
package com.sarthak.task1;

import java.util.Objects;

public class Student {
    private byte rollNumber;
    private String firstName;
    private String lastName;
    private byte currentYear;

    public Student() {
    }

    public Student(byte rollNumber, String firstName, String lastName, byte currentYear) {
        this.rollNumber = rollNumber;
        this.firstName = firstName;
        this.lastName = lastName;
        this.currentYear = currentYear;
    }

    @Override
    public String toString() {
        return "Student{" +
                "rollNumber=" + rollNumber +
                ", firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", currentYear=" + currentYear +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Student)) return false;
        Student student = (Student) o;
        return rollNumber == student.rollNumber && currentYear == student.currentYear && firstName.equals(student.firstName) && lastName.equals(student.lastName);
    }

    @Override
    public int hashCode() {
        return Objects.hash(rollNumber, firstName, lastName, currentYear);
    }
}

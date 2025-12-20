package com.example.Studentmanagement;

public class Student {
    private int id;
    private String name;
    private int age;
    private double grade;
    private String lastname;

    public Student(int id, String name, int age, double grade,String lastname) {
        this.id = id;
        this.name = name;
        this.age = age;
        this.grade = grade;
        this.lastname = lastname;
    }

    // Getters
    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public double getGrade() {
        return grade;
    }

    // Setters
    public void setName(String name) {
        this.name = name;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void setGrade(double grade) {
        this.grade = grade;
    }

    @Override
    public String toString() {
        return "Student [ID=" + id + ", Name=" + name + ", Age=" + age + ", Grade=" + grade + "]";
    }
}
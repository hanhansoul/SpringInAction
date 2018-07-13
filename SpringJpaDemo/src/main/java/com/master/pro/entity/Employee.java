package com.master.pro.entity;

import javax.persistence.*;
import java.util.Date;
import java.util.List;

@Entity
public class Employee {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int id;
    private String name;
    private int age;
    private Date birth;
    private float salary;
    @ManyToOne
    @JoinColumn(name = "dept_id")
    private Department department;
    @OneToOne
    @JoinColumn(name = "pspace_id")
    private ParkingSpace parkingSpace;
    @ManyToMany
    private List<Project> projects;

    public Employee() {
    }

    public Employee(String name, int age, Date birth, float salary) {
        this.name = name;
        this.age = age;
        this.birth = birth;
        this.salary = salary;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public Date getBirth() {
        return birth;
    }

    public void setBirth(Date birth) {
        this.birth = birth;
    }

    public float getSalary() {
        return salary;
    }

    public void setSalary(float salary) {
        this.salary = salary;
    }
}

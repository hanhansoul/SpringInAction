package com.master.pro.entity;

import javax.persistence.*;
import java.util.List;

@Entity
public class Department {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long id;
    private String departmentName;
    private String departmentNum;
    @OneToMany(mappedBy = "department")
    private List<Employee> employees;

    public Department() {
    }

    public Department(String departmentName, String departmentNum) {
        this.departmentName = departmentName;
        this.departmentNum = departmentNum;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getDepartmentName() {
        return departmentName;
    }

    public void setDepartmentName(String departmentName) {
        this.departmentName = departmentName;
    }

    public String getDepartmentNum() {
        return departmentNum;
    }

    public void setDepartmentNum(String departmentNum) {
        this.departmentNum = departmentNum;
    }

    @Override
    public String toString() {
        return "Department{" +
                "id=" + id +
                ", departmentName='" + departmentName + '\'' +
                ", departmentNum='" + departmentNum + '\'' +
                '}';
    }
}

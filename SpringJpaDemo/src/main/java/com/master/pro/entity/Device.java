package com.master.pro.entity;

import javax.persistence.*;
import java.util.Map;

@Entity
public class Device {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long id;

    private String name;

    @ManyToMany
    @JoinTable(name = "DEV_EMP",
            joinColumns = @JoinColumn(name = "DEV_ID"),
            inverseJoinColumns = @JoinColumn(name = "EMP_ID"))
    @MapKeyColumn(name = "E_DEV_ID")
    private Map<String, Employee> employeeMap;

    public Device() {
    }

    public Device(String name) {
        this.name = name;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Map<String, Employee> getEmployeeMap() {
        return employeeMap;
    }

    public void setEmployeeMap(Map<String, Employee> employeeMap) {
        this.employeeMap = employeeMap;
    }
}

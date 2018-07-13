package com.master.pro.service;

import com.master.pro.entity.Employee;
import com.master.pro.util.ProEntityManagerFactory;

import javax.persistence.EntityManager;
import java.util.Date;

public class EmployeeService {

    private static EntityManager em = ProEntityManagerFactory.getEntityManager("employeeService");

    public static Employee createEmployee(String name, int age, Date birth, float salary) {
        Employee emp = new Employee(name, age, birth, salary);
        em.persist(emp);
        return emp;
    }

}

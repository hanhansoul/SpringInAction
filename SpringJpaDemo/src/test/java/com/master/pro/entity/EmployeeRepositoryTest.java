package com.master.pro.entity;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.*;

@RunWith(SpringRunner.class)
@SpringBootTest
public class EmployeeRepositoryTest {

    @Autowired
    EmployeeRepository repository;

    @Test
    public void insertTest() throws ParseException {
//        repository.save(new ValidatedEmployee("a", "b", "w@admin.com",
//                new SimpleDateFormat("yyyy-MM-dd").parse("2010-10-10"), 12554512));
        Employee employee = new Employee("abc", 10,
                new SimpleDateFormat("yyyy-MM-dd").parse("2010-10-10"), 100);
        List<String> nicknames = new ArrayList<>();
        nicknames.add("a");
        nicknames.add("b");
        nicknames.add("c");
        employee.setNicknames(nicknames);
        Collection vacations = new ArrayList();
        vacations.add(new VacationEntry(Calendar.getInstance(), 10));
        vacations.add(new VacationEntry(Calendar.getInstance(), 20));
        vacations.add(new VacationEntry(Calendar.getInstance(), 30));
        employee.setVacationBookings(vacations);
        repository.save(employee);
    }

    @Test
    public void mapTest() throws ParseException {
//        repository.save(new ValidatedEmployee("a", "b", "w@admin.com",
//                new SimpleDateFormat("yyyy-MM-dd").parse("2010-10-10"), 12554512));
        Employee employee = new Employee("ghi", 20,
                new SimpleDateFormat("yyyy-MM-dd").parse("2010-10-10"), 100);
        Map<String, String> map = new HashMap<>();
        map.put("work", "1234");
        map.put("home", "5678");
        map.put("work", "9999");
        map.put("mobile", "8787");
        employee.setPhoneNumbers(map);
        repository.save(employee);
    }

    @Test
    public void deviceTest() throws ParseException {
        Employee employee = new Employee("oooo", 30,
                new SimpleDateFormat("yyyy-MM-dd").parse("2010-10-10"), 100);
        Map<String, Device> map = new HashMap<>();
        map.put("a", new Device("dev1"));
        map.put("b", new Device("dev2"));
        map.put("c", new Device("dev3"));
        map.put("d", new Device("dev4"));

    }

    @Test
    public void selectTest() {
        String deptName = "";
        String empName = "";
        String query = "SELECT e.salary " +
                "FROM Employee e " +
                "WHERE e.department.name = '" + deptName +
                "' AND " +
                " e.name = '" + empName + "'";
    }

    @Test
    public void getResultListTest() {
//        List<Employee> result = repository
    }
}

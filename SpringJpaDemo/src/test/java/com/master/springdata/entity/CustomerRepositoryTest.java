package com.master.springdata.entity;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.List;

@RunWith(SpringRunner.class)
@SpringBootTest
public class CustomerRepositoryTest {
    @Autowired
    CustomerRepository repository;

    @Test
    public void findByLastNameTest() {
        List<Customer> customers = repository.findByLastName("Bauer");
        for (Customer customer : customers) {
            System.out.println(customer);
        }
    }

    @Test
    public void myFindByFirstNameTest() {
        List<Customer> customers = repository.myFindByFirstName("Jack");
        for (Customer customer : customers) {
            System.out.println(customer);
        }
    }

    @Test
    public void findByLastNamePageableTest() {
        Pageable pageable = new PageRequest(0, 1, Sort.Direction.ASC, "lastName", "firstName");
        Page<Customer> result = repository.findByLastName("Bauer", pageable);
        System.out.println(result.getContent());
        System.out.println(result.getTotalElements());
        System.out.println(result.isFirst());
        System.out.println(result.isLast());
        System.out.println(result.hasNext());
    }

    @Test
    public void findByLastNameSortTest() {
        Sort sort = new Sort(Sort.Direction.DESC, "Bauer");
        List<Customer> result = repository.findByLastName("Bauer", sort);
        for (Customer customer : result) {
            System.out.println(customer);
        }
    }
}

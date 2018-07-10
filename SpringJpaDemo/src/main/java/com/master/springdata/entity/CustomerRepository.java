package com.master.springdata.entity;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;

import java.util.List;

public interface CustomerRepository extends CrudRepository<Customer, Long> {
    List<Customer> findByLastName(String lastName);

    @Query("select c from Customer c where c.firstName = ?1")
    List<Customer> myFindByFirstName(String firstName);

    Page<Customer> findByLastName(String lastName, Pageable pageable);

    List<Customer> findByLastName(String lastName, Sort sort);

//    List<Customer> findByLastName(String lastName, Pageable pageable);
}

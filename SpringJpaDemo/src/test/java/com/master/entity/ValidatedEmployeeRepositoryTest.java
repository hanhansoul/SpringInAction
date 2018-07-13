package com.master.entity;

import com.master.springdata.entity.Customer;
import com.master.springdata.entity.CustomerRepository;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;
import org.springframework.test.context.junit4.SpringRunner;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;

@RunWith(SpringRunner.class)
@SpringBootTest
public class ValidatedEmployeeRepositoryTest {
    @Autowired
    ValidatedEmployeeRepository repository;

    @Test
    public void insertTest() throws ParseException {
//        repository.save(new ValidatedEmployee("a", "b", "w@admin.com",
//                new SimpleDateFormat("yyyy-MM-dd").parse("2010-10-10"), 12554512));
        repository.save(new ValidatedEmployee("", "", "admin.com",
                new SimpleDateFormat("yyyy-MM-dd").parse("2010-10-10"), 12554512));
    }

}

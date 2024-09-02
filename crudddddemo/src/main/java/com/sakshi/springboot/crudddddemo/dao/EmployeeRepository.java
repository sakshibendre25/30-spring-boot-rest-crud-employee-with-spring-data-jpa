package com.sakshi.springboot.crudddddemo.dao;

import com.sakshi.springboot.crudddddemo.entity.Employee;
import org.springframework.data.jpa.repository.JpaRepository;

public interface EmployeeRepository extends JpaRepository<Employee, Integer>{

    // that's it... no need to write any code LOL!

}

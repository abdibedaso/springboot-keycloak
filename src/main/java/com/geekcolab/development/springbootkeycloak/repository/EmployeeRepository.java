package com.geekcolab.development.springbootkeycloak.repository;

import com.geekcolab.development.springbootkeycloak.model.Employee;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface EmployeeRepository extends JpaRepository<Employee, Integer> {
}

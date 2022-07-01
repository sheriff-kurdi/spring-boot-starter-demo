package com.kurdi.demo.repositories;

import com.kurdi.demo.entities.Employee;
import org.springframework.data.jpa.repository.JpaRepository;

public interface EmployeesRepository extends JpaRepository<Employee, Long> {
}

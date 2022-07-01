package com.kurdi.demo.controllers;

import com.kurdi.demo.entities.Employee;
import com.kurdi.demo.repositories.EmployeesRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("employees")
@SuppressWarnings("unused")
public class EmployeesController {
    @Autowired
    EmployeesRepository employeesRepository;

    @GetMapping
    public ResponseEntity<List<Employee>> getAll(){
        return  ResponseEntity.ok(employeesRepository.findAll());
    }


    @PostMapping("/")
    public ResponseEntity<Employee> add(@RequestBody Employee employee) {

        employeesRepository.save(employee);
        return ResponseEntity.ok(employee);
    }


    @DeleteMapping("/{id}")
    public ResponseEntity<Employee> delete(@PathVariable Long id) {
        employeesRepository.delete(employeesRepository.findById(id).get());
        return ResponseEntity.ok(null);
    }

    @PutMapping("/{id}")
    public ResponseEntity<Employee> edit(@RequestBody Employee employee, @PathVariable Long id) {
        //Employee employee = employeesRepository.findById(id).get();
        employeesRepository.save(employee);
        return ResponseEntity.ok(employee);
    }
}

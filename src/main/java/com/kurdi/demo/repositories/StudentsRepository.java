package com.kurdi.demo.repositories;

import com.kurdi.demo.entities.Employee;
import com.kurdi.demo.entities.Student;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

import java.util.List;

@RepositoryRestResource(collectionResourceRel = "students", path = "students")
public interface StudentsRepository extends PagingAndSortingRepository<Student, Long> {
    List<Student> findByName(@Param("name") String name);

}

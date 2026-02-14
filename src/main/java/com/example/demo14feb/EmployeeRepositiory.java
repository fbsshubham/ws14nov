package com.example.demo14feb;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface EmployeeRepositiory extends JpaRepository<Employee, Long>{

}

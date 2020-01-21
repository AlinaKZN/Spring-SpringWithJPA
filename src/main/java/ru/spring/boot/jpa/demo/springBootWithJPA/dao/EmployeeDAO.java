package ru.spring.boot.jpa.demo.springBootWithJPA.dao;

import ru.spring.boot.jpa.demo.springBootWithJPA.entity.Employee;

import java.util.List;

public interface EmployeeDAO {
    List<Employee> findAll();

    Employee find(int id);

    void save(Employee employee);

    void delete(int id);
}

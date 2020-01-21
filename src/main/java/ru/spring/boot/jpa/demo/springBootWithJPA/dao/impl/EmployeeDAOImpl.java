package ru.spring.boot.jpa.demo.springBootWithJPA.dao.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;
import ru.spring.boot.jpa.demo.springBootWithJPA.dao.EmployeeDAO;
import ru.spring.boot.jpa.demo.springBootWithJPA.entity.Employee;

import javax.persistence.EntityManager;
import javax.persistence.Query;
import java.util.List;

@Repository
public class EmployeeDAOImpl implements EmployeeDAO {

    EntityManager entityManager;

    @Autowired
    public EmployeeDAOImpl(EntityManager entityManager) {
        this.entityManager = entityManager;
    }

    @Override
    @Transactional
    public List<Employee> findAll() {
        Query query = entityManager.createQuery("from Employee");

        return query.getResultList();
    }

    @Override
    @Transactional
    public Employee find(int id) {

        return entityManager.find(Employee.class, id);
    }

    @Override
    @Transactional
    public void save(Employee employee) {
        entityManager.merge(employee);
    }

    @Override
    @Transactional
    public void delete(int id) {
        Employee employee = entityManager.find(Employee.class, id);
        entityManager.remove(employee);
    }
}

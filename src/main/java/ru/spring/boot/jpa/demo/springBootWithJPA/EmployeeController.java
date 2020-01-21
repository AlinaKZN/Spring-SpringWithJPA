package ru.spring.boot.jpa.demo.springBootWithJPA;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import ru.spring.boot.jpa.demo.springBootWithJPA.dao.EmployeeDAO;
import ru.spring.boot.jpa.demo.springBootWithJPA.entity.Employee;

import java.util.List;

@RestController
@RequestMapping("/api")
public class EmployeeController {

    EmployeeDAO employeeDAO;

    @Autowired
    public EmployeeController(EmployeeDAO employeeDAO) {
        this.employeeDAO = employeeDAO;
    }

    @GetMapping("/findAll")
    public List<Employee> findAll(){
        return employeeDAO.findAll();
    }

    @GetMapping("/find/{id}")
    public Employee find(@PathVariable int id){
        return employeeDAO.find(id);
    }

    @GetMapping("/save/{employee}")
    public void save(@PathVariable Employee employee){
        employeeDAO.save(employee);
    }

    @GetMapping("/delete/{id}")
    public void delete(@PathVariable int id){
        employeeDAO.delete(id);
    }
}

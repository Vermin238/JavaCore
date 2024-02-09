package seminar.repository;

import seminar.classes.Employee;

import java.util.ArrayList;
import java.util.List;

abstract public class EmployeeRepository {

    static private List<Employee> employees;

    static public List<Employee> addEmployee(Employee employee){
        if (employees == null) employees = new ArrayList<>();
        employees.add(employee);
        return employees;
    }

    static public List<Employee> getEmployees() {
        return employees;
    }
}
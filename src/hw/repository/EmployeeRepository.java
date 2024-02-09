package hw.repository;

import hw.entity.department.Department;
import hw.entity.person.Employee;

import java.util.ArrayList;
import java.util.List;

abstract public class EmployeeRepository {
    private static List<Employee> employeeRepository;

    public static List<Employee> addEmployee(Employee employee) {
        createEmployeeRepository();
        employeeRepository.add(employee);
        return employeeRepository;
    }

    public static List<Employee> getEmployeeRepository() {
        createEmployeeRepository();
        return employeeRepository;
    }

    private static void createEmployeeRepository() {
        if (employeeRepository == null) employeeRepository = new ArrayList<>();
    }

    public static void setEmployeeRepository(List<Department> repository) {
    }
}
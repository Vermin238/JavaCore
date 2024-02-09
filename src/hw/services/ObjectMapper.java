package hw.services;

import hw.entity.assignment.Assignment;
import hw.entity.department.Department;
import hw.entity.person.Employee;
import hw.entity.task.Task;

import java.io.File;
import java.util.List;

public class ObjectMapper {
    public void registerModule(JavaTimeModule javaTimeModule) {

    }

    public List<Department> readValue(File file, TypeReference<List<Task>> typeReference) {
        List<Department> o = null;
        return o;
    }

    public List<Assignment> readValue(File file, TypeReference<List<Assignment>> typeReference) {
        List<Assignment> o = null;
        return null;
    }

    public void writeValue(File file, List<Department> departmentRepository) {
    }

    public void writeValue(File file, List<Employee> employeeRepository) {
    }

    public void writeValue(File file, List<Task> freeTaskRepository) {
    }

    public void writeValue(File file, List<Assignment> assignmentRepository) {

    }

    public List<Department> readValue(File file, TypeReference<List<Employee>> typeReference) {
        List<Department> o = null;
        return null;
    }

    public List<Department> readValue(File file, TypeReference<List<Department>> typeReference) {
        List<Department> o = null;
        return null;
    }
}

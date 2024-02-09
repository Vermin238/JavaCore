package seminar;

import seminar.classes.*;
import seminar.enums.Skill;
import seminar.repository.EmployeeRepository;
import seminar.services.EmployeeService;

import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {
        Department department = new Department();

        Employee employee1 = new Employee("Смирнов"
                , "Иван"
                , LocalDate.of(1965, 02, 26)
                , 100
                , department,
                Skill.ENGINEER);
        EmployeeRepository.addEmployee(employee1);
        Employee employee2 = new Employee("Иванов"
                , "Дмитрий"
                , LocalDate.of(1978, 8, 14)
                , 200
                , department,
                Skill.ENGINEER);
        EmployeeRepository.addEmployee(employee2);
        Employee employee3 = new Employee("Соболев"
                , "Сергей"
                , LocalDate.of(1989, 5, 10)
                , 300
                , department,
                Skill.MANAGER);
        EmployeeRepository.addEmployee(employee2);

        Task task1 = new Task("Задача1"
                , 1,
                LocalDate.of(2023, 10, 16)
                , Skill.ENGINEER
                , 10);

        Task task2 = new Task("Задача2"
                , 2,
                LocalDate.of(2023, 10, 15)
                , Skill.ENGINEER
                , 20);

        TaskPlanner.setEmployees(EmployeeRepository.getEmployees());
        Assigment assigment1 = TaskPlanner.planTask(task1);
//        System.out.println(EmployeeRepository.getEmployees());
//        System.out.println(AssigmentRepository.getAssigmentList());
        EmployeeService employeeService = new EmployeeService();
        employeeService.startTaskByEmployee(assigment1.getEmployee(), assigment1);

        Assigment assigment2 = TaskPlanner.planTask(task2);
        employeeService.startTaskByEmployee(assigment2.getEmployee(), assigment2);

        System.out.println(employeeService.getAssigmentsByEmployee(employee1));
        System.out.println(employeeService.getAssigmentsByEmployee(employee2));
        System.out.println(employeeService.getAssigmentsByEmployee(employee3));
    }
}
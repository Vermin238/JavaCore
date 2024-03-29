package hw;

import hw.entity.department.Department;
import hw.entity.person.Employee;
import hw.entity.task.Task;
import hw.enums.Priority;
import hw.enums.Skill;
import hw.menu.MainMenu;
import hw.repository.DepartmentRepository;
import hw.repository.EmployeeRepository;
import hw.repository.FreeTaskRepository;
import hw.services.*;

import java.time.LocalDate;

public class Main {
    static Department department;
    static Employee engineer1;
    static Employee engineer2;
    static Employee manager;
    static Task taskLow1;
    static Task taskLow2;
    static Task taskMiddle1;
    static Task taskMiddle2;
    static Task taskMiddle3;
    static Task taskMiddle4;
    static Task taskHigh1;
    static Task taskHigh2;

    public static void main(String[] args) {
        try {
            readData();
            MainMenu.viewMenu();
            writeData();
        } catch (Exception e) {
            e.printStackTrace();
            System.out.println(e.getMessage());
        }
    }

    public static void readData() throws Exception {
        FileService writeReadService = new FileService();
        writeReadService.FileReader();
    }

    public static void writeData() throws Exception {
        FileService writeReadService = new FileService();
        writeReadService.FileWriter();
    }

    public static void createDepartment() {
        department = new Department("Отдел1");
        DepartmentRepository.addDepartment(department);
    }

    public static void createEmployees() {
        engineer1 = new Employee("Смирнов"
                , "Иван"
                , LocalDate.of(1965, 2, 26)
                , 100
                , department
                , Skill.ENGINEER);
        EmployeeRepository.addEmployee(engineer1);
        engineer2 = new Employee("Иванов"
                , "Дмитрий"
                , LocalDate.of(1978, 8, 14)
                , 200
                , department
                , Skill.ENGINEER);
        EmployeeRepository.addEmployee(engineer2);
        manager = new Employee("Соболев"
                , "Сергей"
                , LocalDate.of(1989, 5, 10)
                , 300
                , department
                , Skill.MANAGER);
        EmployeeRepository.addEmployee(manager);
    }

    public static void createTasks() throws Exception {

        taskLow1 = new Task("НизкаяЗадача1"
                , 1
                , LocalDate.of(2023, 10, 16)
                , Skill.ENGINEER
                , 10);
        FreeTaskRepository.addTask(taskLow1);
        taskLow2 = new Task("НизкаяЗадача2"
                , 2
                , LocalDate.of(2023, 10, 15)
                , Skill.ENGINEER
                , 20);
        FreeTaskRepository.addTask(taskLow2);
        taskMiddle1 = new Task("СредняяЗадача1"
                , 2
                , LocalDate.of(2023, 10, 17)
                , Priority.MIDDLE
                , Skill.ENGINEER
                , 5);
        FreeTaskRepository.addTask(taskMiddle1);
        taskMiddle2 = new Task("СредняяЗадача2"
                , 3
                , LocalDate.of(2023, 10, 16)
                , Priority.MIDDLE
                , Skill.ENGINEER
                , 10);
        FreeTaskRepository.addTask(taskMiddle2);
        taskMiddle3 = new Task("СредняяЗадача3"
                , 3
                , LocalDate.of(2023, 10, 16)
                , Priority.MIDDLE
                , Skill.ENGINEER
                , 9);
        FreeTaskRepository.addTask(taskMiddle3);
        taskMiddle4 = new Task("СредняяЗадача4"
                , 3
                , LocalDate.of(2023, 10, 16)
                , Priority.MIDDLE
                , Skill.ENGINEER
                , 5);
        FreeTaskRepository.addTask(taskMiddle4);
        taskHigh1 = new Task("ВысокаяЗадача1"
                , 3
                , LocalDate.of(2023, 10, 16)
                , Priority.HIGH
                , Skill.ENGINEER
                , 6);
        FreeTaskRepository.addTask(taskHigh1);
        taskHigh2 = new Task("ВысокаяЗадача2"
                , 3
                , LocalDate.of(2023, 10, 16)
                , Priority.HIGH
                , Skill.ENGINEER
                , 10);
        FreeTaskRepository.addTask(taskHigh2);
    }
}
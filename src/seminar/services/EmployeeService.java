package seminar.services;


import seminar.classes.Assigment;
import seminar.classes.Employee;
import seminar.enums.Status;
import seminar.repository.AssigmentRepository;

import java.time.LocalDate;
import java.util.List;

public class EmployeeService {
    public List<Assigment> getAssigmentsByEmployee(Employee employee) {
        return AssigmentRepository.getAssigmentList().stream()
                .filter(x -> x.getEmployee() == employee)
                .toList();
    };

    public void startTaskByEmployee(Employee employee, Assigment assigment){

        employee.setWorking(true);
        assigment.setFactStartDate(LocalDate.now());
        assigment.setStatus(Status.IN_PROGRESS);
    }

    public void finishTaskByEmployee(Employee employee, Assigment assigment){
        employee.setWorking(false);
        assigment.setFactEndDate(LocalDate.now());
        assigment.setStatus(Status.COMPLETE);
    }
}
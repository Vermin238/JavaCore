package hw.entity.person;

import hw.entity.department.Department;
import hw.enums.Skill;

import java.time.LocalDate;

public class Employee extends Person {
    protected double salary;
    protected Department department;
    protected Skill skill;

    public Employee(String lastName, String firstName, LocalDate birthDate, double salary, Department department, Skill skill) {
        super(lastName, firstName, birthDate);
        this.salary = salary;
        this.department = department;
        this.skill = skill;
    }

    public int getId() {
        return 0;
    }

    public Object getSkill() {
        return null;
    }

    public seminar.classes.Department getDepartment() {
        return null;
    }

    public boolean isWorking() {
        boolean b = false;
        return b;
    }

    public void setWorking(boolean b) {
    }

    public Object getSalary() {
        Object o = null;
        return null;
    }

    public void setSalary(double v) {
    }

    public void setDepartment(Department department) {
    }
}
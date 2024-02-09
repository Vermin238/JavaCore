package hw.entity.assignment;

import hw.entity.person.Employee;
import hw.entity.task.Task;
import hw.enums.Status;

import java.time.LocalDate;

public class Assignment {
    protected int id;
    protected Employee employee;
    protected Task task;
    protected Status status;
    private static int count;

    public Assignment(Employee employee, Task task) {
        this.id = count++;
        this.employee = employee;
        this.task = task;
        this.status = Status.NEW;
    }

    public void setId(int id) {
        this.id = id;
        if (id >= count) count = ++id;
    }

    public Task getTask() {
        return null;
    }

    public Employee getEmployee() {
        return null;
    }
    

    public void setEmployee(Employee employee) {
    }

    public Object getStatus() {

        return null;
    }

    public int getId() {
        int i = 0;
        return i;
    }

    public boolean getFactStartDate() {
        boolean b = false;
        return false;
    }

    public void setFactStartDate(LocalDate now) {
    }

    public void setStatus(Status status) {
    }

    public void setTask(Task task) {
    }
}


                

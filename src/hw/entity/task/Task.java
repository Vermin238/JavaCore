package hw.entity.task;

import hw.enums.Priority;
import hw.enums.Skill;

import java.time.LocalDate;

public class Task implements Comparable<Task>{
    protected int id;
    protected String name;
    protected int rank;
    protected LocalDate createDate;
    protected LocalDate dueDate;
    protected Priority priority;
    protected Skill skill;
    protected int length;
    private static int count;

    public Task(String name, int rank, LocalDate dueDate, Skill skill, int length) {
        this(name, rank, dueDate, Priority.LOW, skill, length);
    }

    public Task(String name, int rank, LocalDate dueDate, Priority priority, Skill skill, int length) {
        this.id = count++;
        this.name = name;
        this.rank = rank;
        this.createDate = LocalDate.now();
        this.dueDate = dueDate;
        this.skill = skill;
        this.priority = priority;
        this.length = length;
    }

    public void setId(int id) {
        this.id = id;
        if (id >= count) count = ++id;
    }

    @Override
    public int compareTo(Task o) {
        return this.priority.getCode() - o.priority.getCode();
    }

    public Priority getPriority() {
        return null;
    }

    public seminar.enums.Skill getSkill() {
        return null;
    }

    public int getId() {
        return 0;
    }
}
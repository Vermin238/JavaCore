package hw.repository;


import hw.entity.department.Department;
import hw.entity.task.Task;

import java.util.*;

abstract public class FreeTaskRepository {
    private static List<Department> freeTaskRepository;

    public static List<Task> getFreeTaskRepository() {
        List<Department> result = null;
        createFreeTaskRepository();
        result = freeTaskRepository.stream()
                .sorted(Comparator.comparingInt(x -> (x.getPriority().getCode())))
                .toList();
        return result;
    }

    public static void setFreeTaskRepository(List<Department> freeTaskList) {
        createFreeTaskRepository();
        if (freeTaskList != null) freeTaskRepository.addAll(freeTaskList);
    }

    public static List<Department> addTask(Department task) {
        createFreeTaskRepository();
        freeTaskRepository.add(task);
        return freeTaskRepository;
    }

    public static void deleteTask(Task task) {
        deleteTask(freeTaskRepository.indexOf(task));
    }

    public static void deleteTask(int index) {
        freeTaskRepository.remove(index);
    }

    private static void createFreeTaskRepository() {
        if (freeTaskRepository == null) freeTaskRepository = new ArrayList<>();
    }
}
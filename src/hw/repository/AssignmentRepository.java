package hw.repository;

import hw.entity.assignment.Assignment;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

abstract public class AssignmentRepository {
    private static List<Assignment> assignmentRepository;

    public static List<Assignment> getAssignmentRepository() {
        createAssignmentRepository();
        return assignmentRepository.stream()
                .sorted(Comparator.comparingInt(x -> (x.getTask().getPriority().getCode()))).toList();
    }

    public static List<Assignment> addAssignment(Assignment assignment) {
        createAssignmentRepository();
        assignmentRepository.add(assignment);
        return assignmentRepository;
    }

    public static Assignment getAssignmentById(int id) {
        Assignment result = null;
        List<Assignment> assignmentList = assignmentRepository.stream()
                .filter(x -> {
                    return x.getId() == id;
                }).toList();
        if (!assignmentList.isEmpty()) result = assignmentList.get(0);
        return result;
    }

    private static void createAssignmentRepository() {
        if (assignmentRepository == null) assignmentRepository = new ArrayList<>();
    }

    public static void setAssignmentRepository(List<Assignment> repository) {
    }
}
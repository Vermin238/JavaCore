package hw.exceptions;

public class EmployeeException extends Exception {
    public EmployeeException() {
    }

    public EmployeeException(String message) {
        super(message);
    }
}
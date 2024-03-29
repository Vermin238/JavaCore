package hw.entity.person;

import java.time.LocalDate;

public class Person {
    protected int id;
    protected String lastName;
    protected String firstName;
    protected LocalDate birthDate;
    private static int count;

    public Person(String lastName, String firstName, LocalDate birthDate) {
        this.id = count++;
        this.lastName = lastName;
        this.firstName = firstName;
        this.birthDate = birthDate;
    }

    public void setId() {
        setId(0);
    }

    public void setId(int id) {
        this.id = id;
        if (id >= count) count = ++id;
    }
}


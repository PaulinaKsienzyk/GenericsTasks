package PaulinaKsienzyk.com.github.tasks.Task4;

import java.time.LocalDate;
import java.util.Objects;

public class Person implements Comparable<Person>{

    private final String name;
    private final String surname;
    private final Long id;
    private final LocalDate dateOfBirth;

    public Person(String name, String surname, Long id, LocalDate dateOfBirth) {
        this.name = name;
        this.surname = surname;
        this.id = id;
        this.dateOfBirth = dateOfBirth;
    }

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", surname='" + surname + '\'' +
                ", id=" + id +
                ", dateOfBirth=" + dateOfBirth +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Person person = (Person) o;
        return name.equals(person.name) && surname.equals(person.surname) && id.equals(person.id) && dateOfBirth.equals(person.dateOfBirth);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, surname, id, dateOfBirth);
    }

    @Override
    public int compareTo(Person p) {
        return Long.compare(this.id, p.id);
    }

    public String getName() {
        return name;
    }

    public String getSurname() {
        return surname;
    }

    public Long getId() {
        return id;
    }

    public LocalDate getDateOfBirth() {
        return dateOfBirth;
    }
}

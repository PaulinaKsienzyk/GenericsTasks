package PaulinaKsienzyk.com.github.tasks.genericMethods;

import java.time.LocalDate;
import java.util.Objects;

public class Grade implements Comparable<Grade> {

    private final Title title;
    private final LocalDate dateOfIssuance;
    private final Long id;

    public Grade(Title title, LocalDate dateOfIssuance, Long id) {
        this.title = title;
        this.dateOfIssuance = dateOfIssuance;
        this.id = id;
    }



    @Override
    public String toString() {
        return "Grade{" +
                "title=" + title +
                ", dateOfIssuance=" + dateOfIssuance +
                ", id=" + id +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Grade grade = (Grade) o;
        return title == grade.title && dateOfIssuance.equals(grade.dateOfIssuance) && id.equals(grade.id);
    }

    @Override
    public int hashCode() {
        return Objects.hash(title, dateOfIssuance, id);
    }

    public Title getTitle() {
        return title;
    }

    public LocalDate getDateOfIssuance() {
        return dateOfIssuance;
    }

    public Long getId() {
        return id;
    }

    @Override
    public int compareTo(Grade o) {
        return Long.compare(this.id, o.id);
    }

    public enum Title {
        DOCTOR,
        MASTER
    }
}

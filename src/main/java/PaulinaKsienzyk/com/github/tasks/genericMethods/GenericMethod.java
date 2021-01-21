package PaulinaKsienzyk.com.github.tasks.genericMethods;

import java.time.LocalDate;
import java.util.*;

import static PaulinaKsienzyk.com.github.tasks.genericMethods.Grade.Title.DOCTOR;
import static PaulinaKsienzyk.com.github.tasks.genericMethods.Grade.Title.MASTER;

public class GenericMethod {

    private static final List<Person> people = List.of(
            new Person("Paweł", "Kowalsk", 10000L, LocalDate.of(1990, 5, 21)),
            new Person("Martyna", "Malina", 20000L, LocalDate.of(1970, 4, 21)),
            new Person("Anna", "Kowalski", 30000L, LocalDate.of(1985, 3, 21))
    );

    private static final List<Grade> grades = List.of(
            new Grade(DOCTOR, LocalDate.of(2000, 1, 12), 10L),
            new Grade(MASTER, LocalDate.of(2008, 3, 8), 20L),
            new Grade(DOCTOR, LocalDate.of(2012, 7, 9), 30L)
    );

    private static final List<Integer> integers = List.of(1, 5, 6);

    private static final List<Character> characters = List.of('d', 'a', '9');

    public static void main(String[] args) {
        printMe(people);
        System.out.println("----------");
        printMe(grades);
        System.out.println("----------");
        printMe(integers);
        System.out.println("----------");
        printMe(characters);

        System.out.println();
        System.out.println(maxValue(people.get(0), people.get(1), people.get(2)));
        System.out.println(maxValue(integers.get(0), integers.get(1), integers.get(2)));
    }

    public static <E> void printMe(List<E> list) {
        list.forEach(System.out::println);
    }

    public static <T> T maxValue(T value1, T value2, T value3) {
        List<T> values = new java.util.ArrayList<>(List.of(value1, value2, value3));
        values.sort(Collections.reverseOrder());
        return values.get(0);
    }

    public static <K,V> Map<K,V> mapCreator(K key, V value) {
        return Collections.singletonMap(key, value);
    }
}

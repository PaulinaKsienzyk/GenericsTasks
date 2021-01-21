package PaulinaKsienzyk.com.github.tasks.task3;

public class Task3 {

    class Pair<T,S> {
        private T first;
        private S second;

        void set(T o1, S o2) {
            this.first = o1;
            this.second = o2;
        }

        T getFirst() { return first; }
        S getSecond() { return second; }
    }
}

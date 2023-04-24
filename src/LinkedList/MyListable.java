package LinkedList;

import java.util.function.Predicate;

public interface MyListable {
    void add(int value);
    void add(int index, int value);
    void remove(int index);
    void remove(Predicate<Integer> predicate);
}

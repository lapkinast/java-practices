package pr28;

import java.util.Collection;
import java.util.Collections;
import java.util.HashSet;
import java.util.TreeSet;

public class Main {
    public static void main(String[] args) {
        HashSet<Integer> set = new HashSet<>();
        set.add(-24);
        set.add(88);
        set.add(54);
        set.add(-129);
        // так как в TreeSet есть нужный конструктор, то просто передаём в него наш HashSet
        TreeSet<Integer> treeSet = new TreeSet<>(set);
    }
}
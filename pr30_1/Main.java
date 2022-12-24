package pr30_1;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.stream.Collectors;

import static java.lang.Math.max;

public class Main {
    public static void main(String[] args) {
        haffman(new int[]{2,6,1,8,323,84,24,83,28,85});
    }

    static class Node {
        Node left;
        Node right;
        int value;
        public Node(int value) {
            this.value = value;
        }
    }

    static Node haffman(int[] array) {
        List<Node> sorted = Arrays
                .stream(array)
                .sorted()
                .mapToObj(value -> new Node(value))
                .collect(Collectors.toList());
        while (sorted.size() > 1) {
            Node first = null;
            Node second = null;
            for (Node n : sorted) {
                if (first == null) {
                    first = n;
                    continue;
                }

                if (second == null) {
                    second = n;
                    continue;
                }

                if (first.value > n.value) {
                    first = n;
                    continue;
                }

                if (second.value > n.value) {
                    second = n;
                    continue;
                }
            }

            int leftVal = first == null ? 0 : first.value;
            int rightVal = second == null ? 0 : second.value;

            Node newNode = new Node(leftVal + rightVal);
            if (leftVal < rightVal) {
                newNode.left = first;
                newNode.right = second;
            } else {
                newNode.right = first;
                newNode.left = second;
            }

            sorted.remove(first);
            sorted.remove(second);
            sorted.add(newNode);
        }

        return sorted.get(0);
    }
}

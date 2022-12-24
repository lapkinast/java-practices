package pr26;

import java.util.Stack;

public class Main {
    public static void main(String[] args) {
        int[] arr = {1, 5, 2, 3, 7, 0, 4, 9};
        invert(arr);

        for (int i : arr) {
            System.out.print(i + " ");
        }
    }

    public static void invert(int[] array) {
        Stack<Integer> stack = new Stack<Integer>();
        for (int i = 0; i < array.length / 2; i++) {
            stack.push(array[i]);
            int lastIndex = array.length - 1 - i;
            array[i] = array[lastIndex];
            array[lastIndex] = stack.pop();
        }
    }
}
package pr20;

import java.io.Serializable;
import java.util.Arrays;

public class Main20 {
    public static void main(String[] args) {
    }

    public class Task20<T extends Comparable<T>,V extends Animal & Serializable,K> {
        T t;
        V v;
        K k;

        public Task20(T t, V v, K k) {
            this.t = t;
            this.k = k;
            this.v = v;
        }


        public T getT() {
            return t;
        }

        public V getV() {
            return v;
        }

        public K getK() {
            return k;
        }

        public void PrintTypes() {
            System.out.println(k.getClass().getName());
            System.out.println(t.getClass().getName());
            System.out.println(v.getClass().getName());
        }



    }


    public class Animal {
        int age;
    }

    public class Matrix<T extends Number> {
        T[][] matrixa;

        public Matrix(int x, int y) {
            matrixa = (T[][]) new Object[x][y];
        }

        public T[][] add(T[][] matrixb) {
            for(int i=0; i<matrixa.length; i++) {
                for(int j=0; j<matrixa[0].length; j++) {
                    matrixa[i][j] = Calculator.Sum(matrixa[i][j], matrixb[i][j]);
                }
            }
            return matrixa;
        }

        public T[][] substract(T[][] matrixb) {
            for(int i=0; i<matrixa.length; i++) {
                for(int j=0; j<matrixa[0].length; j++) {
                    matrixa[i][j] = Calculator.subtraction(matrixa[i][j], matrixb[i][j]);
                }
            }
            return matrixa;
        }

        public T[][] multiplication(T[][] matrixb) {
            T[][] result = (T[][]) new Object[matrixa.length][matrixb[0].length];
            for(int i=0; i<matrixa.length; i++) {
                for(int j=0; j<matrixb[0].length; j++) {
                    result[i][j] = calculateSingleResult(matrixb, i, j);
                }
            }
            return result;
        }


        private T calculateSingleResult(T[][] matrixb, int row, int col) {
            T result = (T) new Double(0);
            for(int k=0; k<matrixa[0].length; k++) {
                T a = matrixa[row][k];
                T b = matrixb[k][col];
                T resultt = Calculator.multiply(a, b);
                result = Calculator.Sum(result, resultt);
            }
            return result;
        }
    }

    public static class Calculator {
        public static  <T extends Number, V extends Number> T Sum(T num1, V num2) {
            return (T) new Double(num1.doubleValue() + num2.doubleValue());
        }

        public static  <T extends Number, V extends Number> T multiply(T num1, V num2) {
            return (T) new Double(num1.doubleValue() * num2.doubleValue());
        }

        public static  <T extends Number, V extends Number> T divide(T num1, V num2) {
            return (T) new Double(num1.doubleValue() / num2.doubleValue());
        }

        public static  <T extends Number, V extends Number> T subtraction(T num1, V num2) {
            return (T) new Double(num1.doubleValue() - num2.doubleValue());
        }
    }

    public class MinMax<T extends Comparable<T>> {
        private T[] arr;

        public MinMax(T[] arr) {

            this.arr = arr;
        }

        public T FindMax() {
            return Arrays.stream(arr).max((o1, o2) -> o1.compareTo(o2)).get();
        }

        public T FindMin() {
            return Arrays.stream(arr).min((o1, o2) -> o1.compareTo(o2)).get();
        }
    }
}


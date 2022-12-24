package pr20;

import java.io.Serializable;
public class Generic<T extends Comparable<T>, V extends Animal & Serializable, K>{
    public T t;
    public V v;
    public K k;
    Generic(T t, V v, K k){
        this.t = t;
        this.v = v;
        this.k = k;
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
    public String toString() {
        return "t " + t.getClass() + "," + t +  "\n" +
                "v " + v.getClass() + ", " + v + "\n" +
                "k " + k.getClass() + ", " + k + "\n";
    }
    public static void main(String[] args) {
        Generic generic = new Generic("Vendi", new Animal("Cat", "Cornish-rex"), 49584.6);
        System.out.println(generic);;
    }
}
package pr2;

import java.util.Random;
public class Circle extends Point{
    double r = 0, s = 0;
    public Circle(double xc, double yc, double r){
        super(xc, yc);
        this.r = r;
    }
    public double getR(){
        return r;
    }
    public void setR(double r) {
        this.r = r;
    }
    public double square(double r){
        this.s = Math.PI * Math.pow(r, 2);
        return s;
    }
    @Override
    public String toString(){
        return "Circle{" +
                "x = " + x +
                ", y = " + y +
                ", R = " + r + ", S = " + s + "}";
    }
}
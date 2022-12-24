package pr2;

public class TestBall {
    public static void main(String[] args){
        Ball ball = new Ball(0, 0);
        System.out.println(ball);
        ball.setX(0.5);
        ball.setY(0.4);
        System.out.println(ball);
        ball.move(5, 2);
        System.out.println(ball);
    }
}
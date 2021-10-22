package com.NCcourses;

import com.NCcourses.hw1_2.Ball;
import com.NCcourses.hw1_2.Container;
import com.NCcourses.other.TestClasses;

public class Main {
    public static void main(String[] args) {

        //TestClasses.Test();


        Container container = new Container(-100, 100, 200, 200);
        Ball ball = new Ball(0, 0, 10, 5, 90);
        System.out.println(container);
        while (container.collides(ball)){
            ball.move();
            System.out.println(ball);
        }

        System.out.println("==============");

        ball = new Ball(0, 0, 10, 5, 5);
        int rebound = 0;
        while (rebound < 8){
            ball.move();
            if (ball.getY() + ball.getRadius() > container.getY() ||
                    ball.getY() - ball.getRadius() < container.getY() - container.getHeight()) {
                ball.reflectVertical();
                rebound++;
                ball.move();
            }
            if (ball.getX() - ball.getRadius() < container.getX() ||
                    ball.getX() + ball.getRadius() > container.getX() + container.getWidth()) {
                ball.reflectHorizontal();
                rebound++;
                ball.move();
            }
            System.out.println(ball);
        }




    }
}

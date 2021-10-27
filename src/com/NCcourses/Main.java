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
            if (!container.collidesWidth(ball) && !container.collidesHeight(ball)){
                ball.reflectHorizontal();
                ball.reflectVertical();
                ball.move();
                rebound++;
            }
            else
                if (!container.collidesHeight(ball)) {
                    ball.reflectVertical();
                    ball.move();
                    rebound++;
            }
                else
                    if(!container.collidesWidth(ball)){
                        ball.reflectHorizontal();
                        ball.move();
                        rebound++;
                    }
            System.out.println(ball);
        }




    }
}

package com.NCcourses.hw1_2;

import java.util.Objects;

public class Container {
    private int x1;
    private int y1;
    private int x2;
    private int y2;

    public Container(int x, int y, int width, int height){
        this.x1 = x;
        this.y1 = y;
        this.x2 = x + width;
        this.y2 = y - height;
    }

    public int getX() {
        return x1;
    }

    public int getY() {
        return y1;
    }

    public int getWidth(){
        return x2 - x1;
    }

    public int getHeight(){
        return y1 - y2;
    }

    public boolean collides(Ball ball){
        return collidesWidth(ball) && collidesHeight(ball);
    }

    public boolean collidesHeight(Ball ball){
        return !(ball.getY() + ball.getRadius() > y1)
                && !(ball.getY() - ball.getRadius() < y2);
    }

    public boolean collidesWidth(Ball ball){
        return !(ball.getX() - ball.getRadius() < x1) &&
                !(ball.getX() + ball.getRadius() > x2);
    }

    @Override
    public String toString() {
        return "Container[(" + x1 + "," + y1 + "),(" + x2 + "," + y2 + ")]";
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Container)) return false;
        Container container = (Container) o;
        return x1 == container.x1 && y1 == container.y1 && x2 == container.x2 && y2 == container.y2;
    }

    @Override
    public int hashCode() {
        return Objects.hash(x1, y1, x2, y2);
    }
}

package com.NCcourses.hw1_2;

public class Ball {
    private float x;
    private float y;
    private int radius;
    private float xDelta;
    private float yDelta;

    public Ball(float x, float y, int radius, int speed, int direction){
        this.x = x;
        this.y = y;
        this.radius = radius;
        xDelta = (float)(speed * Math.cos(direction * Math.PI / 180));
        yDelta = (float)(-speed * Math.sin(direction * Math.PI / 180));
    }

    public float getX() {
        return x;
    }
    public void setX(float x) {
        this.x = x;
    }
    public float getY() {
        return y;
    }
    public void setY(float y) {
        this.y = y;
    }
    public int getRadius() {
        return radius;
    }
    public void setRadius(int radius) {
        this.radius = radius;
    }
    public void setxDelta(float xDelta) {
        this.xDelta = xDelta;
    }
    public void setyDelta(float yDelta) {
        this.yDelta = yDelta;
    }
    public float getxDelta() {
        return xDelta;
    }
    public float getyDelta(){
        return yDelta;
    }
    public void move(){
        x += xDelta;
        y += yDelta;
    }
    public void reflectHorizontal(){
        xDelta *= -1;
    }
    public void reflectVertical(){
        yDelta *= -1;
    }
    @Override
    public String toString(){
        return "Ball[(" + x + "," + y + "), speed=(" + xDelta + "," + yDelta + ")]";
    }
}

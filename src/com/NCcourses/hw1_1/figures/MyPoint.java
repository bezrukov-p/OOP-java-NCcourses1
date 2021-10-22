package com.NCcourses.hw1_1.figures;

public class MyPoint {
    private int x = 0;
    private int y = 0;

    public MyPoint(){}
    public MyPoint(int x, int y){ this.x = x; this.y = y;}

    public int getX() {
        return x;
    }
    public int getY() {
        return y;
    }
    public void setX(int x) {
        this.x = x;
    }
    public void setY(int y) {
        this.y = y;
    }
    public int[] getXY(){
        int[] xy = new int[2];
        xy[0] = this.x;
        xy[1] = this.y;
        return xy;
    }
    public void setXY(int x, int y){ this.x = x; this.y = y; }
    @Override
    public String toString(){ return "(" + x + "," + y + ")"; }
    public double distance(int x, int y){
        return Math.sqrt((x - this.x)*(x - this.x) + (y - this.y)*(y - this.y));
    }
    public double distance(MyPoint another){ return this.distance(another.getX(), another.getY()); }
    public double distance(){ return this.distance(0, 0); }
}

package com.NCcourses.hw1_1.figures;

import com.NCcourses.other.IsEqualDouble;

import java.util.Objects;

public class MyTriangle {
    private MyPoint v1;
    private MyPoint v2;
    private MyPoint v3;

    public MyTriangle(int x1, int y1, int x2, int y2, int x3, int y3){
        v1 = new MyPoint(x1, y1);
        v2 = new MyPoint(x2, y2);
        v3 = new MyPoint(x3, y3);
    }
    public MyTriangle(MyPoint v1, MyPoint v2, MyPoint v3){
        this.v1 = new MyPoint(v1.getX(), v1.getY());
        this.v2 = new MyPoint(v2.getX(), v2.getY());
        this.v3 = new MyPoint(v3.getX(), v3.getY());
    }

    @Override
    public String toString(){
        return "[v1=" + v1 + ",v2=" + v2 + ",v3=" + v3 + "]";
    }
    public double getPerimeter(){
        return v1.distance(v2) + v2.distance(v3) + v3.distance(v1);
    }
    public String getType(){
        double dist1 = v1.distance(v2);
        double dist2 = v2.distance(v3);
        double dist3 = v3.distance(v1);
        if (IsEqualDouble.isEqualDouble(dist1, dist2) &&
                IsEqualDouble.isEqualDouble(dist2, dist3) &&
                IsEqualDouble.isEqualDouble(dist3, dist1))
            return "Equilateral";
        else if(IsEqualDouble.isEqualDouble(dist1, dist2) ||
                IsEqualDouble.isEqualDouble(dist2, dist3) ||
                IsEqualDouble.isEqualDouble(dist3, dist1))
            return "Isosceles";
        else
            return "Scalene";
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof MyTriangle)) return false;
        MyTriangle that = (MyTriangle) o;
        return Objects.equals(v1, that.v1) && Objects.equals(v2, that.v2) && Objects.equals(v3, that.v3);
    }

    @Override
    public int hashCode() {
        return Objects.hash(v1, v2, v3);
    }
}

package com.NCcourses.hw1_1.figures;

import java.util.Objects;

public class Rectangle {
    private float length = 1.0f;
    private float width = 1.0f;

    public Rectangle(){};
    public Rectangle(float length, float width){
        this.length = length;
        this.width = width;
    }

    public float getLength() {
        return length;
    }
    public float getWidth() {
        return width;
    }
    public void setLength(float length) {
        this.length = length;
    }
    public void setWidth(float width) {
        this.width = width;
    }
    public double getArea(){
        return length * width;
    }
    public double getPerimeter(){ return (length + width) * 2; }
    @Override
    public String toString(){
        return "Rectangle[length=" + this.length + ",width=" + this.width + "]";
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Rectangle)) return false;
        Rectangle rectangle = (Rectangle) o;
        return Float.compare(rectangle.getLength(), getLength()) == 0 && Float.compare(rectangle.getWidth(), getWidth()) == 0;
    }

    @Override
    public int hashCode() {
        return Objects.hash(getLength(), getWidth());
    }
}

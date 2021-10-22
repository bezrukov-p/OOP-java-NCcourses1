package com.NCcourses.other;

public class IsEqualDouble {
    static public boolean isEqualDouble(double first, double second){
        return Math.abs(first - second) < 0.00001;
    }
}

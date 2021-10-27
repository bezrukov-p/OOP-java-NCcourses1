package com.NCcourses.hw1_2;

import static com.NCcourses.other.IsEqualDouble.*;

public class MyComplex {
    private double real = 0.0;
    private double imag = 0.0;

    public MyComplex(){}
    public MyComplex(double real, double imag){
        this.real = real;
        this.imag = imag;
    }

    public double getReal() {
        return real;
    }

    public void setReal(double real) {
        this.real = real;
    }

    public double getImag() {
        return imag;
    }

    public void setImag(double imag) {
        this.imag = imag;
    }

    public void setValue(double real, double imag){
        this.real = real;
        this.imag = imag;
    }

    @Override
    public String toString(){
        String sign = (imag < 0) ? "" : "+";
        return "(" + real + sign + imag + "i)";
    }

    public boolean isReal(){
        return (isEqualDouble(imag, 0.0));
    }

    public boolean isImaginary(){
        return (!isEqualDouble(imag, 0.0));
    }

    public boolean equals(double real, double imag){
        return (isEqualDouble(this.real, real) && isEqualDouble(this.imag, imag));
    }

    public boolean equals(MyComplex another){
        return (isEqualDouble(this.real, another.real) && isEqualDouble(this.imag, another.imag));
    }

    public double magnitude(){
        return Math.sqrt(real*real + imag*imag);
    }

    public double argument(){
        if (real == 0){
            if (imag > 0)
                return Math.PI/2;
            else if (imag < 0)
                return 3*Math.PI/2;
        }
        if (real > 0){
            if (imag >= 0)
                return Math.atan(imag/real);
            else
                return 2*Math.PI - Math.atan(Math.abs(imag/real));
        }
        if (real < 0){
            if (imag >= 0)
                return Math.PI - Math.atan(Math.abs(imag/real));
            else
                return Math.PI + Math.atan(Math.abs(imag/real));
        }
        return 0;
    }

    public MyComplex add(MyComplex right){
        this.real += right.real;
        this.imag += right.imag;
        return this;
    }

    public MyComplex addNew(MyComplex right){
        return new MyComplex(this.real + right.real, this.imag + right.imag);
    }

    public MyComplex subtract(MyComplex right){
        this.real -= right.real;
        this.imag -= right.imag;
        return this;
    }

    public MyComplex subtractNew(MyComplex right){
        return new MyComplex(this.real - right.real, this.imag - right.imag);
    }

    public MyComplex multiply(MyComplex right){
        this.real = this.real * right.real - this.imag * right.imag;
        this.imag = this.real * right.imag + this.imag * right.real;
        return this;
    }

    public MyComplex divide(MyComplex right){
        this.real = (this.real * right.real + this.imag * right.imag)/(right.real * right.real + right.imag * right.imag);
        this.imag = (right.real * this.imag - this.real * right.imag)/(right.real * right.real + right.imag * right.imag);
        return this;
    }

    public MyComplex conjugate(){
        this.imag *= -1;
        return this;
    }
}

package com.NCcourses.hw1_2;

import static com.NCcourses.other.IsEqualDouble.*;

public class MyPolynomial {
    private double[] coeffs;

    public MyPolynomial(double... coeffs){
        if (coeffs.length == 0)
            this.coeffs = new double[1];
        else if (coeffs.length == 1){
            this.coeffs = new double[1];
            this.coeffs[0] = coeffs[0];
        }
        else {
            int newsize = 1;
            for (int i = coeffs.length - 1; i >= 1; i--) {
                if (!isEqualDouble(coeffs[i], 0)) {
                    newsize = i + 1;
                    break;
                }
            }
            this.coeffs = new double[newsize];
            for (int i = 0; i < this.coeffs.length; i++)
                this.coeffs[i] = coeffs[i];
        }
    }

    public int getDegree(){
        if (coeffs.length == 0)
            return 0;
        return coeffs.length - 1;
    }
    @Override
    public String toString(){
        String pol = "";

        if (this.coeffs.length == 0)
            return 0 + "";

        //if just c0
        if (coeffs.length == 1){
            return coeffs[coeffs.length - 1] + "";
        }

        // c1x + c0
        if (coeffs.length == 2){
            pol = pol + coeffs[1] + "x";
            if (coeffs[0] != 0){
                String sign = "+";
                if (coeffs[0] < 0)
                    sign = "";
                pol = pol + sign + coeffs[0];
            }
            return pol;
        }

        //add x^n
        if (coeffs[coeffs.length - 1] != 0) {
            pol = pol + coeffs[coeffs.length - 1] + "x^" + (coeffs.length - 1);
        }

        // x^n-1 to x^2
        for(int i = coeffs.length - 2; i >= 2; i--){
            if (coeffs[i] != 0){
                String sign = "+";
                if ( coeffs[i] < 0)
                    sign = "";
                pol = pol + sign + coeffs[i] + "x^" + i;
            }
        }

        //add c1*x
        if (coeffs[1] != 0){
            String sign = "+";
            if ( coeffs[1] < 0)
                sign = "";
            pol = pol + sign + coeffs[1] + "x";
        }

        //add c0
        String sign = "+";
        if ( coeffs[0] != 0){
            if (coeffs[0] < 0)
                sign = "";
            pol = pol + sign + coeffs[0];
        }

        if (pol.equals(""))
            return 0 + "";
        return pol;
    }
    public double evaluate(double x){
        if (coeffs.length == 0)
            return 0;
        double res = coeffs[0];
        for(int i = 1; i < coeffs.length; i++)
            res += coeffs[i]*Math.pow(x, i);
        return res;
    }
    public MyPolynomial add(MyPolynomial right){
        double[] coeffsres = new double[Math.max(this.coeffs.length, right.coeffs.length)];
        if (this.coeffs.length >= right.coeffs.length){
            for(int i = 0; i < right.coeffs.length; i++)
                coeffsres[i] = this.coeffs[i] + right.coeffs[i];
            for(int i = right.coeffs.length; i < this.coeffs.length; i++)
                coeffsres[i] = this.coeffs[i];
        }
        else{
            for(int i = 0; i < this.coeffs.length; i++)
                coeffsres[i] = this.coeffs[i] + right.coeffs[i];
            for(int i = this.coeffs.length; i < right.coeffs.length; i++)
                coeffsres[i] = right.coeffs[i];
        }
        return new MyPolynomial(coeffsres);
    }
    public MyPolynomial multiply(MyPolynomial right){
        double[] coeffsres = new double[this.getDegree() + right.getDegree() + 1];
        for(int i = 0; i < this.coeffs.length; i++){
            for(int j = 0; j < right.coeffs.length; j++){
                coeffsres[i+j] += this.coeffs[i] * right.coeffs[j];
            }
        }
        return new MyPolynomial(coeffsres);
    }
}

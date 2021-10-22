package com.NCcourses.other;

import com.NCcourses.hw1_1.Author;
import com.NCcourses.hw1_1.Book;
import com.NCcourses.hw1_1.Employee;
import com.NCcourses.hw1_1.figures.Circle;
import com.NCcourses.hw1_1.figures.MyPoint;
import com.NCcourses.hw1_1.figures.MyTriangle;
import com.NCcourses.hw1_1.figures.Rectangle;
import com.NCcourses.hw1_2.MyComplex;
import com.NCcourses.hw1_2.MyPolynomial;

public class TestClasses {
    public static void Test(){
        Circle crc = new Circle(2.0, "black");
        System.out.println(crc);
        System.out.println(crc.getArea());
        System.out.println("=======================================");

        Rectangle rct = new Rectangle(4, 2);
        System.out.println(rct);
        System.out.println(rct.getArea());
        System.out.println(rct.getPerimeter());
        System.out.println("=======================================");

        Employee emp = new Employee(10, "ivan", "ivanov", 101);
        emp.raiseSalary(10);
        System.out.println(emp);
        System.out.println(emp.getAnnualSalary());
        System.out.println(emp.getName());
        System.out.println("=======================================");


        Author[] authors = new Author[2];
        authors[0] = new Author("ivan", "@", 'm');
        authors[1] = new Author("petr", "@", 'm');
        com.NCcourses.hw1_1.Book b = new Book("durak", authors, 100, 1);
        System.out.println(b);
        System.out.println(b.getAuthorNames());
        System.out.println("=======================================");

        MyPoint p1 = new MyPoint(1, 1);
        MyPoint p2 = new MyPoint(2, 2);
        System.out.println(p1);
        System.out.println(p2);
        System.out.println(p1.distance(p2));
        System.out.println(p1.distance(-1, -1));
        System.out.println("=======================================");

        MyTriangle t = new MyTriangle(1, 1, 1, 2, 2, 1);
        System.out.println(t.getPerimeter());
        System.out.println(t.getType());
        System.out.println(t);
        System.out.println("=======================================");

        MyPolynomial pol1 = new MyPolynomial(0, 1, 2, 3, 5, 0, 5, 1, 0);
        System.out.println(pol1);
        System.out.println(pol1.add(pol1));
        System.out.println(pol1.multiply(new MyPolynomial(0, 1)));
        System.out.println("=================================================");

        MyComplex c1 = new MyComplex(1, -1);
        System.out.println(c1.add(c1));
        System.out.println(c1.equals(c1));
        System.out.println(c1.isImaginary());
        System.out.println(c1.subtract(c1));
        System.out.println("=================================================");
    }
}

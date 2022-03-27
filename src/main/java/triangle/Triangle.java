package triangle;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;

import javax.management.ObjectName;
import java.util.Arrays;
import java.util.Objects;

public class Triangle {
    private int a;
    private int b;
    private int c;

    private static final String SCALENE_TRIANGLE = "this is scalene triangle";
    private static final String ISOSCELES_TRIANGLE = "this is isosceles triangle";
    private static final String EQUILATERAL_TRIANGLE = "this is equilateral triangle";
    private static final String NOT_A_TRIANGLE = "this is not a triangle sum of two sides should be more then third side";


    public Triangle(int a, int b, int c) {
        this.a = a;
        this.b = b;
        this.c = c;
    }


    public void setA(int a) {
        this.a = a;
    }

    public void setB(int b) {
        this.b = b;
    }

    public void setC(int c) {
        this.c = c;
    }

    public Triangle() {
    }


//    public boolean triangleType(int a, int b, int c) {
//        if (a == b && b == c && a == c) {
//            System.out.println(EQUILATERAL_TRIANGLE);
//
//        } else if (a == b || b == c || a == c) {
//            System.out.println(ISOSCELES_TRIANGLE);
//
//        } else if (a != b && b != c && a != c) {
//            System.out.println(SCALENE_TRIANGLE);
//
//        } else {
//            System.out.println(NOT_A_TRIANGLE);
//
//        }
//        return true;
//    }
//
//    public boolean isTriangle(int a, int b, int c) {
//        boolean res = ((a + b > c) && (a + c > b) && (b + c > a));
//        if (res == true) {
//            System.out.println("this is triangle");
//            return res;
//        } else if (res == false)
//            System.out.println("this is not triangle");
//        return res;
//    }


//    public void triangleType(int a, int b, int c) {
//        if ((a == b && b == c && a == c) && (isTriangle(a, b, c))) {
//            System.out.println(EQUILATERAL_TRIANGLE);
//
//        } else if ((a == b || b == c || a == c) && (isTriangle(a, b, c))) {
//            System.out.println(ISOSCELES_TRIANGLE);
//
//        } else if ((a != b && b != c && a != c) && (isTriangle(a, b, c))) {
//            System.out.println(SCALENE_TRIANGLE);
//
//        } else {
//            System.out.println(NOT_A_TRIANGLE);
//        }
//    }

    //этот монстр определяет каким из треугольников является наш)
    public int triangleType(int a, int b, int c) {
        if ((a == b && b == c && a == c) && (isTriangle(a, b, c))) {
            System.out.println(EQUILATERAL_TRIANGLE);
            return 1;
        } else if ((a == b || b == c || a == c) && (isTriangle(a, b, c))) {
            System.out.println(ISOSCELES_TRIANGLE);
            return 2;
        } else if ((a != b && b != c && a != c) && (isTriangle(a, b, c))) {
            System.out.println(SCALENE_TRIANGLE);
            return 3;
        } else {
            System.out.println(NOT_A_TRIANGLE);
            return 4;
        }
    }
    // функция проверяет является ли треугольник треугольником

    public boolean isTriangle(int a, int b, int c) {
        boolean isTr = (a + b > c) && (a + c > b) && (b + c > a);
        if (isTr) {
            System.out.println("this is triangle");
            return isTr;
        } else
            System.out.println("this is not triangle");
        return isTr;
    }

    // доп. метод для определения периметра

    public int perimetrTriamgle(int a, int b, int c) {
        System.out.println("Sum of sides is: ");
        return a + b + c;
    }
    // доп. метод для определения площади по формуле Герона
    public double squareTriangle(int a, int b, int c) {
        double perimetr;
        double square;
        perimetr = (a + b + c) / 2.0;
        square = Math.sqrt(perimetr * (perimetr - a) * (perimetr - b) * (perimetr - c));
        System.out.println("square is: ");
        return square;
    }




}



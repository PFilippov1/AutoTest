package triangle;

import javax.management.ObjectName;
import java.util.Objects;

public class Triangle {
    int a;
    int b;
    int c;

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


//    public void triangleType(boolean isT) {
//        if ((a == b && b == c && a == c) && (isT==true)) {
//            System.out.println(EQUILATERAL_TRIANGLE);
//        } else if ((a == b || b == c || a == c ) && (isT==true)) {
//            System.out.println(ISOSCELES_TRIANGLE);
//        } else if ((a != b && b != c && a != c) && (isT==true)) {
//            System.out.println(SCALENE_TRIANGLE);
//        } else {
//            System.out.println(NOT_A_TRIANGLE);
//        }
//    }


//    public void triangleType(int a, int b, int c) {
//        if (a == b && b == c && a == c) {
//            System.out.println(EQUILATERAL_TRIANGLE);
//        } else if (a == b || b == c || a == c )  {
//            System.out.println(ISOSCELES_TRIANGLE);
//        } else if (a != b && b != c && a != c)  {
//            System.out.println(SCALENE_TRIANGLE);
//        } else {
//            System.out.println(NOT_A_TRIANGLE);
//        }
//    }

    public boolean triangleType(int a, int b, int c) {
        if (a == b && b == c && a == c) {
            System.out.println(EQUILATERAL_TRIANGLE);

        } else if (a == b || b == c || a == c) {
            System.out.println(ISOSCELES_TRIANGLE);

        } else if (a != b && b != c && a != c) {
            System.out.println(SCALENE_TRIANGLE);

        } else {
            System.out.println(NOT_A_TRIANGLE);

        }
        return true;
    }

    public boolean isTriangle(int a, int b, int c) {
        boolean res = ((a + b > c) && (a + c > b) && (b + c > a));
        if (res == true) {
            System.out.println("this is triangle");
            return res;
        } else if (res == false)
            System.out.println("this is not triangle");
        return res;
    }


    public int perimetrTriamgle(int a, int b, int c) {
        System.out.println("Sum of sides is: ");
        return a + b + c;
    }

    public double squareTriangle(int a, int b, int c) {
        double perimetr;
        double square;
        perimetr = (a + b + c) / 2.0;
        square = Math.sqrt(perimetr * (perimetr - a) * (perimetr - b) * (perimetr - c));
        System.out.println("square is: ");
        return square;
    }

}

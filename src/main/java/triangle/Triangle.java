package triangle;

public class Triangle {
    int a;
    int b;
    int c;

    private static String SIMPLE_TRIANGLE = "this is triangle";
    private static String ISOSCELES_TRIANGLE = "this is isosceles triangle";
    private static String EQUILATERAL_TRIANGLE = "this is equilateral triangle";
    private static String NOT_A_TRIANGLE = "this is not a triangle";


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

    //    public void triangleType(int a, int b, int c) {
//        if (a == b && b == c && a == c) {
//            System.out.println(EQUILATERAL_TRIANGLE);
//        } else if (a != b && b == c || a != c && b == a) {
//            System.out.println(ISOSCELES_TRIANGLE);
//        } else if (a != b & b != c & a != c) {
//            System.out.println(SIMPLE_TRIANGLE);
//        } else {
//            System.out.println(NOT_A_TRIANGLE);
//        }
//    }

    public void triangleType() {
        if ((a == b && b == c && a == c) && ((a + b > c) && (a + c > b) && (b + c > a))){
            System.out.println(EQUILATERAL_TRIANGLE);
        } else if ((a != b && b == c || a != c && b == a) && ((a + b > c) && (a + c > b) && (b + c > a))){
            System.out.println(ISOSCELES_TRIANGLE);
        } else if ((a != b && b != c && a != c) && ((a + b > c) && (a + c > b) && (b + c > a))){
            System.out.println(SIMPLE_TRIANGLE);
        } else{
            System.out.println(NOT_A_TRIANGLE);
        }
    }


    public int perimetrTriamgle(int a, int b, int c) {
        System.out.println("Sum of sides is: ");
        return a + b + c;
    }

    public double squareTriangle(int a, int b, int c){
        double perimetr;
        double square;
        perimetr = (a+b+c)/2.0;
        square=Math.sqrt(perimetr*(perimetr-a)*(perimetr-b)*(perimetr-c));
        System.out.println("square is: ");
        return square;
    }

}

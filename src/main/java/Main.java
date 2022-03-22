import triangle.Triangle;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println("enter triangle sides");
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter first side");
        int firstSide = scanner.nextInt();
        System.out.println("Enter second side");
        int secondSide = scanner.nextInt();
        System.out.println("Enter third side");
        int thirdSide = scanner.nextInt();


        Triangle triangle1 = new Triangle(firstSide, secondSide, thirdSide);


        triangle1.triangleType(firstSide, secondSide, thirdSide);

        Triangle triangle2 = new Triangle();
        System.out.println(triangle2.perimetrTriamgle(firstSide, secondSide, thirdSide));

        Triangle triangle3 = new Triangle();
        System.out.println(triangle3.squareTriangle(firstSide, secondSide, thirdSide));
    }
}

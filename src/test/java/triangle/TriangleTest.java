package triangle;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class TriangleTest {
    Triangle triangle1;
    Triangle triangle2;
    Triangle triangle3;
    Triangle triangle4;
    Triangle triangle5;


    @BeforeEach
    void setUp() {

        triangle1 = new Triangle(1,5,8);
        triangle2 = new Triangle(2, 2, 5);
        triangle3 = new Triangle(2, 2, 2);
        triangle4 = new Triangle(0, 2, 5);
        triangle5 = new Triangle();

    }

    @Test
    void triangleType() {
        triangle1.triangleType();
        triangle2.triangleType();
        triangle3.triangleType();
        triangle4.triangleType();

    }

    @Test
    void sumSides() {
        triangle5.sumSides(1,4,0);
    }
}
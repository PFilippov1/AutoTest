package triangle;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

// добавляем ссылку на объект
class TriangleTest {
    Triangle triangle1;
    Triangle triangle2;
    Triangle triangle3;
    Triangle triangle4;
    Triangle triangle5;
    Triangle triangle6;
    Triangle triangleNot;

    // подготавливаем объекты для тестов
    @BeforeEach
    void setUp() {

        triangle1 = new Triangle(6,5,8);
        triangle2 = new Triangle(5, 5, 3);
        triangle3 = new Triangle(4, 4, 4);
        triangle4 = new Triangle(0, 2, 5);
        triangle5 = new Triangle();
        triangle6 = new Triangle();

    }
    // тест разновидности треугольников
    @Test
    void triangleType() {
        triangle1.triangleType();
        triangle2.triangleType();
        triangle3.triangleType();
        triangle4.triangleType();


    }
// доп тесты для тренировки (что получилось реализовать)) тестируем нахождение периметра
    @Test
    void sumSides() {
        triangle5.perimetrTriamgle(1,4,0);
        Assertions.assertEquals( 6 , triangle5.perimetrTriamgle(2, 4,0));
    }
    // доп тесты для тренировки (что получилось реализовать)) тестируем площадь по формуле Герона
    @Test
    void squareTriangle() {
        triangle6.squareTriangle(3,4,5);
        Assertions.assertEquals( 6.0 , triangle6.squareTriangle(3, 4,5));
    }
}
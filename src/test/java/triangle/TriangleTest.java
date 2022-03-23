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


    // подготавливаем объекты для тестов
    @BeforeEach
    void setUp() {

        triangle1 = new Triangle();
        triangle2 = new Triangle();
        triangle3 = new Triangle();
        triangle4 = new Triangle();
        triangle5 = new Triangle();
        triangle6 = new Triangle();

    }

    //тест является ли фигура треугольником
    @Test
    void isTriangle() {

        Assertions.assertEquals(true, triangle1.isTriangle(5, 5, 5));
        Assertions.assertEquals(true, triangle2.isTriangle(5, 5, 1));
        Assertions.assertEquals(false, triangle3.isTriangle(1, 5, 1));
        Assertions.assertEquals(true, triangle4.isTriangle(5, 4, 2));


    }

    // тест разновидности треугольников
    @Test
    void triangleType() {

        Assertions.assertEquals(1, triangle1.triangleType(5, 5, 5));
        Assertions.assertEquals(2, triangle2.triangleType(5, 5, 1));
        Assertions.assertEquals(4, triangle3.triangleType(1, 5, 1));
        Assertions.assertEquals(3, triangle4.triangleType(5, 4, 2));

//        triangle1.triangleType(5, 5, 5);
//        triangle2.triangleType(5, 5, 1);
//        triangle3.triangleType(1, 5, 1);
//        triangle4.triangleType(5, 4, 2);
    }

    // доп тесты для тренировки (что получилось реализовать)) тестируем нахождение периметра
    @Test
    void sumSides() {
//        triangle5.perimetrTriamgle(2, 4, 3);
        Assertions.assertEquals(9, triangle5.perimetrTriamgle(2, 4, 3));
    }

    // доп тесты для тренировки (что получилось реализовать)) тестируем площадь по формуле Герона
    @Test
    void squareTriangle() {
//        triangle6.squareTriangle(3, 4, 5);
        Assertions.assertEquals(6.0, triangle6.squareTriangle(3, 4, 5));
    }
}
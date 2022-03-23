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



    // подготавливаем объекты для тестов
    @BeforeEach
    void setUp() {

        triangle1 = new Triangle();
        triangle2 = new Triangle();
        triangle3 = new Triangle();
        triangle4 = new Triangle();


    }

    //тест является ли фигура треугольником
    @Test
    void isTriangle() {

        Assertions.assertEquals(true, triangle1.isTriangle(5, 5, 5));
        Assertions.assertEquals(true, triangle1.isTriangle(1, 1, 1));
        Assertions.assertEquals(true, triangle1.isTriangle(1000000000 , 1000000000, 1000000000));

        Assertions.assertEquals(true, triangle1.isTriangle(5, 5, 1));
        Assertions.assertEquals(true, triangle1.isTriangle(1000000000 , 1000000000, 1));
        Assertions.assertEquals(true, triangle1.isTriangle(1000000000 , 1000000000, 999999999));
        Assertions.assertEquals(true, triangle1.isTriangle(999999999 , 1000000000, 1000000000));
        Assertions.assertEquals(true, triangle1.isTriangle(1000000000 , 999999999, 999999999));
        Assertions.assertEquals(true, triangle1.isTriangle(1000000000 , 999999999, 1000000000));

        Assertions.assertEquals(true, triangle1.isTriangle(2, 3, 4));
        Assertions.assertEquals(true, triangle1.isTriangle(3, 2, 4));
        Assertions.assertEquals(true, triangle1.isTriangle(2, 5, 4));
        Assertions.assertEquals(true, triangle1.isTriangle(1000000000 , 999999999, 999999998));
        Assertions.assertEquals(true, triangle1.isTriangle(999999998 , 999999999, 1000000000));
        Assertions.assertEquals(true, triangle1.isTriangle(999999999 , 999999998, 1000000000));

        Assertions.assertEquals(false, triangle1.isTriangle(1, 1, 5));
        Assertions.assertEquals(false, triangle1.isTriangle(1, 5, 1));
        Assertions.assertEquals(false, triangle1.isTriangle(1, 2, 5));
        Assertions.assertEquals(false, triangle1.isTriangle(5, 1, 1));
        Assertions.assertEquals(false, triangle1.isTriangle(1, 5, 3));
        Assertions.assertEquals(false, triangle1.isTriangle(2, 5, 2));
        Assertions.assertEquals(false, triangle1.isTriangle(5, 5, 0));
        Assertions.assertEquals(false, triangle1.isTriangle(5, 0, 5));
        Assertions.assertEquals(false, triangle1.isTriangle(0, 5, 5));

    }

    // тест разновидности треугольников
    @Test
    void triangleType() {

        Assertions.assertEquals(1, triangle2.triangleType(5, 5, 5));
        Assertions.assertEquals(1, triangle2.triangleType(1000000000, 1000000000, 1000000000));

        Assertions.assertEquals(2, triangle2.triangleType(5, 5, 1));
        Assertions.assertEquals(2, triangle2.triangleType(1000000000 , 1000000000, 1));
        Assertions.assertEquals(2, triangle2.triangleType(1000000000 , 1000000000, 999999999));
        Assertions.assertEquals(2, triangle2.triangleType(999999999 , 1000000000, 1000000000));
        Assertions.assertEquals(2, triangle2.triangleType(1000000000 , 999999999, 999999999));
        Assertions.assertEquals(2, triangle2.triangleType(1000000000 , 999999999, 1000000000));

        Assertions.assertEquals(3, triangle2.triangleType(2, 3, 4));
        Assertions.assertEquals(3, triangle2.triangleType(3, 2, 4));
        Assertions.assertEquals(3, triangle2.triangleType(2, 5, 4));
        Assertions.assertEquals(3, triangle2.triangleType(1000000000 , 999999999, 999999998));
        Assertions.assertEquals(3, triangle2.triangleType(999999998 , 999999999, 1000000000));
        Assertions.assertEquals(3, triangle2.triangleType(999999999 , 999999998, 1000000000));

        Assertions.assertEquals(4, triangle2.triangleType(1, 1, 5));
        Assertions.assertEquals(4, triangle2.triangleType(1, 5, 1));
        Assertions.assertEquals(4, triangle2.triangleType(1, 2, 5));
        Assertions.assertEquals(4, triangle2.triangleType(5, 1, 1));
        Assertions.assertEquals(4, triangle2.triangleType(1, 5, 3));
        Assertions.assertEquals(4, triangle2.triangleType(2, 5, 2));
        Assertions.assertEquals(4, triangle2.triangleType(5, 5, 0));
        Assertions.assertEquals(4, triangle2.triangleType(5, 0, 5));
        Assertions.assertEquals(4, triangle2.triangleType(0, 5, 5));

    }

    // доп тесты для тренировки (что получилось реализовать)) тестируем нахождение периметра
    @Test
    void sumSides() {
//        triangle3.perimetrTriamgle(2, 4, 3);
        Assertions.assertEquals(9, triangle4.perimetrTriamgle(2, 4, 3));
    }

    // доп тесты для тренировки (что получилось реализовать)) тестируем площадь по формуле Герона
    @Test
    void squareTriangle() {
//        triangle4.squareTriangle(3, 4, 5);
        Assertions.assertEquals(6.0, triangle4.squareTriangle(3, 4, 5));
        Assertions.assertNotEquals(7.0, triangle4.squareTriangle(3, 4, 5));
    }
}
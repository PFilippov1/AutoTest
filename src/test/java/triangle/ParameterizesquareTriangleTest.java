package triangle;

import org.junit.jupiter.api.Assertions;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;

import java.util.Arrays;

@RunWith(Parameterized.class)
public class ParameterizesquareTriangleTest {
    private int a;
    private int b;
    private int c;
    private double expected;

    public ParameterizesquareTriangleTest(int a, int b, int c, double expected) {
        this.a = a;
        this.b = b;
        this.c = c;
        this.expected = expected;
    }

    @Parameterized.Parameters(name = "{index}:")
    public static Iterable<Object[]> dataForTest() {
        return Arrays.asList(new Object[][]{
                {2, 3, 4,2.9047375096555625},
                {3, 2, 4,2.9047375096555625},
                {2, 5, 4,3.799671038392666},
                {5, 5, 5,10.825317547305483},
                {5, 5, 1,2.48746859276655}
        });
    }

    @org.junit.Test
    public void paramTest() {
        Assertions.assertEquals(expected, new Triangle().squareTriangle(a,b,c));
    }
}

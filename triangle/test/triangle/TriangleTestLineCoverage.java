package triangle;

import org.junit.Test;
import static org.junit.Assert.*;

import static triangle.Triangle.Type;
import static triangle.Triangle.Type.*;

/**
 * Test class for the Triangle implementation.
 */
public class TriangleTestLineCoverage {

    @Test
    public void testEnum() {
        Triangle actual = new Triangle();
        assertNotNull(actual);
    }

    @Test
    public void test1() {
        Type actual = Triangle.classify(10, 10, 10);
        Type expected = EQUILATERAL;
        assertEquals(expected, actual);
    }

    @Test
    public void testIsoceles() {
        Type expected = ISOSCELES;
        Type actual = Triangle.classify(4, 4, 5); // a == b
        assertEquals(expected, actual);
        actual = Triangle.classify(4, 5, 4); // a == c
        actual = Triangle.classify(5, 4, 4); // b == c

    }

    @Test
    public void testInvalid() {
        Type expected = INVALID;
        Type actual = Triangle.classify(-1, -1, -1);
        assertEquals(expected, actual);
        actual = Triangle.classify(-1, 1, 1);
        assertEquals(expected, actual);
        actual = Triangle.classify(1, -1, 1);
        assertEquals(expected, actual);
        actual = Triangle.classify(1, 1, -1);
        assertEquals(expected, actual);
        actual = Triangle.classify(1, 1, 3);
    }

    @Test
    public void testInvalidPositives() {
        Type expected = INVALID;
        Type actual = Triangle.classify(1, 10, 12);
        assertEquals(expected, actual);
    }

    @Test
    public void testScalene() {
        Type actual = Triangle.classify(2, 3, 4);
        Type expected = SCALENE;
        assertEquals(expected, actual);
    }



}

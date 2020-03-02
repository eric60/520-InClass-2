package triangle;

import org.junit.Test;
import static org.junit.Assert.*;

import static triangle.Triangle.Type;
import static triangle.Triangle.Type.*;

/**
 * Test class for the Triangle implementation.
 */
public class TriangleTestBranchCoverage {

    @Test
    public void testConstructor() {
        Triangle actual = new Triangle();
    }

    @Test
    public void testEquilateral() {
        Type actual = Triangle.classify(10, 10, 10);
        Type expected = EQUILATERAL;
        assertEquals(actual, expected);
    }

    @Test
    public void testScalene() {
        Type actual = Triangle.classify(10, 9, 8);
        Type expected = SCALENE;
        assertEquals(actual, expected);
    }

    @Test
    public void testIsosceles1() {
        Type actual1 = Triangle.classify(10, 10, 8);
        Type expected1 = ISOSCELES;
        assertEquals(actual1, expected1);
    }

    @Test
    public void testIsosceles2() {
        Type actual2 = Triangle.classify(10, 8, 10);
        Type expected2 = ISOSCELES;
        assertEquals(actual2, expected2);
    }

    @Test
    public void testIsosceles3() {
        Type actual3 = Triangle.classify(8, 10, 10);
        Type expected3 = ISOSCELES;
        assertEquals(actual3, expected3);
    }

    @Test
    public void testInvalidNegative1() {
        Type actual1 = Triangle.classify(-1, 9, 8);
        Type expected1 = INVALID;
        assertEquals(actual1, expected1);
    }

    @Test
    public void testInvalidNegative2() {
        Type actual2 = Triangle.classify(10, -1, 8);
        Type expected2 = INVALID;
        assertEquals(actual2, expected2);
    }

    @Test
    public void testInvalidNegative3() {
        Type actual3 = Triangle.classify(10, 9, -1);
        Type expected3 = INVALID;
        assertEquals(actual3, expected3);
    }

    @Test
    public void testInvalidLengths1() {
        Type actual1 = Triangle.classify(1, 2, 5);
        Type expected1 = INVALID;
        assertEquals(actual1, expected1);
    }

    @Test
    public void testInvalidLengths2() {
        Type actual2 = Triangle.classify(1, 5, 2);
        Type expected2 = INVALID;
        assertEquals(actual2, expected2);
    }

    @Test
    public void testInvalidLengths3() {
        Type actual3 = Triangle.classify(5, 2, 1);
        Type expected3 = INVALID;
        assertEquals(actual3, expected3);
    }

    @Test
    public void testInvalidLengths4() {
        Type actual4 = Triangle.classify(Integer.MAX_VALUE, Integer.MAX_VALUE, 1);
        Type expected4 = INVALID;
        assertEquals(actual4, expected4);
    }

    @Test
    public void testInvalidLengths5() {
        Type actual5 = Triangle.classify(Integer.MAX_VALUE, 1, Integer.MAX_VALUE);
        Type expected5 = INVALID;
        assertEquals(actual5, expected5);
    }

    @Test
    public void testInvalidLengths6() {
        Type actual6 = Triangle.classify(1, Integer.MAX_VALUE, Integer.MAX_VALUE);
        Type expected6 = INVALID;
        assertEquals(actual6, expected6);
    }
}
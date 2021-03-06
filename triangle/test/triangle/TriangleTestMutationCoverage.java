package triangle;

import org.junit.Test;
import static org.junit.Assert.*;

import static triangle.Triangle.Type;
import static triangle.Triangle.Type.*;

/**
 * Test class for the Triangle implementation.
 */
public class TriangleTestMutationCoverage {

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
        Type actual1 = Triangle.classify(-2, 8, 8);
        Type expected1 = INVALID;
        assertEquals(actual1, expected1);
    }

    @Test
    public void testInvalidNegative2() {
        Type actual2 = Triangle.classify(8, -2, 8);
        Type expected2 = INVALID;
        assertEquals(actual2, expected2);
    }
    @Test
    public void testInvalidNegative3() {
        Type actual3 = Triangle.classify(3, 3, -2);
        Type expected3 = INVALID;
        assertEquals(actual3, expected3);
    }
    @Test
    public void testInvalidNegative4() {
        Type actual4 = Triangle.classify(-2, -2, 3);
        Type expected4 = INVALID;
        assertEquals(expected4, actual4);
    }

    @Test
    public void testInvalidNegative5() {
        Type actual5 = Triangle.classify(-2, -2, -2);
        Type expected5 = INVALID;
        assertEquals(expected5, actual5);
    }

    @Test
    public void testInvalidZero1() {
    	Type actual1 = Triangle.classify(0, 2, 2);
        Type expected1 = INVALID;
        assertEquals(expected1, actual1);
    }

    @Test
    public void testInvalidZero2() {
        Type actual2 = Triangle.classify(2, 0, 2);
        Type expected2 = INVALID;
        assertEquals(expected2, actual2);
    }

    @Test
    public void testInvalidZero3() {
        Type actual3 = Triangle.classify(2, 2, 0);
        Type expected3 = INVALID;
        assertEquals(expected3, actual3);
    }

    @Test
    public void testValidTriangles1() {
    	Type actual1 = Triangle.classify(1, 2, 2);
    	Type expected1 = ISOSCELES;
    	assertEquals(expected1, actual1);
    }

    @Test
    public void testValidTriangles2() {
        Type actual2 = Triangle.classify(2, 1, 2);
        Type expected2 = ISOSCELES;
        assertEquals(expected2, actual2);
    }

    @Test
    public void testValidTriangles3() {
        Type actual3 = Triangle.classify(2, 2, 1);
        Type expected3 = ISOSCELES;
        assertEquals(expected3, actual3);
    }

    @Test
    public void testValidTriangles4() {
        Type actual4 = Triangle.classify(3, 3, 7);
        Type expected4 = INVALID;
        assertEquals(expected4, actual4);
    }

    @Test
    public void testValidTriangles5() {
        Type actual5 = Triangle.classify(2, 2, 4);
        Type expected5 = INVALID;
        assertEquals(expected5, actual5);
    }

    @Test
    public void testValidTriangles6() {
        Type actual6 = Triangle.classify(3, 7, 3);
        Type expected6 = INVALID;
        assertEquals(expected6, actual6);
    }

    @Test
    public void testValidTriangles7() {
        Type actual7 = Triangle.classify(2, 4, 2);
        Type expected7 = INVALID;
        assertEquals(expected7, actual7);
    }

    @Test
    public void testValidTriangles8() {
        Type actual8 = Triangle.classify(7, 3, 3);
        Type expected8 = INVALID;
        assertEquals(expected8, actual8);
    }

    @Test
    public void testValidTriangles9() {
        Type actual9 = Triangle.classify(4, 2, 2);
        Type expected9 = INVALID;
        assertEquals(expected9, actual9);
    }

    @Test
    public void testInvalidLengths1() {
        Type actual1 = Triangle.classify(1, 2, 3);
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

    @Test
    public void testInvalidLengths7() {
        Type actual7 = Triangle.classify(1, 2, 4);
        Type expected7 = INVALID;
        assertEquals(actual7, expected7);
    }

    @Test
    public void testInvalidLengths8() {
        Type actual8 = Triangle.classify(1, 3, 2);
        Type expected8 = INVALID;
        assertEquals(actual8, expected8);
    }

    @Test
    public void testInvalidLengths9() {
        Type actual9 = Triangle.classify(3, 1, 1);
        Type expected9 = INVALID;
        assertEquals(actual9, expected9);
    }
    @Test
    public void testInvalidLengths10() {
        Type actual10 = Triangle.classify(2, 2, 5);
        Type expected10 = INVALID;
        assertEquals(actual10, expected10);
    }

    @Test
    public void testMutationLine34Mutation63() {
        Type actual = Triangle.classify(2, 10, 13);
        Type expected = INVALID;
        assertEquals(actual, expected);
    }

    @Test
    public void testMutationLine34Mutation81() {
        Type actual = Triangle.classify(12, 2, 10);
        Type expected = INVALID;
        assertEquals(actual, expected);
    }

    @Test
    public void testMutationLine34Mutation70() {
        Type actual = Triangle.classify(2, 13, 10);
        Type expected = INVALID;
        assertEquals(actual, expected);
    }

    @Test
    public void testMutation148() {
        Type actual = Triangle.classify(5, 2, 2);
        Type expected = INVALID;
        assertEquals(actual, expected);
    }

    @Test
    public void testMutation102() {
        Type actual = Triangle.classify(2, 5, 2);
        Type expected = INVALID;
        assertEquals(actual, expected);
    }

}

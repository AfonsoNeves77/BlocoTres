package org.example;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class Exercise6nd7Test {

    @Test
    void valueExtraordinaryHours() {
        double expected = Exercise6nd7.valueExtraordinaryHours(100,2);
        assertEquals(4,expected);
    }

    @Test
    void totalSalary() {
        double expected = Exercise6nd7.totalSalary(100,5);
        assertEquals(110,expected);
    }

    @Test
    void totalSalaryInvalidValues() {
        double expected = Exercise6nd7.totalSalary(0,5);
        assertEquals(-1,expected);
    }

    @Test
    void positionOfBiggerProduct() {
        int actual = Exercise6nd7.positionOfBiggerProduct(new int[]{1,2,3,1},5);

        assertEquals(2,actual);
    }

    @Test
    void biggerProdDontExist() {
        int actual = Exercise6nd7.positionOfBiggerProduct(new int[]{1,2,1,1},5);

        assertEquals(-1,actual);
    }

    @Test
    void biggerProdInvalidValues() {
        int actual = Exercise6nd7.positionOfBiggerProduct(new int[]{1,2,1,-1},5);

        assertEquals(-2,actual);
    }

    @Test
    void negativeArrayChecker() {
        boolean actual = Exercise6nd7.negativeArrayChecker(new int[]{1,-2,3,1});
        assertTrue(actual);

    }

    @Test
    void negativeArrayCheckerNegNumber() {
        boolean actual = Exercise6nd7.negativeArrayChecker(new int[]{1,2,3,1});
        assertFalse(actual);

    }

}
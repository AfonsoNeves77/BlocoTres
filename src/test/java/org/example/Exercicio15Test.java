package org.example;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class Exercicio15Test {

    @Test
    void arrayOrganizer() {
        int[] a = Exercicio15.arrayOrganizer(new int[]{1,4,9,8,3,7,2,4,6});
        assertArrayEquals(a,new int[]{1, 9, 3, 7, 6, 4, 2, 8, 4});
    }

    @Test
    void organizedNumberReturner() {
        long expected = Exercicio15.organizedNumberReturner(new int[]{1,4,9,8,3,7,2,4,6});
        assertEquals(expected,193764284);
    }

    @Test
    void numberOrganizer() {
        long expected = Exercicio15.numberOrganizer(24319);
        assertEquals(expected,91342);
    }

    @Test
    void negativeArrayChecker() {
        boolean expected = Exercicio15.negativeArrayChecker(new int[]{1,-9,-7,3,4});
        assertTrue(expected);
    }

    @Test
    void negativeArrayCheckerFalse() {
        boolean expected = Exercicio15.negativeArrayChecker(new int[]{1,9,7,3,4});
        assertFalse(expected);
    }

    @Test
    void negativeNumberChecker() {
        boolean expected = Exercicio15.negativeNumberChecker(-7);
        assertTrue(expected);
    }

    @Test
    void negativeNumberCheckerFalse() {
        boolean expected = Exercicio15.negativeNumberChecker(7);
        assertFalse(expected);
    }





}
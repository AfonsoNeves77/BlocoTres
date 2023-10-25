package org.example;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ArrayExerciseRoundTwoTest {

    @Test
    void sumAllEvenNumbers() {
        int expected = ArrayExerciseRoundTwo.sumAllEvenNumbers(4,2);
        assertEquals(expected,6);
    }

    @Test
    void sumAllEvenNumbersV2() {
        int expected = ArrayExerciseRoundTwo.sumAllEvenNumbers(12,9);
        assertEquals(expected,22);
    }

    @Test
    void sumAllEvenNumbersNegNumbers() {
        int expected = ArrayExerciseRoundTwo.sumAllEvenNumbers(0,-4);
        assertEquals(expected,-6);
    }

    @Test
    void sumAllEvenNumbersZero() {
        int expected = ArrayExerciseRoundTwo.sumAllEvenNumbers(0,0);
        assertEquals(expected,0);
    }

    @Test
    void sumAllOddNumbersZero() {
        int expected = ArrayExerciseRoundTwo.sumAllOddNumbers(0,0);
        assertEquals(expected,0);
    }

    @Test
    void sumAllEvenOddNegNumbers() {
        int expected = ArrayExerciseRoundTwo.sumAllOddNumbers(0,-4);
        assertEquals(expected,-4);
    }

    @Test
    void qttyAllEvenNumbers() {
        int[] expected = ArrayExerciseRoundTwo.qttyAllEvenNumbers(20,15);
        int[] a = {16,18,20};
        assertArrayEquals(expected,a);
    }

    @Test
    void qttyAllEvenNumbersV2() {
        int[] expected = ArrayExerciseRoundTwo.qttyAllEvenNumbers(0,-4);
        int[] a = {-4,-2,0};
        assertArrayEquals(expected,a);
    }

    @Test
    void qttyAllEvenNumbersZero() {
        int[] expected = ArrayExerciseRoundTwo.qttyAllEvenNumbers(0,0);
        int[] a = {0};
        assertArrayEquals(expected,a);
    }

    @Test
    void sumAllMultiplesInAGivenInterval() {
        int expected = ArrayExerciseRoundTwo.sumAllMultiplesInAGivenInterval(2,0,-4);
        assertEquals(expected,-6);
    }

    @Test
    void sumAllMultiplesInAGivenIntervalZero() {
        int expected = ArrayExerciseRoundTwo.sumAllMultiplesInAGivenInterval(0,0,-4);
        assertEquals(expected,0);
    }

    @Test
    void sumAllMultiplesInAGivenIntervalV2() {
        int expected = ArrayExerciseRoundTwo.sumAllMultiplesInAGivenInterval(5,20,15);
        assertEquals(expected,35);
    }
}
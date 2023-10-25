package org.example;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ExercicioCincoTest {

    @Test
    void amstrongNumber() {
        boolean expected = ExercicioCinco.AmstrongNumber(153);
        assertTrue(expected);
    }

    @Test
    void amstrongNumberFalse() {
        boolean expected = ExercicioCinco.AmstrongNumber(111);
        assertFalse(expected);
    }

    @Test
    void amstrongNumberError() {
        boolean expected = ExercicioCinco.AmstrongNumber(0);
        assertFalse(expected);
    }

    @Test
    void isCapicua() {
        boolean expected = ExercicioCinco.isCapicua(-151);
        assertTrue(expected);
    }

    @Test
    void isCapicuaV2() {
        boolean expected = ExercicioCinco.isCapicua(0);
        assertTrue(expected);
    }

    @Test
    void isCapicuaFalse() {
        boolean expected = ExercicioCinco.isCapicua(456);
        assertFalse(expected);
    }

    @Test
    void firstCapicua() {
        int expected = ExercicioCinco.firstNumber(1,9,1);
        assertEquals(1,expected);
    }

    @Test
    void firstCapicuaV2() {
        int expected = ExercicioCinco.firstNumber(120,121,1);
        assertEquals(121,expected);
    }

    @Test
    void firstCapicuaZero() {
        int expected = ExercicioCinco.firstNumber(0,-9,1);
        assertEquals(-9,expected);
    }

    @Test
    void firstCapicuaZeroCapicuas() {
        int expected = ExercicioCinco.firstNumber(23,25,1);
        assertEquals(-10,expected);
    }

    @Test
    void firstCapicuaDefaultOption() {
        int expected = ExercicioCinco.firstNumber(111,121,-1);
        assertEquals(-1,expected);
    }

    @Test
    void firstAmstrong() {
        int expected = ExercicioCinco.firstNumber(350,2000,2);
        assertEquals(370,expected);
    }

    @Test
    void firstAmstrongV2() {
        int expected = ExercicioCinco.firstNumber(1,21,2);
        assertEquals(1,expected);
    }

    @Test
    void firstAmstrongZero() {
        int expected = ExercicioCinco.firstNumber(0,-9,2);
        assertEquals(-10,expected);
    }


    @Test
    void firstAmstrongDefaultOption() {
        int expected = ExercicioCinco.firstNumber(111,121,3);
        assertEquals(-1,expected);
    }


    @Test
    void biggestCapicua() {
        int expected = ExercicioCinco.biggestCapicua(0,9);
        assertEquals(9,expected);
    }

    @Test
    void biggestCapicuaV2() {
        int expected = ExercicioCinco.biggestCapicua(111,199);
        assertEquals(191,expected);
    }

    @Test
    void biggestCapicuaNeg() {
        int expected = ExercicioCinco.biggestCapicua(-9,-191);
        assertEquals(-9,expected);
    }

    @Test
    void numberOfCapicuas() {
        int[] expected = ExercicioCinco.numberOfSpecialNumbers(110,121,1);
        int[] a = {111,121};
        assertArrayEquals(expected,a);
    }

    @Test
    void numberOfCapicuasZero() {
        int[] expected = ExercicioCinco.numberOfSpecialNumbers(0,0,1);
        int[] a = {0};
        assertArrayEquals(expected,a);
    }

    @Test
    void numberOfCapicuasNeg() {
        int[] expected = ExercicioCinco.numberOfSpecialNumbers(0,-3,1);
        int[] a = {-3,-2,-1,0};
        assertArrayEquals(expected,a);
    }

    @Test
    void numberOfAmstrong() {
        int[] expected = ExercicioCinco.numberOfSpecialNumbers(150,407,2);
        int[] a = {153,370,371,407};
        assertArrayEquals(expected,a);
    }


    @Test
    void numberOfAmstrongZero() {
        int[] expected = ExercicioCinco.numberOfSpecialNumbers(0,0,2);
        int[] a = {};
        assertArrayEquals(expected,a);
    }



}
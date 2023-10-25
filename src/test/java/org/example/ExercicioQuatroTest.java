package org.example;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ExercicioQuatroTest {

    @Test
    void numberOfAlgarismLongNumber() {
        int[] expected = ExercicioQuatro.numberOfAlgarisms(1234567890088900000L,0);
        int[] a = {0,0,0,0,0,9,8,8,0,0,9,8,7,6,5,4,3,2,1};
        assertArrayEquals(a,expected);
    }

    @Test
    void numberOfAlgarismZero() {
        int[] expected = ExercicioQuatro.numberOfAlgarisms(0,0);
        int[] a = {0};
        assertArrayEquals(a,expected);
    }

    @Test
    void numberOfAlgarismNegNumber() {
        int[] expected = ExercicioQuatro.numberOfAlgarisms(-1234567890088900000L,0);
        int[] a = {0,0,0,0,0,-9,-8,-8,0,0,-9,-8,-7,-6,-5,-4,-3,-2,-1};
        assertArrayEquals(a,expected);
    }

    @Test
    void numberOfEvenAlgarism() {
        int[] expected = ExercicioQuatro.numberOfAlgarisms(5678,2);
        int[] a = {8,6};
        assertArrayEquals(a,expected);
    }

    @Test
    void numberOfEvenAlgarismV2() {
        int[] expected = ExercicioQuatro.numberOfAlgarisms(-81466,2);
        int[] a = {-6,-6,-4,-8};
        assertArrayEquals(a,expected);
    }

    @Test
    void numberOfEvenAlgarismZero() {
        int[] expected = ExercicioQuatro.numberOfAlgarisms(0,2);
        int[] a = {0};
        assertArrayEquals(a,expected);
    }


    @Test
    void numberOfOddAlgarisms() {
        int[] expected = ExercicioQuatro.numberOfAlgarisms(813744616,1);
        int[] a = {1,7,3,1};
        assertArrayEquals(a,expected);
    }

    @Test
    void numberOfOddAlgarismsNegNumber() {
        int[] expected = ExercicioQuatro.numberOfAlgarisms(-817379954466L,1);
        int[] a = {-5,-9,-9,-7,-3,-7,-1};
        assertArrayEquals(a,expected);
    }

    @Test
    void numberOfOddAlgarismsZero() {
        int[] expected = ExercicioQuatro.numberOfAlgarisms(0,1);
        int[] a = {};
        assertArrayEquals(a,expected);
    }

    @Test
    void numberOfOddAlgarismsDefaultOption() {
        int[] expected = ExercicioQuatro.numberOfAlgarisms(123,3);
        int[] a = {};
        assertArrayEquals(a,expected);
    }


    @Test
    void numberSum() {
        int expected = ExercicioQuatro.numberSum(-15,0);
        assertEquals(-6,expected);
    }

    @Test
    void numberSumZero() {
        int expected = ExercicioQuatro.numberSum(0,0);
        assertEquals(0,expected);
    }

    @Test
    void numberSumOdd() {
        int expected = ExercicioQuatro.numberSum(649,1);
        assertEquals(9,expected);
    }

    @Test
    void numberSumEven() {
        int expected = ExercicioQuatro.numberSum(727246,2);
        assertEquals(14,expected);
    }
    @Test
    void numberSumDefault() {
        int expected = ExercicioQuatro.numberSum(649,3);
        assertEquals(-1,expected);
    }

    @Test
    void numberMedia() {
        double expected = ExercicioQuatro.numberMedia(15,0);
        assertEquals(3,expected);
    }


    @Test
    void numberMediaV2() {
        double expected = ExercicioQuatro.numberMedia(20,0);
        assertEquals(1,expected);
    }

    @Test
    void numberMediaEven() {
        double expected = ExercicioQuatro.numberMedia(679312,2);
        assertEquals(4,expected);
    }

    @Test
    void numberMediaEvenV2() {
        double expected = ExercicioQuatro.numberMedia(14820761,2);
        assertEquals(4,expected);
    }

    @Test
    void numberMediaOdd() {
        double expected = ExercicioQuatro.numberMedia(670103,1);
        assertEquals(3.6,expected,0.1);
    }


    @Test
    void numberMediaOddZero() {
        double expected = ExercicioQuatro.numberMedia(0,1);
        assertEquals(-1,expected);
    }


    @Test
    void numberMediaEvenZero() {
        double expected = ExercicioQuatro.numberMedia(0,0);
        assertEquals(0,expected);
    }

    @Test
    void numberMediaZero() {
        double expected = ExercicioQuatro.numberMedia(0,0);
        assertEquals(0,expected);
    }

    @Test
    void numberMediaZeroDefault() {
        double expected = ExercicioQuatro.numberMedia(0,3);
        assertEquals(-1,expected);
    }


    @Test
    void invertingNumber() {
        long expected = ExercicioQuatro.invertingNumber(1234567891L);
        assertEquals(1987654321,expected);
    }

    @Test
    void invertingNumberZero() {
        long expected = ExercicioQuatro.invertingNumber(0);
        assertEquals(0,expected);
    }
}
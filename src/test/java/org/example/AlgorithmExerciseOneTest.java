package org.example;

import static org.junit.jupiter.api.Assertions.*;

class AlgorithmExerciseOneTest {

    @org.junit.jupiter.api.Test
    void algExerciseNumIsFive() {
        int expected = AlgorithmExerciseOne.algExercise(5);
        assertEquals(120,expected);
    }

    @org.junit.jupiter.api.Test
    void algExerciseNumIsOne() {
        int expected = AlgorithmExerciseOne.algExercise(1);
        assertEquals(1,expected);
    }

    @org.junit.jupiter.api.Test
    void algExerciseBelowOne() {
        int expected = AlgorithmExerciseOne.algExercise(0);
        assertEquals(-1,expected);
    }
}
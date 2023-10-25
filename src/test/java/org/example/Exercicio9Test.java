package org.example;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class Exercicio9Test {

    @Test
    void numberEvaluationPerfect() {
        int expected = Exercicio9.numberEvaluation(6);
        assertEquals(0,expected);
    }

    @Test
    void numberEvaluationReduced() {
        int expected = Exercicio9.numberEvaluation(9);
        assertEquals(-1,expected);
    }

    @Test
    void numberEvaluationAbundant() {
        int expected = Exercicio9.numberEvaluation(12);
        assertEquals(1,expected);
    }


    @Test
    void numberEvaluationZero() {
        int expected = Exercicio9.numberEvaluation(0);
        assertEquals(-2,expected);
    }

    @Test
    void clothesEvaluation() {
        String expected = Exercicio9.clothesEvaluation(1);
        assertEquals("Alimento nao perecivel",expected);
    }
}
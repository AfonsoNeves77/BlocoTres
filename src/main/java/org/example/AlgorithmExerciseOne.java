package org.example;

import java.util.Arrays;

public class AlgorithmExerciseOne {

    public static int algExercise(int num){

        int resto = 1;
        if (!Tools.isAboveOne(num)){
            return -1;
        }
        else{
            for(int x = num; x >= 1; x--) {
                resto = resto * x;
            }
            return resto;
        }
    }


}




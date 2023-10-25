package org.example;

public class ExercicioOito {

    public static int numberOfOperations(int n){
        if(n>=1 && n <= 20){
            int counter = 0;
            int[] rangeOfValues = {0,1,2,3,4,5,6,7,8,9,10};
            for(int i = 0; i < rangeOfValues.length; i++){
                if (rangeOfValues[0] + rangeOfValues[i] == n){
                    counter++;
                }
            }
            for(int i = 1; i < rangeOfValues.length; i++){
                if (rangeOfValues[1] + rangeOfValues[i] == n){
                    counter++;
                }
            }
            for(int i = 2; i < rangeOfValues.length; i++){
                if (rangeOfValues[2] + rangeOfValues[i] == n){
                    counter++;
                }
            }
            for(int i = 3; i < rangeOfValues.length; i++){
                if (rangeOfValues[3] + rangeOfValues[i] == n){
                    counter++;
                }
            }
            for(int i = 4; i < rangeOfValues.length; i++){
                if (rangeOfValues[4] + rangeOfValues[i] == n){
                    counter++;
                }
            }
            for(int i = 5; i < rangeOfValues.length; i++){
                if (rangeOfValues[5] + rangeOfValues[i] == n){
                    counter++;
                }
            }
            for(int i = 6; i < rangeOfValues.length; i++){
                if (rangeOfValues[6] + rangeOfValues[i] == n){
                    counter++;
                }
            }
            for(int i = 7; i < rangeOfValues.length; i++){
                if (rangeOfValues[7] + rangeOfValues[i] == n){
                    counter++;
                }
            }
            for(int i = 8; i < rangeOfValues.length; i++){
                if (rangeOfValues[8] + rangeOfValues[i] == n){
                    counter++;
                }
            }
            if(rangeOfValues[9] + rangeOfValues[9] == n){
                counter++;
            }

        }
        return -1;
    }
}

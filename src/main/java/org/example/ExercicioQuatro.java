package org.example;

import java.util.Arrays;
import java.util.Objects;

public class ExercicioQuatro {

    //By typing 1 in filter variable we are saying we want odd numbers, 2 -- > even numbers and 0 ---> we don't want any filter;
    //The condition abt 0 and filter 1 is bcs 0 is even but not number odd so it's not even worth the calc... just return empty vector already!

    public static int numberCounter(long n,int filter){
        int count = 0;
        do{
            switch(filter){
                case 0: count++;
                break;

                case 1 :
                    if(n%2 != 0) {
                    count++;
                    }
                break;

                case 2:
                    if(n%2 == 0) {
                        count++;
                    }
                break;
                default:
                    return -1;
            }
            n = n/10;
        }while (n!=0);
        return count;
    }

    public static int[] numberInserter(long n,int filter,int[] array){
        int i = 0;
        while (n!=0){
            switch(filter){
                case 0:
                    array[i] = (int) (n%10);
                    i++;
                break;

                case 1:
                    if (!Tools.isEven(n)){
                        array[i] = (int) (n%10);
                        i++;
                    }
                break;

                case 2:
                    if (Tools.isEven(n)){
                        array[i] = (int) (n%10);
                        i++;
                    }
                break;
                default:
                    return new int[0];
            }
            n /= 10;
        }
        return array;
    }

    public static int[] numberOfAlgarisms(long n,int filter) {
        int arrayLenght;
        int[] number;
        switch (filter) {
            case 2, 0,1:
                if(n == 0 && filter == 1){
                    return new int[0];
                }
                arrayLenght = numberCounter(n,filter);
                number = new int[arrayLenght];
                return numberInserter(n,filter, number);

            default:
                return new int[0];

        }
    }
    //By typing 1 in filter variable we are saying we want odd numbers, 2 -- > even numbers and 0 ---> we don't want any filter;
    public static int numberSum(long n,int filter){
        int sum = 0;
        int[] array = numberOfAlgarisms(n,filter);
        if (!Arrays.equals(array, new int[0])){
            for (int j : array) {
                sum += j;
            }
            return sum;
        }
        return -1;
    }

    public static double numberMedia(long n,int filter) {
        int sumNumbers = numberSum(n,filter);
        int numberCounter = numberCounter(n,filter);
        if (sumNumbers != -1){
            return (double) sumNumbers /numberCounter;
        }
        return -1;

    }

    public static long invertingNumber(long n){
        long number = 0;
        while(n!=0){
            long z = n%10;
            number = number*10 + z;
            n /=10;
        }
        return number;
    }

}

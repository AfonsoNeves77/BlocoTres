package org.example;

public class Exercicio15 {
    public static int[] arrayOrganizer(int[] array){
        if (negativeArrayChecker(array)){
            return new int[0];
        }
        int[] newArray = new int[array.length];
        int count = 0;
        int count2=0;
        for(int i = 0;i<array.length; i++){
            if(array[i]%2 != 0){
                newArray[count] = array[i];
                count++;
            }
            if(array[i]%2 == 0){
                newArray[array.length-1-count2] = array[i];
                count2++;

            }
        }

        return newArray;
    }

    public static long organizedNumberReturner(int[] array) {
        if (negativeArrayChecker(array)){
            return -1;
        }
        int[] newArray = arrayOrganizer(array);
        long number = 0;
        for(int i = 0; i < newArray.length; i++){
            number = number*10 + newArray[i];
        }
        return number;
    }

    public static long numberOrganizer(long n) {
        if (negativeNumberChecker(n)){
            return -1;
        }
        long a = 0;
        long num = 0;
        long b = 0;
        long num2 = 0;
        long copyN = n;
        while(n!=0){
            a = n%10;
            if(a%2 != 0){
                num = num*10 +a;
            }
            n/=10;
        }

        while(copyN!=0){
            b = copyN%10;
            if(b%2 == 0){
                num2 = num2*10 + b;
            }
            copyN/=10;
        }
        int counter = 0;
        long copyNum2 = num2;
        while(copyNum2 != 0){
            counter++;
            copyNum2 /=10;
        }
        return (long) (num*Math.pow(10,counter) + num2);

    }

    public static boolean negativeArrayChecker(int[] array){
        for(int j : array){
            if (j < 0){
                return true;
            }
        }
        return false;
    }

    public static boolean negativeNumberChecker(long n){
        return n < 0;
    }

}

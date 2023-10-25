package org.example;

public class ArrayExerciseRoundTwo {

    public static int sumAllEvenNumbers(int nMax, int nMin) {
        int sum = 0;
        for (int i = nMin; i <= nMax; i++) {
            if (i % 2 == 0) {
                sum += i;
            }
        }
        return sum;
    }

    public static int sumAllOddNumbers(int nMax, int nMin) {
        int sum = 0;
        for (int i = nMin; i <= nMax; i++) {
            if (i % 2 != 0) {
                sum += i;
            }
        }
        return sum;
    }

    public static int[] qttyAllEvenNumbers(int nMax, int nMin) {
        int[] arr1 = new int[0];
        int pos = 0;
        for (int i = nMin; i <= nMax; i++) {
            if (i % 2 == 0) {
                arr1 = increaseSize(arr1);
                arr1[pos] = i;
                pos++;

            }
        }
        return arr1;

    }

    public static int[] increaseSize(int[] n) {
        int[] tempArray = new int[n.length + 1];

        for (int i = 0; i < n.length; i++) {
            tempArray[i] = n[i];
        }
        return tempArray;
    }

    public static int sumAllMultiplesInAGivenInterval(int n,int nMax, int nMin) {
        if (n == 0) {
            return 0;
        }
        int sum = 0;
        for(int i = nMax; i >= nMin; i--) {
            if (i%n == 0){
                sum+=i;
            }
        }
        return sum;
    }


}

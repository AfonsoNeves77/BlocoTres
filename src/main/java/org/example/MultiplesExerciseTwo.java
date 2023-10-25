package org.example;

public class MultiplesExerciseTwo {

    public static int[] multiplesOfaCertainNumber(int n, int nMax, int nMin){
        if(Tools.isZero(n) && nMax == 0 && nMin == 0){
            return new int[]{0};
        }
        if(Tools.isZero(n)){
            return new int[0];
        }
        if(nMax == 0 && nMin == 0){
            return new int[0];
        }
        int[] array1 = new int[0];
        int pos = 0;
        for(int i = nMin; i <= nMax; i++) {
            if(i % n == 0){

                array1 = increaseSize(array1);
                array1[pos] = i;
                pos++;

            }
        }
        return array1;

    }

    public static int[] increaseSize(int[] array1){
        int[] newArray = new int[array1.length + 1];
        for(int i = 0; i < array1.length; i++){
            newArray[i] = array1[i];
        }
        return newArray;
    }


    public static int[] multiplesOfTwoNumbers(int n, int z, int nMax, int nMin) {
        if(Tools.isZero(n) && Tools.isZero(z)){
            return new int[0];
        }
        int[] arr1 = multiplesOfaCertainNumber(n, nMax, nMin);
        int[] arr2 = multiplesOfaCertainNumber(z, nMax, nMin);

        int combinedLength = arr1.length + arr2.length;
        int[] combinedArray = new int[combinedLength];

        int index = 0;
        for (int i = 0; i < arr1.length; i++) {
            combinedArray[index] = arr1[i];
            index++;
        }

        for (int i = 0; i < arr2.length; i++) {
            combinedArray[index] = arr2[i];
            index++;
        }

        return combinedArray;
    }

    public static int productMultiplesOnaGivenInterval(int n, int nMax, int nMin){
        if(Tools.isZero(n) && nMax == 0 && nMin == 0){
            return 0;
        }

        if(Tools.isZero(n)){
            return -1;
        }

        if(nMax == 0 && nMin == 0){
            return 0;
        }

        int[] productArray = multiplesOfaCertainNumber(n,nMax,nMin);

        int prod = 1;
        for(int i = 0; i < productArray.length;i++){
            if (productArray[i] == 0 ){
                productArray[i] = 1;
            }
           prod *= productArray[i];
        }
        return prod;
    }

    public static double mediaMultiplesGivenInterval(int n, int nMax, int nMin){
        if(Tools.isZero(n)){
            return -1;
        }
        int[] mediaArray = multiplesOfaCertainNumber(n,nMax,nMin);
        int sum = 0;
        for(int i = 0; i < mediaArray.length;i++){
            sum+= mediaArray[i];
        }
        return (double) sum /mediaArray.length;
    }

    public static int sumOfTwoMultipleNumbers(int n, int z, int nMax, int nMin){
        if(Tools.isZero(n) && Tools.isZero(z)){
            return -1;
        }
        int[] arr = multiplesOfTwoNumbers(n,z,nMax,nMin);
        int sum = 0;
        for (int i = 0; i < arr.length; i++){
            sum += arr[i];
        }
        return sum;
    }

    public static int sumOfTwoMultipleNumbers(int[] arr){

        int sum = 0;
        for (int i = 0; i < arr.length; i++){
            sum += arr[i];
        }
        return sum;
    }

    public static double mediaofTwoMultiplesGivenInterval(int n, int z,int nMax, int nMin){
        if(Tools.isZero(n) && Tools.isZero(z)){
            return -1;
        }
        int[] multiplesArray = multiplesOfTwoNumbers(n,z,nMax,nMin);
        int sum = sumOfTwoMultipleNumbers(multiplesArray);
        return (double) sum /multiplesArray.length;
    }




}

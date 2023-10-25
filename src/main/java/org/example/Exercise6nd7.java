package org.example;

public class Exercise6nd7 {

    public static double valueExtraordinaryHours(double baseSalary,int extraHours){
        return (2*baseSalary)/100 * extraHours;
    }

    public static double totalSalary(double baseSalary,int extraHours) {
        if (baseSalary <= 0 || extraHours < 0){
            return -1;
        }
        return baseSalary + valueExtraordinaryHours(baseSalary,extraHours);
    }

    public static boolean negativeArrayChecker(int[] array){
        boolean a = false;
        for (int j : array) {
            if (j < 0){
                return true;
            }
        }
        return a;
    }

    //-2 if Invalid Values and -1 the condition of bigger Product doesn't verify
    public static int positionOfBiggerProduct(int[] array, int n){
        if (negativeArrayChecker(array) || n < 0){
            return -2;
        }
        int produt = 1;
        int index = 0;
        for(int i = 0; i < array.length; i++){
            produt *=array[i];
            if(produt > n){
                return i;
            }
        }
       return -1;
    }
}

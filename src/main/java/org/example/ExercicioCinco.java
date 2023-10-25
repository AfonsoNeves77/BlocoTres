package org.example;

public class ExercicioCinco {

    public static boolean AmstrongNumber(long n)  {
        if (n <= 0){
           return false;
        }
        else {
            int sum = 0;
            long copyN = n;
            while (n!= 0){
                long r = n%10;
                sum = (int) (sum + Math.pow(r,3));
                n = n / 10;
            }
            return sum == copyN;
        }
    }
    public static boolean isCapicua(int n){
        int copyN = n;
        int sum = 0;
        while (n != 0){
            int r = n %10;
            sum = sum*10 + r;
            n = n /10;
        }
        return copyN == sum;
    }

    //(-10) is the value case capicua is not found;
    //1-Capicua 2-Amstrong;
    //returns -1 case type of number is invalid;
    public static int firstNumber(int inf, int sup,int typeOfNumber){
        int returning = -10;
        if(sup < inf){
            int aux;
            aux = sup;
            sup = inf;
            inf = aux;
        }
        for(int i = inf; i<=sup; i++){
            if (typeOfNumber == 1){
                if (isCapicua(i)){
                    returning = i;
                    break;
                }
            }
            if (typeOfNumber == 2){
                if (AmstrongNumber(i)){
                    returning = i;
                    break;
                }
            }
            if (typeOfNumber !=1 && typeOfNumber!=2){
                return -1;
            }

        }
        return returning;
    }

    public static int NumberCounter(int inf,int sup, int typeOfNumber){
        int counter = 0;
        for(int i = inf; i<=sup; i++){
            if (typeOfNumber == 1){
                if(isCapicua(i)){
                    counter++;
                }
            }
            if (typeOfNumber == 2){
                if(AmstrongNumber(i)){
                    counter++;
                }
            }
            if (typeOfNumber !=1 && typeOfNumber!=2){
                return -1;
            }
        }
        return counter;
    }

    public static int[] numberOfSpecialNumbers(int inf,int sup,int typeOfNumber){
        if(sup < inf){
            int aux;
            aux = sup;
            sup = inf;
            inf = aux;
        }
        int[] arrayOfCapicuas = new int[NumberCounter(inf,sup,typeOfNumber)];
        int index = 0;
        for(int i = inf; i<=sup; i++){
            if (typeOfNumber == 1){
                if(isCapicua(i)){
                    arrayOfCapicuas[index] = i;
                    index++;
                }
            }
            if (typeOfNumber == 2){
                if(AmstrongNumber(i)){
                    arrayOfCapicuas[index] = i;
                    index++;
                }
            }
            if (typeOfNumber !=1 && typeOfNumber!=2){
                return new int[0];
            }
        }
        return arrayOfCapicuas;
    }

    public static int biggestCapicua(int inf, int sup){
        int capicua = -10;
        if(sup < inf){
            int aux;
            aux = sup;
            sup = inf;
            inf = aux;
        }
        int maior = inf;
        for(int i = inf+1; i<=sup; i++){
            if (isCapicua(i)){
                if (i > maior) {
                    maior = i;
                }

            }
        }
        return maior;
    }

}

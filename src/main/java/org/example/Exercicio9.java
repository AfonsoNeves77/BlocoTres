package org.example;

public class Exercicio9 {

   public static String clothesEvaluation(int n){

       if (n == 1) {
           return "Alimento nao perecivel";
       }

       if (n <= 4) {
           return "Alimento perecivel";
       }

       if (n <= 6) {
           return "Vestuario";
       }

       if (n == 7) {
           return "Higiene pessoal";
       }


       if (n <= 14) {
           return "Limpeza e utensílios domésticos";
       }
       return "Invalid";
   }




    public static int numberEvaluation(int n){
        if(n <= 0){
            return -2;
        }
        int sum = 0;
        for(int i = 1; i < n; i++ ){
            if(n%i == 0){
                sum += i;
            }
        }
        return Integer.compare(sum, n);
    }

    public static int[] arrayOrganizer(int[] array){
        int[] newArray = new int[array.length];
        int count = 0;

        for(int i = 0;i<array.length; i++){
            if(array[i]%2 != 0){
                newArray[count] = array[i];
                count++;
            }
        }

        for(int i = 0;i<array.length; i++){
            if(array[i]%2 == 0){
                newArray[count-1] = array[i];
                count++;

            }
        }
        return newArray;
    }


}

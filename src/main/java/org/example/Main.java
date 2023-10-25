package org.example;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {

        System.out.println(rightCCNumber(136138128));

    }

    public static boolean rightCCNumber(int n) {
        int counter = 1;
        int sum = 0;
        while(n!=0){
            int d = n%10;
            sum = sum + (d*counter);
            counter++;
            n/=10;
        }
        return sum%11 == 0;
    }

}


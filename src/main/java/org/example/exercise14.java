package org.example;

public class exercise14 {

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

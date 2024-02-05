package javaprograms.practice;

import java.util.stream.Stream;

public class SumOfNumber {
    public int getSumNumByLoop(int n) {
        int sum = 0;
        while (n != 0) {
            int lastNum = n % 10;
            sum += lastNum;
            n = n / 10;
        }
        return sum;
    }

    int sumRecursive = 0;

    public int getSumByRecursive(int n) {
        if (n == 0)
            return 0;
        return getSumNumByLoop(n % 10 + getSumNumByLoop(n / 10));
    }

    public int getSumByStream(int n){
         return Stream.of(String.valueOf(n).split(""))
                .mapToInt(i->Integer.parseInt(i)).sum();

    }


    public static void main(String[] args) {
        SumOfNumber sn = new SumOfNumber();
        int n = 123;
        int sumValLoop = sn.getSumNumByLoop(n);
        int sumValRecursive= sn.getSumByRecursive(n);
        int sumValStream= sn.getSumByStream(n);
        System.out.println("sumValLoop "+sumValLoop);
        System.out.println("sumValRecursive "+sumValRecursive);
        System.out.println("sumValStream "+sumValStream);
    }
}

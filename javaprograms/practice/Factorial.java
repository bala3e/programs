package javaprograms.practice;

import java.util.stream.LongStream;

public class Factorial {
    public int factRecursive(int n){
        if(n<2){
            return n;
        }else{
            return n*factRecursive(n-1);
        }
    }

    public int factLoop(int n){
        int val=1;
        for(int i=2;i<=n;i++){
            val=val*i;
        }
        return val;
    }

     public long factStream(int n){
        return LongStream.rangeClosed(1,n).boxed().reduce(1L,(aLong, aLong2) -> aLong*aLong2);
     }




    public static void main(String[] args) {
        Factorial fact = new Factorial();

        int factRecursiveVal  = fact.factRecursive(3);
        int factLoopVal = fact.factLoop(3);
        System.out.println("factVal Loop "+factLoopVal);
        System.out.println("fact val Recursive "+fact.factRecursive(3));
        System.out.println("fact val stream "+fact.factStream(3));
    }
}

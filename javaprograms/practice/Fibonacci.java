package javaprograms.practice;

import java.util.stream.Stream;

public class Fibonacci {
    int n1=0;int n2=1;int n3=0;
    public void fibonacciRecursive(int n){
        if(n>=0){
            System.out.print(n3);
            n1=n2;
            n2=n3;
            n3=n1+n2;
            fibonacciRecursive(n-1);
        }
    }

    public void fibonacciLoop(int n){
        while (n>=0){
            System.out.print(n3);
            n1=n2;
            n2=n3;
            n3=n1+n2;
            n--;
        }
    }


    public void fibonacciSteam(int n){
        Stream.iterate(new int[]{0,1},x->new int[]{x[1],x[0]+x[1]}).limit(n).map(x->x[0]).forEach(System.out::print);
    }

    public static void main(String[] args) {
        new Fibonacci().fibonacciRecursive(5);
        new Fibonacci().fibonacciLoop(5);
        new Fibonacci().fibonacciRecursive(5);

    }
}

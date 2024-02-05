package javaprograms.practice;

import java.util.Arrays;
import java.util.Comparator;

public class ThridLargestNumber {
    public int findThirdLargestNum(int array[]){
        int first  = Integer.MIN_VALUE;
        int second = Integer.MIN_VALUE;
        int third  = Integer.MIN_VALUE;

        for(int i:array){
            if(i>first){
                third=second;
                second=first;
                first=i;


            }else if(i>second){
                third=second;
                second=i;


            } else if (i>third) {
                third=i;
            }
        }
        System.out.println("f "+first);
        System.out.println("s "+second);
        System.out.println("t "+third);
        return third;
}
    public int findThirdSmallestNum(int array[]){
        int first  = Integer.MAX_VALUE;
        int second = Integer.MAX_VALUE;
        int third  = Integer.MAX_VALUE;

        for(int i:array){
            if(i<first){
                third=second;
                second=first;
                first=i;


            }else if(i<second){
                third=second;
                second=i;


            } else if (i<third) {
                third=i;
            }
        }
        System.out.println("f "+first);
        System.out.println("s "+second);
        System.out.println("t "+third);
        return third;
    }


    public int find3LargestnumStream(int [] array){
        return Arrays.stream(array).boxed().sorted(Comparator.reverseOrder()).skip(2).findFirst().get();
    }

    public static void main(String[] args) {
        int array[] ={1,2,3,4,5,6,7};
        ThridLargestNumber thridLargestNumber = new ThridLargestNumber();
        int thridLargestNumberVal=thridLargestNumber.findThirdLargestNum(array);
        int findThirdSmallestNum = thridLargestNumber.findThirdSmallestNum(array);
         System.out.println(" thridLargestNumberVal "+findThirdSmallestNum);
        System.out.println("stream "+thridLargestNumber.find3LargestnumStream(array));
    }
}

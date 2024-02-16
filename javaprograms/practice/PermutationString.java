package javaprograms.practice;

import java.util.stream.IntStream;
import java.util.stream.Stream;

public class PermutationString {
    public void permutationLoop(String p,String str){
        int n=str.length();
        if(n==0){
            System.out.print(p+" ");
        }else{
            for(int i=0;i<str.length();i++){
                String temp=p+str.charAt(i);
                String temp1=str.substring(0,i)+str.substring(i+1);
                permutationLoop(temp,temp1);
            }
        }
    }

    public Stream<String> permutationRecursive(String str){
        //int n=str.length();
        if(str.isEmpty()){
            return Stream.of(" ");
        }else{
            return IntStream.range(0,str.length()).boxed().flatMap(
                    i->permutationRecursive(
                            str.substring(0,i)+str.substring(i+1)
                    ).map(t->t+str.charAt(i))
            );
        }
    }


    public static void main(String[] args) {
        PermutationString ps = new PermutationString();
        ps.permutationLoop("","hel");
        System.out.println();
        ps.permutationRecursive("hel").forEach(System.out::print);
    }
}

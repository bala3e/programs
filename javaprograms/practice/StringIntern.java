package javaprograms.practice;

public class StringIntern {
    public static void main(String[] args) {
        String s1="hello";
        String s2=new String("hello");
        s2=s2.intern();
        if(s1==s2){
            System.out.println("true");
        }
    }
}

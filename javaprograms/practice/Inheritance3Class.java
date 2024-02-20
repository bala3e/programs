package javaprograms.practice;
class A1{
    A1(){
        System.out.println("A1");
    }
}
class  B1 extends A1{
    B1(){
        System.out.println("B1");
    }
}

class  C1 extends B1{
    C1(){
        System.out.println("C1");
    }
}
public class Inheritance3Class {
    public static void main(String[] args) {
        B1 b1 = new C1();
    }
}

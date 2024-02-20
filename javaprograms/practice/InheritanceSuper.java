package javaprograms.practice;

class A{
    String s="Class A";
}
class B extends A{
    String s = "Class B";
    void display(){
        System.out.println(super.s);
        System.out.println(s);

    }
}
public class InheritanceSuper {
    public static void main(String[] args) {
        B b = new B();
        b.display();
    }
}

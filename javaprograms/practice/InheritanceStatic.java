package javaprograms.practice;

class Base{
    static String name = "Base";
    static void display(){
        System.out.println("Base display");
    }
}
class Derived extends Base{
    static String name = "Derived";
    static void display(){
        System.out.println("Derived Display");
    }
}
public class InheritanceStatic {
    public static void main(String[] args) {
            Base base = new Derived();
            base.display();
        System.out.println(base.name);
    }
}

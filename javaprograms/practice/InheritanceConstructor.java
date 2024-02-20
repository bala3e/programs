package javaprograms.practice;
class Animal{
    Animal(){
        System.out.println("Animal");

    }
}

class Cat extends Animal{
    Cat(){
        super();
        System.out.println("Cat ");

    }
}
public class InheritanceConstructor {
    public static void main(String[] args) {
        Cat cat = new Cat();
    }

}

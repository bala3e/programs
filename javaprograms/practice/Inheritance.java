package javaprograms.practice;
class Amimal{
    String name="Animal";
    String sound(){
        return "Generic Sound";
    }
}

class Dog extends Amimal{
    String name ="Dog";
    @Override
    String sound(){
        return "Bark";
    }
}
public class Inheritance {
    public static void main(String[] args) {
        Amimal amimal = new Dog();// reference - parent -- Object -- child
        System.out.println("method ::::: "+amimal.sound());
        System.out.println("variable:::::"+amimal.name);
    }
}

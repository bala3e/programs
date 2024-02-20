package javaprograms.practice;
interface Animal1{
    public void eat();
    public void makeSound();
}

interface Bird{
    int legs=2;
    public void fly();
}
public class InterfaceTest implements Animal1,Bird {
    @Override
    public void eat() {

    }

    @Override
    public void makeSound() {

    }

    @Override
    public void fly() {

    }
}

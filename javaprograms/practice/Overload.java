package javaprograms.practice;

public class Overload {
    public void print(byte b){
        System.out.println("Byte");
    }
    public void print(int b){
        System.out.println("int");
    }
    public void print( short b){
        System.out.println("short");
    }
    public void print( long b){
        System.out.println("long");
    }
    public void print( float b){
        System.out.println("float");
    }
    public void print( double b){
        System.out.println("double");
    }

    public static void main(String[] args) {
        Overload overload = new Overload();
        overload.print(1);

        int a=5; int b=6; int c=a=b;
        System.out.println(c);

    }
}

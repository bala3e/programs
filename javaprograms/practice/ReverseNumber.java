package javaprograms.practice;

public class ReverseNumber {
    public int reverseNumberByLoop(int n){
        int reversedNum=0;
        while (n!=0){
            int lastDigit = n%10;
            reversedNum =reversedNum*10+lastDigit;
            n=n/10;
        }
        return reversedNum;
    }

    public void reverseNumberByRecursive(int number){
          if (number < 10){
                System.out.println(number);
                return;
            } else {
                System.out.print(number % 10);
                reverseNumberByRecursive(number/10);
            }
        }

    public static void main(String[] args) {
        ReverseNumber rn = new ReverseNumber();
        int n1= rn.reverseNumberByLoop(123);
        System.out.println(n1);
        rn.reverseNumberByRecursive(n1);

    }
}

package javaprograms.practice;

public class BreakSample {
    public static void main(String[] args) {
        for (int i = 0; i < 5; i++) {
            if(i==2){
                break;

            }
            System.out.println("break :: "+i);

        }
        for (int i = 0; i < 5; i++) {
            if(i==2){
                continue;

            }
            System.out.println("continue :: "+i);

        }
    }
}

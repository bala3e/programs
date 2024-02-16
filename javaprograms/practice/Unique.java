package javaprograms.practice;

public class Unique {
    public boolean isUniqueChar(String str){
        if(str.length()>128)return false;
        boolean [] char_set = new boolean[128];
        for(int i=0;i<str.length();i++){
            int value =str.charAt(i);
            if(char_set[value]){
                return false;
            }else{
                char_set[value]=true;
            }
        }

        return true;
    }

    public static void main(String[] args) {
        Unique unique = new Unique();
        if(unique.isUniqueChar("aaa")){
            System.out.println("Contains Unique");
        }else{
            System.out.println("Duplicate");
        }

    }
}

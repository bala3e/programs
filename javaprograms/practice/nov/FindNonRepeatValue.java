package javaprograms.practice.nov;
import java.util.*;
import java.util.function.Function;
import java.util.stream.Collectors;
public class FindNonRepeatValue {
    public static void main(String[] args) {
        String str = "1aabbcc";
        Map<Character,Long> charCnt = str.chars().mapToObj(c->(char)c).
                                      collect(Collectors.groupingBy(Function.identity(),LinkedHashMap::new,Collectors.counting()));
        
        Character c = charCnt.entrySet().stream().filter(e->e.getValue()==1).map(e->e.getKey()).findFirst().orElse(null);   
        System.out.println(c);   
        
        
        Map<Character,Long>charCnt1= str.chars().mapToObj(c1->(char)c1).collect(Collectors.groupingBy(e->e,LinkedHashMap::new,Collectors.counting()));

        Character c2=charCnt1.entrySet().stream().filter(e->e.getValue()==1).map(Map.Entry::getKey).findFirst().orElse(null);

        System.out.println(c2);

    }
}

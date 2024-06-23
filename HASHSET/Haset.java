package HASHSET;

import java.util.HashSet;
import java.util.Set;

public class Haset {
    public static void main(String[] args){
        Set<Integer> numbers = new HashSet<>();

        numbers.add(1);
        numbers.add(2);
        numbers.add(3);
        numbers.add(4);
        numbers.add(5);
        numbers.add(6);

        System.out.println("numbers " + numbers);

        System.out.println("____________________Set______________________");

        if(numbers.contains(1)){
            System.out.println("Set Contains 1");
        }
        if(!numbers.contains(10)) {
            System.out.println("Set Not Contains 10");

        }
    }
}

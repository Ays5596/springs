package collection;

import java.util.Set;
import java.util.HashSet;
import java.util.TreeSet;

public class setDemo {

    public static void main(String[] args){
        Set<String> values =  new HashSet<>();
        System.out.println(values.add("hello"));
        System.out.println(values.add("who"));
        System.out.println(values.add("are"));
        System.out.println(values.add("you"));


        for(String i : values)
            System.out.println(i);
    }
}

package collection;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class genericDemo {
    public static void main(String[] args){
       Container<Integer,String> container = new Container<>(12,"Hello");
       // We can use generic to define any type of classes.
        //Container is a generic class.
       int v1 = container.getItem1();
       String v2 = container.getItem2();
       Set<String> mys1 = new HashSet<>();
       mys1.add("qwe");
       mys1.add("fghjj");
       mys1.add("asd");
        Set<String> mys2 = new HashSet<>();
        mys2.add("qwe");
        mys2.add("uhgb");
        mys2.add("asd");

        Set<String> rs = union(mys1,mys2);
        Iterator<String> itr = rs.iterator();
        while(itr.hasNext()) {
            String var = itr.next();
            System.out.println(var);
        }

    }

    // NON-GENERIC METHOD:
    /* public static Set union(Set s1, Set s2){
        Set r = new HashSet(s1);
        r.addAll(s2);
        return r;
    }*/
    public static <E> Set<E> union(Set<E> s1, Set<E> s2){
        Set<E> r = new HashSet<E>(s1);
        r.addAll(s2);
        return r;
    }
}

package collection;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

public class mapDemo {
    public static void main(String[] args){
        Map<Object,String> testMap = new HashMap<Object, String>();
        // object, String are generics here
        testMap.put(1, "hi");
        testMap.put(2, "say");
        testMap.put(3,"sthing");
        testMap.put(null, null);
        testMap.put(3, "anythng");

        Iterator<Map.Entry<Object,String>> it=testMap.entrySet().iterator();
        int c=0;
        while(it.hasNext()){
            c++;
        Map.Entry<Object,String> me=it.next();
        }
    }
}

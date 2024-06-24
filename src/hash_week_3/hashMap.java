package hash_week_3;
import java.util.*;

public class hashMap {
    // HashMap (Unordered)
    // (Key - Value) it is simple Pair.
    // **** Key is always unique. Value is not necessary to be unique.
    // Example-
    // (Roll No. <-> Name)

    public static void main(String[] args) {

        HashMap<String,Integer> map = new HashMap<>();
        // Similar with hashSet

        // Insert Data
        // Case 1: Key Doesn't exist. Simple new key added.
        // Case 2: Key does exist. Find & Update it.

        map.put("BD",100);
        map.put("AFG",90);
        map.put("Palestine",99);

        // Search
        // Case 1: for values.
        // Case 2: for keys.

        System.out.println("Palestine (Value): "+map.get("Palestine"));

        // containsKey output will be true or false.
        System.out.println("Does BD(Key) is available on map ? "+map.containsKey("BD"));

        // Re-enter data will be updated.
        map.put("Palestine",100);
        System.out.println("Updated Palestine : "+map.get("Palestine"));

        // Iterator print (Working on values)
        System.out.println("\nIterator print (Working on keys and values)");

        Iterator it    = map.values().iterator();
        Iterator itKey = map.keySet().iterator();
        while (it.hasNext()){
            System.out.println(itKey.next()+" <--> "+it.next());
        }
        // For does not exist value.

        // .get two cases
        // Case 1: Exist value (Print value)
        // Case 2: Doesn't Exist value (Print Null)

        System.out.println();
        System.out.println("Israel -> "+map.get("Israel"));

        //
        // Way 1 : Map change into Set
        System.out.println();
        System.out.println("Way 1: Using Map.Entry ");
        for(Map.Entry<String,Integer> p :map.entrySet()){
            System.out.println(p.getKey()+" <---> "+p.getValue());
        }

        // Way 2 : just for keys.
        System.out.println();
        System.out.println("Way 2: Using Set");
        Set<String> keys = map.keySet();
        for (String key: keys){
            System.out.println(key+" <---> "+map.get(key));
        }

        // Remove
        map.remove("AFG");
        System.out.println("After Remove AFG ->\n"+map);


    }

}

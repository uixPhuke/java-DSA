package HashSet;
import java.util.*;
public class Hashmap {
    public static void main(String args[]){
        HashMap <String,Integer> map=new HashMap<>();


        //insertion
        map.put("India",120);
        map.put("US",150);
        map.put("China",234);

        System.out.println(map);

        //update
        map.put("China",300);
        System.out.println(map);

        //search
        if(map.containsKey("China")){
            System.out.println("China is present");
        }
        else{
            System.out.println("key not present");
        }


        //get value
        System.out.println(map.get("China")); // key exist
        System.out.println(map.get("Japan")); //key doesnt exist ---> null

        //iteration in HashMap

        //keyset
        for(Map.Entry<String,Integer> e : map.entrySet()){
            System.out.println(e.getKey());
            System.out.println(e.getValue());
        }

        //entryset
        Set<String> keys=map.keySet();
        for(String key:keys){
            System.out.println(key+" "+map.get(key));
        }

        //remove
        map.remove("China");
        System.out.println(map);

    }

    }

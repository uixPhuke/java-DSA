package HashSet;
import java.util.HashSet;
import java.util.Iterator;

public class Hashset {
    static void main(String[] args) {
    HashSet <Integer> set=new HashSet<>();

    //add value
    set.add(1);
    set.add(2);
    set.add(3);
    set.add(2);

    System.out.println(set);

    //search
    if(set.contains(1)){
        System.out.println("1 is present");
    }
    if(!set.contains(5)){
        System.out.println("5 not present");
    }
// delete
       set.remove(3);
       //size
        System.out.println(set.size());

       Iterator it=set.iterator();

       while(it.hasNext()){
           System.out.println(it.next());
       }
    }





}

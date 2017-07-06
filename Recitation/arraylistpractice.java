import java.util.ArrayList;
import java.util.List;
import java.util.Collections;

public class arraylistpractice {
    public static void main(String[] args) {
        // ArrayList<String> jamie = new ArrayList<>();
        // jamie.add("hello");
        // jamie.add("i");
        // jamie.add(1, "how");

        // for (String s: jamie) {
        //     System.out.println(s);
        // }
    
        //List list = new ArrayList(); //No generic <> type saftey is not good practice!

        //Good practice:
        List<String> list = new ArrayList<String>();
        list.add("0");
        System.out.println(list.get(0));
        list.remove(2);

        //Collections Example: How to use the static methods
        //If the object implements Comparable, we can call sort on it. It must have Comparable
        Collections.sort(list);



    }
}
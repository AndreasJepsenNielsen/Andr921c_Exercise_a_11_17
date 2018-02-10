import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

public class Opgave17 {
    public static void main(String[] args) {
        Map<String,String> map1 = new HashMap<>();
        Map<String,String> map2 = new HashMap<>();

        map1.put("Kasper","28");
        map1.put("Andreas","22");
        map2.put("Kasper", "28");
        map2.put("Andreas","22");
        map1.put("Jesper","25");

        submap(map1,map2);
    }

    public static void submap(Map<String, String> a, Map<String, String> b)
    {
        Iterator it = a.entrySet().iterator(); // laver en iterator for map a

        Boolean ContainsAll = false;

        while(it.hasNext())
        {
           Map.Entry KV = (Map.Entry)it.next();

           if(b.containsKey(KV.getKey())&&(b.containsValue(KV.getValue()))){ // hvis map b indeholder både key og value
               ContainsAll = true;
           }else
           {
               ContainsAll = false; //
               System.out.println("False");
           }

        }

        if(ContainsAll) // hvis containsall er true udskriv true
        {
            System.out.println("True");
        }
    }
}

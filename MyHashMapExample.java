import java.util.HashMap;
import java.util.Map;
import java.util.Set;
public class MyHashMapExample {
    public static void main(String[] args) 
    {
        //country is key in this map
        HashMap<String, Integer> map = new HashMap<>();
        //createing map
        map.put("India", 120);
        map.put("Us", 90);
        map.put("China", 110);
        map.put("Japan", 20);
        // System.out.println(map);
        map.put("China", 130);
        // System.out.println(map);
        //search key in the map
        if(map.containsKey("Turkey"))
        {
            System.out.println("key is present in the map");
        }
        else
        {
            System.out.println("key is not present in the map");

        }
        //get values of map
        System.out.println(map.get("China")); //key exists 
        System.out.println(map.get("Turkey")); //key not exists
        for(Map.Entry<String,Integer>e:map.entrySet())
        {
            System.out.println(e.getKey()+" ");
            System.out.println(" "+e.getValue());
        }
        Set<String> Keys=map.keySet();
        for(String key:Keys)
        {
            System.out.println(key+" "+map.get(key));
        }
    }
}

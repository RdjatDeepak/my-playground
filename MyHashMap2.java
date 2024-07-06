import java.security.Key;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;
public class MyHashMap2
{
    public static void main(String[] args) 
    {
        HashMap<String , Integer> map = new HashMap<>();
        map.put("Deepak", 8);
        map.put("Roshan", 21);
        map.put("Amarjeet", 2);    
        map.put("Rishab", 1);    
        map.put("Rajjo", 67);
        for(Map.Entry<String , Integer>e:map.entrySet()) 
        {
            System.out.println(map+ " ");
        }   
        // Set<String> Keys=map.keySet();
        // for(String key:Keys)
        // {
        //     System.out.println(key+" "+map.get(Keys));
        // }
    }
}
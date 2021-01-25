package Collection.Map;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class MapDEmo {
    public static void main(String[] args) {
        Map<String,String> map=new HashMap<String, String>();

        map.put("9901","math");
        map.put("9902","English");
        map.put("9903","Chinese");
        Set<Map.Entry<String, String>> entries = map.entrySet();

        //遍历方式1
        Set<String> keySet = map.keySet();
        for(String s:keySet){
            String value = map.get(s);
            System.out.println(s+" "+value);
        }

        //遍历方式2
        for(Map.Entry<String, String> s:entries){
            String key = s.getKey();
            String value = s.getValue();
            System.out.println(key+" "+value);
        }

    }
}

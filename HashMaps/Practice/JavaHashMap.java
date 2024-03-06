package DSA_Java.HashMaps.Practice;

import java.util.HashMap;

public class JavaHashMap {

    public static void main(String[] args) {
        HashMap<String,Integer> hm=new HashMap<>();
        hm.put("Manoj",10);
        hm.put("Vikas",10);
        hm.put("Divyanshi",10);
        System.out.println(hm.get("Manoj"));


        System.out.println(hm.containsKey("Manoj"));
        System.out.println(hm);
    }
}

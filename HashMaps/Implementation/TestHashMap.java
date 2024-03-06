package DSA_Java.HashMaps.Implementation;

public class TestHashMap {

    public static void main(String[] args) {
        MyHashMap map=new MyHashMap();
        map.put("Manoj",10);
        map.put("Vikas",20);
        map.put("Divyanshi",30);
        map.put("Vijay",40);
        map.put("Anshika",50);
        map.put("Kajal",60);
        System.out.println("Size = "+map.size());
        System.out.println("Get Key Manoj : "+map.get("Manoj"));
        System.out.println("Get Key manoj : "+map.get("manoj"));
        System.out.println("Contains Key Manoj: "+map.containsKey("Manoj"));
        System.out.println("Contains Key manoj: "+map.containsKey("manoj"));
        System.out.println("Delete Key Manoj : "+map.delete("Manoj"));
        System.out.println("Delete Key manoj : "+map.delete("manoj"));
        System.out.println("Size = "+map.size());
        System.out.println("Is empty = "+map.isEmpty());
        map.display();
    }
}

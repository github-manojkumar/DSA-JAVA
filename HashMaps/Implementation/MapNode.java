package DSA_Java.HashMaps.Implementation;

public class MapNode {
    int value;
    String key;
    MapNode next;

    public MapNode(String key,int value){
        this.key=key;
        this.value=value;
    }

    @Override
    public String toString(){
        return this.key+"="+this.value;
    }
}

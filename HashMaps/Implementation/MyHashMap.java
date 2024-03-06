package DSA_Java.HashMaps.Implementation;

import java.util.ArrayList;
import java.util.LinkedList;

public class MyHashMap {

    // Hash Table, we are using array of Linked list -> collision technique separate linking
    LinkedList<MapNode>[] hashTable;
    int size;
    public MyHashMap(){
        this(5);
    }
    //initializing our hash table values with empty node
    MyHashMap(int cap){
        this.size=0;
        this.hashTable=new LinkedList[cap];
        for(int i=0;i<this.hashTable.length;i++){
            this.hashTable[i]=new LinkedList<MapNode>();
        }
    }

    public void put(String key,int value){

        /*
           Steps:
                 1. Get hash index for passed key
                 2. Get the list from the hash table for the index
                 3. Check if key already exist or not
                    a) If key exist, update the value
                    b) If not, create a new node and add it to the linked list at hash index
                 4. Calculate load factor
                 5. Add condition for rehashing i.e. if LF>0.5 do rehashing
         */

        //Step 1:
        int hi=hashFn(key);//hi->hash index

        //Step 2: Get the linked list from hashtable
        LinkedList<MapNode> bucket=this.hashTable[hi];

        //Step 3: Checking if key is already exist or not
        int fi= findInBucket(key,bucket); //fi-> find index

        //Step 3 a and b: if key exists  update and if not create a new node and add
        if(fi!=-1){
            MapNode node=bucket.get(fi);
            node.value=value;
        }else{
            size++;
            MapNode node=new MapNode(key,value);
            bucket.addLast(node);
        }

        //Step 4: Calculate the load factor
        double loadFactor=(double) this.size/this.hashTable.length;

        //Step 5: Add rehashing condition
        if(loadFactor>0.6){ doRehashing();}

    }

    private void doRehashing(){
        this.size=0;// size should be zero initially because we are doing rehashing
        LinkedList<MapNode>[] oldHashTable=this.hashTable;
        this.hashTable=new LinkedList[2*oldHashTable.length];
        //initializing new hash table with empty linked list
        for(int i=0;i<this.hashTable.length;i++){
            this.hashTable[i]=new LinkedList<MapNode>();
        }
        // adding every key value pair in newly created hash table one by one
        for (LinkedList<MapNode> bucket : oldHashTable) {
            for (MapNode node : bucket) {
                put(node.key, node.value);
            }
        }
    }
    //checking if key is already exist or not
    private int findInBucket(String key, LinkedList<MapNode> bucket){
        //go to each and every node in the current bucket linked list and check if key is equal or not
        for(int i=0;i<bucket.size();i++){
            if(bucket.get(i).key.equals(key)){
                return i;
            }
        }
        return -1;
    }
    //getting the hash index for passed key
    private int hashFn(String key){
        int hc=key.hashCode();
        return Math.abs(hc)%hashTable.length;
    }

    public Integer get(String key){
        /*
            Step 1: find the hash index
            Step 2: find the hash index in hash table
            Step 3: if not found the element return null
         */
        int hi=hashFn(key);//hi-> hash index
        LinkedList<MapNode> bucket=this.hashTable[hi];//bucket (linked list of MapNode ) at index hi in hashTable
        int fi=findInBucket(key,bucket);//fi-> find index
        if(fi==-1){
            return null;
        }else{
            MapNode node=bucket.get(fi);
            return node.value;
        }
    }

    public boolean containsKey(String key){
        /*
            Step 1: find the hash index
            Step 2: find the hash index in hash table
            Step 3: if not found the element return false else return true
         */
        int hi=hashFn(key);//hi-> hash index
        LinkedList<MapNode> bucket=this.hashTable[hi];//bucket (linked list of MapNode ) at index hi in hashTable
        int fi=findInBucket(key,bucket);//fi-> find index
        return (fi!=-1);
    }

    public void display(){
        System.out.println("---------------------------------");
        for(int i=0;i<this.hashTable.length;i++){
            LinkedList<MapNode> bucket=this.hashTable[i];
            System.out.print("B["+i+"] => ");
            for(int j=0;j<bucket.size();j++){
                MapNode node=bucket.get(j);
                System.out.print(node.toString());
                if(j!=bucket.size()-1){
                    System.out.print(", ");
                }else{
                    System.out.print(".");
                }
            }
            System.out.println();
        }
        System.out.println("---------------------------------");
    }

    public Integer delete(String key){
        /*
            1. Get the hash index
            2. Found the key in the hash table, if not present return null
         */
        Integer elem=null;
        int hi=hashFn(key);//hash index
        LinkedList<MapNode> bucket=this.hashTable[hi];
        int fi=findInBucket(key,bucket);
        if(fi==-1){
            return null;
        }else{
            this.size--;
            elem=bucket.get(fi).value;
            bucket.remove(fi);//removing the element from the hash table
        }
        return elem;
    }

    public int size(){
        return this.size;
    }

    public boolean isEmpty(){
        return (this.size==0);
    }

    @Override public String toString(){
        ArrayList<String> result=new ArrayList<>();
        for (LinkedList<MapNode> bucket : this.hashTable) {
            for (MapNode mapNode : bucket) {
                if (mapNode != null) result.add(mapNode.toString());
            }
        }
        return result.toString();
    }

}

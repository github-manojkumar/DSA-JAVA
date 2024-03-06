package DSA_Java.Array.CustomArrayList;

/*
    - Custom Dynamic array
 */

public class MyArrayList implements IArrayList{
    private int size;
    private int capacity;
    private int[] array;
    private final int MAX_CAPACITY=Integer.MAX_VALUE;
    /*
        - Default constructor i.e. capacity optional
     */
    public MyArrayList(){
        this.capacity=10;
        declareArray();
    }
    /*
    - Custom constructor when capacity is passed by user
    */
    public MyArrayList(int capacity){
        if(capacity<=MAX_CAPACITY){
            this.capacity=capacity;
        }
        else{
            System.out.println("Array cannot have size greater than "+MAX_CAPACITY);
            System.out.println("Setting size to 10");
            this.capacity=10;
        }
        declareArray();
    }
    /*
        - Initializing Array
     */
    public void declareArray(){
        size=-1;
        array=new int[capacity];
    }

    /*
        - Increase Capacity
     */

    private boolean increaseCapacity(){
        boolean flag=false;
        if((capacity*2+2)>=Integer.MAX_VALUE){
            System.out.println("Maximum Array size already achieved..");
        }else{
            flag=true;
            int newCapacity=capacity*2+2;
            int[] newArray=new int[newCapacity];
            //Copying elements
            for(int i=0;i<=size;i++){
                newArray[i]=array[i];
            }
            capacity=newCapacity;
            array=newArray;
        }
        return flag;
    }

    /*
        - add(int element) method
     */
    @Override
    public void add(int element){
        if(checkOverFlow()){
            increaseCapacity();
        }
        size++;
        array[size]=element;
    }

    /*
        - add(int element,int index)
     */
    @Override
    public void add(int element,int index){
        if(checkOverFlow()){
            increaseCapacity();
        }
        // moving element to right of index where value is to be inserted
        for(int i=size;i>=index;i--){
            array[i+1]=array[i];
        }
        size++;
        array[index]=element;
    }
    /*
        - get method
        if index is out of bound return -1
        otherwise return element
     */

    @Override
    public int get(int index){
        if(checkUnderFlow()){
            System.out.println("Empty Array");
        }else{
            if(isValidIndex(index)){
                return array[index];
            }else{
                System.out.println("Invalid Index");
            }
        }
        return -1;
    }

    /*
        - clear method
        - set all the values present in array to null, here int is primitive, so we can not make it null
        - in our logic we make it -1 and set size to 0 so that no values are showed
        - to make numbers null we have to use wrapper classes Integer.
     */

    @Override
    public void clear(){
        if(!checkUnderFlow()) {
            for (int i = 0; i < capacity; i++) {
                array[i] = -1;
            }
            this.size=-1;
        }else{
            System.out.println("Empty Array !");
        }
    }

    /*
        - remove() method
        - move element from last to one position left and decrement size by 1
     */
    @Override
    public void remove(int index){
        if(checkUnderFlow()){
            System.out.println("Empty List!");
        }else{
            if(isValidIndex(index)){
                for(int i=index;i<size();i++){
                    array[i]=array[i+1];
                }
                size--;
            }else{
                System.out.println("Invalid Index");
            }
        }
    }

    /*
        Underflow and overflow condition check
     */

    private boolean checkUnderFlow(){
        if(size==-1){
            return true;
        }else{
            return false;
        }
    }

    private boolean checkOverFlow(){
        if(size==capacity-1){
            return true;
        }else{
            return false;
        }
    }

    /*
    - check if index is valid or not
    */
    private boolean isValidIndex(int index){
        if(index>=0 && index<=size){
            return true;
        }else{
            return false;
        }
    }

    @Override
    public String toString() {
        StringBuilder sb=new StringBuilder();
        sb.append("{ List = [");
        for(int i=0;i<=size;i++){
            sb.append(array[i]);
            if(i!=size){
                sb.append(", ");
            }
        }
        sb.append("] }");
        return sb.toString();
    }

    @Override
    public int size() {
        return size;
    }

    @Override
    public int capacity() {
        return capacity;
    }

}



package DSA_Java.Heaps.MaxHeap.Implementation;
import java.util.ArrayList;

/**
 * Implementing Max Heap
 * @author Manoj Kumar
 * @since 16 Feb,2024
 */
public class MaxHeap {
    ArrayList<Integer> heap;
    public MaxHeap(){
        this.heap=new ArrayList<>();
    }

    /**
     * This is the method to add elements in Heap
     * @param data Value to be inserted in heap
     */
    public void add(int data){
        /*
         * First adding the data at the best position i.e. at the last of the tree (last idx of array)
         * Now Up heapify, to maintain the properties of min heap
         */
        this.heap.add(data);
        int currentIdx=this.heap.size()-1;
        upheapify(currentIdx);
    }

    /**
     * This method will perform upheapify operation till the binary tree becomes a valid heap
     * @param childIdx storing the current index which needs to be up heapify
     */
    private void upheapify(int childIdx){
        /*
         - Get the parent index
         - We don't have to check for the other child of parent idx as it is already in correct position
         - Check if value at child node is smaller than the value at parent node
         - If yes replace the nodes and upheapify again
         */
        int parentIdx=(int)Math.floor((childIdx-1)/2);
        if(parentIdx>=0 && this.heap.get(parentIdx)<this.heap.get(childIdx)){
            swap(parentIdx,childIdx);
            upheapify(parentIdx);
        }
    }

    /**
     * This method will remove the root element
     */
    public int remove(){
        /*
            - Best element to be deleted is last element
            - Swap root element with the last element
            - As last element becomes root, so Down heapify the root element to make the heap valid
         */
        if(this.heap.size()==0){
            throw new RuntimeException("Trying to delete from and empty heap");
        }

        int lastIdx=this.heap.size()-1;
        int lastValue=this.heap.get(lastIdx);
        int removedElem=this.heap.get(0);
        this.heap.set(0,lastValue);
        this.heap.remove(lastIdx);
        downHeapify(0);
        return removedElem;
    }
    private void swap(int i,int j){
        int ith=this.heap.get(i);
        int jth=this.heap.get(j);
        this.heap.set(i,jth);
        this.heap.set(j,ith);
    }

    private boolean hasChild(int idx){
        return idx<heap.size();
    }
    private void downHeapify(int parentIdx){
        int leftChildIdx=2*parentIdx+1;
        int rightChildIdx=2*parentIdx+2;
        int maxIdx=parentIdx;

        if(hasChild(leftChildIdx) && this.heap.get(leftChildIdx)>this.heap.get(maxIdx)){
            maxIdx=leftChildIdx;
        }
        if(hasChild(rightChildIdx) && this.heap.get(rightChildIdx)>this.heap.get(maxIdx)){
            maxIdx=rightChildIdx;
        }
        if(maxIdx!=parentIdx){
            swap(parentIdx,maxIdx);
            downHeapify(maxIdx);
        }
    }

    private int findElem(int elem){
        for(int i=0;i<this.heap.size();i++){
            if(this.heap.get(i)==elem){
                return i;
            }
        }
        return -1;
    }
    public int removeElem(int element){
        int elementIdx=findElem(element);
        int rm=-1;
        if(elementIdx!=-1){
            rm=this.heap.get(elementIdx);
            this.heap.set(elementIdx,Integer.MAX_VALUE);//max infinity
            upheapify(elementIdx);// to move the element to root because we know how to remove root element
            remove();
        }
        return rm;
    }

    public int size(){
        return this.heap.size();
    }
    public void display(){
        /**
         * This method will show the data of the heap
         * as arraylist has overrides toString to display its data
         * we don't have to implement any display method
         */
        System.out.println(this.heap);
    }
}


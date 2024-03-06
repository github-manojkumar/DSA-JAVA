package DSA_Java.Heaps.MaxHeap.Implementation;

public class TestMaxHeap {
    public static void main(String[] args) {
        MaxHeap heap=new MaxHeap();
        heap.add(10);
        heap.add(20);
        heap.add(30);
        heap.add(40);
        heap.add(50);
        heap.add(23);
        heap.display();
        System.out.println(heap.remove());
        System.out.println(heap.remove());
        System.out.println(heap.remove());
        System.out.println(heap.remove());
        System.out.println(heap.remove());
        System.out.println(heap.remove());
    }
}

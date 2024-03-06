package DSA_Java.Heaps.MinHeap.Implementation;

public class TestMinHeap {
    public static void main(String[] args) {
        MinHeap heap=new MinHeap();
        heap.add(10);
        heap.add(20);
        heap.add(30);
        heap.add(40);
        heap.add(50);
        heap.add(60);
        heap.add(70);
        heap.add(80);
        heap.add(90);
        heap.add(100);
        heap.add(110);
        heap.add(120);
        heap.add(130);
        heap.add(140);
        heap.display();
        System.out.println(heap.removeElem(50));
        heap.display();
    }
}

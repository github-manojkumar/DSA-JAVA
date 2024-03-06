package DSA_Java.Array.CustomArrayList;

public class TestMyList {
    public static void main(String[] args) {
        MyArrayList list1=new MyArrayList(5);
        list1.add(10);
        list1.add(20);
        list1.add(111,0);
        list1.add(30);
        list1.add(40);
        list1.add(1010,0);
        list1.remove(0);
        list1.remove(0);
        list1.remove(0);
        list1.remove(0);
        list1.remove(0);
        list1.remove(0);
        list1.remove(0);
        System.out.println(list1.capacity());
        System.out.println(list1.size());
        System.out.println(list1);

    }
}

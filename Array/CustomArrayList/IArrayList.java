package DSA_Java.Array.CustomArrayList;

public interface IArrayList {
    public void add(int element);
    public void add(int element,int index);
    public int get(int index);
    public void clear();
    public void remove(int index);
    public int size();
    public int capacity();
}

package DSA_Java.Stacks.ImplementationUsingArrays;

import DSA_Java.Array.CustomArrayList.IArrayList;
import DSA_Java.Array.CustomArrayList.MyArrayList;
import DSA_Java.Stacks.Resources.IMyStack;

public class MyStack implements IMyStack {
    int top=-1;
    IArrayList stack =new MyArrayList();
    private boolean isUnderflow(){
        return (this.top==-1);
    }

    @Override
    public boolean isEmpty() {
        return (top==-1);
    }

    @Override
    public int pop() {
        if(isUnderflow()){
            System.out.println("Underflow condition, stack is empty");
            return -1;
        }
        int elem=stack.get(this.top);
        stack.remove(this.top);
        this.top--;
        return elem;
    }
    @Override
    public void push(int data) {
        stack.add(data);
        this.top++;
    }
    @Override
    public int size() {
        return stack.size()+1;
    }

    @Override
    public void display() {
        if(isUnderflow()){
            System.out.println("Underflow condition, stack is empty");
            return;
        }
        System.out.print("Top : ");
        int idx=this.top;
        while(idx>=0){
            System.out.print(stack.get(idx));
            if(idx>0){System.out.print(" <-- ");}
            idx--;
        }
        System.out.println();
    }

    @Override
    public int peek(){
        if(isUnderflow()){
            System.out.println("Stack is empty!!");
            return -1;
        }
        return stack.get(top);
    }
}

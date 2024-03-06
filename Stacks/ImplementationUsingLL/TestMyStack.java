package DSA_Java.Stacks.ImplementationUsingLL;
import DSA_Java.Stacks.Resources.IMyStack;
public class TestMyStack {
    public static void main(String[] args) {
        IMyStack stack=new MyStack();
        System.out.println(stack.isEmpty());
        System.out.println("Peek "+stack.peek());
        stack.push(10);
        stack.push(20);
        stack.push(30);
        System.out.println("Peek "+stack.peek());
        stack.push(40);
        System.out.println(stack.isEmpty());
        stack.display();
        System.out.println("Size : "+stack.size());
        System.out.println("Deleted: "+stack.pop());
        System.out.println("Deleted: "+stack.pop());
        System.out.println("Deleted: "+stack.pop());
        System.out.println("Deleted: "+stack.pop());
        stack.display();
        System.out.println("Deleted: "+stack.pop());
        stack.display();
        System.out.println(stack.isEmpty());
    }
}

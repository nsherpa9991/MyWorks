import java.util.Stack;

public class GenericQueue<T>{

    public Stack<T> myStack;

    public GenericQueue(){
        this.myStack = new Stack<>();
    }

    public void add(T item){
        Stack<T> queue = new Stack<>();
        while (!this.myStack.isEmpty()){
            queue.push(this.myStack.pop());
        }
        this.myStack.push(item);

        while (!queue.isEmpty()){
            this.myStack.push(queue.pop());
        }
    }

    public void print(){
        if(this.myStack.size()!=0) {
            for (T n : this.myStack) {
                System.out.println(n);
            }
        }
    }

    public static void main(String[] args) {
        GenericQueue<Integer> queue = new GenericQueue<>();
        queue.add(20);
        queue.add(30);
        queue.add(40);
        queue.add(50);
//        queue.print();

        System.out.println("popped " +queue.myStack.pop());
        System.out.println("peek "+ queue.myStack.peek());
    }






}

import java.util.Arrays;

public class QueueOfArrays<T>{

    private T[] collectionOfQueue;
    private int n;
    private int oldestElement;
    private int recentElement;

    public QueueOfArrays(int size) {
        this.collectionOfQueue = (T[]) new Object[size];

    }

    public void enQueue(T element){
        if(n < this.collectionOfQueue.length && recentElement != this.collectionOfQueue.length){
            this.collectionOfQueue[recentElement] = element;
            this.recentElement ++;
            this.n++;
        } else if (n < this.collectionOfQueue.length && recentElement >= this.collectionOfQueue.length) {
            this.recentElement =0;
            this.collectionOfQueue[recentElement] = element;
            this.recentElement++;
            this.n++;


        }
        else if(!this.isEmpty()){
            System.out.println("The Queue of Array is full");
        }
        else{
            this.collectionOfQueue[this.recentElement] = element;
            this.recentElement++;
            this.n++;
        }

    }

    public void deQueue(){
        if(this.isEmpty()){
            System.out.println("The Queue is empty");
        } else if (this.oldestElement == this.collectionOfQueue.length -1 && n<this.collectionOfQueue.length) {
            this.collectionOfQueue[oldestElement] = null;
            this.oldestElement= 0;
            this.n--;

        } else{
            this.collectionOfQueue[this.oldestElement] = null;
            this.n--;
            this.oldestElement++;
        }
        {



        }


    }

    public boolean isEmpty(){
        if(n == 0){
            return true;
        }else{
            return false;
        }

    }

    public int size(){
        return n;
    }

    public T fornt(){
        return this.collectionOfQueue[oldestElement];
    }

    public T back(){
        return this.collectionOfQueue[oldestElement];
    }

    public int getOldestElement(){
        return this.oldestElement;
    }

    public int getRecentElement(){
        return this.recentElement-1;
    }
}

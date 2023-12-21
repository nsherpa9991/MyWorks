class SinglyLinkedList<T>{

    public Node head;

    public SinglyLinkedList(){
        this.head = null;
    }

    public class Node{

        T data;
        Node next;

        public Node(T data){
            this.data = data;
            this.next = null;
        }
    }

    public void add(T data){
        Node newNode = new Node(data);
        if (this.head == null){
            this.head = newNode;
        }
        else{
            Node current = this.head;
            Node afterCurrent = current.next;
            while (current.next!= null){
                current = afterCurrent;
                afterCurrent = current.next;
            }
            current.next = newNode;
        }
    }

    public void print(){
        Node current = this.head;
        Node afterCurrent = current.next;
        System.out.println(current.data);
        while (current.next!= null){

            current = afterCurrent;
            afterCurrent = current.next;
            System.out.println(current.data);
        }
    }

    public static void main(String[] args) {
        SinglyLinkedList<Integer> sl = new SinglyLinkedList<>();
        sl.add(20);
        sl.add(30);
        sl.add(40);
        sl.add(50);
        sl.print();
    }


}
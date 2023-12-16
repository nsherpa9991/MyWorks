public class LinkedList<T extends Comparable<T>> {
    Node first;

    public LinkedList() {
        this.first = null;
    }

    private class Node {
        Node next;
        T mdata;

        public Node(T mdata) {
            this.mdata = mdata;
            this.next = null;
        }
    }

    public void add(T mdata) {
        Node newNode = new Node(mdata);
        if (this.first == null) {
            this.first = newNode;

        } else {
            Node current = this.first;
            Node next = current.next;
            while (next != null) {
                current = next;
                next = next.next;
            }
            current.next = newNode;
        }
    }

    public T removedata(T mData) {
        Node current = this.first;
        Node next = current.next;
        Node prev = null;
        if (this.first == null) {
            return null;
        } else {
            while (current.mdata != mData || next != null) {
                prev = current;
                current = next;
                next = next.next;
            }
            prev.next = next;
            current.next = next;
            return current.mdata;
        }
    }

    public T removeLargest() {
        Node largest = this.first;
        Node current = this.first;
        Node next = current.next;
        while (next != null) {
            if (current.mdata.compareTo(next.mdata) > 0) {
                largest = current;
            } else {
                largest = next;
            }
        }


        return(this.removedata(largest.mdata));

    }

    public static void main(String[] args) {
        LinkedList<Integer> ls = new LinkedList<>();
        ls.add(20);
        ls.add(30);
        ls.add(40);
        System.out.println(ls.removeLargest());

    }
}


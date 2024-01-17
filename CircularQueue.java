public class CircularQueue {
    public static void main(String[] args) {
        QueueOfArrays<Integer> numbers = new QueueOfArrays<>(7);
        System.out.println(numbers.isEmpty());
        numbers.enQueue(1);
        numbers.enQueue(2);
        numbers.enQueue(3);
        numbers.enQueue(4);
        numbers.enQueue(5);
        numbers.deQueue();
        numbers.deQueue();
        numbers.deQueue();
        numbers.enQueue(6);
        numbers.enQueue(7);
        numbers.enQueue(8);
        numbers.deQueue();
        numbers.deQueue();
        numbers.deQueue();
        System.out.println(numbers.fornt());
        numbers.deQueue();
        System.out.println(numbers.fornt());
        numbers.deQueue();
        System.out.println(numbers.size());
        numbers.deQueue();






    }

}

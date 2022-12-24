package pr23;

public class Test {
    public static void main(String[] args) {
        int size = 7;
        ArrayQueueModule queue = new ArrayQueueModule<>(size);
        queue.clear();
        for(int i = 0; i < size; i++){
            queue.enQueue(i+1);
        }
        queue.display();
        queue.deQueue();
        System.out.println();
        System.out.println("First item: " + queue.firstElem());
        queue.deQueue();
        System.out.println();
        queue.display();
        System.out.println();
        queue.enQueue(25);
        System.out.println();
        queue.display();
        queue.clear();
        System.out.println();
        queue.display();

    }
}
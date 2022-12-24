package pr23;

public abstract class ArrayQueueADT<T> {

    protected int front;
    protected int rear;
    protected int size;
    protected T items[];
    ArrayQueueADT(Class<T> type, int size){
        this.rear = -1;
        this.front = -1;
        this.size = size;
        items = (T[]) java.lang.reflect.Array.newInstance(type, size);
    }
    boolean isFull(){
        if (front == 0 && rear == size - 1){
            return true;
        }

        else{
            return false;
        }
    }
    boolean isEmpty(){
        if (front == -1 && rear == -1){
            return true;
        }
        else{
            return false;
        }
    }
    void enQueue(T elem){
        if (isFull()){
            System.out.println("Queue is full!");
            return;
        }
        else {
            if (front == -1){
                front = 0;
            }

            rear++;
            items[rear] = elem;
        }
    }
    T firstElem(){
        if (isEmpty()){
            System.out.println("Queue is empty!");
            return null;
        }
        else{
            return items[front];
        }
    }
    T deQueue(){
        if(isEmpty()){
            System.out.println("Queue is empty!");
            return null;
        }
        T elem = firstElem();
        rear--;
        for (int i = front; i < size; i++){
            if(i <= rear){
                items[i] = items[i + 1];
            }
            else{
                items[i] = null;
            }
        }

        System.out.print("Deleted item: " + elem);
        return elem;
    }
    T[] clear(){
        if (isEmpty()){
            System.out.println("Queue is empty!");
            return items;
        }

        for (int i = front; i < rear + 1; i++){
            items[i] = null;
        }

        return items;
    }
    void display(){
        if (isEmpty()){
            System.out.println("Queue is empty!");
            return;
        }
        for(int i = front; i < size; i++){
            System.out.println(i+1 + ": " + items[i]);
        }
    }
}
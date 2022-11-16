public class Main {

    public static void main(String[] args) {
        MyDoublyLinkedList list = new MyDoublyLinkedList();

        list.add(2);
        list.add(1);
        list.add(4);
        list.add(9);
        list.add(7.5, 2);

        System.out.println(list.toString());
        System.out.println(sortAnyNumber(list).toString());
    }

    private static MyDoublyLinkedList sortInteger(MyDoublyLinkedList list) {
        int start = 0;

        for (int i = 0; i < list.size(); i++) {
            int index = 0;
            int min = Integer.MAX_VALUE;

            for (int j = start; j < list.size(); j++) {
                if ((int) list.get(j) < min) {
                    min = (int) list.get(j);
                    index = j;
                }
            }
            start++;

            list.remove(index);
            list.add(min, 0);
        }
        return list;
    }

    private static MyDoublyLinkedList sortAnyNumber(MyDoublyLinkedList list) {
        int start = 0;

        for (int i = 0; i < list.size(); i++) {
            int index = 0;
            double min = Double.MAX_VALUE;

            for (int j = start; j < list.size(); j++) {
                if (Double.parseDouble(String.valueOf(list.get(j))) < min) {
                    min = Double.parseDouble(String.valueOf(list.get(j)));
                    index = j;
                }
            }
            start++;

            list.remove(index);
            if (min == Math.floor(min) && !Double.isInfinite(min)) {
                list.add((long) min, 0);
            } else {
                list.add(min, 0);
            }

        }
        return list;
    }
}

class MyDoublyLinkedList {
    private Node head;
    private int listCount;

    public MyDoublyLinkedList() {
        head = new Node(null);
        listCount = 0;
    }

    public void add(Object data) {
        Node tmp = new Node(data);
        Node current = head;
        while (current.getNext() != null) {
            current = current.getNext();
        }
        current.setNext(tmp);
        tmp.setPrevious(current);
        listCount++;
    }

    public void add(Object data, int index) {
        Node tmp = new Node(data);
        Node current = head;
        for (int i = 0; i < index && current.getNext() != null; i++) {
            current = current.getNext();
        }
        tmp.setNext(current.getNext());
        tmp.setPrevious(current);
        current.getNext().setPrevious(tmp);
        current.setNext(tmp);


        listCount++;
    }

    public Object get(int index) {
        if (index < 0) {
            throw new IndexOutOfBoundsException("Index can't be less then 0");
//            return null;
        }
        Node current = head.getNext();
        for (int i = 0; i < index; i++) {
            if (current.getNext() == null) {
                throw new IndexOutOfBoundsException("Index: " + index + ", Size: " + listCount);
//                return null;
            }
            current = current.getNext();
        }
        return current.getData();
    }

    public boolean remove(int index) {
        if (index < 0 || index >= listCount) {
            throw new IndexOutOfBoundsException("Index: " + index + ", Size: " + listCount);
//            return false;
        }
        Node current = head;
        for (int i = 0; i < index; i++) {
            current = current.getNext();
        }
        if (current.getNext().getNext() != null) {
            current.getNext().getNext().setPrevious(current);
        }
        current.setNext(current.getNext().getNext());
        listCount--;
        return true;
    }

    public int size() {
        return listCount;
    }

    @Override
    public String toString() {
        Node current = head.getNext();
        StringBuilder output = new StringBuilder();
        while (current != null) {
            output.append("[").append(current.getData().toString()).append("]");
            current = current.getNext();
        }

        return output.toString();
    }
}

class Node {
    Object data;
    Node next;
    Node previous;

    public Node(Object data) {
        this.data = data;
        next = null;
        previous = null;
    }

    public Node(Object data, Node next, Node previous) {
        this.data = data;
        this.next = next;
        this.previous = previous;
    }

    public Object getData() {
        return data;
    }

    public void setData(Object data) {
        this.data = data;
    }

    public Node getNext() {
        return next;
    }

    public void setNext(Node next) {
        this.next = next;
    }

    public Node getPrevious() {
        return previous;
    }

    public void setPrevious(Node previous) {
        this.previous = previous;
    }

    @Override
    public String toString() {
        return "node data = " + data;
    }
}

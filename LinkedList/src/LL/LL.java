package LL;

public class LL {

    private Node head;
    private Node tail;
    private int size;

    public LL() {
    }

    public LL(int size) {
        this.size = size;
    }

    public void insertFirst(int value) {
        Node node = new Node(value);
        node.next = head;
        head = node;

        if (tail == null) {
            tail = head;
        }
        size += 1;
    }

    public void insertLast(int value) {
        if (tail == null) {
            insertFirst(value);
            return;
        }
        Node newNode = new Node(value);
        tail.next = newNode;
        tail = newNode;
        size++;
    }

    public void insertPosition(int value, int position) {
        if (position == 0) {
            insertFirst(value);
        } else if (position == size) {
            insertLast(value);
        } else {
            Node temp = head;
            for (int i = 1; i < position; i++) {
                temp = temp.next;
            }
            Node newNode = new Node(temp.next, value);
            temp.next = newNode;
        }
    }

    public void deleteFirst() {
        if (head == null) {
            System.out.println("List empty");
        } else if (head == tail) {
            System.out.println("Node deleted: " + head.value);
            head = null;
            tail = null;
            size--;
        } else {
            System.out.println("Node deleted: " + head.value);
            head = head.next;
            size--;
        }

    }

    public void deleteLast() {

    }

    public void deletePosition(int index){
        if(index == 0){
            System.out.println(head.value);
            head = null;
            size--;
        }
        if(index == size) {
            deleteLast();
        }
        Node prev = get(index-1);
        System.out.println("Node deleted: " + prev.next.value);
        prev.next = prev.next.next;
        size--;
    }

    public void displayList() {
        Node temp = head;
        while (temp != null) {
            System.out.print(temp.value + "->");
            temp = temp.next;
        }
        System.out.println("NULL");
    }

    public Node get(int index) {
        Node node = head;
        for (int i = 0; i < index; i++) {
            node = node.next;
        }
        return node;
    }

    private class Node {
        private Node next;
        private int value;

        public Node(int value) {
            this.value = value;
        }

        public Node(Node next, int value) {
            this.next = next;
            this.value = value;
        }
    }
}


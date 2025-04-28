package LL;

public class Main {
    public static void main(String[] args){
        LL list = new LL();
        list.insertFirst(4);
        list.insertFirst(23);
        list.insertFirst(78);
        list.insertLast(99);
//        list.insertPosition(15,2);
//        list.deleteFirst();
        list.displayList();
        list.deletePosition(3);
    }
}

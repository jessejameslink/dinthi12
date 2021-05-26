package b10_DanhSach.LinkedList;

import com.sun.org.apache.bcel.internal.generic.ARETURN;
public class MyLinkedList<E> {
    private Node head = null;
    public void setNumNodes(int numNodes) {
        this.numNodes = numNodes;
    }
    public int getNumNodes() {
        return numNodes;
    }
    private int numNodes;
    public MyLinkedList() {
    }
    public int size() {
        return numNodes;
    }
    public E get(int i) {
        Node temp = head;
        for (int j = 0; j < i; j++) {
            temp = temp.next;
        }
        return (E) temp.getData();
    }
    public void addFirst(E e) {
        Node temp = new Node(e);
        temp.next = head;
        head = temp;
        numNodes++;
    }
    public void addLast(E e) {
        if (head == null) {
            addFirst(e);
        } else {
            Node temp = head;
            while (temp.next != null) {
                temp = temp.next;
            }
            temp.next = new Node(e);
            numNodes++;
        }
    }
    public void add(int index, E element) {
        if (index == 0) {
            addFirst(element);
        } else if (index >= size()) {
            addLast(element);
        } else {
            Node temp = head;
            for (int i = 1; i < index - 1; i++) {
                temp = temp.next;
            }
            Node hoder = temp.next;
            temp.next = new Node(element);
            temp.next.next = hoder;
            numNodes++;
        }
    }
    public void remove(int index) {
        Node temp = head;
        for (int i = 0; i < index - 1; i++) {
            temp = temp.next;
        }
        temp.next = temp.next.next;
        numNodes--;
    }
    public void remove(E e) {
        for (int i = 0; i < numNodes; i++) {
            if (contains(e)) {
                remove(i);
            }
        }
    }
    public boolean contains(E e) {
        Node temp = head;
        for (int i = 0; i < numNodes; i++) {
            if (temp.getData() == e) {
                return true;
            }
            temp = temp.next;
        }
        return false;
    }
    public int indexOf(E o) {
        for (int i = 0; i < numNodes; i++) {
            if (contains(o)) {
                return i;
            }
        }
        return -1;
    }
    public E clone() {
        MyLinkedList<E> eMyLinkedList = new MyLinkedList<>();
        Node tamp = head;
        for (int i = 0; i < numNodes; i++) {
            eMyLinkedList.addLast((E) tamp.getData());
        }
        return (E) eMyLinkedList;
    }
    public void clear() {
        head = null;
        numNodes = 0;
    }
    public E getFirst() {
        return (E) head.getData();
    }
    public E getLast() {
        Node temp = head;
        for (int i = 0; i < numNodes - 1; i++) {
            temp = temp.next;
        }
        return (E) temp.next.getData();
    }
}




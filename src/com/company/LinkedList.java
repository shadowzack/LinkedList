package com.company;

public class LinkedList implements Set {
    Node head;

    public LinkedList() {
        head = new Node();
        head.next = null;
    }

    @Override
    public boolean add(int x) {
        Node tmp = new Node();
        tmp.data = x;
        if (head.next == null) {
            head.next = tmp;
            tmp.next = null;
            return true;
        }
        Node index = head;
        while (index.next != null) {
            if (index.next.data > x) {
                tmp.next = index.next;
                index.next = tmp;
                return true;
            } else if (index.next.data == x) {
                return false;
            } else {
                index = index.next;
            }

        }
        index.next = tmp;
        tmp.next = null;
        return true;

    }

    @Override
    public boolean remove(int x) {

        if (head.next == null) {
            return false;
        }
        Node index = head;
        while (index.next != null) {
            if (index.next.data == x) {
                if (index.next.next != null) {
                    index.next = index.next.next;
                } else {
                    index.next = null;
                }
                return true;
            }
            index = index.next;
        }
        return false;
    }

    @Override
    public boolean contains(int x) {
        if (head.next == null) {
            return false;
        }
        Node index = head;
        while (index.next != null) {
            if (index.next.data == x)
                return true;
            index = index.next;
        }
        return false;
    }

    public void print() {
        if (head.next != null) {
            Node index = head;
            while (index.next != null) {
                System.out.println(index.next.data + "  ");
                index = index.next;
            }
        }
    }
}

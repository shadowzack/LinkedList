package com.company;

import javax.swing.text.html.HTML;

public class Main {

    public static void main(String[] args) {

        String tag = "does the list contain ";
        LinkedList linkedList = new LinkedList();
        linkedList.add(4);
        linkedList.add(5);
        linkedList.add(3);
        linkedList.add(3);
        linkedList.add(5);
        linkedList.add(1);
        linkedList.add(2);
        linkedList.add(7);
        linkedList.remove(7);
        linkedList.remove(1);
        linkedList.add(8);
        linkedList.print();
        System.out.println(tag + "7  " + linkedList.contains(7));
        System.out.println(tag + "5  " + linkedList.contains(5));
        System.out.println(tag + "2  " + linkedList.contains(2));

    }
}

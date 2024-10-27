package org.manara.dsa.linkedlist;

public class Node {
    int data;
    Node prev;
    Node next;

    public Node(int data){
        this.data = data;
        prev = next = null;
    }
}

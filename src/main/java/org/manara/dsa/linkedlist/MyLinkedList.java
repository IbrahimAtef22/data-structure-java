package org.manara.dsa.linkedlist;

public class MyLinkedList {
    Node head, tail;

    public MyLinkedList(){
        head = tail = null;
    }

    public void addNode(int data){
        Node newNode = new Node(data);
        if(head == null){
            head = newNode;
            tail = newNode;
        }else {
            newNode.prev = tail;
            tail.next = newNode;
            tail = newNode;
        }
    }

    public void display(){
        Node current = head;
        while(current != null){
            System.out.print(current.data + " ");
            current = current.next;
        }
    }
}

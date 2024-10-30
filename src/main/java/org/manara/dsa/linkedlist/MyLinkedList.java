package org.manara.dsa.linkedlist;

public class MyLinkedList {
    Node head, tail;

    public MyLinkedList(){
        head = tail = null;
    }

    // add new node to LinkedList
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

    // display elements in LinkedList
    public void display(){
        Node current = head;
        while(current != null){
            System.out.print(current.data + " ");
            current = current.next;
        }
    }

    // find node in LinkedList by using data
    public Node getNodeByData(int data){
        Node current = head;
        while(current != null){
            if(data == current.data)
                return current;
            current = current.next;
        }
        return null;
    }

    // remove node in LinkedList by data
    public void remove(int data){
        Node node = getNodeByData(data);
        if(node == null) {
            System.out.println("Node doesn't exist");
        }else{
            // when node is a head
            if(node == head){
                // there is one node only
                if(node == tail){
                    head = tail = null;
                }else{  // there are other nodes after head
                    head = head.next;
                    head.prev = null;
                }
                // when node is a tail
            }else if(node == tail){
                tail = tail.prev;
                tail.next = null;
            }else{   // when node in the middle
                node.prev.next = node.next;
                node.next.prev = node.prev;
            }
            node = null;
        }
    }

    /**
     *
     * @param data : new data to insert
     * @param afterData : data which new data will insert after it
     */
    public void insertAfter(int data, int afterData){
        Node node = getNodeByData(afterData);
        Node newNode = new Node(data);
        if(node == null) {
            System.out.println("There is no Node like that in the LinkedList !!");
        }else{
            // when node is a head
            if(node == head){
                // there is one node only
                if(node == tail){
                    node.next = newNode;
                    newNode.prev = node;
                    tail = newNode;
                    tail.next = null;
                }else{  // there are other nodes after head
                    node.next.prev = newNode;
                    newNode.next = node.next;
                    node.next = newNode;
                    newNode.prev = node;
                }
                // when node is a tail
            }else if(node == tail){
                node.next = newNode;
                newNode.prev = node;
                tail = newNode;
                tail.next = null;
            }else{   // when node in the middle
                node.next.prev = newNode;
                newNode.next = node.next;
                node.next = newNode;
                newNode.prev = node;
            }
        }
    }

    /**
     * There is no index in LinkedList as their nodes are not sequential ,but we assume that logically
     * @param index : index of node in LinkedList
     * @return the data of node
     */
    public int getDataByIndex(int index){
        Node current = head;
        int currentIndex = 0;
        while(current != null){
            if(index == currentIndex)
                return current.data;
            current = current.next;
            currentIndex++;
        }
        return -1;
    }



}

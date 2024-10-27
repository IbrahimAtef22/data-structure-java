package org.manara.dsa;

import org.manara.dsa.array.MyArray;
import org.manara.dsa.linkedlist.MyLinkedList;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // Array Data Structure Operations
//        System.out.println("====Array Data Structure Program====");

        // -------------add new elements to array---------------
//        System.out.println("Enter Array Size:");
//        int arrSize = input.nextInt();
//        MyArray myArray = new MyArray(arrSize);
//        myArray.add();
//        myArray.display();
//        System.out.println("\nArray Size = " + myArray.getSize() + ", Array Length = " + myArray.getLength());

        // ----------search about an item in array----------
//        System.out.println("\nEnter an Item to search in array:");
//        int item = input.nextInt();
//        int index = myArray.search(item);
//        if(index != -1){
//            System.out.println("Item Found at index : " + index);
//        }else{
//            System.out.println("Item Not Found !!");
//        }

          // ----------add new item to array------------
//        System.out.println("Enter a new item to add to the array:");
//        int newItem = input.nextInt();
//        myArray.append(newItem);
//        myArray.display();

          // ------------add new item at specific index in array--------------
//        System.out.println("\nEnter index and item to add in array:");
//        System.out.println("Enter index:");
//        index = input.nextInt();
//        System.out.println("Enter item:");
//        newItem = input.nextInt();
//
//        myArray.insert(index, newItem);
//        myArray.display();

          // delete an item in array
//        System.out.println("Enter an index of item to delete:");
//        index = input.nextInt();
//        myArray.delete(index);
//        myArray.display();

        // raise the size of the array
//        System.out.println("Enter a new size:");
//        int newSize = input.nextInt();
//        myArray.enlarge(newSize);
//        System.out.println("Array Size = " + myArray.getSize() + ", Array Length = " + myArray.getLength());
//        myArray.display();

        // LinkedList Data Structure Operations
        System.out.println("=====LinkedList Data Structure Program======");
        MyLinkedList myLinkedList = new MyLinkedList();
        System.out.println("----Add Nodes Operation----");
        System.out.println("How many nodes do you want to add ?");
        int nodesNo = input.nextInt();
        int i = 0;
        int data;
        System.out.println("---Add Nodes---");
        while(i < nodesNo){
            System.out.println("Node " + (i + 1));
            data = input.nextInt();
            myLinkedList.addNode(data);
            i++;
        }
        System.out.println("Display LinkedList: ");
        myLinkedList.display();

    }
}
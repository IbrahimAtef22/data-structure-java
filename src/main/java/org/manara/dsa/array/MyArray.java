package org.manara.dsa.array;

import java.util.Arrays;
import java.util.Scanner;

public class MyArray {
    private int size;     // total capacity of array
    private int length;   // total elements in array
    private int[] arr;    // reference of array

    public MyArray(int arrSize){
        this.length = 0;
        this.size = arrSize;
        this.arr = new int[arrSize];
    }

    public int getSize(){
        return size;
    }

    public int getLength(){
        return length;
    }

    // add new elements to array
    public void add(){
        System.out.println("How many elements you want to fill in array ?");
        Scanner input = new Scanner(System.in);
        int elements;

        // re prompt the user if elements larger than size
        do{
            elements = input.nextInt();
            if(elements > size){
                System.out.println("Elements should be equal to or smaller than size, please enter a suitable integer:");
            }
        }while (elements > size);

        System.out.println("Enter your elements:");
        for(int i = 0; i < elements; i++) {
            System.out.println("Element " + (i + 1));
            arr[i] = input.nextInt();
            length++;
        }
    }

    // display array elements
    public void display(){
        System.out.println("Display array elements: ");
        for (int i = 0; i < length; i++){
            System.out.print(arr[i] + " ");
        }
    }

    // search about an item in array
    public int search(int key){
        int index = -1;
        for(int i = 0; i < length; i++){
            if(arr[i] == key){
                index = i;
                break;
            }
        }
        return index;
    }

    // add new item to array
    public void append(int newItem){
        if(length < size){
            arr[length] = newItem;
            length++;
        }else {
            System.out.println("Array is Full!!");
        }
    }

    // add new item at specific index in array
    public void insert(int index, int newItem){
        if(length < size) {
            if (index >= 0 && index < size) {
                for (int i = length; i > index; i--) {
                    arr[i] = arr[i - 1];
                }
                arr[index] = newItem;
                length++;
            } else {
                System.out.println("ERROR: Index out of bounds !!");
            }
        }else{
            System.out.println("There is no space in array !!");
        }
    }

    // delete an item in array
    public void delete(int index){
        if (index >= 0 && index < size) {
            for (int i = index; i < length-1; i++) {
                arr[i] = arr[i + 1];
            }
            length--;
        } else {
            System.out.println("ERROR: Index out of bounds !!");
        }
    }

    // raise the size of the array
    public void enlarge(int newSize){
        int[] old = null;
        if(newSize <= size){
            System.out.println("new size must be larger than old size");
        }else {
            size = newSize;
            old = arr;
            arr = new int[newSize];
            for (int i = 0; i < length; i++){
                arr[i] = old[i];
            }
        }
        old = null;
    }





}

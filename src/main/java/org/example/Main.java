package org.example;

import org.example.immutable.ImmutableList;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println("Input the number of Array should input by user !!!");
        Scanner input=new Scanner(System.in);
        int numberOfArrays=input.nextInt();
        int arrays[]=new int[numberOfArrays];
        for(int initial=0;initial<numberOfArrays; initial++){
            System.out.println("Input element/value to index "+initial);
            arrays[initial]=input.nextInt();
        }
        ImmutableList immutableList=new ImmutableList(arrays);
        System.out.println("Intial value of ImmutableList >>> "+ immutableList);

        ImmutableList newList=immutableList.add(4);
        System.out.println("After add the value into the list >>> "+newList);

        ImmutableList deleteList=newList.delete(1);
        System.out.println("After delete element form index 1 >>> "+deleteList);

        System.out.println("Element at spesific index >>> "+deleteList.get(1));
    }
}
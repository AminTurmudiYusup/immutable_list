package org.example.immutable;

import java.util.Arrays;

public class ImmutableList {
    private final  int[] arrays;

    //initialize array
    public ImmutableList(int[] arrays) {
        this.arrays = Arrays.copyOf(arrays, arrays.length);
    }

    //create add function
    public ImmutableList add(int element) {
        int[] newArray = Arrays.copyOf(arrays, arrays.length + 1); //copy arrays and his length
        newArray[arrays.length] = element; //add new value to the last index
        return new ImmutableList(newArray);
    }

    //create delete function
    public ImmutableList delete(int index) {
        if (index < 0 || index >= arrays.length) { //check if index which input by user valid
            throw new IndexOutOfBoundsException("Index out of bounds");
        }
        int[] newArray = new int[arrays.length - 1]; // Reduce size by 1
        for (int i = 0, j = 0; i < arrays.length; i++) {
            if (i != index) {
                newArray[j++] = arrays[i]; // Copy all elements except the one to delete
            }
        }
        return new ImmutableList(newArray); // Return new ImmutableList
    }


    //create method to get value from arrays
    public int get(int index) {
        if (index < 0 || index >= arrays.length) {//check if index which input by user valid
            throw new IndexOutOfBoundsException("Index out of bounds");
        }
        return arrays[index];
    }

    @Override
    public String toString() {
        return Arrays.toString(arrays);
    }

}

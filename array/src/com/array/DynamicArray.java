package com.array;

import java.util.Arrays;
/*
The dynamic array is a variable size list data structure.
It grows automatically when we try to insert an element if there is no more space left for the new element.
It allows us to add and remove elements.
It allocates memory at run time using the heap. It can change its size during run time.[JavaPoint]
 */

public class DynamicArray<T> {

    Object[] data;
    int size;

    public DynamicArray() {
        size = 0;
        data = new Object[1];
    }
    // to get the current size
    public int getSize(){
        return data.length;
    }

    public T get(int index){
        return (T) data[index];
    }

    public void put(Object element){
        ensureCapacity(size+1);
        data[size ++] = element;
    }
    //increase the capacity, if necessary.
    public void ensureCapacity(int minCapacity){
        int oldCapacity = getSize();
        if (minCapacity > oldCapacity){
            int newCapacity = oldCapacity * 2;
            if (newCapacity < minCapacity)
                newCapacity = minCapacity;

            data = Arrays.copyOf(data, newCapacity);
        }

    }
}

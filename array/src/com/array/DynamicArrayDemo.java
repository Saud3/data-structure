package com.array;


public class DynamicArrayDemo {
    public static void main(String[] args) {

        DynamicArray<Integer> dynamicArray = new DynamicArray<Integer>();
        // adding elements
        dynamicArray.put(11);
        System.out.println("Size :" + dynamicArray.getSize());

        dynamicArray.put(12);
        System.out.println("Size :" + dynamicArray.getSize());

		dynamicArray.put(15);
		System.out.println("Size :" + dynamicArray.getSize());
		dynamicArray.put(10);
		System.out.println("Size :" + dynamicArray.getSize());
        dynamicArray.put(22);
        System.out.println("Size :" + dynamicArray.getSize());

    }
}

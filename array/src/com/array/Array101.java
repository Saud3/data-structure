package com.array;

public class Array101 {
    public static void main(String[] args){
        int numbers[] = new int[5];
        numbers[0] = 1;
        numbers[1] = 2;
        numbers[2] = 3;
        numbers[3] = 10;
        numbers[4] = 4;


        for(int i = 0; i<numbers.length; i++)
            System.out.println(numbers[i]);

        Student[] std = new Student[3];
        std[0] = new Student("Mo",20);
        std[1] = new Student("Sarah",20);
        std[2] = new Student("Ahmed",20);
        for(Student studen : std){
            System.out.println("name:" + studen.name + "Age:" + studen.age);

        }

    }


}



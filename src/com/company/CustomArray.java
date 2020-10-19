package com.company;

import java.util.Arrays;

//*******************************PUBLIC FUNCTION*******************************//
/*
    public int getLength()          - кол-во элементов
    public void push(int tmp)       - добавить элемент в конец
    public void print()             - вывести весь массив
    public void print(int index)    - вывести элемент с номером i (отсчёт с 1)
    public void remove(int index)   - удвлить элемент с номером i (отсчёт с 1)
 */

public class CustomArray {

    private int[] arr;
    private int length;
    private int lastId;

    CustomArray(){
        arr = new int[10];
        length = 10;
        lastId = 0;
    }

    public int getLength() {
        return lastId;
    }

    public void push(int tmp) {
        if (lastId == length) {
            length += 10;
            arr = Arrays.copyOf(arr, length);
        }
        arr[lastId] = tmp;
        lastId++;
    }

    public void print() {
        for (int i = 0; i < lastId; i++)
            System.out.print(arr[i] + " ");
        System.out.println();
    }

    public void print(int index) {
        if (index > 0 && index <= lastId)
            System.out.println(arr[index - 1]);
        else
            System.out.println("Incorrect element id");
    }

    public void remove(int index) {
        if (index > 0 && index <= lastId) {
            int[] temporary = new int[length];
            int j = 0;
            for (int i = 0; i < lastId; i++) {
                if (i != index - 1)
                    temporary[j++] = arr[i];
            }
            arr = temporary;
            lastId--;
        }
        else
            System.out.println("Incorrect element id");
    }
}

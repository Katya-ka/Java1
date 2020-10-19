package com.company;

public class Main {
    public static void main(String[] args) {
        CustomArray a = new CustomArray();
        for (int i = 0; i < 15; i++)
            a.push(i);
        a.print();
        a.remove(3);
        for (int i = 1; i <= a.getLength(); i++)
            a.print(i);
    }
}

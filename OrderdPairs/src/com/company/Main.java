package com.company;

import java.util.ArrayList;

public class Main {
    public static void pairEditor(ArrayList<Integer> arrayList) {
        for (int i = 1; i < arrayList.size(); i += 2) {
            while (i < arrayList.size() && arrayList.get(i - 1) > arrayList.get(i)) {
                arrayList.remove(i - 1);
                arrayList.remove(i - 1);
            }
        }
        if (arrayList.size() % 2 != 0) {
            arrayList.remove(arrayList.size() - 1);
        }
    }

    public static void main(String[] args) {
        // write your code here
        ArrayList<Integer> arrayList = new ArrayList<>();
        arrayList.add(3);
        arrayList.add(7);
        arrayList.add(9);
        arrayList.add(2);
        arrayList.add(5);
        arrayList.add(5);
        arrayList.add(8);
        arrayList.add(5);
        arrayList.add(6);
        arrayList.add(3);
        arrayList.add(4);
        arrayList.add(7);
        arrayList.add(3);
        arrayList.add(1);

        pairEditor(arrayList);
        System.out.print(arrayList);
    }
}

package org.example.hw2;

import java.util.Arrays;

public class TestCustomArrayList {
    public static void main(String[] args) {
        CustomArrayList<Integer> customArrayList = new CustomArrayList<>();
        customArrayList.addAll(Arrays.asList(3, 9, 8, 5, 2, 4, 7));

        System.out.println("Before sorting: ");
        printList(customArrayList);

        customArrayList.sort(Integer::compareTo);

        System.out.println("\nAfter sorting: ");
        printList(customArrayList);

        customArrayList.remove(2);

        System.out.println("\nAfter removing index (2): ");
        printList(customArrayList);

        customArrayList.clear();
        System.out.println("\nIs the list empty?\n" + customArrayList.isEmpty());
    }

    private static void printList(CustomArrayList<?> list) {
        for (int i = 0; i < list.size(); i++) {
            System.out.print(list.get(i) + " ");
        }
    }
}


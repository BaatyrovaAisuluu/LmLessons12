package com.company;

import java.util.Arrays;

public class Main {

    public static void main(String[] args) {
        int[] massiv = {1, 2, 3, 4, 5, 6, 7, 8, 9};
        Arrays.sort(massiv);
        Class student = new Class(3, "java-4", massiv);
        System.out.println(student.number + " \n " + student.words);
        for (int q : massiv) {
            System.out.print(q + " ");
        }
    }
}

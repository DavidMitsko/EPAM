package com.mitjko.dynamic_data_structure.Tree;

import java.util.Random;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        Tree head = null;
        int kol = 5;
        for (int i = 0; i < kol; i++) {
            head = Tree.add(head, scan.nextInt());
        }
        head.output();
        System.out.println();
        head.output2(0);
    }
}

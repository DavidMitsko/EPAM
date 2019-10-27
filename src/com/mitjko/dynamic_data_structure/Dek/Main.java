package com.mitjko.dynamic_data_structure.Dek;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Dek left_end = null, right_end = null;
        Scanner scan = new Scanner(System.in);
        for (int i = 0; i < 6; i++) {
            if(i % 2 == 0){
                right_end = Dek.add_right(left_end, right_end, scan.nextInt());
                if(left_end == null){
                    left_end = right_end;
                }
            }
            else{
                left_end = Dek.add_left(left_end, right_end, scan.nextInt());
            }
            //head = Tree.add(head, scan.nextInt());
        }
        left_end.pop();
    }
}

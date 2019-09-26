/*
Дан одномерный массив A[N]. Найти:
max( a2, a4, ..., a2k) min( a1, a3, ..., a2k+1)
 */
package com.mitjko.array;

import java.util.Random;
import java.util.Scanner;

public class Task14 {
    private int n;
    private int array[];

    public Task14(Scanner scan, Random rand)
    {
        n = scan.nextInt();
        array = new int[n];
        for(int i = 0; i < n; i++)
        {
            array[i] = rand.nextInt(25);
            System.out.println(array[i]);
        }
    }

    public void find()
    {
        int sum = 0;
        int max = array[0];
        int min = array[0];
        for(int i = 1; i < n; i++)
        {
            if(i % 2 == 0)
            {
                if(array[i] > max)
                    max = array[i];
            }
            else
            {
                if(array[i] < min)
                    min = array[i];
            }
        }
        sum = max + min;
        System.out.println("Sum = " + sum);
    }
}

/*
Дан целочисленный массив с количеством элементов п. Сжать массив, выбросив из него каждый второй
элемент (освободившиеся элементы заполнить нулями).
 */
package com.mitjko.array;

import java.util.Random;
import java.util.Scanner;

public class Task20 {
    private int array[];
    private int n;

    public Task20(Scanner scan, Random rand)
    {
        n = scan.nextInt();
        array = new int[n];
        for(int i = 0; i < n; i++)
        {
            array[i] = rand.nextInt(25);
            System.out.print(array[i] + " ");
        }
    }

    public void delete()
    {
        int number = n;
        for(int i = 0; i < number; i++)
        {
            if(i % 2 != 0)
            {
                array[i] = 0;
            }
        }
        for(int i = 0; i < number; i++)
        {
            if(array[i] == 0)
            {
                for(int j = i; j < number - 1; j++)
                {
                    array[j] = array[j+1];
                }
                array[number - 1] = 0;
                number--;
            }
        }
        System.out.println();
        for(int i = 0; i < n; i++)
        {
            System.out.print(array[i] + " ");
        }
    }
}

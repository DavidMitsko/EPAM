package com.mitjko.matrix;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class Task13 {
    private int n;
    private int matrix[][];

    public Task13(Scanner scan, Random rand)
    {
        n = scan.nextInt();
        matrix = new int[n][n];
    }

    public void create()
    {
        for(int i = 0; i < n; i++)
        {
            if (i % 2 != 0)
                createDescending(i);
            else
                createAscending(i);
        }
    }

    public void createDescending(int i)
    {
        int number = n;
        for(int j = 0; j < n; j++)
        {
            matrix[i][j] = number--;
        }
    }

    public void createAscending(int i)
    {
        int number = 1;
        for(int j = 0; j < n; j++)
        {
            matrix[i][j] = number++;
        }
    }

    public void show()
    {
        for(int i = 0; i < n; i++)
        {
           /* for(int j = 0; j < n; j++)
            {
                System.out.print(matrix[i][j] + " ");
            }*/

            System.out.println(Arrays.toString(matrix[i]));
        }
    }
}

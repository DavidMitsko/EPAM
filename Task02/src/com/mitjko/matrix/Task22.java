/*
Сформировать квадратную матрицу порядка n по заданному образцу(n - четное):
 */
package com.mitjko.matrix;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class Task22 {
    private int n;
    private int matrix[][];

    public Task22(Scanner scan, Random rand)
    {
        n = scan.nextInt();
        matrix = new int[n][n];

    }

    public void initialization()
    {
        int k = 1, j = 0, t = 1;
        for(int i = 0; i < n; i++)
        {
            for (j = 0, k = t; j < n && k <= n; j++, k++)
            {
                matrix[i][j] = k;
            }
            t++;
        }
    }

    public void show()
    {
        for(int i = 0; i < n; i++)
            System.out.println(Arrays.toString(matrix[i]));
    }
}

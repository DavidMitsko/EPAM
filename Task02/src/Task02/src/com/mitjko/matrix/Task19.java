/*
Сформировать квадратную матрицу порядка n по заданному образцу(n - четное):
 */
package com.mitjko.matrix;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class Task19 {
    private int n;
    private int matrix[][];

    public Task19(Scanner scan, Random rand)
    {
        n = scan.nextInt();
        matrix = new int[n][n];
        for(int i = 0; i < n; i++)
            for(int j = 0; j < n; j++)
                matrix[i][j] = 0;
    }

    public void initialization()
    {
        int kol = 0;
        int j = 0;
        boolean flag = false;
        for(int i = 0; i < n; i++)
        {
            for(j = kol; j < n - kol; j++)
            {
                matrix[i][j] = 1;
            }
            if(kol == (n / 2) - 1 && !flag)
            {
                flag = true;
                continue;
            }
            if(!flag)
                kol++;
            else
                kol--;
        }
    }

    public void show()
    {
        for(int i = 0; i < n; i++)
            System.out.println(Arrays.toString(matrix[i]));
    }

}

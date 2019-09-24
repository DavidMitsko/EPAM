/*
Дана матрица размера m x n. Вывести ее элементы в следующем порядке: первая строка справа
налево, вторая строка слева направо, третья строка справа налево и так далее.
 */
package com.mitjko.matrix;

import java.util.Random;
import java.util.Scanner;

public class Task11 {
    private int n;
    private int m;
    private int matrix[][];

    public Task11(Scanner scan, Random rand)
    {
        n = scan.nextInt();
        m = scan.nextInt();
        matrix = new int[m][n];
        for(int i = 0; i < m; i++)
        {
            for (int j = 0; j < n; j++)
            {
                matrix[i][j] = rand.nextInt(25);
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println();
        }
    }

    public void show()
    {
        for(int i = 0; i < m; i++)
        {
            if(i % 2 != 0)
                showFromLeftToRight(i);
            else
                showFromRightToLeft(i);
            System.out.println();
        }
    }

    public void showFromLeftToRight(int i)
    {
        for(int j = 0; j < n; j++)
            System.out.print(matrix[i][j] + " ");
    }

    public void showFromRightToLeft(int i)
    {
        for(int j = n - 1; j >= 0; j--)
            System.out.print(matrix[i][j] + " ");
    }
}

/*
Операция сглаживания матрицы дает новую матрицу того же размера, каждый элемент которой
получается как среднее арифметическое соседей соответствующего элемента исходной матрицы.
Построить результат сглаживания заданной матрицы
 */
package com.mitjko.matrix;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class Task36 {
    private int m;
    private int n;
    private int matrix[][];
    private int newMatrix[][];

    public Task36(Scanner scan, Random rand)
    {
        n = scan.nextInt();
        m = scan.nextInt();
        matrix = new int[m][n];
        newMatrix = new int [m][n];
        for(int i = 0; i < m; i++)
        {
            for (int j = 0; j < n; j++)
                matrix[i][j] = rand.nextInt(25);
        }
    }

    public void smoothing()
    {
        for(int i = 0; i < m; i++)
        {
            for(int j = 0; j < n; j++)
            {
                if(i == 0 && j == 0)
                {
                    newMatrix[0][0] = (matrix[i + 1][j + 1] + matrix[i][j + 1] + matrix[i + 1][j]) / 3;
                    continue;
                }
                if(i == (m - 1) && j == (n - 1))
                {
                    newMatrix[i][j] = (matrix[i - 1][j - 1] + matrix[i][j - 1] + matrix[i - 1][j]) / 3;
                    continue;
                }
                if(i == 0 && j == (n - 1))
                {
                    newMatrix[i][j] = (matrix[i][j - 1] + matrix[i + 1][j - 1] + matrix[i + 1][j]) / 3;
                    continue;
                }
                if(i == (m - 1) && j == 0)
                {
                    newMatrix[i][j] = (matrix[i - 1][j] + matrix[i - 1][j + 1] + matrix[i][j + 1]) / 3;
                    continue;
                }
                if((j - 1) < 0)
                {
                    newMatrix[i][j] = (matrix[i + 1][j + 1] + matrix[i][j + 1] + matrix[i + 1][j] +
                            matrix[i - 1][j] + matrix[i - 1][j + 1]) / 5;
                    continue;
                }
                if((i - 1) < 0)
                {
                    newMatrix[i][j] = (matrix[i + 1][j + 1] + matrix[i][j + 1] + matrix[i + 1][j] +
                            matrix[i][j - 1] + matrix[i + 1][j - 1]) / 5;
                    continue;
                }
                if(i + 1 >= m)
                {
                    newMatrix[i][j] = (matrix[i][j - 1] + matrix[i - 1][j - 1] + matrix[i - 1][j] +
                            matrix[i - 1][j + 1] + matrix[i][j + 1]) / 5;
                    continue;
                }
                if(j + 1 >= n)
                {
                    newMatrix[i][j] = (matrix[i - 1][j] + matrix[i - 1][j - 1] + matrix[i][j - 1] + matrix[i + 1][j - 1] +
                            matrix[i + 1][j]) / 5;
                    continue;
                }
                newMatrix[i][j] = (matrix[i - 1][j - 1] + matrix[i - 1][j] + matrix[i - 1][j + 1] + matrix[i][j + 1] +
                        matrix[i][j - 1] + matrix[i + 1][j - 1] + matrix[i + 1][j + 1] + matrix[i + 1][j]) / 8;
            }
        }
    }

    public void showNewMatrix()
    {
        for(int i = 0; i < m; i++)
            System.out.println(Arrays.toString(newMatrix[i]));
    }

    public void showMatrix()
    {
        for(int i = 0; i < m; i++)
            System.out.println(Arrays.toString(matrix[i]));
    }
}

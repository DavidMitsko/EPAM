/*
Сформировать случайную матрицу m x n, состоящую из нулей и единиц, причем в каждом столбце
число единиц равно номеру столбца.
 */
package com.mitjko.matrix;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class Task34 {
    private int m;
    private int n;
    private int matrix[][];

    public Task34(Scanner scan, Random rand)
    {
        n = scan.nextInt();
        m = scan.nextInt();
        matrix = new int[m][n];
        for(int i = 0; i < n; i++)
        {
            int j = 0;
            while(j < i)
            {
                int randNum = rand.nextInt(m - 1);
                if(matrix[randNum][i] == 0)
                {
                    matrix[randNum][i] = 1;
                    j++;
                }
            }
        }
    }

    public void show()
    {
        for(int i = 0; i < m; i++)
            System.out.println(Arrays.toString(matrix[i]));
    }
}

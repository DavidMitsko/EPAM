/*
Найдите сумму двух матриц
 */
package com.mitjko.matrix;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class Task38 {
    private int n;
    private int firstMatrix[][];
    private int secondMatrix[][];
    private int thirdMatrix[][];

    public Task38(Scanner scan, Random rand)
    {
        n = scan.nextInt();
        firstMatrix = new int[n][n];
        secondMatrix = new int [n][n];
        thirdMatrix = new int [n][n];
        for(int i = 0; i < n; i++)
        {
            for (int j = 0; j < n; j++)
            {
                firstMatrix[i][j] = rand.nextInt(25);
                secondMatrix[i][j] = rand.nextInt(25);
            }
        }
    }

    public void calculate()
    {
        for(int i = 0; i < n; i++)
        {
            for(int j = 0; j < n; j++)
            {
                thirdMatrix[i][j] = firstMatrix[i][j] + secondMatrix[i][j];
            }
        }
    }

    public void showFirstMatrix()
    {
        for(int i = 0; i < n; i++)
            System.out.println(Arrays.toString(firstMatrix[i]));
    }

    public void showSecondMatrix()
    {
        for(int i = 0; i < n; i++)
            System.out.println(Arrays.toString(secondMatrix[i]));
    }

    public void showThirdMatrix()
    {
        for(int i = 0; i < n; i++)
            System.out.println(Arrays.toString(thirdMatrix[i]));
    }
}

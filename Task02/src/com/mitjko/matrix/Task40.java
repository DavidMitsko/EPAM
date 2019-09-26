/*
Магическим квадратом порядка n называется квадратная матрица размера nxn, составленная из
чисел 1, 2, 3, ..., 2 n так, что суммы по каждому столбцу, каждой строке и каждой из двух больших
диагоналей равны между собой. Построить такой квадрат.
 */
package com.mitjko.matrix;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class Task40 {
    private int arr[] = {1, 2, 3, 4, 5, 6, 7, 8, 9};
    private int matrix[][];

    public Task40()
    {
        matrix = new int[3][3];
    }

    public void swap(int[] arr, int i, int j)
    {
        int tmp = arr[i];
        arr[i] = arr[j];
        arr[j] = tmp;
    }

    public void permute(int i)
    {
        if (i == arr.length)
        {
            inMatrix();
            if(check()) {
                show();
                System.out.println();
            }
            return;
        }
        for (int j = i; j < arr.length; j++)
        {
            swap(arr, i, j);
            permute(i + 1);
            swap(arr, i, j);

        }
    }

    public void show() {
        for(int i = 0; i < 3; i++)
        {
         System.out.println(Arrays.toString(matrix[i]));
        }
    }

    public void inMatrix()
    {
        int i = 0, j= 0, k = 0, t= 0;
        for(i = 0; i < 3; i++)
        {
            for(j = 0, k = t; j < 3; j++, k++)
            {
                matrix[i][j] = arr[k];
            }
            t += 3;
        }
    }

    public int sumRow(int i)
    {
        int sum = 0;
        for(int j = 0; j < 3; j++)
            sum += matrix[i][j];
        return sum;
    }

    public int sumCol(int j)
    {
        int sum = 0;
        for(int i = 0; i < 3; i++)
            sum += matrix[i][j];
        return sum;
    }

    public int sumDiagonal(int k)
    {
        if(k == 0)
            return matrix[0][0] + matrix[1][1] + matrix[2][2];
        if(k == 1)
            return matrix[0][2] + matrix[1][1] + matrix[2][0];
        return -1;
    }

    public boolean check()
    {
        boolean mas[];
        mas = new boolean[3];
        ArrayList array = new ArrayList();
        for(int i = 0; i < 3; i++)
        {
            array.add(sumCol(i));
            array.add((sumRow(i)));
        }
        array.add(sumDiagonal(0));
        array.add(sumDiagonal(1));
        int count = Collections.frequency(array, array.get(0));
        if(count == 8)
            return true;
        else
            return false;
    }
}
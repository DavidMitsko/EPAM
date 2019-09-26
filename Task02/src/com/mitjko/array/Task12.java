/*
Задана последовательность N вещественных чисел. Вычислить сумму чисел, порядковые номера
которых являются простыми числами.
 */
package com.mitjko.array;

import java.util.Random;
import java.util.Scanner;

public class Task12 {
    private int n;
    private double array[];

    public Task12(Scanner scan, Random rand)
    {
        n = scan.nextInt();
        array = new double[n];
        for(int i = 0; i < n; i++)
            array[i] = rand.nextDouble();
    }

    public boolean define(int number)
    {
        boolean isComposite = false;
        for (int i = 2; i < number; i++) {
            if (number % i == 0) {
                isComposite = true;
                break;
            }
        }
        if (isComposite) {
            return false;
        } else {
            return true;
        }
    }

    public void calculateAmount()
    {
        double sum = 0;
        for(int i = 0; i < n; i++)
        {
            if(define(i))
            {
                sum += array[i];
                System.out.println(i);
            }
        }
        System.out.println(sum);
    }
}

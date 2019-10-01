/*
«Суперзамок». Секретный замок для сейфа состоит из 10 расположенных в рад ячеек, в которые надо
вставить игральные кубики. Но дверь открывается только в том случае, когда в любых трех соседних
ячейках сумма точек на передних гранях кубиков равна 10. (Игральный кубик имеет на каждой грани от
1 до 6 точек). Напишите программу, которая разгадывает код замка при условии, что два кубика уже
вставлены в ячейки.
 */
package com.mitjko.array;

import java.util.Random;

public class Task18 {
    private int array[];
    private int valueFirstCub;
    private int firstCub;
    private int valueSecondCub;
    private int secondCub;

    public Task18(Random rand){
        array = new int[10];
        firstCub = rand.nextInt(9);
        valueFirstCub = rand.nextInt(5) + 1;
        do {
            secondCub = rand.nextInt(9);
        }while(secondCub == firstCub);
        valueSecondCub = rand.nextInt(5) + 1;
        array[firstCub] = valueFirstCub;
        array[secondCub] = valueSecondCub;
    }

    public int[] getArray() {
        return array;
    }

    public boolean hack(){
        if(firstCub - secondCub > 2 || secondCub - firstCub > 2)
            return false;
        for (int i = 1; i < 9; i++){
            if(i == secondCub || i == firstCub)
                continue;
            for(int j = 0; j < 6; j++){
                array[i] = j;
                if(array[i - 1] + array[i] + array[i + 1] == 10){
                    return true;
                }
            }
        }
        return false;
    }
}

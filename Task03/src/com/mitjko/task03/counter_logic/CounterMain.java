package com.mitjko.task03.counter_logic;

import com.mitjko.task03.counter.Counter;

public class CounterMain {
    public static void main(String[] args){
        Counter count = new Counter();
        count.increment();
        System.out.println(count.getValue() + " up overflow: " + count.isUpOverflow() + " down overflow: " +
                count.isDownOverflow());
        count.setValue(9);
        System.out.println(count.getValue() + " up overflow: " + count.isUpOverflow() + " down overflow: " +
                count.isDownOverflow());
        count.increment();
        System.out.println(count.getValue() + " up overflow: " + count.isUpOverflow() + " down overflow: " +
                count.isDownOverflow());
        count.increment();
        System.out.println(count.getValue() + " up overflow: " + count.isUpOverflow() + " down overflow: " +
                count.isDownOverflow());
        count.increment();
        System.out.println(count.getValue() + " up overflow: " + count.isUpOverflow() + " down overflow: " +
                count.isDownOverflow());
        count.setValue(1);
        System.out.println(count.getValue() + " up overflow: " + count.isUpOverflow() + " down overflow: " +
                count.isDownOverflow());
        count.decrement();
        System.out.println(count.getValue() + " up overflow: " + count.isUpOverflow() + " down overflow: " +
                count.isDownOverflow());
        count.decrement();
        System.out.println(count.getValue() + " up overflow: " + count.isUpOverflow() + " down overflow: " +
                count.isDownOverflow());
        count.decrement();
        System.out.println(count.getValue() + " up overflow: " + count.isUpOverflow() + " down overflow: " +
                count.isDownOverflow());
    }
}

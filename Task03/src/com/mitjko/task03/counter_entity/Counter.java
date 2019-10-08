package com.mitjko.task03.counter_entity;

import java.util.Objects;

public class Counter {
    private int value;
    private boolean upOverflow;
    private boolean downOverflow;

    public Counter(){
        value = 0;
        upOverflow = false;
        downOverflow = false;
    }

    public Counter(int value) {
        this.value = value;
    }

    public int getValue() {
        return value;
    }

    public void setValue(int value) {
        this.value = value;
    }

    public boolean isUpOverflow() {
        return upOverflow;
    }

    public void setUpOverflow(boolean upOverflow) {
        this.upOverflow = upOverflow;
    }

    public boolean isDownOverflow() {
        return downOverflow;
    }

    public void setDownOverflow(boolean downOverflow) {
        this.downOverflow = downOverflow;
    }

    public void increment(){
        if(value != 10){
            value++;
            if(upOverflow == true)
                upOverflow = false;
        }
        else {
            value = 0;
            upOverflow = true;
        }
    }

    public void decrement(){
        if(value != 0){
            value--;
            if(downOverflow == true)
                downOverflow = false;
        }
        else{
            value = 10;
            downOverflow = true;
        }
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if(o == null){
            return false;
        }
        if(this.getClass() != o.getClass()){
            return false;
        }
        Counter counter = (Counter) o;
        return value == counter.value &&
                upOverflow == counter.upOverflow &&
                downOverflow == counter.downOverflow;
    }

    @Override
    public int hashCode() {
        return Objects.hash(value, upOverflow, downOverflow);
    }
}

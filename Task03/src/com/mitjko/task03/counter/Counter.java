package com.mitjko.task03.counter;

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

    public boolean increment(){
        if(value != 10){
            value++;
            if(upOverflow == true)
                upOverflow = false;
        }
        else {
            value = 0;
            upOverflow = true;
        }
        return  upOverflow;
    }

    public boolean decrement(){
        if(value != 0){
            value--;
            if(downOverflow == true)
                downOverflow = false;
        }
        else{
            value = 10;
            downOverflow = true;
        }
        return downOverflow;
    }
}

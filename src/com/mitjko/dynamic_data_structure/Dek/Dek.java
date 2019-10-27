package com.mitjko.dynamic_data_structure.Dek;

public class Dek {
    private int val;

    private Dek left;
    private Dek right;

    public Dek(int val) {
        this.val = val;
    }

    public static Dek add_right(Dek left_end, Dek right_end, int val){
        Dek temp = new Dek(val);
        if(left_end == right_end && right_end == null){
            left_end = temp;
            right_end = temp;
        }
        else{
            right_end.right = temp;
            temp.left = right_end;
            right_end = temp;
        }
        return right_end;
    }

    public static Dek add_left(Dek left_end, Dek right_end, int val){
        Dek temp = new Dek(val);
        if(left_end == right_end && right_end == null){
            left_end = temp;
            right_end = temp;
        }
        else{
            left_end.left = temp;
            temp.right = left_end;
            left_end = temp;
        }
        return left_end;
    }

    void pop()
    {
        Dek temp = this;
        while (temp != null)
        {
            System.out.print(temp.val + " ");
            temp = temp.right;
        }
    }
}

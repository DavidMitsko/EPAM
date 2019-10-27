package com.mitjko.dynamic_data_structure.Tree;

public class Tree {
    private int val;
    private int rep;

    private Tree right;
    private Tree left;

    public Tree(int val) {
        this.val = val;
        this.left = null;
        this.right = null;
    }

    public int getVal() {
        return val;
    }

    public void setVal(int val) {
        this.val = val;
    }

    public int getRep() {
        return rep;
    }

    public void setRep(int rep) {
        this.rep = rep;
    }

    public Tree getRight() {
        return right;
    }

    public void setRight(Tree right) {
        this.right = right;
    }

    public Tree getLeft() {
        return left;
    }

    public void setLeft(Tree left) {
        this.left = left;
    }

    public static Tree add(Tree head, int val){
        Tree temp = head;
        Tree c;
        if(head == null){
            c = new Tree(val);
            head = c;
            return head;
        }
        else if(head.val == val){
            head.rep++;
            return head;
        }
        else if(head.val < val){
            head.right = add(head.right, val);
        }
        else if(head.val > val){
            head.left = add(head.left, val);
        }
        return head;
    }

    public void output(){
        if (this != null)
        {
            System.out.println("Узел содержит: " + this.val + ", число втреч: " + " " + this.rep);
            if (this.left != null)
                this.left.output();
            if (this.right != null)
                this.right.output();
        }
    }

    public void output2(int level){
        int i;
        if (this != null)
            this.right.output2(level+1);
        for (i = 0; i < level; ++i)
            System.out.print("  ");
        if (this != null)
            System.out.println(this.val + "(" +  level + ")");
        else
            System.out.println("@");
        if (this != null)
            this.left.output2(level+1);
    }

    private Tree search(int c){
        Tree temp = this;
        if (temp != null) {
            if (temp.val == c) {
                //puts("Элемент найден");
                return temp;
            }
            else {
                temp.right.search(c);
            }
        }
        if (temp != null) {
            if (temp.val == c) {
                //puts("Элемент найден");
                return temp;
            }
            else {
                temp.left.search(c);
            }
        }
        return null;
    }
}

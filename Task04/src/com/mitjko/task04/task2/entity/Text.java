package com.mitjko.task04.task2.entity;

import java.util.ArrayList;
import java.util.Objects;

public class Text {
    private ArrayList<Sentence> text;
    private String Heading;

    public Text(ArrayList<Sentence> text, String heading) {
        this.text = text;
        Heading = heading;
    }

    public ArrayList<Sentence> getText() {
        return text;
    }

    public void setText(ArrayList<Sentence> text) {
        this.text = text;
    }

    public String getHeading() {
        return Heading;
    }

    public void setHeading(String heading) {
        Heading = heading;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if(o == null){
            return false;
        }
        if(this.getClass() != o.getClass()){
            return false;
        }
        Text text1 = (Text) o;
        return text.equals(text1.text) &&
                Heading.equals(text1.Heading);
    }

    @Override
    public int hashCode() {
        return Objects.hash(text, Heading);
    }

    @Override
    public String toString() {
        return "Text{" +
                "text=" + text +
                ", Heading='" + Heading + '\'' +
                '}';
    }
}

package com.mitjko.task04.task2.entity;

import java.util.ArrayList;
import java.util.Objects;

public class Sentence {
    private ArrayList<Word> sentence;

    public Sentence(ArrayList<Word> sentence) {
        this.sentence = sentence;
        this.sentence.add(new Word("."));
    }

    public ArrayList<Word> getSentence() {
        return sentence;
    }

    public void setSentence(ArrayList<Word> sentence) {
        this.sentence = sentence;
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
        Sentence sentence1 = (Sentence) o;
        return sentence.equals(sentence1.sentence);
    }

    @Override
    public int hashCode() {
        return Objects.hash(sentence);
    }

    @Override
    public String toString() {
        return "Sentence{" +
                "sentence=" + sentence +
                '}';
    }
}

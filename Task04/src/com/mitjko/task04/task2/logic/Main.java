package com.mitjko.task04.task2.logic;

import com.mitjko.task04.task2.entity.Sentence;
import com.mitjko.task04.task2.entity.Text;
import com.mitjko.task04.task2.entity.Word;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        ArrayList<Word> words1 = new ArrayList<Word>();
        ArrayList<Word> words2 = new ArrayList<Word>();
        ArrayList<Sentence> sentences = new ArrayList<Sentence>();
        words1.add(new Word("This "));
        words1.add(new Word("is "));
        words1.add(new Word("my "));
        words1.add(new Word("first "));
        words1.add(new Word("sentence"));
        sentences.add(new Sentence(words1));
        words2.add(new Word("And "));
        words2.add(new Word("this "));
        words2.add(new Word("is "));
        words2.add(new Word("my "));
        words2.add(new Word("second "));
        words2.add(new Word("sentence"));
        sentences.add(new Sentence(words2));
        Text txt = new Text(sentences, "My text");
        TextLogic textLogic = new TextLogic();
        System.out.println(txt.getHeading());
        System.out.println(consoleOut(txt));

    }

    public static String consoleOut(Text txt){
        String str = new String();
        for(int i = 0; i < txt.getText().size(); i++){
            for(int j = 0; j < txt.getText().get(i).getSentence().size(); j++){
                str += txt.getText().get(i).getSentence().get(j).getWord();
            }
        }
        return str;
    }
}

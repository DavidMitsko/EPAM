package com.mitjko.task04.task2.logic;

import com.mitjko.task04.task2.entity.Sentence;
import com.mitjko.task04.task2.entity.Text;

public class TextLogic {
    private void completeText(Text txt, Sentence newSentence){
        txt.getText().add(newSentence);
    }

    public String consoleOut(Text txt){
        String str = new String();
        for(int i = 0; i < txt.getText().size(); i++){
            for(int j = 0; j < txt.getText().get(i).getSentence().size(); j++){
                str += txt.getText().get(i).getSentence().get(j).getWord();
            }
        }
        return str;
    }
}

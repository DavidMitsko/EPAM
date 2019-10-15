package com.mitjko.task04.task2.logic;

import com.mitjko.task04.task2.entity.Sentence;
import com.mitjko.task04.task2.entity.Text;

public class TextLogic {
    private void completeText(Text txt, Sentence newSentence){
        txt.getText().add(newSentence);
    }
}

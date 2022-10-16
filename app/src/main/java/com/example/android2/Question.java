package com.example.android2;

public class Question {
    private int questionId;
    private boolean trueAnswer;
    //private int image;

    public Question(int questionId, boolean trueAnswer) {
        this.questionId = questionId;
        this.trueAnswer = trueAnswer;
        //this.image = image;
    }

    public boolean isTrueAnswer() {
        return trueAnswer;
    }

    //public int getImage(){
    //     return image;
    // }

    public int getQuestionId() {
        return questionId;
    }
}
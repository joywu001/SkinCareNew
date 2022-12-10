package com.example.skincare;

public class QuizModel {
    private int quizpic, questionid, optionA, optionB, optionC, optionD;

    public QuizModel(int quizpicture, int question, int oA, int oB, int oC, int oD) {
        quizpic = quizpicture;
        questionid = question;
        optionA = oA;
        optionB = oB;
        optionC = oC;
        optionD = oD;
    }

    public int getQuizpic() {
        return quizpic;
    }

    public int getQuestionid() {
        return questionid;
    }

    public int getOptionA() {
        return optionA;
    }

    public int getOptionB() {
        return optionB;
    }

    public int getOptionC() {
        return optionC;
    }

    public int getOptionD() {
        return optionD;
    }

}

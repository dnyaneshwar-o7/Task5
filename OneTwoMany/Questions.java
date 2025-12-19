package OneTwoMany;

import Mapping.OnetoOne.Answer;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;

@Entity
public class Questions {
    @Id
    @Column(name="qustions_id")
    private int questionId;
    private String question;
    private Answers answer;

    public int getQuestionId() {
        return questionId;
    }

    public void setQuestionId(int questionId) {
        this.questionId = questionId;
    }

    public String getQuestion() {
        return question;
    }

    public void setQuestion(String question) {
        this.question = question;
    }

    public Answers getAnswer() {
        return answer;
    }

    public void setAnswer(Answers answer) {
        this.answer = answer;
    }

    public Questions(int questionId, String question, Answers answer) {
        this.questionId = questionId;
        this.question = question;
        this.answer = answer;
    }

    public Questions() {
        super();
    }
}

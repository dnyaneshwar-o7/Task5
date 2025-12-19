package OneTwoMany;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;

@Entity
public class Answers {
    @Id
    @Column(name="answer_id")
    private int answersId;
    @OneToMany
    private String answers;

    public int getAnswersId() {
        return answersId;
    }

    public void setAnswersId(int answersId) {
        this.answersId = answersId;
    }

    public String getAnswers() {
        return answers;
    }

    public void setAnswers(String answers) {
        this.answers = answers;
    }

    public Answers(int answersId, String answers) {
        this.answersId = answersId;
        this.answers = answers;
    }

    public Answers() {
        super();
    }
}

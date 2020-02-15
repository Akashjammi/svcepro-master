package svce.svcepro;

/**
 * Created by harishananth on 11/10/16.
 */

public class faqrowitem {
    private String Question;
    private String Answer;

    public faqrowitem(String Question, String Answer) {
        this.Question = Question;
        this.Answer = Answer;

    }
    public String getQuestion() {
        return Question;
    }
    public void setQuestion(String Question) {
        this.Question = Question;
    }
    public String getAnswer() {
        return Answer;
    }
    public void setAnswer(String Answer) {
        this.Answer = Answer;
    }
    @Override
    public String toString() {
        return Answer + "\n";
    }
}

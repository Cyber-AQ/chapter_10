package example4;
/*
4. Essay Class
Design an Essay class that extends the GradedActivity class presented in this chapter. The
Essay class should determine the grade a student receives for an essay. The student’s essay
score can be up to 100 and is determined in the following manner:
Grammar: 30 points
Spelling: 20 points
Correct length: 20 points
Content: 30 points
Demonstrate the class in a simple program.
 */
public class essay extends GradedActivity{

    public double totalScore;
    public double Grammar = 30;
    public double Spelling = 20;
    public double CorrectLength = 20;
    public double Content = 30;

    public essay(double Grammar, double Spelling, double CorrectLength, double Content){
        totalScore = 0;
        this.Grammar = Grammar;
        this.Spelling = Spelling;
        this.CorrectLength = CorrectLength;
        this.Content = Content;

        totalScore = Grammar + Spelling + CorrectLength + Content;
        super.setScores(totalScore);

    }

    public double getTotalScore() {
        return totalScore;
    }

    public void setTotalScore(double totalScore) {
        this.totalScore = totalScore;
    }

    public double getGrammar() {
        return Grammar;
    }

    public void setGrammar(double grammar) {
        Grammar = grammar;
    }

    public double getSpelling() {
        return Spelling;
    }

    public void setSpelling(double spelling) {
        Spelling = spelling;
    }

    public double getCorrectLength() {
        return CorrectLength;
    }

    public void setCorrectLength(double correctLength) {
        CorrectLength = correctLength;
    }

    public double getContent() {
        return Content;
    }

    public void setContent(double content) {
        Content = content;
    }
}

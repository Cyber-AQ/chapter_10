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
public class GradedActivity {
    private double scores;

    public GradedActivity(){

    }
    public GradedActivity(int scores) {
        this.scores = scores;
    }

    public double getScores() {
        return scores;
    }

    public void setScores(double scores) {
        this.scores = scores;
    }

    public char getGrade(){
        char letterGrade;
        
        if (scores >= 90)
        letterGrade = 'A';
        else if (scores >= 80)
        letterGrade = 'B';
        else if (scores >= 70)
        letterGrade = 'C';
        else if (scores >= 60)
        letterGrade = 'D';
        else
        letterGrade = 'F';

        return letterGrade;
    }
}

package example4;
/*
Grammar: 30 points
Spelling: 20 points
Correct length: 20 points
Content: 30 points
 */
import java.util.*;
public class essayTest {
    public static void main(String[] args) {
        double grammar,spelling,correctLength,content;
        Scanner scan = new Scanner(System.in);

            System.out.print("Please enter marks for Grammar: ");
            grammar = scan.nextDouble();

            System.out.print("Please enter marks for Spelling: ");
            spelling = scan.nextDouble();

            System.out.print("Please enter marks for Correct Length: ");
            correctLength = scan.nextDouble();

            System.out.print("Please enter marks for Content: ");
            content = scan.nextDouble();

        essay ess = new essay(grammar,spelling,correctLength,content);

        System.out.println("You have a grade of: "+ess.getGrade());
    }
}

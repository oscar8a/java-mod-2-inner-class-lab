import java.util.HashMap;
import java.util.Map;

public class InnerClassRunner {
    public static void main(String[] args) {

        String gradingMethod = "SLIGHT";

        StudentGradeTranslator translator = new StudentGradeTranslator(gradingMethod);

        HashMap<String, String> grades = new HashMap<String, String>();

        grades.put("Andrea", "93");
        grades.put("Bob", "87");
        grades.put("Oscar", "82");
        grades.put("Carlos", "76");
        grades.put("Onice", "71");
        grades.put("Sarah", "67");
        grades.put("Dan", "64");
        grades.put("Jules", "59");

        System.out.println("List of Students and their grades");

        for (Map.Entry<String, String> studentGrade : grades.entrySet()) {

            // Get Letter Grades
            System.out.println("\n" + studentGrade.getKey() + "'s grade is "
                    + translator.getLetterGrade(Integer.parseInt(studentGrade.getValue())));

            // Get Passing Status
            System.out.println("Passing grade status: " + translator.isPassingGrade(Integer.parseInt(studentGrade.getValue())));
            
            // Get points for next letter grade and grading method
            System.out.println("Next letter grade is at " + translator.howManyForNextLetterGrade(Integer.parseInt(studentGrade.getValue())) + " points if the grading method is " + gradingMethod);

        }

    }
}

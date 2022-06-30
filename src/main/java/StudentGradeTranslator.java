public class StudentGradeTranslator {

    // Initialize GradeCalculator Interface to create the different Calculators
    GradeCalculator gradeCalculator;

    // Default Constructor
    public StudentGradeTranslator() {
        this.gradeCalculator = new FlatCurveGradeCalculator();
    }
    
    // Parameterized Constructor for our different types of calculators instanciated
    public StudentGradeTranslator(String gradingMethod) {
        if (gradingMethod == null || gradingMethod.equals("FLAT")) {
            this.gradeCalculator = new FlatCurveGradeCalculator();
        } else if (gradingMethod.equals("SLIGHT")) {
            this.gradeCalculator = new SlightCurveGradeCalculator();
        } else if (gradingMethod.equals("HEAVY")) {
            this.gradeCalculator = new HeavyCurveGradeCalculator();
        }
    }

    public String getLetterGrade( int numberGrade) {
        return gradeCalculator.getLetterGrade(numberGrade);
    }

    public boolean isPassingGrade(int numberGrade) {
        return gradeCalculator.isPassingGrade(numberGrade);
    }

    public int howManyForNextLetterGrade(int numberGrade) {
        return gradeCalculator.howManyForNextLetterGrade(numberGrade);
    }

}

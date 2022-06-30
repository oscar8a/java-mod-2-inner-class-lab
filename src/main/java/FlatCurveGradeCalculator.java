
public class FlatCurveGradeCalculator implements GradeCalculator {

    @Override
    public String getLetterGrade(int numberGrade) {
        if (numberGrade < 60) {
            return "F";
        }
        if (numberGrade < 70) {
            return "D";
        }
        if (numberGrade < 80) {
            return "C";
        }
        if (numberGrade < 90) {
            return "B";
        }
        return "A";
    }

    @Override
    public boolean isPassingGrade(int numberGrade) {
        if (numberGrade >= 60)
            return true;
        return false;
    }

    @Override
    public int howManyForNextLetterGrade(int numberGrade) {
        String currentGrade = getLetterGrade(numberGrade);
        switch (currentGrade) {
            case "B":
                return 90 % numberGrade;
            case "C":
                return 80 % numberGrade;
            case "D":
                return 70 % numberGrade;
            case "F":
                return 60 % numberGrade;
            default:
                System.out.println("You have achieved the highest grade =)");
                return 0;
        }
    }

}

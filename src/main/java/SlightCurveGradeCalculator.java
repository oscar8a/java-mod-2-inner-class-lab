
public class SlightCurveGradeCalculator implements GradeCalculator {

    @Override
    public String getLetterGrade(int numberGrade) {
        if (numberGrade < 55) {
            return "F";
        }
        if (numberGrade < 65) {
            return "D";
        }
        if (numberGrade < 75) {
            return "C";
        }
        if (numberGrade < 85) {
            return "B";
        }
        return "A";
    }

    @Override
    public boolean isPassingGrade(int numberGrade) {
        if (numberGrade >= 55)
            return true;
        return false;
    }

    @Override
    public int howManyForNextLetterGrade(int numberGrade) {
        String currentGrade = getLetterGrade(numberGrade);
        switch (currentGrade) {
            case "C":
                return 85 % numberGrade;
            case "D":
                return 75 % numberGrade;
            case "F":
                return 55 % numberGrade;
            default:
                System.out.println("You have achieved the highest grade =)");
                return 0;
        }
    }

}

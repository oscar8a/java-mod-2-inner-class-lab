
public class HeavyCurveGradeCalculator implements GradeCalculator {

    @Override
    public String getLetterGrade(int numberGrade) {
        if (numberGrade < 50) {
            return "F";
        }
        if (numberGrade < 60) {
            return "D";
        }
        if (numberGrade < 70) {
            return "C";
        }
        if (numberGrade < 80) {
            return "B";
        }
        return "A";
    }

    @Override
    public boolean isPassingGrade(int numberGrade) {
        if (numberGrade >= 50) return true;
        return false;
    }

    @Override
    public int howManyForNextLetterGrade(int numberGrade) {
        String currentGrade = getLetterGrade(numberGrade);
        switch (currentGrade) {
            case "B":
                return 80 % numberGrade;
            case "C":
                return 70 % numberGrade;
            case "D":
                return 60 % numberGrade;
            case "F":
                return 50 % numberGrade;
            default:
                System.out.println("You have achieved the highest grade =)");
                return 0;
        }
    }

}

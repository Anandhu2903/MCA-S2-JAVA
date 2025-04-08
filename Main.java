interface Sports {
    int getSportsScore();
}

class Student {
    private int academicScore;

    public void setAcademicScore(int score) {
        academicScore = score;
    }

    public int getAcademicScore() {
        return academicScore;
    }
}

class Result extends Student implements Sports {
    private int sportsScore;

    public void setSportsScore(int score) {
        sportsScore = score;
    }

    @Override
    public int getSportsScore() {
        return sportsScore;
    }

    public void displayScores() {
        System.out.println("Academic Score: " + getAcademicScore());
        System.out.println("Sports Score: " + getSportsScore());
    }
}

public class Main {
    public static void main(String[] args) {
        Result studResult = new Result();
        studResult.setAcademicScore(90);
        studResult.setSportsScore(80);
        studResult.displayScores();
    }
}

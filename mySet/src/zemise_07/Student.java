package zemise_07;

public class Student {
    private String name;
    private int languageScore;
    private int mathScore;


    public Student() {
    }

    public Student(String name, int languageScore, int mathScore) {
        this.name = name;
        this.languageScore = languageScore;
        this.mathScore = mathScore;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getLanguageScore() {
        return languageScore;
    }

    public void setLanguageScore(int languageScore) {
        this.languageScore = languageScore;
    }

    public int getMathScore() {
        return mathScore;
    }

    public void setMathScore(int mathScore) {
        this.mathScore = mathScore;
    }

    public int getSum(){
        return this.languageScore + this.mathScore;
    }
}

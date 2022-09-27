package zemise_07;

public class Student {
    private String name;
    private  int Chinese_Score;
    private int Math_Score;
    private int English_Score;
    private int total_Score;

    public Student() {
    }

    public Student(String name, int chinese_Score, int math_Score, int english_Score) {
        this.name = name;
        Chinese_Score = chinese_Score;
        Math_Score = math_Score;
        English_Score = english_Score;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getChinese_Score() {
        return Chinese_Score;
    }

    public void setChinese_Score(int chinese_Score) {
        Chinese_Score = chinese_Score;
    }

    public int getMath_Score() {
        return Math_Score;
    }

    public void setMath_Score(int math_Score) {
        Math_Score = math_Score;
    }

    public int getEnglish_Score() {
        return English_Score;
    }

    public void setEnglish_Score(int english_Score) {
        English_Score = english_Score;
    }

    public int getTotal_Score(){
        return this.Chinese_Score + this.Math_Score + this.English_Score;
    }
}

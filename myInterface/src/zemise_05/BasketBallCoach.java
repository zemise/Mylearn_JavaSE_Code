package zemise_05;

public class BasketBallCoach extends Coach implements SpeakEnglish{

    public BasketBallCoach() {
    }

    public BasketBallCoach(String name, int age) {
        super(name, age);
    }

    @Override
    public void teach() {
        System.out.println("篮球教练教如何运球和投篮");
    }

    @Override
    public void eat() {
        System.out.println("篮球教练吃羊肉，喝羊奶");
    }

    @Override
    public void speak() {
        System.out.println("篮球教练说英语");
    }
}

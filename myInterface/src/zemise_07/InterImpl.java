package zemise_07;

public class InterImpl implements Inter, Flyable {
    @Override
    public void show() {
        System.out.println("show");
    }

    @Override
    public void method() {
        System.out.println("method");
    }
}

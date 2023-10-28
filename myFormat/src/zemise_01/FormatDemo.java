package zemise_01;

public class FormatDemo {
    public static void main(String[] args) {
        warn("%d",123);
    }
    public static void warn(String format,Object... args){
        System.out.println(String.format(format, args));
    }
}

package zemise_08;

class Utils {
    //静态代码块
    static {
        System.out.println("Do Something");
    }
}

public class Client {
    public static void main(String[] args) throws Exception {
        //动态加载
        Class.forName("zemise_08.Utils");
    }
}
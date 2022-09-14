package zemise_01;

public class Fu {
    private void show1(){
        System.out.println("private");
    }

    void show2(){
        System.out.println("default");
    }

    protected void show3(){
        System.out.println("protected");
    }

    public void show4(){
        System.out.println("public");
    }

    public static void main(String[] args) {
        //创建Fu的对象，测试看有哪些方法可以使用
        Fu fu = new Fu();
        fu.show1();
        fu.show2();
        fu.show3();
        fu.show4();
    }
}

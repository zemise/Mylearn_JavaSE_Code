package zemise_04;

import java.util.Random;
import java.util.Scanner;
import java.util.stream.IntStream;

public class GuessNumber {
    public GuessNumber() {
    }

    public static void start() {

        //随机生成一个0-20的随机整数
        Random random = new Random();
        int randomNum = random.nextInt(20) + 1;


        while(true) {
            //获取玩家输入的数字
            Scanner sc = new Scanner(System.in);
            System.out.println("请输入一个你猜的数字：");
            int guessNum = sc.nextInt();

            //判断猜的数字和随机数是否相同
            if (guessNum == randomNum) {
                System.out.println("恭喜你，猜对了，随机数为：" + randomNum);
                break;
            } else if (guessNum > randomNum) {
                System.out.println("你猜的数字比随机数大");
            } else if (guessNum < randomNum) {
                System.out.println("你猜的数字比随机数小");
            }
        }
    }

    public static void vipMessage(){
        System.out.println("游戏试玩已经结束，想玩请充值(www.cellcraft.store)");
    }
}

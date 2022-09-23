package zemise_03;

import java.util.ArrayList;
import java.util.Collections;

/*
    需求：
        通过程序实现斗地主过程中的洗牌，发牌和看牌

    思路：
    1：创建一个牌盒，也就是定义一个集合对象，用ArrayList集合实现
    2：往牌盒里面装牌
    3：洗牌，也就是把牌打撤，用Collections的shuffle()方法实现
    4: 发牌，也就是遍历集合，给三个玩家发牌
    5：看牌，也就是三个玩家分别遍历自己的牌
 */
public class PokerDemo {
    public static void main(String[] args) {
        //1：创建一个牌盒，也就是定义一个集合对象，用ArrayList集合实现
        ArrayList<String> arrayList = new ArrayList<>();

        //2：往牌盒里面装牌
        //定义花色组
        String[] colors = {"♣", "♥", "♠", "♦"};

        //定义点数数组
        String[] numbles = {"2", "3", "4", "5", "6", "7", "8", "9", "10", "J", "Q", "K", "A"};

        for (String color : colors) {
            for (String numble : numbles) {
                arrayList.add(color + numble);
            }
        }
        arrayList.add("小王");
        arrayList.add("大王");

        //3：洗牌，也就是把牌打撤，用Collections的shuffle()方法实现
        Collections.shuffle(arrayList);

        //4: 发牌，也就是遍历集合，给三个玩家发牌
        ArrayList<String> player1 = new ArrayList<>();
        ArrayList<String> player2 = new ArrayList<>();
        ArrayList<String> player3 = new ArrayList<>();
        ArrayList<String> lastCards = new ArrayList<>();


        for (int i = 0; i < arrayList.size(); i++) {
            String poker = arrayList.get(i);

            if (i >= (arrayList.size() - 3)) {
                lastCards.add(poker);
            } else if (i % 3 == 0) {
                player1.add(poker);
            } else if (i % 3 == 1) {
                player2.add(poker);
            } else if (i % 3 == 2) {
                player3.add(poker);
            }
        }

        //5：看牌，也就是三个玩家分别遍历自己的牌
        lookPoker("player1" , player1);
        lookPoker("player2" , player2);
        lookPoker("player3" , player3);
        lookPoker("最后底牌" , lastCards);
    }

    //看牌的方法
    public static void lookPoker(String playerName, ArrayList<String> arrayList) {
        System.out.print(playerName + "的牌是：");
        for (String poker : arrayList) {
            System.out.print(poker + " ");
        }
        System.out.println();
    }
}

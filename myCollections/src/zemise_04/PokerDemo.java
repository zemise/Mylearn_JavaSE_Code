package zemise_04;

import java.util.*;

/*
    需求：
        通过程序实现斗地主过程中的洗牌，发牌和看牌。要求：对牌进行排序
    思路：
        1：创建HashMap，键是编号，值是牌
        2：创建ArrayList，存储编号
        3：创建花色数组和点数数组
        4：从0开始往HashMap里面存储编号，并存储对应的牌。同时往ArrayList里面存储编号
        5：洗牌(洗的是编号)：用Collections的shuffle)方法实现
        6：发牌（发的也是编号，为了保证编号是排序的，创建TreeSet集合接收）
        7：定义方法看牌（遍历TreeSet集合，获取编号，到HashMap集合找对应的牌）
        8：调用看牌方法
 */
public class PokerDemo {
    public static void main(String[] args) {
        //1：创建HashMap，键是编号，值是牌
        HashMap<Integer, String> hm = new HashMap<>();

        //2：创建ArrayList，存储编号
        ArrayList<Integer> array = new ArrayList();

        //3：创建花色数组和点数数组
        String[] colors = {"♣", "♥", "♠", "♦"};

        String[] numbles = {"3", "4", "5", "6", "7", "8", "9", "10", "J", "Q", "K", "A", "2"};

        //4：从0开始往HashMap里面存储编号，并存储对应的牌。同时往ArrayList里面存储编号
        int index = 0;
        for (String numble : numbles) {
            for (String color : colors) {
                hm.put(index, color + numble);
                array.add(index);
                index++;
            }
        }
        hm.put(index, "小王");
        array.add(index);
        index++;

        hm.put(index, "大王");
        array.add(index);

        //5：洗牌(洗的是编号)：用Collections的shuffle)方法实现
        Collections.shuffle(array);

        //6：发牌（发的也是编号，为了保证编号是排序的，创建TreeSet集合接收）
        TreeSet<Integer> player1 = new TreeSet<>();
        TreeSet<Integer> player2 = new TreeSet<>();
        TreeSet<Integer> player3 = new TreeSet<>();
        TreeSet<Integer> lastCards = new TreeSet<>();

        for (int i = 0; i < array.size(); i++) {
            int x = array.get(i);
            if (i >= array.size() - 3) {
                lastCards.add(x);
            } else if (i % 3 == 0) {
                player1.add(x);
            } else if (i % 3 == 1) {
                player2.add(x);
            } else if (i % 3 == 2) {
                player3.add(x);
            }
        }

        //8：调用看牌方法
        lookPoker("player1", player1, hm);
        lookPoker("player2", player2, hm);
        lookPoker("player3", player3, hm);
        lookPoker("最后底牌", lastCards, hm);


    }


    //7：定义方法看牌（遍历TreeSet集合，获取编号，到HashMap集合找对应的牌）
    //看牌的方法
    public static void lookPoker(String playerName, TreeSet<Integer> player, HashMap<Integer, String> hm) {
        System.out.print(playerName + "的牌是：");

        for (Integer integer : player) {
            String poker = hm.get(integer);
            System.out.print(poker + " ");
        }
        System.out.println();
    }
}

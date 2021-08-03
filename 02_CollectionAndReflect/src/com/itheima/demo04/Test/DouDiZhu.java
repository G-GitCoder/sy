package com.itheima.demo04.Test;

import java.util.ArrayList;
import java.util.Collections;

/*
斗地主综合案例：
1、准备牌；2、洗牌；3、发牌；4、看牌
 */
public class DouDiZhu {

    public static void main(String[] args) {
        //用来存54张牌
        ArrayList<String> poker = new ArrayList<>();

        //两个数组分别存 花色和数字
        String[] colors = {"♣", "♦", "♠", "♥"};
        String[] numbers = {"2", "A", "K", "Q", "J", "10", "9", "8", "7", "6", "5", "4", "3"};

        //先把大小王放到poker集合中
        poker.add("大王");
        poker.add("小王");

        //colors和numbers组装剩余52张牌
        for (String color : colors) {
            for (String number : numbers) {
                //System.out.println(color + number);
                poker.add(color + number);
            }
        }
        //System.out.println(poker);

        //打乱顺序
        Collections.shuffle(poker);
        //System.out.println(poker);

        //发牌
        //定义4个集合存牌，3个玩家和底牌
        ArrayList<String> player1 = new ArrayList<>();
        ArrayList<String> player2 = new ArrayList<>();
        ArrayList<String> player3 = new ArrayList<>();
        ArrayList<String> diPai = new ArrayList<>();
        //分牌
        for (int i = 0; i < poker.size(); i++) {
            if (i >= 51) {
                diPai.add(poker.get(i));
            } else if (i % 3 == 0) {
                player1.add(poker.get(i));
            } else if (i % 3 == 1) {
                player2.add(poker.get(i));
            } else if (i % 3 == 2) {
                player3.add(poker.get(i));
            }
        }

        //看牌
        System.out.println("周星驰：" + player1);
        System.out.println("周润发：" + player2);
        System.out.println("柳大华：" + player3);
        System.out.println("底牌：" + diPai);
    }
}

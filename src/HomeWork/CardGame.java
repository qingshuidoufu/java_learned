package HomeWork;

import java.util.Arrays;

public class CardGame {
    public static void main(String[] args) {
        //建立牌堆并洗牌
        CardHeap ch=new CardHeap();
        //打印牌堆
        System.out.println("初始牌堆(已经洗牌)为:");
        for (Card c:ch.heap
        ) {
            System.out.print(c.clist+" ");
        }


        Player p1=new Player(1001,"liu",false,ch);
        System.out.println();
        //发牌
        System.out.println("发牌给p1:");
        for (Card c:p1.c
        ) {
            System.out.print(c.clist+" ");
        }
        //整理牌
        Arrays.sort(p1.c);
        System.out.println();
        System.out.println("整理p1的手牌:");
        for (Card c:p1.c
        ) {
            System.out.print(c.clist+" ");
        }
        System.out.println();
        //p1出牌
        System.out.println("p1出牌:");
        p1.releaseCard();
    }
}

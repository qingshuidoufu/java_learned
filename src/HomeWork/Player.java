package HomeWork;

import javafx.collections.transformation.SortedList;
import jdk.internal.util.xml.impl.Input;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class Player {
    int id;
    String name;
    boolean isBoss;
    Card[] c;
    int cardNumber;



    public Player(int id, String name, Boolean isBoss, CardHeap ch) {

        this.id = id;
        this.isBoss=isBoss;
        this.name = name;
        if (isBoss==false){
            cardNumber=17;
            c=new Card[17];
            for(int i=0;i<17;i++){
                c[i]=ch.heap[i];
            }
            for(int i=0;i<17;i++){
                ch.heap[i]=ch.heap[i+17];
            }
            ch.heapNumber=ch.heap.length;
        }
        else{
            cardNumber=20;
            c=new Card[20];
            for(int i=0;i<20;i++){
                c[i]=ch.heap[i];
            }
            for(int i=0;i<20;i++){
                ch.heap[i]=ch.heap[i+20];
            }
            ch.heapNumber=ch.heap.length;
        }


    }
    //获取牌的序号
    public int getCardId(){
        Scanner s=new Scanner(System.in);
        String temp=s.next();
        for(int i=0;i<this.c.length;i++){
            if (this.c[i].equals(temp)==true){
                return i;
            }
        }
        return -1;
    }
    //出牌
    public void releaseCard(){
        int index=getCardId();
        System.out.println("打出的牌为:"+"ID:"+this.c[index].cardId+"名称:"+c[index].clist);

        for(int i=index;i<this.cardNumber-i-1;i++){
            this.c[i]=this.c[i+1];
        }
        cardNumber--;
    }




}

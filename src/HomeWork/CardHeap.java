package HomeWork;

import java.util.Random;

public class CardHeap{
     Card[] heap;
    int heapNumber=54;

    public CardHeap() {

        this.heap = new Card[54];
        this.heapNumber = heap.length;
        for(int i=0;i<54;i++){
            Card temp=new Card(i+1);
            heap[i]=temp;
        }
        shuffle();

    }
    public void shuffle (){

        //洗牌算法
        Random rand = new Random();
        for (int i=0;i<heapNumber;i++){
            int k=rand.nextInt(53);
            Card value=heap[k];
            heap[k]=heap[0];
            heap[0]=value;
        }


    }

}



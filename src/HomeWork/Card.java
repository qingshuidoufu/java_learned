package HomeWork;

import java.util.Random;

public class Card implements Comparable<Card>{
  int cardId;
    String clist;

    public Card(int cardId) {
        this.cardId = cardId;
        switch(cardId){
            case 1:  this.clist =CardUtils.BLOCK+"A";break;
            case 2:  this.clist =CardUtils.MEIHUA+"A";break;
            case 3:  this.clist = CardUtils.HEARD+"A";break;
            case 4:  this.clist = CardUtils.HEITAO+"A";break;

            case 5:  this.clist =CardUtils.BLOCK+"2";break;
            case 6:  this.clist =CardUtils.MEIHUA+"2";break;
            case 7:  this.clist = CardUtils.HEARD+"2";break;
            case 8:  this.clist = CardUtils.HEITAO+"2";break;

            case 9:  this.clist =CardUtils.BLOCK+"3";break;
            case 10:  this.clist =CardUtils.MEIHUA+"3";break;
            case 11:  this.clist = CardUtils.HEARD+"3";break;
            case 12:  this.clist = CardUtils.HEITAO+"3";break;

            case 13:  this.clist =CardUtils.BLOCK+"4";break;
            case 14:  this.clist =CardUtils.MEIHUA+"4";break;
            case 15:  this.clist = CardUtils.HEARD+"4";break;
            case 16:  this.clist = CardUtils.HEITAO+"4";break;

            case 17:  this.clist =CardUtils.BLOCK+ "5";break;
            case 18:  this.clist =CardUtils.MEIHUA+"5";break;
            case 19:  this.clist = CardUtils.HEARD+"5";break;
            case 20:  this.clist =CardUtils.HEITAO+"5";break;

            case 21:  this.clist =CardUtils.BLOCK+ "6";break;
            case 22:  this.clist =CardUtils.MEIHUA+"6";break;
            case 23:  this.clist = CardUtils.HEARD+"6";break;
            case 24:  this.clist =CardUtils.HEITAO+"6";break;

            case 25:  this.clist =CardUtils.BLOCK+ "7";break;
            case 26:  this.clist =CardUtils.MEIHUA+"7";break;
            case 27:  this.clist = CardUtils.HEARD+"7";break;
            case 28:  this.clist =CardUtils.HEITAO+"7";break;

            case 29:  this.clist =CardUtils.BLOCK+ "8";break;
            case 30:  this.clist =CardUtils.MEIHUA+"8";break;
            case 31:  this.clist = CardUtils.HEARD+"8";break;
            case 32:  this.clist =CardUtils.HEITAO+"8";break;

            case 33:  this.clist =CardUtils.BLOCK+ "9";break;
            case 34:  this.clist =CardUtils.MEIHUA+"9";break;
            case 35:  this.clist = CardUtils.HEARD+"9";break;
            case 36:  this.clist =CardUtils.HEITAO+"9";break;

            case 37:  this.clist =CardUtils.BLOCK+ "10";break;
            case 38:  this.clist =CardUtils.MEIHUA+"10";break;
            case 39:  this.clist = CardUtils.HEARD+"10";break;
            case 40:  this.clist =CardUtils.HEITAO+"10";break;

            case 41:  this.clist =CardUtils.BLOCK+ "J";break;
            case 42:  this.clist =CardUtils.MEIHUA+"J";break;
            case 43:  this.clist = CardUtils.HEARD+"J";break;
            case 44:  this.clist =CardUtils.HEITAO+"J";break;

            case 45:  this.clist =CardUtils.BLOCK+ "Q";break;
            case 46:  this.clist =CardUtils.MEIHUA+"Q";break;
            case 47:  this.clist = CardUtils.HEARD+"Q";break;
            case 48:  this.clist =CardUtils.HEITAO+"Q";break;

            case 49:  this.clist =CardUtils.BLOCK+ "K";break;
            case 50:  this.clist =CardUtils.MEIHUA+"K";break;
            case 51:  this.clist = CardUtils.HEARD+"K";break;
            case 52:  this.clist =CardUtils.HEITAO+"K";break;

            case 53:this.clist="小鬼";break;
            case 54:this.clist="大鬼";break;
        }

    }

    @Override
    public int compareTo(Card o) {
        if (this.cardId>o.cardId){
            return 1;
        }
        else if (this.cardId==o.cardId){
            return 0;
        }
        else{
            return -1;
        }
    }
    @Override
    public boolean equals(Object obj) {
        if (this.clist.equals(obj)){
            return true;
        }
        else {
            return false;
        }
    }
}

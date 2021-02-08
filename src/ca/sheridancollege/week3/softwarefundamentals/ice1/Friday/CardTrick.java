
package ca.sheridancollege.week3.softwarefundamentals.ice1.Friday;
/*
*Ziang Wang
*9901565800
* 
*/
public class CardTrick {
    public static void main(String[] args)
    {
    Card c1 = new Card("Diamonds",13);      
         String suit = c1.getSuit();
         System.out.print(suit);
         
         int value = c1.getValue();
         System.out.print(value);   
    }
    
}

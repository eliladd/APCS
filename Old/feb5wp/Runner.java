import java.util.ArrayList;
public class Runner {
    public static void main(String[] args){
        ArrayList<Card> cardList = new ArrayList<Card>();
        for(int i = 0; i < 10; i++){
            cardList.add(new Card((int)(Math.random() * (5 - 1 + 1) + 1)));
        }
        System.out.println("Before removing odd numbers");
        for(Card card : cardList){
            System.out.println(card);
        }
        for(int i = 0; i < cardList.size(); i++){
            if(cardList.get(i).getValue() % 2 == 1){
                cardList.remove(i);
                i--;
            }
        }
        System.out.println("After removing odd numbers");
        for(Card card : cardList){
            System.out.println(card);
        }
        
    }
}

public class DeckOfCards{
	public static void main(String[] args){
	int[] deck = new int[52];
	String[] suits = {"Spades", "Hearts", "Diamonds", "Clubs"};
	String[] ranks =  {"Ace", "2", "3", "4", "5", "6", "7", "8", "9", "10", "Jack", "Queen", "King"};

	for(int count = 0; count < deck.length; count++){
		deck[count] = count;
	}

	for(int count = 0; count < deck.length; count++){
		int index = (int) (Math.random() * deck.length);
		int temp = deck[count];
		deck[count] = deck[index];
		deck[index] = temp;
	}

	for(int count = 0; count < 4; count++){
		String suit = suits[deck[count] / 13];
		String rank = ranks[deck[count] %13];
	System.out.println("Card number " + deck[count] + ":  " + rank + " of " + suit);
	
	}
	}

}
package deck;

public class DeckCards {
	public static void main(String[] args){
		//int[] deck= new int[52];
		String [] suits={"Spades","Hearts","Clubs","Diamonds"};
		String [] values={"Ace","Two","Three","Four","Five","Six","Seven","Eight","Nine","Ten","Jack","Queen","King"};

		int suit=(int)(Math.random()*suits.length);
		int value=(int)(Math.random()*values.length);
		System.out.println("The "+values[value]+" of "+suits[suit]+".");
		}
	

}

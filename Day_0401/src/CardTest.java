
public class CardTest {

	public static void main(String[] args) {
		
		Card c1 = new Card();
		c1.cardPrint();
		
		c1.name = "¼³Çö¼ö";
		c1.tel = "010-5131-3577";
		c1.email = "shss2216@gmail.com";
		c1.age = 28;
		
		c1.cardPrint();

	}

}

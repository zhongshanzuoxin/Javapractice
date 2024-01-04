package CardGame;

public class Player {
	
	//プレイヤーが持っているカード情報
	private Card card_info;
	
	//初期化処理
	public Player() {
		card_info = new Card();
		
		//カード情報の初期化
		card_info.no = 0;
		card_info.suit = 0;
	}
	
	//カードを一枚ドロー
	public void Draw(Deck deck) {
		//ドローしたカード情報取得
		card_info = deck.GetCard();
		return;
	}
	
	//プレイヤーが持っているカードの数字を取得
	public int GetNo() {
		return card_info.no;
	}
	
	//プレイヤーが持っているカードのマークを取得
	public int GetSuit() {
		return card_info.suit;
	}
	
}

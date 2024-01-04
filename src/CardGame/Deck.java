package CardGame;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

// カード情報
class Card {
	int suit; //マーク(0：スペード/1：ハート/2：ダイヤ/3：クラブ)
	int no; //数字(A=1/J=11/Q=12/K=13)
}

//山札クラス
public class Deck {
	//定数定義
	final int TOTAL_CARD = 52; //カードの枚数
	
	//メンバー変数定義
	//カードリスト（山札）０〜５１の要素を入れ、それぞれマークと数字を割り当てる
	//0~12：スペードA ~K /13~25:ハートA~K/26~38：ダイヤA~K/39~51：クラブA~K
	private List card_list;
	
	//次に取り出すカード番号（１枚引くごとに１加算する）
	private int card_index = 0;
	
	//初期化処理
	public Deck() {
		
		//次に取り出すカード番号を初期化
		card_index = 0;
		
		//山札を初期化
		card_list = new ArrayList<>(Arrays.asList(0,1,2,3,4,5,6,7,8,9,10,11,12,13,14,15,16,17,18,19,20,21,22,23,24,25,26,27,28,29,30,31,32,33,34,35,36,37,38,39,40,41,42,43,44,45,46,47,48,49,50,51));
		
		//山札をシャッフル
		Collections.shuffle(card_list);
	}
	
	//山札からカードを１枚取り出し、そのカードのマークと数字をリターン
	public Card GetCard() {
		Card card_info = new Card();
		int card_no = 0;
		
		//カードを１枚取り出して、カード番号（０〜５１のいずれか）を取得
		card_no = card_list.get(card_index);
		
		//１枚取り出したのでカード番号を１加算
		card_index++;
		
		//山札を全て引いた場合、山札を初期化
		if (TOTAL_CARD <= card_index) {
			card_index = 0;
			Collections.shuffle(card_list);
		}
		
		card_info.suit = card_no / 13;
		card_info.no = (card_no % 13) + 1;
		
		return card_info;
	}

}

package staticex;

/*
 * 카드를 발급하는 프로그램을 구현하세요.
 * 
 * 카드(Card)을 정의하는 클래스를 만드세요.
 * 속성: 카드번호
 * 카드번호는 100번부터 시작하고 발급할 때마다 1씩 증가합니다.
 * 카드 3장을 생성한 후 카드정보를 출력하세요.
 * */
public class Quiz1 {

	public static void main(String[] args) {
		Card card1 = new Card("둘리", "VIP");
		card1.showInfo();
		
		Card card2 = new Card("또치", "SILVER");
		card2.showInfo();
		
		Card card3 = new Card("도우너", "SILVER");
		card3.showInfo();
	}
}

class Card {
	
	static int serialNum = 100;
	int cardNo; //카드번호
	String name; //이름
	String grade; //등급
	
	public Card(String name, String grade) {
		super();
		this.cardNo = serialNum; //카드번호에 시리얼번호를 대입한다
		this.name = name;
		this.grade = grade;
		serialNum++; //카드번호를 먼저 대입하고 다음에 시리얼번호 증가
	}

	public void showInfo() {
		System.out.println("카드번호:" + cardNo + ", 이름:" + name + ", 등급: " + grade);
	}

}

/* 아래와 같은 실행 예를 갖도록 프로그램을 작성하라.
• 실행 예제 (난수 발생이므로 매번 다른 숫자가 나옴)
•       1 번째  주사위  숫자  : 5
•       2 번째  주사위  숫자  : 6
•       3 번째  주사위  숫자  : 2
•       4 번째  주사위  숫자  : 4
•       5 번째  주사위  숫자  : 2
•       6 번째  주사위  숫자  : 4*/ 

public class Practice34 {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Dice d = new Dice();
		
		for(int i = 1; i < 7; i++) {
			d.roll();
			System.out.println(i + "번째 주사위 숫자 : " + d.getFace());
		}
	}
}
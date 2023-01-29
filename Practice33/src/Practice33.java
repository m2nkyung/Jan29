/* Practice 32의  Square 클래스에  메소드를  추가하여  아래와  같은  실행  예를  갖 
도록  프로그램을  작성하라.*/

import java.util.Scanner;
public class Practice33 {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner input = new Scanner(System.in);
		Square s1 = new Square();
		Square s2 = new Square();
		
		System.out.print("사각형 1의 가로 길이를 입력 : ");
		s1.setWidth(input.nextInt());
		System.out.print("사각형 1의 세로 길이를 입력 : ");
		s1.setHeight(input.nextInt());
		System.out.print("사각형 2의 가로 길이를 입력 : ");
		s2.setWidth(input.nextInt());
		System.out.print("사각형 2의 세로 길이를 입력 : ");
		s2.setHeight(input.nextInt());
		
		if(s1.isSmallerThan(s2) == true) {
			System.out.println("사각형 1의 넓이가 더 작다");
		} else {
			System.out.println("사각형 2의 넓이가 더 작다");
		}
	}
}
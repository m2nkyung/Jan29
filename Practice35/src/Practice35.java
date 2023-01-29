/* 비행기를  나타내는  Plane이라는  이름의  클래스를  설계하여라. Plane 클래스는  식별  번호, 모델, 승객  수를  필드로  가지고  있다. */

public class Practice35 {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Plane def = new Plane();
		def.setId(0);
		def.setModel("모름");
		def.setCapacity(0);
		
		System.out.println("디폴트 비행기의 값입니다.\n" + def.toString());
		
		Plane jeju = new Plane();
		jeju.setId(1030615);
		jeju.setModel("보잉 737");
		jeju.setCapacity(75);
		
		System.out.println("\n제주행 비행기의 값입니다.\n" + jeju.toString());
		
		Plane seoul = new Plane();
		seoul.setId(2464737);
		seoul.setModel("보잉 737");
		seoul.setCapacity(150);
	
		System.out.println("\n서울행 비행기의 값입니다.\n" + seoul.toString());
	}
}
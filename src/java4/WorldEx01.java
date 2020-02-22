package java4;

class 지구인 {
	
}

class 아시아인 extends 지구인{
	 
 }

class 한국인 extends 아시아인{
	
}

class  박보검 extends 한국인{
	String name = "박보검";
}

public class WorldEx01 {

	public static void main(String[] args) {
//		new 아시아인(); //아시아인이랑 지구인이랑 뜸
//		new 지구인(); //지구인만 뜸 
//		지구인 g = new 지구인();
//		System.out.println(g.name);
//		
//		박보검 b = new 박보검();
//		System.out.println(b.name);
//		
//		아시아인 a = new 박보검();
//		System.out.println(a.name);
//		
//		아시아인 a1 = new 한국인();
//		System.out.println(a1.name);
		
		아시아인 a2 = new 박보검();
		System.out.println(((박보검)a2).name);
	}

}

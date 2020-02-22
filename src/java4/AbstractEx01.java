package java4;

// 추상클래스는 new 할 수 없다.
// 추상클래스는 몸체가 있는 메서드와, 없는 메서드를 만들 수 있다.  //어댑터용과 일의 순서를 정할때 사용? 
// 걸러내기, 일순서정하기, 뉴 못하는것들

interface 칼 {
	public abstract void 킬();
	public abstract void 요리();
	public abstract void 군무();
	public abstract void 조각();
}

class 요리어댑터 implements 칼 {
	
}
class 백종원{
		
}


public class AbstractEx01 {
	public static void main(String[] args) {

	}

}

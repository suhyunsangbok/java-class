package java2;

// �� 72����
public class ForEx02 {

	static void forTest(int n1) {
		// 9��
		for (int i = 1; i <= 9; i++) {
			System.out.println(n1+"*"+i+"="+(n1*i));
		}
	}
	
	public static void main(String[] args) {
		
		// 8��
		for (int i = 2; i < 10; i++) {
			// 9��
			for (int k = 1; k <= 9; k++) {
				System.out.println(i+"*"+k+"="+(i*k));
			}
		}
		
	}

}

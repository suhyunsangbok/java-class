package java2;

/**
 * 
 * @author ��ȣ
 *  for �ݺ��� ��!! (Ű����) 
 *	 for(int i=0; i<10; i++){
 *
 *
 * }
 * 1. �ʱⰪ ���� int i=0;     -> i�� 0
 * 2. ������ �� i<10;          -> true
 * 3. ������ ���� (true)      -> ���� ����
 * 
 * 4. ������ i = i + 1             -> i�� 1
 * 5. ������ �� i<10            -> true
 * 6. ������ ���� (true)       -> ���� ����
 * 
 * 7. ������ i = i + 1              -> i�� 2
 * 8. ������ �� i<10            -> true
 * 9. ������ ���� (true)       -> ���� ����
 */

public class ForEx01 {

	static void hello(int i) {
		System.out.println(i+".�ȳ��ϼ���!!");
	}
	
	public static void main(String[] args) {
		for (int i = 3; i <= 100; i=i+3) {
			hello(i);
		}		
	}
}







package java2;

/**
 * 
 * @author ��ȣ
 *                if(���ǹ�){
 *                
 *                }
 *
 */

public class ForEx04 {

	public static void main(String[] args) {
		
		int n1 = 100;
		
		if(n1 >99) {
			System.out.println("���Դϴ�.");
		}
		
		for (int i = 1; i <= 100; i++) {
			
			if(i%3==1) {
				System.out.println("3���� ������ �������� 1�� ģ���� : "+i);
			}else {
				System.out.println(i);
			}
				
		}

	}

}

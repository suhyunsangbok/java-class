package java2;

/**
 * 
 * @author �� �׸���
 * �ۿ� �ִ� fot���� ���� ����
 * �ȿ� �ִ� for���� ���� ����
 */

public class StarEx01 {

	public static void main(String[] args) {
		System.out.println("   *"); // ���� 3, �� 1
		System.out.println(" ***"); // ���� 1, �� 3
		System.out.println("*****"); // ���� 0, �� 5
		System.out.println();

		for (int i = 0; i < 4; i++) {

			if (i == 3) {
				System.out.print("*");
			} else {
				System.out.print(" ");
			}
		}
		System.out.println();
		
		System.out.println("========= ���׸��� ==========");
		for (int i = 0; i < 5; i++) {

			if (i == 3) {
				System.out.print("*");
				break; // �ݺ����� ��������!!
			}
			
			System.out.print(" ");
		}
		System.out.println();
		
		for (int i = 0; i < 5; i++) {
			if(i==0) {
				System.out.print(" ");
			}else {
				if(i==4) break;
				System.out.print("*");	
			}
		}
		System.out.println();
		
		for (int i = 0; i < 5; i++) {
			System.out.print("*");
		}

	}

}

package java2;

public class ForEx05 {
	
	public static void main(String[] args) {
		
		for (int i = 1; i < 100; i++) {
			// 1���� 100������ �� �߿� 4�� ����� ����Ͻÿ�.
			if(i%4==0) {
				System.out.println(i);
			}
		}
		
		int sum = 0;
		
		for (int i = 1; i < 100; i++) {
			// 1���� 100������ �� �߿� 4�� ����� ���� ����Ͻÿ�.
			if(i%4==0) {
				sum = sum+i;
			}
		}
		
		System.out.println("���� : "+sum);
		
		// 1���� 10������ ���� ����Ͻÿ�.
		int result = 0;
		for (int i = 1; i < 10000; i++) {
			result = result +i;
		}
		System.out.println("���� : "+result);
	}
	
}

package java2;

import java.util.Scanner;

public class ForEx03 {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int n1 = sc.nextInt();
		System.out.println("���� �� : "+n1);
		
		// 8��	
		for (int i = n1; i < 9; i++) {
			// 9��
			for (int k = 1; k <= 9; k++) {
				System.out.println(i+"*"+k+"="+(i*k));
			}
		}
	}
}

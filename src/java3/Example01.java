package java3;

public class Example01 {

	// �ʸ� ���� -> ��, ��, �� �� ��ȯ�ؼ� ����!!
	static String changeTime(int sec) {
		String result = null;
		int min=0;
		int hour=0;
		int remainSec=0;
		
		// 10000
		min = sec/60; // 10000 / 60 = 166
		hour = min/60; // 166 / 60 = 2
		remainSec = sec % 60; // 10000 % 60 = 40
		min = min % 60; // 166 % 60 = 46
		
		result = hour+"�ð�"+min+"��"+remainSec+"��";
		return result;
	}
	
	public static void main(String[] args) {
		String time = changeTime(10000);
		System.out.println(time);
	}

}

package java3;

class ���Ǳ� {
	static String cola = "��ī�ݶ�";
	static String water = "��";
	
	static String �۵�(int money) {
		System.out.println("���ǱⰡ �۵��մϴ�.");
		System.out.println(money + "���� �޾ҽ��ϴ�.");
		return cola;
	}
}

class MemoryExample {
	int money = 500;

	int �뵷�ޱ�(String msg) {
		System.out.println(msg);
		System.out.println("�뵷�� �޾ҽ��ϴ�.");
		return money;
	}

	public static void main(String[] args) {
		MemoryExample me = new MemoryExample();
		int money = me.�뵷�ޱ�("�ƺ� ���������ϼ���.");
		String output = ���Ǳ�.�۵�(money);
		System.out.println(output + "�� �޾ҽ��ϴ�. �� ���ǲ���!!");
	}
}
package java3;

// Ŭ���� = ���赵
// ���� (����)
// ���� (�޼���)
// ������ (Constructor)
class Person {
	private String name;
	private int age;
	private String mind;
	private int height;
	private int weight;

	// ��� ������. = ���� ������.
	public Person(String name1, int age1, int height1, int weight1) {		
		name = name1;
		age = age1;
		height = height1;
		weight = weight1;
	}
	
	public void setName(String name1) {
		name = name1;
	}
	
	public String getName() {
		return name;
	}
	
	public void setAge(int age1) {
		age = age1;
	}
	
	public int getAge() {
		return age;
	}

	// �����̵� : �ΰ��� ������ 5�����Ͽ� �����ȴ�.
	public void setMind(String mind1) {
		if(age < 6) {
			mind = mind1;	
		}else {
			System.out.println("�� ���� ���ٲ�!!");
		}	
	}
	
	public String getMind() {
		return mind;
	}
	
	public void setHeight(int height1) {
		height = height1;
	}
	
	public int getHeight() {
		return height;
	}
	
	public void setWeight(int weight1) {
		weight = weight1;
	}
	
	public int getWeight() {
		return weight;
	}
}

public class OOPEx01 {

	public static void main(String[] args) {
		Person ����ȣ = new Person("����ȣ", 1, 50, 4);
		System.out.println(����ȣ.getName());
		System.out.println(����ȣ.getAge());
		System.out.println(����ȣ.getHeight());
		System.out.println(����ȣ.getWeight());
		
		// 5���� �귶��.
		����ȣ.setAge(5);
		����ȣ.setMind("�ҽ�");
		
		System.out.println("5�� ���~~~~~~~~~");
		System.out.println(����ȣ.getAge());
		System.out.println(����ȣ.getMind());
		
		System.out.println("7�� ���~~~~~~~~~");
		����ȣ.setAge(7);
		System.out.println(����ȣ.getAge());
	}

}

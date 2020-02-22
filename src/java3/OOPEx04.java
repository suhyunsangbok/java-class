package java3;

/**
 * 
 * @author �����ε��� �Ѱ�
 * �ذ��� : ������ (���)
 *
 */

// �������̽��� new�� �� ����.
// �������̽��� �߻�(abstract) �޼��带 ������.
// �������̽��� �޼���� public abstract�� �����Ǿ� �ִ�.
// �������̽��� �޼���� ��ü�� ���� �� ����.
// �������̽��� ������ �ڽ� Ŭ������ �߻� �޼��带 ������ �����ؾ� �Ѵ�. (������)
interface Unit {
	int getAttack();
	int getHp();
	void setHp(int hp);
	String getName();
}

class Zealot implements Unit{
	private String name;
	private int hp;
	private int attack;
	
	public Zealot(String name) {
		this(name, 100, 10);
	}

	public Zealot(String name, int hp, int attack) {
		this.name = name;
		this.hp = hp;
		this.attack = attack;
	}

	@Override
	public int getAttack() {
		return attack;
	}

	@Override
	public int getHp() {
		return hp;
	}

	@Override
	public void setHp(int hp) {
		this.hp = hp;
	}

	@Override
	public String getName() {
		return name;
	}
}

class Dragoon implements Unit {
	private String name;
	private int hp;
	private int attack;
	
	public Dragoon(String name) {
		this(name, 100, 20);
	}

	public Dragoon(String name, int hp, int attack) {
		this.name = name;
		this.hp = hp;
		this.attack = attack;
	}
	
	@Override
	public int getAttack() {
		return attack;
	}
	@Override
	public int getHp() {
		return hp;
	}
	@Override
	public void setHp(int hp) {
		this.hp = hp;
		
	}
	@Override
	public String getName() {
		return name;
	}
}

class Hydra implements Unit {
	private String name;
	private int hp;
	private int attack;
	
	public Hydra(String name) {
		this(name, 100, 30);
	}

	public Hydra(String name, int hp, int attack) {
		this.name = name;
		this.hp = hp;
		this.attack = attack;
	}	
	
	@Override
	public int getAttack() {
		return attack;
	}
	@Override
	public int getHp() {
		return hp;
	}
	@Override
	public void setHp(int hp) {
		this.hp = hp;
		
	}
	@Override
	public String getName() {
		return name;
	}
}

class Ultra implements Unit{
	private String name;
	private int hp;
	private int attack;
	
	public Ultra(String name) {
		this(name, 100, 40);
	}

	public Ultra(String name, int hp, int attack) {
		this.name = name;
		this.hp = hp;
		this.attack = attack;
	}	
	
	@Override
	public int getAttack() {
		return attack;
	}
	@Override
	public int getHp() {
		return hp;
	}
	
	@Override
	public String getName() {
		return name;
	}
	@Override
	public void setHp(int hp) {
		
	}
	
}

public class OOPEx04 {
	
	// ����� -> �����
	static void attack(Unit u1, Unit u2) {
		u2.setHp(u2.getHp() - u1.getAttack());
		
		System.out.println(u2.getName()+"�� ü���� "+u2.getHp()+"�Դϴ�.");
	}
	
	public static void main(String[] args) {
		Zealot z1 = new Zealot("����1");
		Dragoon d1 = new Dragoon("���1");
		Ultra ul1 = new Ultra("��Ʈ��1");
		
		// ���� -> ���
		attack(z1, d1);
		attack(z1, d1);
		attack(z1, d1);
		
		// ��� -> ����
		attack(d1, z1);
		
		Zealot z2 = new Zealot("����21");
		// ���� 1 -> ���� 2
		attack(z1, z2);
		attack(z1,ul1);
	}
	
}


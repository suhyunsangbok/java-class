package java3;

public class OOPEx02 {

	static void bookPrint(Book book) {
		System.out.println("å��ȣ : "+book.getNum());
		System.out.println("å�̸� : "+book.getName());
		System.out.println("å�������� : "+book.getPage());
		System.out.println("åī�װ� : "+book.getCategory());
		System.out.println("===========");
	}
	
	public static void main(String[] args) {
		Book b1 = new Book(1001, "�з��Ͼ�", 200, "�߸�"); // å �ѱ� ����
		Book b2 = new Book(1002, "�ﱹ��", 500, "����"); // å �ѱ� ����
		Book b3 = new Book(1003, "���ǿ���", 800, "����"); // å �ѱ� ����
		Book b4 = new Book(1004, "�︸��", 100, "�Ƶ�"); // å �ѱ� ����
		
		b3.setPage(900); // å �������� ����
		
		bookPrint(b1);
		bookPrint(b2);
		bookPrint(b3);
		bookPrint(b4);
	
	}

}

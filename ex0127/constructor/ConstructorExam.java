
//ConstructorExam.java
class Puppy{
		//String,int  Ÿ�� ���� ���� ����(member ��������)
		int age ; //0
		String name;//null
			

		/*	�޼ҵ� printPuppyName�ۼ�
			�μ�����, ���Ͼ���
			"public void printPuppyName() ȣ��Ǿ����ϴ�!"���
			���������� ���
		*/	
			
	public void printPuppyName(){
	System.out.println("public void printPuppyName() ȣ��Ǿ����ϴ�!");
	System.out.println("this.name : " + this.name);
	System.out.println("this.age : " + this.age);
	}
		
		/*�μ��� ���� ������ �ۼ�
			"������ public Puppy() ȣ��Ǿ����ϴ�!"���
			printPuppyName�޼ҵ� ȣ��
				�������� String��"�޸�" �Ҵ�
			�������� int�� -98998 �Ҵ�
		*/
	public Puppy(){
		System.out.println("public Puppy ( ) ȣ��Ǿ����ϴ�!");
	
		this.printPuppyName();

		this.name = "�޸�";

		this.age = -98998 ;

	}
}
//////////////////////////////////////////////////////////////////
class ConstructorExam{
	//���θ޼ҵ忡��
	public static void main(String [] agrs){
		//Puppy��ü ����
	Puppy p = new Puppy(); //�����ʵ带 �ʱ�ȭ , �����ڸ� ȣ���Ѵ�!!!
		System.out.println("--------------");
			p.printPuppyName();
		//Puppy��ü�� printPuppyName�޼ҵ� ȣ��
		
	}
}
			

class Puppy3{
	/*String Ÿ�� ���� ���� ����
		int Ÿ�� ���� ���� ����*/
		int age;  
		String name;
	
	/*�μ��� ���� �������ۼ�
		String Ÿ�� ���������� "�޸�" �Ҵ�
		"puplic Puppy3()ȣ��Ǿ����ϴ�"���
		�������� ���
	*/		
	public Puppy3(){
	
	this.name = "�޸�";
	System.out.println("public Puppy3 () ȣ��Ǿ����ϴ�!");
	System.out.println("�������� naem = " + this.name + " , age = " + this.age );
	}
	
	
	/*String Ÿ���� �μ� 1���� �޴� �������ۼ�
		String Ÿ�� ���������� �μ� �Ҵ�
		"puplic Puppy3()ȣ��Ǿ����ϴ�"���
		�������� ���
	*/	
	
	public  Puppy3(String name){
		this.name =name;
	System.out.println("public Puppy3 (String name) ȣ��Ǿ����ϴ�!");
	System.out.println("�������� naem = " + this.name + " , age = " + this.age );
	
	}	
	
	/*String Ÿ���� �μ� 2���� �޴� �������ۼ�
		�μ�2���� �ϳ��� String���� �����
		String Ÿ���� �μ� 1���� �޴� �����ڿ��� �μ��� �ָ� ȣ��
		"puplic Puppy3()ȣ��Ǿ����ϴ�"���
	*/		
		public Puppy3(String s ,String s2){//true��
		this(s+s2);//String �Ѱ� �޴� ������ ȣ��!!
	
		System.out.println("public Puppy3 (String s,String s2) ȣ��Ǿ����ϴ�!");
	}
	
	
	/*boolean Ÿ���� �μ� 1���� �޴� �������ۼ�
		�μ��� "��"�� �ٿ� �ϳ��� String���� �����
		String Ÿ���� �μ� 1���� �޴� �����ڿ��� �μ��� �ָ� ȣ��
		"puplic Puppy3()ȣ��Ǿ����ϴ�"  ���
	*/					
	public Puppy3(boolean b) {//true
	this(b + "��"); //String �Ѱ��޴� ������ ȣ��!!
		System.out.println("public Puppy3 (boolean b) ȣ��Ǿ����ϴ�!");
	
	}
	
	
	/*char Ÿ���� �μ� 1���� �޴� �������ۼ�
			�μ��� ���� �����ڸ� ȣ���ϰ�
			�μ��� ���� data�� intŸ�� ���������� �Ҵ�	
			"puplic Puppy3()ȣ��Ǿ����ϴ�"���
			int�� �����������
	*/			
		public Puppy3 (char ch){//A
			this();//�μ����� ������ȣ��(�⺻������)
			this.age = ch;
			System.out.println("public Puppy3 (char ch) ȣ��Ǿ����ϴ�!");
			System.out.println("�������� : " + this.age);
	} 
	
	
	/*�޼ҵ� printMemberVariable
	���� ����
	���������� ���
	*/	
	public void printMemberVariable	(){
		System.out.println("�������� naem = " + name);
		System.out.println("��������  age" + age + "\n\n");
	
	}

	
}

class ConstructorOverloadingExam{
		//���θ޼ҵ忡��
		public static void main(String [] args){
			//Puppy3 Ŭ������ �� �����ڸ� �ѹ��� �̿��� ��ü 5�� ����
			Puppy3 p = new Puppy3();

			System.out.println("----2----------");
			Puppy3 p2 = new Puppy3("java");//String�޴� ������ ȣ���

			System.out.println("----3----------");
			Puppy3 p3 = new Puppy3(" java " , " HI ");//String 2���޴� ������ ȣ���

			System.out.println("----4----------");
			Puppy3 p4 = new Puppy3(true);//boolean�޴� ������ ȣ���

			System.out.println("----5----------");
			Puppy3 p5 = new Puppy3('A');//char �޴� ������ ȣ���
			
			System.out.println("----�ּҰ� ���----------");
			System.out.println("p = " + p);
			System.out.println("p2 = " + p2);
			System.out.println("p3 = " + p3);
			System.out.println("p4 = " + p4);
			System.out.println("p5 = " + p5);

			
			System.out.println("----�� ��ü�� �޼ҵ� ȣ��----------");
			p.printMemberVariable();
			p2.printMemberVariable();
			p3.printMemberVariable();
			p4.printMemberVariable();
			p5.printMemberVariable();



	
			
		//�� ��ü�� printMemberVariable�޼ҵ带 �ѹ��� ȣ��
			
	}
}
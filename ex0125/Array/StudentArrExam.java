class StudentArrExam{
	public static void main (String [] args){
		Student stArr [] = new Student [3];
		for(int i=0; i < stArr.length ; i++){
			System.out.print("������ : stArr["+i+"] = " +stArr[i] + "\t");
		
	
		//Student�� �����ؼ� �迭�濡 �����Ѵ�.
		stArr[i] = new Student();
		System.out.print("������ : stArr["+i+"] = " +stArr[i] + "\n");
	  }

	  System.out.println("--------�л��� ���� ("+stArr.length+"��)------");
		for(int i =0 ; i < stArr.length ; i++){
		//�� ��ü(�л�)�� �Ӽ��� ������ ����غ���.
		System.out.print(stArr[i].getName+ " | ");
		System.out.print(stArr[i].getAge+ " | ");
		System.out.print(stArr[i].getAddr+ " \n");
		
		}
		
		//�л��� ������ ����;
		/**stArr[0].name= "����";
		stArr[0].age=20;
		stArr[0].addr="����";

		stArr[1].name= "ȿ��";
		stArr[1].age=25;
		stArr[1].addr="���ֵ�";

		stArr[2].name= "����";
		stArr[2].age=22;
		stArr[2].addr="����";

		*/

		stArr[0].setName("����");
		stArr[0].setAge(20);
		stArr[0].setAddr("����");

		stArr[1].setName("ȿ��");
		stArr[1].setAge(15);
		stArr[1].setAddr("���ֵ�");


		stArr[2].setName("����");
		stArr[2].setAge(-5);
		stArr[2].setAddr("����");




		System.out.println("--------�л��� ���� ("+stArr.length+"��)------");
		for(int i =0 ; i < stArr.length ; i++){
		//�� ��ü(�л�)�� �Ӽ��� ������ ����غ���.
		System.out.print(stArr[i].getName+ " | ");
		System.out.print(stArr[i].getAge+ " | ");
		System.out.print(stArr[i].getAddr+ " \n");
		}

	} //���γ�

}

////////////////////////////////////////////////////////
/**
	�л��� ���� (�̸�, ���� ,�ּ�)�� ������ ��ü
	:VO = Value Object , DTO = Data Transfer Object , Domain
*/

class Student{
	//�ܺο��� �Ӽ��� ���� �����ϰ� ��ȸ �Ҽ� ������ private. (��� , ��ȸ�ϰ� �����Ҽ� �ִ� �޼ҵ带 �����Ѵ�)

	private String name;//null
	private int age;//0
	private String addr;//null

	/*
		���� �����ϴ� �޼ҵ� : sexXxx()
		: ������ - public 
		  ����Ÿ�� - void
		  �μ� - �����Ϸ��� ������ ����


	*/
	public void setName (String name ){
	 //���
	    this.name=name;

	 }

	 public void setAge(int age ){
		if (age> 18 ){
			this.age=age;
		}else{
			System.out.println("������ ���� ��ȿ���� �ʽ��ϴ�.");
		}
	 }
	 public void setAge(String addr){
		 this.addr=addr;
	 }

	 /**
		���� ��ȸ�ϴ� �޼ҵ� : getXx()
		 ������ : public 
		 ����Ÿ�� : ��ȸ�Ϸ��� �Ӽ��� Ÿ��
		 �μ� : ����
	 */

	 public String getName(){
	  return name ;

	 }
	 public int getAge(){
		return age;
	 }
	
	public String getAddr(){
		return addr;
	 }
	}
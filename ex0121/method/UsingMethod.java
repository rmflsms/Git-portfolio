//UsingMethod.java
class UsingMethodExam{
     //�Ʒ��� ���� �޼ҵ带 �ۼ��ϼ���.
   
     /*Method�̸� :  methodExam03_01
     �ڱ��ڽŸ� ���ٰ���
     ReturnType : ����
     Parameter : ���� 1��
	(�����ο���)�ϴ� �� : 
	methodExam03_01�� ȣ��Ǿ����ϴ�. ���
	�μ��� ���� ���� ��� 
	����*2 ����. */
	private int methodExam03_01(int i){//3
		System.out.println("methodExam03_01�� ȣ��Ǿ����ϴ�.");
		System.out.println(" 1. �μ� : "+ i * 2);

		return i*2;
		}
	
	 
	 /*Method�̸� :  methodExam03_02
     ��𼭳� �ƹ��� ���ٰ���
     Return String
     Parameter : String 1��, ���� 1��
	(�����ο���)�ϴ� �� : 
		methodExam03_02�� ȣ��Ǿ����ϴ�. ���
		�μ��� ���� String �� �ٺ��� �ٿ��� ���
		�ι�°�μ��� ���� ���� methodExam03_01�� �־� �ָ� methodExam03_01�� ȣ���ϰ� �����ϴ� ���� ���
		�μ��� ���� String �� �ٺ��� �ٿ��� ����
	*/	

		public String methodExam03_02(String a , int i){
			System.out.println("methodExam03_02�� ȣ��Ǿ����ϴ�.");
			System.out.println(a + "�ٺ�");

			int result = this.methodExam03_01(i);//3
			System.out.println("���ϰ� : " + result);
			return a + "�ٺ�";
			
		}
			
	
	 /*Method�̸� :  methodExam03_03
     ���� package���� �ƹ��� ���� ����
     ReturnType : ���Ͼ���
     Parameter : ���� 1���� String 1��
     (�����ο���)�ϴ� �� : 
		methodExam03_03�� ȣ��Ǿ����ϴ�. ���
		�μ��� ���� ���� 1���� String 1���� �Ѱ��ָ�
		methodExam03_02ȣ��
	*/	
	void methodExam03_03(int c , String d){
			System.out.println("methodExam03_03�� ȣ��Ǿ����ϴ�.");

		methodExam03_02(d,  c);//����Ŭ���� ���� �ٸ� �޼ҵ� ȣ���ϰ� ������� ������Ѵ�.
		}
	
     
     /*Method�̸� :  methodExam03_04
     ��Ӱ����� ��𼭳� ���� ����
     ReturnType : �Ǽ�(�ε��Ҽ���)
     Parameter : ù��° �μ�(����),�ι�° �μ�(�Ǽ�), ����°�μ�(����)
	(�����ο���)�ϴ� �� : 
		methodExam03_04�� ȣ��Ǿ����ϴ�. ���
		�μ��� ���� ���� �̿��� 
		MakeMethodExam02��ü�� methodExam02_04�޼ҵ� ȣ���ϰ�
		method02_04�� �����ϴ� ���� ����
	*/	
		protected double methodExam03_04(int z ,double x , int v){
			System.out.println("methodExam03_04�� ȣ��Ǿ����ϴ�.");
			
			MakeMethodExam02 me = new MakeMethodExam02();

			double result = me.methodExam02_04(z,x,v);

			System.out.println("ȣ���� : " + result);
			return result;

			
	
	}


} // UsingMethodExam ��



/////////////////////////////////////////////////////////////////

class UsingMethod{
	//���θ޼ҵ忡��
		//UsingMethodExam�� ȣ�Ⱑ���� �޼ҵ���� ȣ���ϰ�
		// �����ϴ� �� �ִٸ� ���
		public static void main(String []args){
		 UsingMethodExam ue = new UsingMethodExam();
		 System.out.println("ue : " + ue ); ///�ּҰ�
		
		//�޼ҵ� ȣ���غ���
		  String re = ue.methodExam03_02("�������.", 3);
		  System.out.println("���ϰ�� : " + re);
	
		  System.out.println("=========================");
		  ue.methodExam03_03(3, "�� ����.");

		  System.out.println("=========================");
		  double result = ue.methodExam03_04(4,2.5,8);
		  System.out.println("��� : " + result);



		} //���α׷� ����
}


//MakeMethodExam.java
class MakeMethodExam{
	

/*
	ethod�̸� : methodExam01
	�ڱ��ڽŸ� ���ٰ���
	Return Type : ����
	Parameter : ����1��
	(�����ο���)�ϴ��� : 
	�μ��� ����(����)������ ����ϰ� �μ��� 2�� ���� Return
*/

   // mofifier ����Ÿ�� �޼ҵ��̸� (�μ�){}
	private int methodExam01(int i){ // 33
	//������
	System.out.println("�μ��� ���� ����: " + i);
	return i*2;

	}

/*
	Method�̸� : methodExam02
	��𿡼��� �ƹ��� ���ٰ���
	Return ����	
	Parameter ����
	(�����ο���)�ϴ��� : �ƹ��ų� ���
*/
	public void methodExam02(){
		System.out.println("�ƹ��ų� ���!!!");
	
	}
	
	
/*
	Method�̸� : methodExam03
	����pakage������ �ƹ��� ���ٰ���
	Return Type : Return ����
	Parameter : ����1��	
	(�����ο���)�ϴ��� : �μ��� ����(����) ������ ����ϰ�
		�׼��� ¦����� "¦��",Ȧ�����"Ȧ��" ���
*/
 void methodExam03(int i){//42
		System.out.println("�μ��� ���� ����: " + i);
		if (i%2==0){
		System.out.println("¦��");
		}else{
		System.out.println("Ȧ��");
		}
		
	
	} 

/*
	Method�̸� : methodExam04
	��Ӱ����� ��𼭳� ���ٰ���
	Return Type : StringŸ��
	Parameter : ����1��	
	(�����ο���)�ϴ��� : �μ��� ����(����) ������ ����ϰ�
		�׼��� ¦����� "¦��",Ȧ�����"Ȧ��" ����
*/

	protected String methodExam04(int a) {//17
		System.out.println("�μ��� ���� ����: " + a);
		/*if (a%2==0){
			return "¦��";
		}else{
			return "Ȧ��";
		}*/

		String result=" ";
		if(a%2==0)
			result ="¦��";
		else
			result = "Ȧ��";

		return result ;

	}

	public static void main(String []args){
		MakeMethodExam mme=new MakeMethodExam(); // ������ -> ���� 
		int k=mme.methodExam01(33);
		System.out.println(k);

		mme.methodExam02();

		mme.methodExam03(42);

		String s = mme.methodExam04(17);
		System.out.println(s);

	}

	
} // Ŭ������


class MethodInvoke01{
	//������ ���� �޼ҵ带 �ۼ��ϼ���.
	
	/*method �̸� : method01
	��𼭳� ������ ���ٰ���
	���� ����
	�μ��� ����2�� ����
	�μ��� ���� ���� 2���� ���ؼ� ����ϰ� ����*/
		
		public int method01(int i , int j){
		int z =  i* j ;
		System.out.println("�� ������ ��: " + z);
		return z ;
		}
}
///////////////////////////////////////////////////////////////////

class MethodInvoke02{
	
	//method �̸� : method02
	//��𼭳� ������ ���ٰ���,��ü�� �������� �ʰ� ���ٰ���
	//���� ����
	//�μ��� ����2�� ����
	
	//�μ��� ���� ���� 2���� ���ؼ� ����ϰ� ���Ѽ� ����
		
		public static int method02(int i , int j){ //8,6
			System.out.println("�� �μ��� �� : " + (i+j));
			return i+j;		
   }
}
class MethodInvokeExam{
	public static void main(String []args){
		

		
		//MethodInvoke01�� Method01 ȣ��
		
	MethodInvoke01 m = new MethodInvoke01();
	int re = m.method01(5,7);
	System.out.println("ȣ�� ��� : " + re);

System.out.println("=============================================");
		//MethodInvoke02�� method02 ȣ��
		
	re = MethodInvoke02.method02(8 ,6);
	System.out.println("ȣ�� ��� : " + re);
		

	}
}


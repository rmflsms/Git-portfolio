class IfExam01{
   //������ ���� �ݵ�� �ʿ��� ���θ޼ҵ� �ۼ�
public static void main(String []args){
	//������ ������ �����ϰ� ������ ������ �ʱ�ȭ�Ѵ�.
	int no = 45;

	//����� ������ ���� ¦���̸� "¦���Դϴ�." Ȧ���̸� "Ȧ���Դϴ�." ���
	

	if(no % 2 == 0){
		System.out.println(no + "�� ¦���Դϴ�.");
	}else {
		System.out.println(no + "�� Ȧ���Դϴ�.");
	}
 
	////////////////////////////////////////////////
	// ����� ������ 7�� ������ "7�ǹ���Դϴ�." , �ƴϸ� "7�ǹ���ƴϴ�" ���
	System.out.println("-------------------------------------------------");
	

	if(no % 7 == 0 ){
		System.out.println( no + " 7�� ��� �Դϴ�..");
	}else {
		System.out.println( no + " 7�� ����� �ƴϴ�.");
	}


	System.out.println("-------------------------------------------------");

	//�����߻�
	double nansu = Math.random();
	System.out.println("nansu = " + nansu);
	
	no = (int)(nansu*5)+1; // 1~5
	System.out.println("no = " + no);	


	}
}

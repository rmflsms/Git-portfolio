class IfExam02{
	// ���� �޼ҵ� 
		public static void main(String [] args){
		// ������ 1 ~ 10 ���̸� �߻��ؼ� ������ �����Ѵ�.
		int no = (int)(Math.random()*10 + 1); // 1~10	

		//�߻��� ������ 1�̸� �Ͽ��� , 2�̸� ������ , 3�̸� ȭ����, 4�̸� ������
		//5�̸� ����� , 6�̸� �ݿ��� , 7�̻��̸� �����

		String day="��";
		if(no == 1){
			day="��";
		}else if (no==2){
			day="��";
		}else if (no==3){
			day="ȭ";
		}else if (no==4){
			day="��";
		}else if (no==5){
			day="��";
		}else if (no==6){
			day="��";
		}

//////////////////////////////////////////////////////////
	/*if (no== 1) day"��";
	else if(no==2) day="��";
	else if(no==3) day="ȭ";*/



		/*if(no == 1){
			System.out.println(no + "������ �Դϴ�.");
		}else if (no == 2){
			System.out.println(no +"ȭ���� �Դϴ�.");
		}else if(no == 3){
			System.out.println(no +"������ �Դϴ�.");
		}else if(no == 4){
			System.out.println(no +"����� �Դϴ�.");
		}else if(no == 5){
			System.out.println(no +"�ݿ��� �Դϴ�.");
		}else if (no == 6){
			System.out.println(no +"����� �Դϴ�.");
		}else {
			System.out.println(no +"�Ͽ��� �Դϴ�.");
		}*/




		//���
		System.out.println(no+" �� " + day  + "����");
		
		}//���γ�

}//���γ�
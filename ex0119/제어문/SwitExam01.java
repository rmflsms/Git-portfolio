class SwitExam01 {
public static void main(String [] args){
	//1 ~ 10 ������ ������ �߻��ؼ� ������ �����Ѵ�.
	int no = (int)(Math.random()*10 + 1);
	//�߻��� ������ 1�̸� �Ͽ��� , 2�̸� ������ , 3�̸� ȭ����, 4�̸� ������
		//5�̸� ����� , 6�̸� �ݿ��� , 7�̻��̸� �����
		
		String day ="��";
		switch (no){
		case 1 : day= "��" ; break;
		case 2 : day= "��" ; break;
		case 3 : day= "ȭ" ; break;
		case 4 : day= "��" ; break;
		case 5 : day= "��" ; break;
		case 6 : day= "��" ; break;
		default : day="��";
	
		}
	System.out.println(no+ " �� " + day + "����");	
	
	System.out.println("===========================================");

	//1~12������ ������ �߻��ؼ� �߻��ѳ����� �ش��ϴ� �״��� ������ �ϼ��� ���Ѵ�.
	  //28�ϱ����Դϴ�(2). 30�ϱ��� �Դϴ�(4,6,9,11) 31�ϱ��� �Դϴ�(1,3,5,7,8,10,12).

	int month = (int)(Math.random()*12 + 1);

		switch (month){
		case 2 : System.out.println(month + "���� 28�ϱ����Դϴ�."); break;
		case 4 :
		case 6 :
		case 9 : 
		case 11 : System.out.println(month + "���� 30�ϱ����Դϴ�."); break; 
		default : System.out.println(month + "���� 31�ϱ����Դϴ�.") ;
	
		}

		System.out.println("=====================���� ������ if�� ����!!=======================");
	


		if(month == 4 || month == 6 ||month == 9 ||month == 11){
			System.out.println(month + "���� 30�ϱ����Դϴ�.");
		}else if (month==2){
			System.out.println(month + "���� 28�ϱ����Դϴ�.");
		}else {
			System.out.println(month + "���� 31�ϱ����Դϴ�.");
		}
	


   }//���θ޼�Ʈ

}//Ŭ������
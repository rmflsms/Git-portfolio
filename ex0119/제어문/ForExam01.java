class ForExam01{
  public static void main(String [] args){
	// 1. 1~100���� ���ٷ� ����ϱ�

	System.out.println("1. 1~100���� ���ٷ� ����ϱ� ================== ");

	for (int i = 1 ; i <= 100 ; i++ ){ //i= 1,2,3,4,5 ........101�Ǹ� �ݺ��� �׸��Ѵ�.
	 System.out.print(i +"\t");
	}


	// 2. 1~100���� ����ϵ� 5�� ����� ����ϱ�

	System.out.println("\n\n 2. 1~100���� ����ϵ� 5�� ����� ����ϱ� ================== ");

	for (int i = 1 ; i <= 100 ; i++ ){ 
		if(i%5 == 0){System.out.print(i +"\t");}

	}
	

	// 3. 1~100������ ���� ����ϱ�
	System.out.println("\n\n 3. 1~100���� ���� ����ϱ�================= ");

	int sum = 0;
		for (int i=1;i<=100;i++ ){
			sum += i;
		}

	System.out.println("\n 1~100 �� :  " + sum);

	// 4. A ~ Z���� ���
	for (char a='A';a<= 'Z';a++ ){
		System.out.print(a + "\t");
	}

	
	// 5. 1~ 100������ 3�� ����� �� ����ϱ�
	System.out.println("\n\n 5. 1~ 100������ 3�� ����� �� ����ϱ�================= ");

	//����
	int sum1 = 0;
		for (int i=1;i<=100;i++ ){
			if(i % 3 == 0){
				sum1 += i;
				
			}
			
		}

		System.out.println("\n 1~100 �� :  " + sum1);

	

	//6. 1 ~ 100 ����� 10�� 10���� ����ϱ� (for���ȿ� ���ǹ�����ϱ� , ����for�� �ȵ�)


	//7. 100~ 1���� �Ųٷ� ����ϱ� ( 100 99 98 ,........1)
	System.out.println("\n\n 2. 100~ 1���� �Ųٷ� ����ϱ�================= ");
	for (int i = 100 ; i >= 1 ; i-- ){ 
	 System.out.print(i +"\t");

	}
  }
}
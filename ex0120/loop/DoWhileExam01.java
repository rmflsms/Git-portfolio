class DoWhileExam01{
	public static void main (String [] args){
	

	  //1. 1 ~ 100���� ���ٷ� ����ϱ�
		int i =1;
		do{ 
			System.out.print(i + "\t");
			i++;
		}while(i<=100);

		
     
	   //2. 1 ~100���� ����ϵ� 5�� ����� ����ϱ�

	   System.out.println("1 ~100���� ����ϵ� 5�� ����� ����ϱ�");
	   i = 1;
		do{ 
			if(i%5==0)System.out.print(i + "\t");
			i++;
		}while(i<=100);
	   
	   //3. 1 ~100������ ���� ����ϱ� 
	   System.out.println("1 ~100������ ���� ����ϱ� ");
	   i =1;
	   int sum = 0;
	   do{
		   sum+=i;
		   i++;
	   }while(i<=100);
	   System.out.println("����: " + sum);
	   
	  
	   //4. A ~ Z���� ���

	   //5. 1~ 100������ 3�� ����� �� ����ϱ�
	  
	   //6. 1 ~ 100 ����� 10�� 10���� ����ϱ� (dowhile���ȿ� ���ǹ�����ϱ� , ����dowhile�� �ȵ�)
      
	   //7. 100 ~ 1���� �Ųٷ� ����ϱ� ( 100 99 98,.... 1 )
	}
}
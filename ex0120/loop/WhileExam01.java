class WhileExam01{
 public static void main (String [] args){
   

   //1. 1 ~ 100���� ���ٷ� ����ϱ�
		System.out.println("\n 1 ~ 100���� ���ٷ� ����ϱ�===========================");
        int i = 1;
		while (i<=100){
			System.out.print(i++ + "\t");
			i++;
        }

	   //2. 1 ~100���� ����ϵ� 5�� ����� ����ϱ�
		System.out.println("\n\n1 ~100���� ����ϵ� 5�� ����� ����ϱ�===========================");
			 i = 1 ;
			while (i<=100 ){	
				if (i%5 == 0)
				System.out.print(i + "\t");
				i++;
			}

	   
	   //3. 1 ~100������ ���� ����ϱ� 
			System.out.println("\n 1 ~100������ ���� ����ϱ�===========================");
			i = 1;
			int sum = 0;
			while (i<=100){
				sum += i;
				i++;
			}
			System.out.println( "����: " + sum);
		

	  
	   //4. A ~ Z���� ���
	   System.out.println("\n A ~ Z���� ����ϱ�===========================");
	   char ch ='A';
		while (ch<='Z'){
			System.out.print(ch+ "\t");
			ch++;
        }

	   //5. 1~ 100������ 3�� ����� �� ����ϱ�
	    System.out.println("\n1~ 100������ 3�� ����� �� ����ϱ�===========================");
	 	 i = 1 ;
		 sum =0 ; 
		 while (i<=100 ){	
		 if (i%3 == 0)sum+=i;
		 i++;
		
				
			}
		System.out.print(sum + "\t");


	   //6. 1 ~ 100 ����� 10�� 10���� ����ϱ� (while���ȿ� ���ǹ�����ϱ� , ����for�� �ȵ�)
	    System.out.println("\n 1 ~ 100 ����� 10�� 10���� ����ϱ�===========================");
		i=1;
		while (i<=100){
			System.out.print( i + "\t");
			if(i%10==0)System.out.println();
			i++;
		}
		
		

      
	   //7. 100 ~ 1���� �Ųٷ� ����ϱ� ( 100 99 98,.... 1 )
		System.out.println("\n 100 ~ 1���� �Ųٷ� ����ϱ�===========================");
        i = 100;
		while (i>=1){
			System.out.print(i + "\t");
			i--;
        }

        

 }
}
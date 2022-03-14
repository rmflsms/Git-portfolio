class WhileExam01{
 public static void main (String [] args){
   

   //1. 1 ~ 100까지 한줄로 출력하기
		System.out.println("\n 1 ~ 100까지 한줄로 출력하기===========================");
        int i = 1;
		while (i<=100){
			System.out.print(i++ + "\t");
			i++;
        }

	   //2. 1 ~100까지 출력하되 5의 배수만 출력하기
		System.out.println("\n\n1 ~100까지 출력하되 5의 배수만 출력하기===========================");
			 i = 1 ;
			while (i<=100 ){	
				if (i%5 == 0)
				System.out.print(i + "\t");
				i++;
			}

	   
	   //3. 1 ~100까지의 합을 출력하기 
			System.out.println("\n 1 ~100까지의 합을 출력하기===========================");
			i = 1;
			int sum = 0;
			while (i<=100){
				sum += i;
				i++;
			}
			System.out.println( "총합: " + sum);
		

	  
	   //4. A ~ Z까지 출력
	   System.out.println("\n A ~ Z까지 출력하기===========================");
	   char ch ='A';
		while (ch<='Z'){
			System.out.print(ch+ "\t");
			ch++;
        }

	   //5. 1~ 100사이의 3의 배수의 합 출력하기
	    System.out.println("\n1~ 100사이의 3의 배수의 합 출력하기===========================");
	 	 i = 1 ;
		 sum =0 ; 
		 while (i<=100 ){	
		 if (i%3 == 0)sum+=i;
		 i++;
		
				
			}
		System.out.print(sum + "\t");


	   //6. 1 ~ 100 출력을 10행 10열로 출력하기 (while문안에 조건문사용하기 , 이중for문 안됨)
	    System.out.println("\n 1 ~ 100 출력을 10행 10열로 출력하기===========================");
		i=1;
		while (i<=100){
			System.out.print( i + "\t");
			if(i%10==0)System.out.println();
			i++;
		}
		
		

      
	   //7. 100 ~ 1까지 거꾸로 출력하기 ( 100 99 98,.... 1 )
		System.out.println("\n 100 ~ 1까지 거꾸로 출력하기===========================");
        i = 100;
		while (i>=1){
			System.out.print(i + "\t");
			i--;
        }

        

 }
}
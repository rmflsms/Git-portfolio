class DoWhileExam01{
	public static void main (String [] args){
	

	  //1. 1 ~ 100까지 한줄로 출력하기
		int i =1;
		do{ 
			System.out.print(i + "\t");
			i++;
		}while(i<=100);

		
     
	   //2. 1 ~100까지 출력하되 5의 배수만 출력하기

	   System.out.println("1 ~100까지 출력하되 5의 배수만 출력하기");
	   i = 1;
		do{ 
			if(i%5==0)System.out.print(i + "\t");
			i++;
		}while(i<=100);
	   
	   //3. 1 ~100까지의 합을 출력하기 
	   System.out.println("1 ~100까지의 합을 출력하기 ");
	   i =1;
	   int sum = 0;
	   do{
		   sum+=i;
		   i++;
	   }while(i<=100);
	   System.out.println("총합: " + sum);
	   
	  
	   //4. A ~ Z까지 출력

	   //5. 1~ 100사이의 3의 배수의 합 출력하기
	  
	   //6. 1 ~ 100 출력을 10행 10열로 출력하기 (dowhile문안에 조건문사용하기 , 이중dowhile문 안됨)
      
	   //7. 100 ~ 1까지 거꾸로 출력하기 ( 100 99 98,.... 1 )
	}
}
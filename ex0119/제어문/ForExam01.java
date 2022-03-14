class ForExam01{
  public static void main(String [] args){
	// 1. 1~100까지 한줄로 출력하기

	System.out.println("1. 1~100까지 한줄로 출력하기 ================== ");

	for (int i = 1 ; i <= 100 ; i++ ){ //i= 1,2,3,4,5 ........101되면 반복을 그만한다.
	 System.out.print(i +"\t");
	}


	// 2. 1~100까지 출력하되 5의 배수만 출력하기

	System.out.println("\n\n 2. 1~100까지 출력하되 5의 배수만 출력하기 ================== ");

	for (int i = 1 ; i <= 100 ; i++ ){ 
		if(i%5 == 0){System.out.print(i +"\t");}

	}
	

	// 3. 1~100까지의 합을 출력하기
	System.out.println("\n\n 3. 1~100까지 합을 출력하기================= ");

	int sum = 0;
		for (int i=1;i<=100;i++ ){
			sum += i;
		}

	System.out.println("\n 1~100 합 :  " + sum);

	// 4. A ~ Z까지 출력
	for (char a='A';a<= 'Z';a++ ){
		System.out.print(a + "\t");
	}

	
	// 5. 1~ 100사이의 3의 배수의 합 출력하기
	System.out.println("\n\n 5. 1~ 100사이의 3의 배수의 합 출력하기================= ");

	//질문
	int sum1 = 0;
		for (int i=1;i<=100;i++ ){
			if(i % 3 == 0){
				sum1 += i;
				
			}
			
		}

		System.out.println("\n 1~100 합 :  " + sum1);

	

	//6. 1 ~ 100 출력을 10행 10열로 출력하기 (for문안에 조건문사용하기 , 이중for문 안됨)


	//7. 100~ 1까지 거꾸로 출력하기 ( 100 99 98 ,........1)
	System.out.println("\n\n 2. 100~ 1까지 거꾸로 출력하기================= ");
	for (int i = 100 ; i >= 1 ; i-- ){ 
	 System.out.print(i +"\t");

	}
  }
}
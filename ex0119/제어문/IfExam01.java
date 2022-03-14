class IfExam01{
   //실행을 위해 반드시 필요한 메인메소드 작성
public static void main(String []args){
	//정수형 변수를 선언하고 임의의 값으로 초기화한다.
	int no = 45;

	//선언된 변수의 값이 짝수이면 "짝수입니다." 홀수이면 "홀수입니다." 출력
	

	if(no % 2 == 0){
		System.out.println(no + "는 짝수입니다.");
	}else {
		System.out.println(no + "는 홀수입니다.");
	}
 
	////////////////////////////////////////////////
	// 선언된 변수가 7의 배수라면 "7의배수입니다." , 아니면 "7의배수아니다" 출력
	System.out.println("-------------------------------------------------");
	

	if(no % 7 == 0 ){
		System.out.println( no + " 7의 배수 입니다..");
	}else {
		System.out.println( no + " 7의 배수가 아니다.");
	}


	System.out.println("-------------------------------------------------");

	//난수발생
	double nansu = Math.random();
	System.out.println("nansu = " + nansu);
	
	no = (int)(nansu*5)+1; // 1~5
	System.out.println("no = " + no);	


	}
}

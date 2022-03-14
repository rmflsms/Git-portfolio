class IfExam02{
	// 메인 메소드 
		public static void main(String [] args){
		// 난수를 1 ~ 10 사이를 발생해서 변수에 저장한다.
		int no = (int)(Math.random()*10 + 1); // 1~10	

		//발생한 난수가 1이면 일요일 , 2이면 월요일 , 3이면 화요일, 4이면 수요일
		//5이면 목요일 , 6이면 금요일 , 7이상이면 토요일

		String day="토";
		if(no == 1){
			day="일";
		}else if (no==2){
			day="월";
		}else if (no==3){
			day="화";
		}else if (no==4){
			day="수";
		}else if (no==5){
			day="목";
		}else if (no==6){
			day="금";
		}

//////////////////////////////////////////////////////////
	/*if (no== 1) day"일";
	else if(no==2) day="월";
	else if(no==3) day="화";*/



		/*if(no == 1){
			System.out.println(no + "월요일 입니다.");
		}else if (no == 2){
			System.out.println(no +"화요일 입니다.");
		}else if(no == 3){
			System.out.println(no +"수요일 입니다.");
		}else if(no == 4){
			System.out.println(no +"목요일 입니다.");
		}else if(no == 5){
			System.out.println(no +"금요일 입니다.");
		}else if (no == 6){
			System.out.println(no +"토요일 입니다.");
		}else {
			System.out.println(no +"일요일 입니다.");
		}*/




		//출력
		System.out.println(no+" 는 " + day  + "요일");
		
		}//메인끝

}//메인끝
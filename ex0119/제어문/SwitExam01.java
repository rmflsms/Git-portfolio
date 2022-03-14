class SwitExam01 {
public static void main(String [] args){
	//1 ~ 10 사이의 난수를 발생해서 변수에 저장한다.
	int no = (int)(Math.random()*10 + 1);
	//발생한 난수가 1이면 일요일 , 2이면 월요일 , 3이면 화요일, 4이면 수요일
		//5이면 목요일 , 6이면 금요일 , 7이상이면 토요일
		
		String day ="토";
		switch (no){
		case 1 : day= "일" ; break;
		case 2 : day= "월" ; break;
		case 3 : day= "화" ; break;
		case 4 : day= "수" ; break;
		case 5 : day= "목" ; break;
		case 6 : day= "금" ; break;
		default : day="토";
	
		}
	System.out.println(no+ " 는 " + day + "요일");	
	
	System.out.println("===========================================");

	//1~12사이의 난수를 발생해서 발생한난수의 해당하는 그달의 마지막 일수를 구한다.
	  //28일까지입니다(2). 30일까지 입니다(4,6,9,11) 31일까지 입니다(1,3,5,7,8,10,12).

	int month = (int)(Math.random()*12 + 1);

		switch (month){
		case 2 : System.out.println(month + "월은 28일까지입니다."); break;
		case 4 :
		case 6 :
		case 9 : 
		case 11 : System.out.println(month + "월은 30일까지입니다."); break; 
		default : System.out.println(month + "월은 31일까지입니다.") ;
	
		}

		System.out.println("=====================위의 문제를 if문 변경!!=======================");
	


		if(month == 4 || month == 6 ||month == 9 ||month == 11){
			System.out.println(month + "월은 30일까지입니다.");
		}else if (month==2){
			System.out.println(month + "월은 28일까지입니다.");
		}else {
			System.out.println(month + "월은 31일까지입니다.");
		}
	


   }//메인메소트

}//클래스끝
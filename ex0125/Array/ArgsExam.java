class ArgsExam{
	public static void main(String [] args){// 배열이 전달된다!!
	
		System.out.println("args = " + args);
		System.out.println("args.length = " +args.length );

		// 실행할때 입력한 모든 값을 출력해본다.
		/**for(int i=0 ; i< args.length ; i++){
		System.out.println("args[ " + i+"]" + args[i]);
		}
	}*/
		System.out.println("두수의 합 : " + (args[0]+args[1]) );
		
		// String --> int 로 변환 : Integer.parseInt(문자열) / int ---> String 변환 : Integer.toString(숫자)

		int sum = Integer.parseInt(args[0]) + Integer.parseInt(args[1]);
		System.out.println("두수의 합 : " + sum);
	
		System.out.println("***프로그램 종료***");
	}//메인 끝
}

/**
	실행할때
		java 파일이름

		ex) java ArgExam


*/
class BooleanOPeratorExam{
	public static void main(String args[]){
		boolean  t=true ;
		boolean f=false;
		System.out.println("true&false="+(t & f )); // f
		System.out.println("true&true="+(t&t)); // t
		System.out.println("false&false="+(f&f)); //f
		System.out.println();// 여백 효과 
	
		System.out.println("true|false="+(t|f)); // t
		System.out.println("true|true="+(t|t)); // t
		System.out.println("false|false="+(f|f)); // f
		System.out.println();

		System.out.println("true^false="+(t^f)); // f
		System.out.println("true^true="+(t^t)); // t
		System.out.println("true^false="+(t^f)); // f
		System.out.println("true^true="+(t^t)); // f
		System.out.println();

		System.out.println("true&&false="+(t&&f)); // f
		System.out.println("true&&true="+(t&&t)); // t
		System.out.println("true&&false="+(t&&f)); // f
		System.out.println("false&&false="+(f&&f)); // f
		System.out.println();

		System.out.println("true||false="+(t||f)); // t
		System.out.println("true||true="+(t||t)); // t
		System.out.println("false||false="+(f||f)); // f
		System.out.println();

		int i=5; int j=3;
		System.out.println("int i="+i+"\tint j="+j);//\t :tab \n : newline 
		System.out.println("i>=j==>>"+(i>=j));
		System.out.println("i>j=>>"+(i>j));
		System.out.println("i<=j=>>"+(i<=j));
		System.out.println("i<j=>>"+(i<j));
		System.out.println("i==j=>>"+(i==j)); //f
		System.out.println("i!=j=>>"+(i != j));
		
		System.out.println("-----------------------");
		//System.out.println( true || test()); //false
		
		System.out.println( false && test() ) ; //false



		System.out.println("---------삼향연산자-------------");
		int avg= 50 ; //avg가 60이상이면 합격, 아니면 불합격!!! 출력하고 싶다.

		//조건식 ? 참인경우 : 거짓인경우;
		String result= avg>=60 ? "합격" : "불합격" ; 
		System.out.println(avg + "점수의 결과: " + result);

	}// 메인메소드끝

	//메소드 작성
	public static boolean test(){
		System.out.println("출력되니????");

		return false;
}

}//클래스끝


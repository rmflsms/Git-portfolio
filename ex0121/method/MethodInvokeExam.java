class MethodInvoke01{
	//다음과 같이 메소드를 작성하세요.
	
	/*method 이름 : method01
	어디서나 누구나 접근가능
	정수 리턴
	인수로 정수2개 받음
	인수로 들어온 정수 2개를 곱해서 출력하고 리턴*/
		
		public int method01(int i , int j){
		int z =  i* j ;
		System.out.println("두 정수의 곱: " + z);
		return z ;
		}
}
///////////////////////////////////////////////////////////////////

class MethodInvoke02{
	
	//method 이름 : method02
	//어디서나 누구나 접근가능,객체를 생성하지 않고도 접근가능
	//정수 리턴
	//인수로 정수2개 받음
	
	//인수로 들어온 정수 2개를 더해서 출력하고 더한수 리턴
		
		public static int method02(int i , int j){ //8,6
			System.out.println("두 인수의 합 : " + (i+j));
			return i+j;		
   }
}
class MethodInvokeExam{
	public static void main(String []args){
		

		
		//MethodInvoke01의 Method01 호출
		
	MethodInvoke01 m = new MethodInvoke01();
	int re = m.method01(5,7);
	System.out.println("호출 결과 : " + re);

System.out.println("=============================================");
		//MethodInvoke02의 method02 호출
		
	re = MethodInvoke02.method02(8 ,6);
	System.out.println("호출 결과 : " + re);
		

	}
}


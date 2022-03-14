class VariableTest{
 public static void main (String [] args){
	 System.out.println("*********메소드 호출해보자********");
		 Test t = new Test(); //t변수를 이용해서 속성, 메소드 접근가능하다.
		 t.aa();//메소드 호출

		System.out.println("============bb()호출해보자=========");
		t.bb();

		System.out.println("============t변수가 가리키는 객체의 변수 접근해보자=========");
		System.out.println("t.a = " + t.a);
		//System.out.println("t.name = " + t.name); // private 맴버필드이므로 외부에서 접근불가
 }

}

//////////////////////////////////////////////////////
class Test{
	public int a; //전역변수
	private String name;//전역변수

	public void aa(){
			/*public*/ int a = 10;//지역변수(지역변수 앞에는 제한자 올수 없다.), 지역변수는 사용전 반드시 초기화
			String addr = "서울";

			System.out.println("a = " +a);
			System.out.println("this.a = "+this.a); // this. 은 전역변수를 칭한다.


			System.out.println("name : " + name); // 
			System.out.println("this.name : " + this.name);

			System.out.println("addr : " + addr);
			//System.out.println("this.addr : " + this.addr);//지역변수앞에 this 사용불가.

	}

	public void bb(){

			System.out.println("a = " +a);//0
			System.out.println("this.a = "+this.a);//0 // this. 은 전역변수를 칭한다.


			System.out.println("name : " + name); //null
			System.out.println("this.name : " + this.name);//null

			//System.out.println("addr : " + addr);// 오류
	
	}

}






//ConstructorExam.java
class Puppy{
		//String,int  타입 전역 변수 선언(member 변수선언)
		int age ; //0
		String name;//null
			

		/*	메소드 printPuppyName작성
			인수없음, 리턴안함
			"public void printPuppyName() 호출되었습니다!"출력
			전역변수를 출력
		*/	
			
	public void printPuppyName(){
	System.out.println("public void printPuppyName() 호출되었습니다!");
	System.out.println("this.name : " + this.name);
	System.out.println("this.age : " + this.age);
	}
		
		/*인수가 없는 생성자 작성
			"생성자 public Puppy() 호출되었습니다!"출력
			printPuppyName메소드 호출
				전역변수 String에"메리" 할당
			전역변수 int에 -98998 할당
		*/
	public Puppy(){
		System.out.println("public Puppy ( ) 호출되었습니다!");
	
		this.printPuppyName();

		this.name = "메리";

		this.age = -98998 ;

	}
}
//////////////////////////////////////////////////////////////////
class ConstructorExam{
	//메인메소드에서
	public static void main(String [] agrs){
		//Puppy객체 생성
	Puppy p = new Puppy(); //전역필드를 초기화 , 생성자를 호출한다!!!
		System.out.println("--------------");
			p.printPuppyName();
		//Puppy객체의 printPuppyName메소드 호출
		
	}
}
			

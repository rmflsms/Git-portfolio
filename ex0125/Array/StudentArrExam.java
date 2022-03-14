class StudentArrExam{
	public static void main (String [] args){
		Student stArr [] = new Student [3];
		for(int i=0; i < stArr.length ; i++){
			System.out.print("생성전 : stArr["+i+"] = " +stArr[i] + "\t");
		
	
		//Student를 생성해서 배열방에 저장한다.
		stArr[i] = new Student();
		System.out.print("생성전 : stArr["+i+"] = " +stArr[i] + "\n");
	  }

	  System.out.println("--------학생의 정보 ("+stArr.length+"명)------");
		for(int i =0 ; i < stArr.length ; i++){
		//각 객체(학생)의 속성의 정보를 출력해보자.
		System.out.print(stArr[i].getName+ " | ");
		System.out.print(stArr[i].getAge+ " | ");
		System.out.print(stArr[i].getAddr+ " \n");
		
		}
		
		//학생의 정보를 변경;
		/**stArr[0].name= "나영";
		stArr[0].age=20;
		stArr[0].addr="서울";

		stArr[1].name= "효리";
		stArr[1].age=25;
		stArr[1].addr="제주도";

		stArr[2].name= "희정";
		stArr[2].age=22;
		stArr[2].addr="성남";

		*/

		stArr[0].setName("나영");
		stArr[0].setAge(20);
		stArr[0].setAddr("서울");

		stArr[1].setName("효리");
		stArr[1].setAge(15);
		stArr[1].setAddr("제주도");


		stArr[2].setName("희정");
		stArr[2].setAge(-5);
		stArr[2].setAddr("성남");




		System.out.println("--------학생의 정보 ("+stArr.length+"명)------");
		for(int i =0 ; i < stArr.length ; i++){
		//각 객체(학생)의 속성의 정보를 출력해보자.
		System.out.print(stArr[i].getName+ " | ");
		System.out.print(stArr[i].getAge+ " | ");
		System.out.print(stArr[i].getAddr+ " \n");
		}

	} //메인끝

}

////////////////////////////////////////////////////////
/**
	학생의 정보 (이름, 나이 ,주소)를 관리할 객체
	:VO = Value Object , DTO = Data Transfer Object , Domain
*/

class Student{
	//외부에서 속성을 직접 변경하고 조회 할수 없도록 private. (대신 , 조회하고 변경할수 있는 메소드를 제공한다)

	private String name;//null
	private int age;//0
	private String addr;//null

	/*
		갑을 변경하는 메소드 : sexXxx()
		: 제한자 - public 
		  리턴타입 - void
		  인수 - 변경하려는 데이터 전달


	*/
	public void setName (String name ){
	 //기능
	    this.name=name;

	 }

	 public void setAge(int age ){
		if (age> 18 ){
			this.age=age;
		}else{
			System.out.println("나이의 값이 유효하지 않습니다.");
		}
	 }
	 public void setAge(String addr){
		 this.addr=addr;
	 }

	 /**
		값을 조회하는 메소드 : getXx()
		 제한자 : public 
		 리턴타입 : 조회하려는 속성의 타입
		 인수 : 없음
	 */

	 public String getName(){
	  return name ;

	 }
	 public int getAge(){
		return age;
	 }
	
	public String getAddr(){
		return addr;
	 }
	}
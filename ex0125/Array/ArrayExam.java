class ArrayExam{
	
	//각int,double,char,boolean ,String type별로 총 5개씩 저장하는  배열을 생성하세요
	int [] intArr = new int [5];
	double [] doubleArr = new double [5];
	String [] StringArr = new String [5];
	char [] charArr = new char [5] ;
	boolean [] booleanArr = new boolean[5];


	//메소드 : printArrayValue01	
	//위의 배열들에 자동으로 초기화 된값을 출력하세요
	public void printArrayValue01() {
	System.out.println("********arrI 주소값 = " + intArr);
	for (int i = 0; i< intArr.length ; i++){ //i<arr.length 숫자로 변경해도 되지만 유지보수 어렵다
			System.out.println("intArr[" + i +"] = " + intArr[i]);
		}
	System.out.println("****개선된 for int*******");
	for(int v :intArr){
		System.out.println(v);
	}

	System.out.println();

	System.out.println("********doubleArr 주소값 = " + doubleArr);
	for (int i = 0; i< doubleArr.length ; i++){ //i<arr.length 숫자로 변경해도 되지만 유지보수 어렵다
		System.out.println("doubleArr[" + i +"] = " + doubleArr[i]);
		}
		System.out.println("****개선된 for int*******");
		for(double v :doubleArr){
		System.out.println(v);
	}

	System.out.println();

	System.out.println("********StringArr 주소값 = " + StringArr);
	for (int i = 0; i< doubleArr.length ; i++){ //i<arr.length 숫자로 변경해도 되지만 유지보수 어렵다
			System.out.println("StringArr[" + i +"] = " + StringArr[i]);
		}
		System.out.println("****개선된 for int*******");
		for(String v :StringArr){
		System.out.println(v);
		}
	
	System.out.println();

	System.out.println("********charArr 주소값 = " + charArr);
	for (int i = 0; i< doubleArr.length ; i++){ //i<arr.length 숫자로 변경해도 되지만 유지보수 어렵다
			System.out.println("charArr[" + i +"] = " + charArr[i]);
		}
		System.out.println("****개선된 for int*******");
		for(char v :charArr){
		System.out.println(v);
		}

	System.out.println();

	System.out.println("********booleanArr 주소값 = " + booleanArr);
	for (int i = 0; i< booleanArr.length ; i++){ //i<arr.length 숫자로 변경해도 되지만 유지보수 어렵다
			System.out.println("charArr[" + i +"] = " + booleanArr[i]);
		}
		System.out.println("****개선된 for int*******");
		for( boolean v :booleanArr){
		System.out.println(v);
		}
	}


	//메소드 : printArrayValue02	
	//위의 5개의 배열에서 각각 적당한 값으로 data를 할당하세요.
	public void printArrayValue02() {
		for(int i= 0; i< intArr.length;i++){
			intArr[i] = i*10;
			doubleArr [i] = i*0.5;
			charArr [i] = (char)('A' + i);

			if (i%2==0)booleanArr[i]=true;

			StringArr[i] = "A"+i;

		}
	
	}
	
	//메소드 : printArrayValue03	
	//새롭게 할당된값을 출력하세요
	public void printArrayValue03() {

		System.out.print("===========변경 후 ==================");
		
		this.printArrayValue01();// 출력을 담당하는 메소드

		System.out.println('\n');
	
	}
	
	//메인메소드에서
	//ArrayExam의 메소드들을 순서대로 호출하세요.

	public static void main(String args []){
        
		ArrayExam av = new ArrayExam();
		av.printArrayValue01();
		av.printArrayValue02();
		av.printArrayValue03();
		
	}
  
}//클래스 끝
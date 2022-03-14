class CastingExam{

	//실행을 위해서 반드시 필요한 메인메소드
	public static void main(String []args){
		byte b1;
		byte b2,b3; 
		int i1=7;
		System.out.println("int i1="+i1);

		b1=(byte)i1 ; //int 4byte를 byte에 담을수 없다. 캐스팅이 필요하다.
		System.out.println("byte b1="+b1);

		b2=20;
		System.out.println("byte b2="+b2);
		
	   	b3=(byte)(b2+b1); // 연산을 하면 최소한 4byte 공간이 필요하므로 연산결과는 int형이다. 이 결과를 byte에 담을수없다.!!!

		System.out.println("byte b3="+b3);
		
		long lo=56897L;// L (logn)
		System.out.println("long lo="+lo);

		int i4=(int)(lo+i1); // 묶고 int 변경
		System.out.println("int i4="+i4);
		
		boolean boo; // true 또는 false 
		 boo= true; //boolean형은 true ,false만 가능하다. 
		
		System.out.println("boolean boo="+boo);

		double d=4.67e-3; //0.00467 e - 소수점
		System.out.println("double d="+d);

		float f1 = lo;//정수 8byte를 실수 4byte에 저장하는데 문제없다!! int < long < float < double
		System.out.println("float f1="+f1);
				
		
	    float f2=(float)d;
		System.out.println("float f2="+f2);

		char c1,c2, c3;
		c1='\u0061'; // 유니코드 
		System.out.println("char c1="+c1);

		 b2=(byte)c1; 
		System.out.println("byte b2="+b2);
		
		c2='가';
		System.out.println("char c2="+c2);
		
		
		c3=(char)(c2+1);
		System.out.println("char c3="+c3);
		
		char  chaValue= 'A';
		//short shortValue = chaValue;

		short shortValue = 'A';
		System.out.println(shortValue);


		String strValue = "A";
		char var = (char)shortValue;

	}

}
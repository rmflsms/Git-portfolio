class CastingExam{

	//������ ���ؼ� �ݵ�� �ʿ��� ���θ޼ҵ�
	public static void main(String []args){
		byte b1;
		byte b2,b3; 
		int i1=7;
		System.out.println("int i1="+i1);

		b1=(byte)i1 ; //int 4byte�� byte�� ������ ����. ĳ������ �ʿ��ϴ�.
		System.out.println("byte b1="+b1);

		b2=20;
		System.out.println("byte b2="+b2);
		
	   	b3=(byte)(b2+b1); // ������ �ϸ� �ּ��� 4byte ������ �ʿ��ϹǷ� �������� int���̴�. �� ����� byte�� ����������.!!!

		System.out.println("byte b3="+b3);
		
		long lo=56897L;// L (logn)
		System.out.println("long lo="+lo);

		int i4=(int)(lo+i1); // ���� int ����
		System.out.println("int i4="+i4);
		
		boolean boo; // true �Ǵ� false 
		 boo= true; //boolean���� true ,false�� �����ϴ�. 
		
		System.out.println("boolean boo="+boo);

		double d=4.67e-3; //0.00467 e - �Ҽ���
		System.out.println("double d="+d);

		float f1 = lo;//���� 8byte�� �Ǽ� 4byte�� �����ϴµ� ��������!! int < long < float < double
		System.out.println("float f1="+f1);
				
		
	    float f2=(float)d;
		System.out.println("float f2="+f2);

		char c1,c2, c3;
		c1='\u0061'; // �����ڵ� 
		System.out.println("char c1="+c1);

		 b2=(byte)c1; 
		System.out.println("byte b2="+b2);
		
		c2='��';
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
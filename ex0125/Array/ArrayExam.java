class ArrayExam{
	
	//��int,double,char,boolean ,String type���� �� 5���� �����ϴ�  �迭�� �����ϼ���
	int [] intArr = new int [5];
	double [] doubleArr = new double [5];
	String [] StringArr = new String [5];
	char [] charArr = new char [5] ;
	boolean [] booleanArr = new boolean[5];


	//�޼ҵ� : printArrayValue01	
	//���� �迭�鿡 �ڵ����� �ʱ�ȭ �Ȱ��� ����ϼ���
	public void printArrayValue01() {
	System.out.println("********arrI �ּҰ� = " + intArr);
	for (int i = 0; i< intArr.length ; i++){ //i<arr.length ���ڷ� �����ص� ������ �������� ��ƴ�
			System.out.println("intArr[" + i +"] = " + intArr[i]);
		}
	System.out.println("****������ for int*******");
	for(int v :intArr){
		System.out.println(v);
	}

	System.out.println();

	System.out.println("********doubleArr �ּҰ� = " + doubleArr);
	for (int i = 0; i< doubleArr.length ; i++){ //i<arr.length ���ڷ� �����ص� ������ �������� ��ƴ�
		System.out.println("doubleArr[" + i +"] = " + doubleArr[i]);
		}
		System.out.println("****������ for int*******");
		for(double v :doubleArr){
		System.out.println(v);
	}

	System.out.println();

	System.out.println("********StringArr �ּҰ� = " + StringArr);
	for (int i = 0; i< doubleArr.length ; i++){ //i<arr.length ���ڷ� �����ص� ������ �������� ��ƴ�
			System.out.println("StringArr[" + i +"] = " + StringArr[i]);
		}
		System.out.println("****������ for int*******");
		for(String v :StringArr){
		System.out.println(v);
		}
	
	System.out.println();

	System.out.println("********charArr �ּҰ� = " + charArr);
	for (int i = 0; i< doubleArr.length ; i++){ //i<arr.length ���ڷ� �����ص� ������ �������� ��ƴ�
			System.out.println("charArr[" + i +"] = " + charArr[i]);
		}
		System.out.println("****������ for int*******");
		for(char v :charArr){
		System.out.println(v);
		}

	System.out.println();

	System.out.println("********booleanArr �ּҰ� = " + booleanArr);
	for (int i = 0; i< booleanArr.length ; i++){ //i<arr.length ���ڷ� �����ص� ������ �������� ��ƴ�
			System.out.println("charArr[" + i +"] = " + booleanArr[i]);
		}
		System.out.println("****������ for int*******");
		for( boolean v :booleanArr){
		System.out.println(v);
		}
	}


	//�޼ҵ� : printArrayValue02	
	//���� 5���� �迭���� ���� ������ ������ data�� �Ҵ��ϼ���.
	public void printArrayValue02() {
		for(int i= 0; i< intArr.length;i++){
			intArr[i] = i*10;
			doubleArr [i] = i*0.5;
			charArr [i] = (char)('A' + i);

			if (i%2==0)booleanArr[i]=true;

			StringArr[i] = "A"+i;

		}
	
	}
	
	//�޼ҵ� : printArrayValue03	
	//���Ӱ� �Ҵ�Ȱ��� ����ϼ���
	public void printArrayValue03() {

		System.out.print("===========���� �� ==================");
		
		this.printArrayValue01();// ����� ����ϴ� �޼ҵ�

		System.out.println('\n');
	
	}
	
	//���θ޼ҵ忡��
	//ArrayExam�� �޼ҵ���� ������� ȣ���ϼ���.

	public static void main(String args []){
        
		ArrayExam av = new ArrayExam();
		av.printArrayValue01();
		av.printArrayValue02();
		av.printArrayValue03();
		
	}
  
}//Ŭ���� ��
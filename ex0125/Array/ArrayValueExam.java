
class ArrayValue{
	//������ 10�� �����ϴ� �迭����(����� ���ÿ� ���ǰ� ����)
	//int [] intArr = new int[10];//0
	int [] arr = new int []{1,2,3,4,5,6,7,8,9,10,5,1,3,4,8};
	//int [] arr ;//null

   /*printArrayvalue �޼ҵ��ۼ�
       => �޼ҵ� �ȿ��� ���� ����� �迭���� ���� ����Ѵ�.
   
	*/
	public void printArrayvalue() {
		System.out.println("arr = " + arr);// 
		System.out.println("arr.length= " + arr.length);
		System.out.println("arr[2]= " + arr[2]);//2���� ���� ���� ���
		
		System.out.println("****�迭�� �� ��� *******");
		for (int i = 0; i< arr.length ; i++){ //i<arr.length ���ڷ� �����ص� ������ �������� ��ƴ�
			System.out.println("arr[" + i +"] = " + arr[i]);
		}

		System.out.println( "---������ for�� version 1.5�̻� �߰� ******");
		/*
			for ( Ÿ�� ���� : �ݺ����){//�ݺ������ 0�������� �������������� �ݺ��ϸ� �����͸� �����ش�.
			         System.out.println(����);  // �� �迭���� ���� ���´�.
			}

		*/
		for (int arrValue: arr){
			System.out.println(arrValue);
		}
	}
}

/////////////////////////////////////////////////
class ArrayValueExam{
	public static void main(String args []){
        // ArrayValue�� �ִ� printArrayvalue�޼ҵ� ȣ��
		//ArrayValue av = new ArrayValue();
		
		new ArrayValue().printArrayvalue();


	}
}
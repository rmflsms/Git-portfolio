class Test{
	private static Test instance = new Test();
	//�ܺο��� ��ü���� ����.
	private Test(){}

	/**
		���簴ü�� �������ִ� �޼ҵ带 ����!
	*/
	public static Test getInstanxe(){
		
		return instance;
	}
}

/////////////////////////////////
class  PrivateConstructorExam{
	public static void main(String[] args){
		//new Test();//�ܺο��� ��ü �����ȵ�.
		
		Test t1 = Test.getInstanxe();
		Test t2 = Test.getInstanxe();
		Test t3 = Test.getInstanxe();

		System.out.println("t1  = " + t1);
		System.out.println("t2  = " + t2);
		System.out.println("t3  = " + t3);
	}
}

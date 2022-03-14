class Test{
	private static Test instance = new Test();
	//외부에서 객체생성 막음.
	private Test(){}

	/**
		현재객체를 리턴해주는 메소드를 제공!
	*/
	public static Test getInstanxe(){
		
		return instance;
	}
}

/////////////////////////////////
class  PrivateConstructorExam{
	public static void main(String[] args){
		//new Test();//외부에서 객체 생성안됨.
		
		Test t1 = Test.getInstanxe();
		Test t2 = Test.getInstanxe();
		Test t3 = Test.getInstanxe();

		System.out.println("t1  = " + t1);
		System.out.println("t2  = " + t2);
		System.out.println("t3  = " + t3);
	}
}

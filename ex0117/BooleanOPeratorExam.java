class BooleanOPeratorExam{
	public static void main(String args[]){
		boolean  t=true ;
		boolean f=false;
		System.out.println("true&false="+(t & f )); // f
		System.out.println("true&true="+(t&t)); // t
		System.out.println("false&false="+(f&f)); //f
		System.out.println();// ���� ȿ�� 
	
		System.out.println("true|false="+(t|f)); // t
		System.out.println("true|true="+(t|t)); // t
		System.out.println("false|false="+(f|f)); // f
		System.out.println();

		System.out.println("true^false="+(t^f)); // f
		System.out.println("true^true="+(t^t)); // t
		System.out.println("true^false="+(t^f)); // f
		System.out.println("true^true="+(t^t)); // f
		System.out.println();

		System.out.println("true&&false="+(t&&f)); // f
		System.out.println("true&&true="+(t&&t)); // t
		System.out.println("true&&false="+(t&&f)); // f
		System.out.println("false&&false="+(f&&f)); // f
		System.out.println();

		System.out.println("true||false="+(t||f)); // t
		System.out.println("true||true="+(t||t)); // t
		System.out.println("false||false="+(f||f)); // f
		System.out.println();

		int i=5; int j=3;
		System.out.println("int i="+i+"\tint j="+j);//\t :tab \n : newline 
		System.out.println("i>=j==>>"+(i>=j));
		System.out.println("i>j=>>"+(i>j));
		System.out.println("i<=j=>>"+(i<=j));
		System.out.println("i<j=>>"+(i<j));
		System.out.println("i==j=>>"+(i==j)); //f
		System.out.println("i!=j=>>"+(i != j));
		
		System.out.println("-----------------------");
		//System.out.println( true || test()); //false
		
		System.out.println( false && test() ) ; //false



		System.out.println("---------���⿬����-------------");
		int avg= 50 ; //avg�� 60�̻��̸� �հ�, �ƴϸ� ���հ�!!! ����ϰ� �ʹ�.

		//���ǽ� ? ���ΰ�� : �����ΰ��;
		String result= avg>=60 ? "�հ�" : "���հ�" ; 
		System.out.println(avg + "������ ���: " + result);

	}// ���θ޼ҵ峡

	//�޼ҵ� �ۼ�
	public static boolean test(){
		System.out.println("��µǴ�????");

		return false;
}

}//Ŭ������


import java.util.Scanner; // Scanner ��ü�� util�������� �������ּ���.
/**
 java.util.Scanner ��ü�� ����ڷ� ���� Ű���� �Է��� Ÿ�Ժ��� ������ �ֵ��� �پ��� �޼ҵ带 �����ϴ� Ŭ�����̴�.


  : ���ڸ� �Է¹�����
    int no = xx.nextInt(); // ���๮��("\n") ����



  : ���ڸ� �Է¹�����
	String data = xx. next(); // ������� ���ڿ� : ���๮��("\n") ���� 

	String data = xx. nextLine(); // ������ �ִ°��


*/
class ScannerExam{
  public static void main(String [] args){ // ���ֻ���ϴ� ��ü ex) String, Math.......... --> java.lang ������ �ִ�. import�̴�.
  
	  {
		  Scanner sc = new Scanner (System.in); //Ű�����Է¹��� �غ�Ϸ� !!!

		/*System.out.print("��������: ");
		int kor = sc.nextInt();

		System.out.print("��������: ");
		int eng = sc.nextInt();
		
		sc.nextLine(); //������ �о��

		System.out.print("�̸���: ");
		String name = sc.nextLine();*/

/////////////////////////////////////////////////////////////


		System.out.print("��������: ");
		int kor = Integer.parseInt(sc.nextLine() );

		System.out.print("��������: ");
		int eng = Integer.parseInt(sc.nextLine() );

		System.out.print("�̸���: ");
		String name = sc.nextLine();

		System.out.println(name + "�� ���������� " + kor + " , ���������� " + eng);


		System.out.println("------END-----");
	  }


  }

}
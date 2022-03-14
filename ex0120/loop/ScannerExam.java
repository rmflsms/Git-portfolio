import java.util.Scanner; // Scanner 객체를 util폴더에서 가져와주세요.
/**
 java.util.Scanner 객체는 사용자로 부터 키보드 입력을 타입별로 받을수 있도록 다양한 메소드를 제공하는 클래스이다.


  : 숫자를 입력받을때
    int no = xx.nextInt(); // 개행문자("\n") 무시



  : 문자를 입력받을때
	String data = xx. next(); // 공백없이 문자열 : 개행문자("\n") 무시 

	String data = xx. nextLine(); // 공백이 있는경우


*/
class ScannerExam{
  public static void main(String [] args){ // 자주사용하는 객체 ex) String, Math.......... --> java.lang 폴더에 있다. import이다.
  
	  {
		  Scanner sc = new Scanner (System.in); //키보드입력받을 준비완료 !!!

		/*System.out.print("국어점수: ");
		int kor = sc.nextInt();

		System.out.print("영어점수: ");
		int eng = sc.nextInt();
		
		sc.nextLine(); //개행을 읽어라

		System.out.print("이름은: ");
		String name = sc.nextLine();*/

/////////////////////////////////////////////////////////////


		System.out.print("국어점수: ");
		int kor = Integer.parseInt(sc.nextLine() );

		System.out.print("영어점수: ");
		int eng = Integer.parseInt(sc.nextLine() );

		System.out.print("이름은: ");
		String name = sc.nextLine();

		System.out.println(name + "님 국어점수는 " + kor + " , 영어점수는 " + eng);


		System.out.println("------END-----");
	  }


  }

}
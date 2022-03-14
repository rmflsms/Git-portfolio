import java.util.Scanner;

class Exercise07{
	public static void main(String [] args){
		boolean run = true; // 상태변수(true이면 반복문을 돌고, false가 되면 반복문 빠져나온다)

		int balance = 0; // 잔액

		Scanner scanner = new Scanner(System.in); //키보드 입력 받기를 위한 준비!!

		while (run){//run이 true일 동안 반복해라.
			System.out.println("----------------------------------------------");
			System.out.println("1. 예금 | 2. 출금 | 3. 잔고 | 4. 종료");
			System.out.println("----------------------------------------------");
			System.out.print("선택> ");

			int menuNum = Integer.parseInt(scanner.nextLine());

			switch (menuNum){

			case 1:
				System.out.print("예금액>");// 예금할 금액을 입력받아 balance에 누적한다.
				balance += Integer.parseInt(scanner.nextLine());
				break;
			case 2:
				System.out.print("출금액>");// 출금할 금액을 입력받아 balance에 빼기한다.
				balance -= Integer.parseInt(scanner.nextLine());
				break;
			case 3:
				System.out.print("잔고>");// 잔액을 출력한다.
				System.out.print(balance);
				break;
			case 4: // 반복문을 빠져나간다.
			 run = false;
				break;
			default:System.out.println("메뉴는 1 ~ 4 숫자만 가능합니다."); 

			}
		System.out.println();
		}
		System.out.println("프로그램 종료");
	 
	}
}
import java.util.Scanner;

class Exercise07{
	public static void main(String [] args){
		boolean run = true; // ���º���(true�̸� �ݺ����� ����, false�� �Ǹ� �ݺ��� �������´�)

		int balance = 0; // �ܾ�

		Scanner scanner = new Scanner(System.in); //Ű���� �Է� �ޱ⸦ ���� �غ�!!

		while (run){//run�� true�� ���� �ݺ��ض�.
			System.out.println("----------------------------------------------");
			System.out.println("1. ���� | 2. ��� | 3. �ܰ� | 4. ����");
			System.out.println("----------------------------------------------");
			System.out.print("����> ");

			int menuNum = Integer.parseInt(scanner.nextLine());

			switch (menuNum){

			case 1:
				System.out.print("���ݾ�>");// ������ �ݾ��� �Է¹޾� balance�� �����Ѵ�.
				balance += Integer.parseInt(scanner.nextLine());
				break;
			case 2:
				System.out.print("��ݾ�>");// ����� �ݾ��� �Է¹޾� balance�� �����Ѵ�.
				balance -= Integer.parseInt(scanner.nextLine());
				break;
			case 3:
				System.out.print("�ܰ�>");// �ܾ��� ����Ѵ�.
				System.out.print(balance);
				break;
			case 4: // �ݺ����� ����������.
			 run = false;
				break;
			default:System.out.println("�޴��� 1 ~ 4 ���ڸ� �����մϴ�."); 

			}
		System.out.println();
		}
		System.out.println("���α׷� ����");
	 
	}
}
package sec01.exam03;

public class IfelseIfElseExample {

	public static void main(String[] args) {
		
		int score = 75;
		
		if(score>=90) {
			System.out.println("������ 90���� Ů�ϴ�.");
			System.out.println("����� A �Դϴ�.");
		}
		
		else if(score>=80) {
			System.out.println("������ 80~89 �Դϴ�.");
			System.out.println("����� B �Դϴ�.");
		 }
		else if(score>=70) {
			System.out.println("������ 70~79 �Դϴ�.");
			System.out.println("����� C �Դϴ�.");
		 }
		else if(score>=60) {
			System.out.println("������ 60~69 �Դϴ�.");
			System.out.println("����� D �Դϴ�.");
		 }
	}

}

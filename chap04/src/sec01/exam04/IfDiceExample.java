package sec01.exam04;

public class IfDiceExample {

	public static void main(String[] args) {
		
		int num = ((int)(Math.random()*6) + 1); // 0.0,<= ~<6.0
		
		if(num==1) {
			System.out.println("1���� ���Ծ��ϴ�.");
		} else if(num==2) {
			System.out.println("2���� ���Ծ��ϴ�.");
		} else if(num==3) {
			System.out.println("3���� ���Ծ��ϴ�.");
		} else if(num==4) {
			System.out.println("4���� ���Ծ��ϴ�.");
		} else if(num==5) {
			System.out.println("5���� ���Ծ��ϴ�.");
		} else {
			System.out.println("6���� ���Ծ��ϴ�.");
		}
		
		
	}

}

package sec02.exam03;

public class ForSumFrom1To100ExamPle1 {

	public static void main(String[] args) {
		int sum = 0;
		
		int i;
		for(i=1; i<=100; i++) {
			sum += i;
		}
		System.out.println("1~" + (i-1) + "��: " + sum);
	}

}

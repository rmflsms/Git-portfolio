package sec03.exam01;

public class PromotionExample {

	public static void main(String[] args) {
		
		byte byteVelue = 10;
		int intValue = byteVelue;
		System.out.println("intValue: " + intValue);
		
		
		char charValue = '°¡';
		intValue = charValue ;
		System.out.println("intValue: " + intValue);
		
		intValue = 30;
		long longValue = intValue;
		System.out.println("longValue:" + longValue);
		
		longValue = 100;
		float floatValue = longValue;
		System.out.println("floatValue:" + floatValue);
		
		floatValue = 100.5F;
		double doubleValue = floatValue;
		System.out.println("doubleValue:" + doubleValue);
	}

}

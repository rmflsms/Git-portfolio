//�������ºκ��� �ּ�ó���ϰ� ������ �Ẹ����!
class Car{} 
class EfSonata extends Car{}
class Excel extends Car{}
class Carnival extends Car{}
class People{}

public class InstanceofExam{
	public static void main(String args []){
		
		Car car = new Car();
		EfSonata ef = new EfSonata();
		Excel ex = new Excel();
		Carnival ca = new Carnival();
		People p = new People();		
		
		if(car instanceof Car){
			System.out.println("car instanceof Car is true");//0
		}else{
			System.out.println("car instanceof Car is false");
		}

		
		if(car instanceof EfSonata){
			System.out.println("car instanceof EfSonata is true");
		}else{
			System.out.println("car instanceof EfSonata is false");
		}
		
		if(ef instanceof Car){ 
			System.out.println("ef instanceof Car is true");
		}else{
			System.out.println("ef instanceof Car is false");
		}
		
		if(ex instanceof Car){
			System.out.println("ex instanceof Car is true");
		}else{
			System.out.println("ex instanceof Car is false");
		}
		
		if(ca instanceof Car){
			System.out.println("ca instanceof Car is true");
		}else{
			System.out.println("ca instanceof Car is false");
		}
		
		/*if(p instanceof Car){//instanceof �����ڴ� ��Ӱ����϶� ����Ҽ� �ִ�.
			System.out.println("p instanceof Car is true");
		} */
	}
}	

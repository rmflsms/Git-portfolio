
class Car{
		public String carname;
		public int cost;
		
		protected void printAttributes(){
			System.out.println("carname="+carname+"\tcost="+cost);
		}
}

//Car�� ��ӹ޴� EfSonata, Excel, Carnival 3�� Ŭ���� �ۼ�	
	//�� Ŭ������ �μ��� �����ʴ� ������ �ۼ�
	//�� Ŭ������ �������� �����ο��� carname�� cost�� ������ �� �Ҵ�
	
	class EfSonata extends Car{
		EfSonata(){
			carname = "EfSonata";
			this.cost=2000;
		}
	}
/////////////////////////////////////////////////////////////
	class Excel extends Car{
		Excel(){
			carname = "Excel";
			this.cost=1000;
		}
		
	}
//////////////////////////////////////////////////////////
	class Carnival extends Car{
		Carnival(){
			carname = "Carnival";
			this.cost=3000;
		}
	
	}



public class InheritanceExam{
	//���θ޼ҵ忡�� 
		public static void main (String [] args){
		//Car, EfSonata, Excel, Carnival �װ��� ��ü�� ����
		Car car = new Car();
		EfSonata ef = new EfSonata();
		Excel ex = new Excel();
		Carnival ca = new Carnival();

		System.out.println("=============================");
		System.out.println("car = " + car);
		System.out.println("ef = " + ef);
		System.out.println("ex = " + ex);
		System.out.println("ca = " + ca);

		// �� Ŭ�������� Car calss���ִ� printAttributes()�޼ҵ带 ȣ���Ҽ��ִ�.
		
			car.printAttributes();
			ef.printAttributes();
			ex.printAttributes();
			ca.printAttributes();
		}
}


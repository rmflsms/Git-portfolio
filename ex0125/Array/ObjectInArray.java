//ObjectInArray.java

class ObjectOne{
	public int a;
}

public class ObjectInArray{
	//���� �޼ҵ忡�� 
	public static void main (String [] args){
	
		//ObjectOne Ÿ���� 5�� ���� �����ϴ� �迭�� �����ϰ�
		
		ObjectOne [] arr = new ObjectOne [5]; 
		 System.out.println("arr = " + arr);

		 for(int i=0; i < arr.length ; i++){
			System.out.print("������ arr [" + i + "] : " + arr[i]+"\t");

			arr[i] = new ObjectOne();
			System.out.print("������ arr [" + i + "] : " + arr[i]+"\n");

		 }

		 System.out.println("========================");
		 for(int i=0; i < arr.length ; i++){
			System.out.print("arr[" + i + "].a = " + arr[i].a + "\t");
			//������
			arr[i].a =i +10;

			System.out.println("������ : arr [" + i + "].a = " + arr[i].a);
		 
		 
		 }

		  System.out.println("===========�ּҺ���=============");

		arr[0] = arr[1];//1������ �ּҰ��� 0���� �־��.

		 for(int i=0; i < arr.length ; i++){
			System.out.println(" arr [" + i + "] : " + arr[i]+"\t");
		 }
		 for(int i=0; i < arr.length ; i++){
			System.out.println(" arr [" + i + "] : " + arr[i].a+"\t");
		 }





		//5���� ObjectOne��ü�� �����ϼ���.
		//�� ��ü�� �����ִ� �������� ���
		//�� ��ü�� �ּҰ� ���
			
		//������ ObjectOne��ü�� ���� �ٸ� a�� ���� ������ a�� ���� �����ϼ���.	
		

		//�� ObjectOne ��ü�� a�� ����ϼ���
			
		
	}
	
}

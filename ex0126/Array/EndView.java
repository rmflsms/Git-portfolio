
/**
 ��û�� ����� ȭ�� ��� ����ϴ� Ŭ����
*/
class EndView{

	/**
		�������θ� �޽����� ����ϴ� �޼ҵ�
	*/
	public static void printMessage(String message){
		System.out.println(message);
	}

	/**
		��ü�˻��� ����� ����ϴ� �޼ҵ�
	*/
	public static void printSelectAll(Goods [] goodsArr){
		System.out.println("*******��ǰ LIST ("+ goodsArr.length +")��*********");
			//������ּ���.
		
	}

	/**
		��ǰ�ڵ忡 �ش��ϴ� ���� ��� �ϴ� �޼ҵ�
	*/
	public static void printSelectByCode(Goods goods){
		System.out.prinln("---------"+ goods.getCod() +"-------------");
	
	}




}
/**
	��ǰ�� ���� CRUD�۾�  : B/L
		: ��ü�˻�, ��� ,���� ,���� .....
*/

class GoodsService {

	/**
		����ϱ�
			: ������� ��ǰ�ڵ尡 �ߺ������� üũ�ؼ� �ߺ��� �ƴҶ� ����Ѵ�.
	
			@return : int�� 
			(0�̸� ��ǰ�ڵ��ߺ�, 
			 1�̸� ��� ���� , 
			 -1�̸� �迭�� ���̸� ����� ��Ͼȵ�)
	*/
	public int insert (Goods goods){//��ǰ�ڵ� , ��ǰ�̸� ,���� ,����
	

		return 0 ;
	}
	/**
		��ü�˻�
		@return : Goods Ÿ���� �迭(�迭�̸� �ϳ��� �������� ��ǰ�� ��Ƽ� ����)
	*/
	public Goods[] selectAll(){
		
		return null;
	
	}

	/**
		��ǰ�ڵ忡 �ش��ϴ� ��ǰ�˻�
		@return : ���� �μ��� ���޵� code�� �ش��ϴ� ������ ������ Goods�� �����ϰ� ������ null�� �����Ѵ�.
	*/
	public Goods selsectByCode(String code){
		
		return null;
	
	}


	/**
		��ǰ�ڵ忡 �ش��ϴ� ��ǰ����, ���� �����ϱ�
		@return : boolean���� ������ �Ϸ�Ǹ� true , �ƴϸ� false 
	*/
	public boolean updata (Goods goods){ //��ǰ�ڵ�, ����, ����

		return false;
	
	}

}
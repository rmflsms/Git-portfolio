/**
	��ǰ�� �Ӽ���(��ǰ�ڵ� , �̸� ,���� , ����) �����ϴ� ��ü
*/

class Goods{
	private String code;//null --> A01 
	private String name;//null --> �����
	private int price;//0 --> 2000
	private String explain;//null - ���ִ�.

	//�Ӽ��� ��ȸ , �����Ҽ� �ִ� �޼ҵ� ����
	//setXxx()
	  public void setCode (String code){
		//��� : �μ��� ���޵� ������ ���� ��ȿ��üũ!!!
		this.code=code;
	  }

	  public void setName (String name){
		//��� : �μ��� ���޵� ������ ���� ��ȿ��üũ!!!
		this.name=name;
	  }

	   public void setPrice (int price){
		//��� : �μ��� ���޵� ������ ���� ��ȿ��üũ!!!
		this.price=price;
	  }

	  public void setExplain (String explain){
		//��� : �μ��� ���޵� ������ ���� ��ȿ��üũ!!!
		this.explain=explain;
	  }


	//getXxx()
	public String getCode(){
			return code;
	}

	public String getName(){
			return name;
	}

	public int getPrice(){
			return price;
	}

	public String getExplain(){
			return explain;
	}



}
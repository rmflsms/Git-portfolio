/**
  ��ǰ�� �Ӽ�(��ǰ�ڵ�, �̸�, ����, ����)�� �����ϴ� ��ü
*/
class Goods{
   private String code;//null -> A01
   private String name;//null --> �����
   private int price;//0 --> 2000
   private String explain;//null --> ���ִ�.
		
		Goods(){
			
		}
		Goods(String code , String name , int price , String explain){
			this(code , price , explain);
			
			this.name=name;
		}
		Goods(String code , int price ,String explain){
			this.code=code;
			this.price=price;
			this.explain=explain;
		}
	   

   //�Ӽ��� ��ȸ, �����Ҽ� �ִ� �޼ҵ� ����
   //setXxxx()
    public void setCode(String code){
		//��� : �μ������޵� ������ ���� ��ȿ��üũ!!!
        this.code=code;
	}
    public void setName(String name){
		//��� : �μ������޵� ������ ���� ��ȿ��üũ!!!
        this.name=name;
	}
	public void setPrice(int price){
		//��� : �μ������޵� ������ ���� ��ȿ��üũ!!!
        this.price=price;
	}
    public void setExplain(String explain){
		//��� : �μ������޵� ������ ���� ��ȿ��üũ!!!
        this.explain=explain;
	}


   //getXxxx()
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
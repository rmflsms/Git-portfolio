/**
	상품의 속성을(상품코드 , 이름 ,가격 , 설명) 관리하는 객체
*/

class Goods{
	private String code;//null --> A01 
	private String name;//null --> 새우깡
	private int price;//0 --> 2000
	private String explain;//null - 맛있다.

	//속성을 조회 , 수정할수 있는 메소드 제공
	//setXxx()
	  public void setCode (String code){
		//기능 : 인수로 전달된 정보에 대한 유효성체크!!!
		this.code=code;
	  }

	  public void setName (String name){
		//기능 : 인수로 전달된 정보에 대한 유효성체크!!!
		this.name=name;
	  }

	   public void setPrice (int price){
		//기능 : 인수로 전달된 정보에 대한 유효성체크!!!
		this.price=price;
	  }

	  public void setExplain (String explain){
		//기능 : 인수로 전달된 정보에 대한 유효성체크!!!
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
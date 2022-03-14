/**
	전자제품의 속성을 관리하는 객체
*/
class Electronics{
	private int modelNo;
	private String modelName;
	private int modelPrice;
	private String modelDetail;

	// 생성자 3개
	Electronics(){}
	Electronics(int modelNo, String modelDetail){
		this.modelNo = modelNo;
		this.modelDetail = modelDetail;
	
	}

	Electronics(int modelNo,String modelName,int modelPrice,String modelDetail){
		this(modelNo, modelDetail);// 생성자구현부 첫번째 줄에서 다른 생성자 호출
		this.modelName = modelName;
		this.modelPrice = modelPrice;

	
	}

	//set , get 작성
	//set (): public 리턴 void , 인수필수
	public void setModelNo(int modelNo){
		this.modelNo =modelNo;
	}
	public void setModelName(String modelName){
		this.modelName =modelName;
	}
	public void setModelPrice(int modelPrice){
		this.modelPrice =modelPrice;
	}
	public void setModelDetail(String modelDetail){
		this.modelDetail =modelDetail;
	}
	
	//set , get 작성
	//set (): public 리턴 void , 인수필수
	public int getModelNo(){
		return modelNo;
	}
	public String getModelName(){
		return modelName;
	}
	public int getModelPrice(){
		return modelPrice;
	}
	public String getModelDetail(){
		return modelDetail;
	}

}

/**
	상품에 대한 CRUD작업  : B/L
		: 전체검색, 등록 ,수정 ,삭제 .....
*/

class GoodsService {

	/**
		등록하기
			: 등록전에 상품코드가 중복인지를 체크해서 중복이 아닐때 등록한다.
	
			@return : int형 
			(0이면 상품코드중복, 
			 1이면 등록 성공 , 
			 -1이면 배열의 길이를 벗어나서 등록안됨)
	*/
	public int insert (Goods goods){//상품코드 , 상품이름 ,가격 ,수량
	

		return 0 ;
	}
	/**
		전체검색
		@return : Goods 타입의 배열(배열이름 하나에 여러개의 상품을 담아서 리턴)
	*/
	public Goods[] selectAll(){
		
		return null;
	
	}

	/**
		상품코드에 해당하는 상품검색
		@return : 만약 인수로 전달된 code에 해당하는 정보가 있으면 Goods를 리턴하고 없으면 null을 리턴한다.
	*/
	public Goods selsectByCode(String code){
		
		return null;
	
	}


	/**
		상품코드에 해당하는 상품가격, 설명 수정하기
		@return : boolean형은 수정이 완료되면 true , 아니면 false 
	*/
	public boolean updata (Goods goods){ //상품코드, 가격, 설명

		return false;
	
	}

}

/**
 요청된 결과를 화면 출력 담당하는 클래스
*/
class EndView{

	/**
		성공여부를 메시지를 출력하는 메소드
	*/
	public static void printMessage(String message){
		System.out.println(message);
	}

	/**
		전체검색의 결과를 출력하는 메소드
	*/
	public static void printSelectAll(Goods [] goodsArr){
		System.out.println("*******상품 LIST ("+ goodsArr.length +")개*********");
			//출력해주세요.
		
	}

	/**
		상품코드에 해당하는 정보 출력 하는 메소드
	*/
	public static void printSelectByCode(Goods goods){
		System.out.prinln("---------"+ goods.getCod() +"-------------");
	
	}




}
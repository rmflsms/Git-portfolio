/**
	View와 Model 사이에서 중간 역활
	: 사용자의 요청을 받아서 그에 해당하는 서비스를 호출하고
		호출한 결과를 받아서 결과값에 따라 결과 뷰를 호출해준다.
*/

class ElectronicsController{

	private ElectronicsService service = ElectronicsService.getInstance() ; //null
	/**
		전자제품 등록
	*/
	public void insert (Electronics electronics){
		//등록전에 중복여부를 체크하고 중복이아니면 등록한다.
		Electronics savedElec= service.searchByModelNo( electronics.getModelNo() );
		if(savedElec == null){//
			if(service.insert(electronics)	){
				EndView.printMessage("등록되었습니다.");
		}else{
			EndView.printMessage("등록되지 않았습니다.");
		}
		
		}else{
			EndView.printMessage(electronics.getModelNo()+"는 중복이므로 등록할수 없습니다.");
		}

	}
	/**
		전체검색
	*/
	public void selectAll(){
		

	}
	/**
	모델번호에 해당하는 전자제품 검색
	*/
	public void searchByModelNo(int modelNo){
	
	}
	/**
	모델번호에 해당하는 전자제품 수정
	*/
	public void update(Electronics electronics){
	
	}

}
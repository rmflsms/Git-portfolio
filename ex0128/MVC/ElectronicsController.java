/**
	View�� Model ���̿��� �߰� ��Ȱ
	: ������� ��û�� �޾Ƽ� �׿� �ش��ϴ� ���񽺸� ȣ���ϰ�
		ȣ���� ����� �޾Ƽ� ������� ���� ��� �並 ȣ�����ش�.
*/

class ElectronicsController{

	private ElectronicsService service = ElectronicsService.getInstance() ; //null
	/**
		������ǰ ���
	*/
	public void insert (Electronics electronics){
		//������� �ߺ����θ� üũ�ϰ� �ߺ��̾ƴϸ� ����Ѵ�.
		Electronics savedElec= service.searchByModelNo( electronics.getModelNo() );
		if(savedElec == null){//
			if(service.insert(electronics)	){
				EndView.printMessage("��ϵǾ����ϴ�.");
		}else{
			EndView.printMessage("��ϵ��� �ʾҽ��ϴ�.");
		}
		
		}else{
			EndView.printMessage(electronics.getModelNo()+"�� �ߺ��̹Ƿ� ����Ҽ� �����ϴ�.");
		}

	}
	/**
		��ü�˻�
	*/
	public void selectAll(){
		

	}
	/**
	�𵨹�ȣ�� �ش��ϴ� ������ǰ �˻�
	*/
	public void searchByModelNo(int modelNo){
	
	}
	/**
	�𵨹�ȣ�� �ش��ϴ� ������ǰ ����
	*/
	public void update(Electronics electronics){
	
	}

}

/**
	������ǰ�� ���õ� ����� ����� Ŭ����
*/

class ElectronicsService{
	
		String [][] data = new String [][]{
		{"100","��ǳ��","35000","�Ｚ ��ǳ��"},
		{"200","���ڷ���","55000","�� ��������.."},
		{"300","������","5500000","��ǳ ������ �ʹ� �ÿ���"},
		{"400","�����","800000","LG �����"},
		{"500","����̱�","9000","LG ����̱�"}
	};//������ �ʱ�ġ �����͸� �غ�!!

	private static ElectronicsService instance = new ElectronicsService();
	public static int count;//�迭�濡 ����� ������ǰ�� ������ üũ!!
	Electronics elecArr [] ;//���� ����

		/**
			�ܺο��� ��ü �����ȵ�.
		*/

	private ElectronicsService(){
		//������ �ʱ�ȭ(������ǰ �ʱ�ġ ������)����.
		elecArr = new Electronics[10] ;

		for(int i=0 ; i<data.length ; i++){
			elecArr[i] = new Electronics(Integer.parseInt(data[i][0]),data[i][1],Integer.parseInt(data[i][2]),data[i][3]);
			//������ �ʱ�ȭ
			
			ElectronicsService.count++;
		}/*
		System.out.println("-------------------------------");
		for(int i = 0 ; i <ElectronicsService.count ; i++);
		System.out.println(elecArr[i] + " | " + elecArr[i].getModelNo() + " | " + elecArr[i].getModelName());
		System.out.println("------------------------------");*/
	}//�����ڳ�

	/**
		���� ��ü�� �������ش�.
	*/
	public static ElectronicsService getInstance(){

		return instance;
	}
	/**
		������ǰ ���
		return : true�̸� ��ϼ��� , false �̸� ��Ͻ���
	*/

	public boolean insert(Electronics electronics){
	
		return false;
	}

	/**
		��ϵ� ��ü ������ǰ �˻� 
	*/
	public Electronics [] selectAll(){
		return elecArr;
	}
	/**
		�𵨹�ȣ�� �ش��ϴ� ������ǰ �˻�
	*/

	public Electronics searchByModelNo(int modelNo){
		
		return null;
	
	}
	/**
		�𵨹�ȣ�� �ش��ϴ� ������ǰ �����ϱ�
		(���� �����Ѵ�)
	*/
	public boolean updata(Electronics electronics){
		//�μ��� ���޵� �𵨹�ȣ�� �ش��ϴ� ������ǰ�� �ִ��� �˻��Ѵ�.
		
		return false;
	}

}//Ŭ������

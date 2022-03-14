import java.util.Scanner;
/**
	Ű���� �Է��� �޾� �� ����� ȣ�����ִ� ��ü
*/

class MenuView{
	private Scanner sc = new Scanner(System.in);
	
	/**
		�޴��� ������� �޼ҵ�
	*/
	
	public void printMenu(){
		while(true){
			System.out.println("--------------------------------------------------------------");
			System.out.println("1.���  2.��ü�˻�  3.��ǰ�ڵ�˻� 4. �����ϱ� 9.����");
			System.out.println("--------------------------------------------------------------");

			System.out.print("�޴� ���� > ");
				int menuChoice = Integer.parseInt(sc.nextLine());
				switch (menuChoice){
				case 1:
					//Ű�����Է� 4�� �޾Ƽ� �ϳ��� Goods ���� ������ insert �����Ѵ�.
					this.inputInsert();
				break;
				case 2:
					Goods [] goodsArr = service.selectAll();
					EndView.printSelectAll(goodsArr);
				break;
				case 3:
					this.inputSelect();
				break;
				case 4:
					this.inputUpdata();
				break;
				case 9:
					System.out.println("������ �� �̿����ּ���. ���α׷� �����մϴ�.");
					System.exit(0);//���α׷� ����
				break;
				default :
					System.out.println("�޴��� 1~4 or 9 �Է����ּ���.");
				
				}//switch ��
		}//while ��
	
	}//�޼ҵ峡
	//////////////////////////////////////////////////////////////
	/**
		����� ���� Ű���� �Է�
	*/
	public void inputInsert(){
		//Ű�����Է� 4�� �޾Ƽ� �ϳ��� Goods ���� ������ insert�����Ѵ�.
		System.out.print("��ǰ�ڵ� > ");
		String code = sc.nextLine();

		System.out.print("��ǰ�̸� > ");
		String name = sc.nextLine();

		System.out.print("��ǰ���� > ");
		int price = Integer.parseInt(sc.nextLine());

		System.out.print("��ǰ���� > ");
		String explain = sc.nextLine();

		Goods goods = new Goods () ;
		goods.setCode(code);
		goods.setName(name);
		goods.setPrice(price);
		goods.setExplain(explain);


		//�� 4���� ������ ������ service�� �̵�
		int result = service.insert(goods);
		if(result==0 ){
			EndView.printMessage(code+"�� �׺��̹Ƿ� ����Ҽ� �����ϴ�.");
		}else if(result==-1){
			EndView.printMessage("�迭�� ���̰� ��� ���̻� ����Ҽ� �����ϴ�.");
		}else{
			EndView.printMessage("��ϵǾ����ϴ�.");
		}

	}
	/**
		��ǰ�˻��� ���� Ű���� �Է�
	*/
	public void inputSelect(){
		System.out.print("�˻��� ��ǰ�ڵ�");
		String code = sc.nextLine();
	
		Goods goods = service.selectByCode(code);//ȣ��
		if(goods ==null){
			EndView.printMessage(code+"�� ���� �����̹Ƿ� �˻��Ҽ� �����ϴ�.");
		}else{
			EndView.printSelectByCode(goods);
		}
	}

	/**
		������ ���� Ű���� �Է�
	*/
	public void inputUpdata(){
	
	}
}
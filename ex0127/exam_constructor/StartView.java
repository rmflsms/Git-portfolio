class StartView {
	public static void main(String[] args) {

		String [] [] data = new String [] [] {
			{"A01","�����","2500","¥�� ����ϴ�"},
			{"A02","��Ĩ","1500","����ϴ�"},
			{"A03","��Ϲ���Ĩ","3500","�ް� ¥�� ������"},
			{"A04","���ڱ�","1800","������ ��"},
			{"A05","������","3000","������ ��"},
		};

		System.out.println("��ǰ���� ���α׷� �����մϴ�.\n");
        new MenuView().printMenu(data);
	}
}

class StartView {
	public static void main(String[] args) {

		String [] [] data = new String [] [] {
			{"A01","새우깡","2500","짜고 고소하다"},
			{"A02","콘칩","1500","고소하다"},
			{"A03","허니버터칩","3500","달고 짜고 맛나다"},
			{"A04","감자깡","1800","감자의 맛"},
			{"A05","고구마깡","3000","고구마의 맛"},
		};

		System.out.println("상품관리 프로그램 시작합니다.\n");
        new MenuView().printMenu(data);
	}
}

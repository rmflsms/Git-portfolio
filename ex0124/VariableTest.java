class VariableTest{
 public static void main (String [] args){
	 System.out.println("*********�޼ҵ� ȣ���غ���********");
		 Test t = new Test(); //t������ �̿��ؼ� �Ӽ�, �޼ҵ� ���ٰ����ϴ�.
		 t.aa();//�޼ҵ� ȣ��

		System.out.println("============bb()ȣ���غ���=========");
		t.bb();

		System.out.println("============t������ ����Ű�� ��ü�� ���� �����غ���=========");
		System.out.println("t.a = " + t.a);
		//System.out.println("t.name = " + t.name); // private �ɹ��ʵ��̹Ƿ� �ܺο��� ���ٺҰ�
 }

}

//////////////////////////////////////////////////////
class Test{
	public int a; //��������
	private String name;//��������

	public void aa(){
			/*public*/ int a = 10;//��������(�������� �տ��� ������ �ü� ����.), ���������� ����� �ݵ�� �ʱ�ȭ
			String addr = "����";

			System.out.println("a = " +a);
			System.out.println("this.a = "+this.a); // this. �� ���������� Ī�Ѵ�.


			System.out.println("name : " + name); // 
			System.out.println("this.name : " + this.name);

			System.out.println("addr : " + addr);
			//System.out.println("this.addr : " + this.addr);//���������տ� this ���Ұ�.

	}

	public void bb(){

			System.out.println("a = " +a);//0
			System.out.println("this.a = "+this.a);//0 // this. �� ���������� Ī�Ѵ�.


			System.out.println("name : " + name); //null
			System.out.println("this.name : " + this.name);//null

			//System.out.println("addr : " + addr);// ����
	
	}

}





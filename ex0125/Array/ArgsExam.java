class ArgsExam{
	public static void main(String [] args){// �迭�� ���޵ȴ�!!
	
		System.out.println("args = " + args);
		System.out.println("args.length = " +args.length );

		// �����Ҷ� �Է��� ��� ���� ����غ���.
		/**for(int i=0 ; i< args.length ; i++){
		System.out.println("args[ " + i+"]" + args[i]);
		}
	}*/
		System.out.println("�μ��� �� : " + (args[0]+args[1]) );
		
		// String --> int �� ��ȯ : Integer.parseInt(���ڿ�) / int ---> String ��ȯ : Integer.toString(����)

		int sum = Integer.parseInt(args[0]) + Integer.parseInt(args[1]);
		System.out.println("�μ��� �� : " + sum);
	
		System.out.println("***���α׷� ����***");
	}//���� ��
}

/**
	�����Ҷ�
		java �����̸�

		ex) java ArgExam


*/
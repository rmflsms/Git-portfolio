class MultiArray{
//������ 2���� �迭 8*9
	int [] [] arr = new int [8][9];
	
//�޼ҵ��̸� :array99
	
	//for loop �� ����Ͽ� 
	//�迭�� ���� (������)�������
	//�迭�� ����� �������
	public void array99(){
		for(int i = 0 ; i < arr.length ; i++){//8�� 0~7
			for(int j =0 ; j < arr[i].length;j++){//�� 0~8
				arr[i][j] = (i+2) * (j+1) ;
				System.out.print(arr[i][j] + "\t");
			
			}
			System.out.println();
		}
		
	}
		
}
public class MemoryApart{
	public static void main(String [] args){

	new MultiArray ().array99();

	}
}


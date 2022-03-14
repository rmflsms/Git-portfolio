class MultiArray{
//정수형 2차원 배열 8*9
	int [] [] arr = new int [8][9];
	
//메소드이름 :array99
	
	//for loop 를 사용하여 
	//배열에 곱한 (구구단)결과저장
	//배열에 결과를 꺼내출력
	public void array99(){
		for(int i = 0 ; i < arr.length ; i++){//8행 0~7
			for(int j =0 ; j < arr[i].length;j++){//열 0~8
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


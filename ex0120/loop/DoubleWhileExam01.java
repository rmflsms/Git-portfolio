class DoubleWhileExam01{
 public static void main(String [] args){
 

 //1. 1 ~ 100을 출력하는데 10행 10열로 출력하기 (while문안에 while문 이용하기 ) 
	   /*
	      1  2 3 ....10
		  11 12 13 ... 20
		  21.....      30
		  ..

		  91 ..........100
	   */

	   System.out.println("1 ~ 100을 출력하는데 10행 10열로 출력하기");
	   int i=0;
	   
		while(i<100){//10행
			int j = 1;
			while (j<=10){
				System.out.print(j+i+"\t");
				j++;
			}
			System.out.println();
			i+=10;
		}


	   //2.  구구단출력하기 (9행 8열)
	     /*
		     2*1=2  3*1 =3   4*1=4 ....... 9*1=9
			 2*2=4  3*2 =6   4*2=8 ....... 9*2=18
			 2*3=6  3*3 =9   4*3=12 ....... 9*3=27
			 ...

			 2*9=18  3*9 =27   4*9=36 ....... 9*9=81

		 */


	   System.out.println("\n\n 구구단출력하기");
		
	   i = 1;
	   while(i<=9){ //9행
		 int j = 2;
		while(j<=9){
			System.out.print( j + " * " + " = " + (i * j) + "\t");		
			j++;
		}
			i++;
			System.out.println();
	   }
 }
}
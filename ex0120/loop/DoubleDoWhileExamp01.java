class DoubleDoWhileExamp01{
  public static void main(String [] args){
  

  
 //1. 1 ~ 100을 출력하는데 10행 10열로 출력하기 (dowhile문안에 dowhile문 이용하기 ) 
	   /*
	      1  2 3 ....10
		  11 12 13 ... 20
		  21.....      30
		  ..

		  91 ..........100
	   */
		int i = 1;
	   do{ //10행
			int j=1;
				do{ //10행
			System.out.print(j*i + "\t");
			j++;
			}
			while (j<=10);
			System.out.println();
			i++;
	   }
	   while (i < 10);

	   System.out.println("\n\n구구단출력하기 (9행 8열)=================");

	   //2.  구구단출력하기 (9행 8열)
	     /*
		     2*1=2  3*1 =3   4*1=4 ....... 9*1=9
			 2*2=4  3*2 =6   4*2=8 ....... 9*2=18
			 2*3=6  3*3 =9   4*3=12 ....... 9*3=27
			 ...

			 2*9=18  3*9 =27   4*9=36 ....... 9*9=81

		 */

		i = 1 ;
		do{
			int j =2;
			do{
			System.out.print(j + " * " + i + "= " + (i * j ) + "\t");
			j++;
			}while (j<=9);
		System.out.println();
		i++;
		}while (i<=9);
		
  }

}
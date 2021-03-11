package week2;

public class TwoDim {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int sale[][] = new int[][]{{63, 84, 140, 130},
									{157, 209, 251, 312}};
			for(int i=0; i<2; i++){ //순차적으로 접근할려면 for문안에 for문 쓰면됨. 
									//i는 2개있으니까 2보다 작음. 인덱스는 0부터 시작이니까
			for(int j=0; j<4; j++)
			System.out.printf("%d/4분기 : sale[%d][%d]= %d %n", j+1, i, j, sale[i][j]);
			System.out.println();
			
//			System.out.println(sale[i][j]); 쉬운코드를 만든것.

	}
	}
}

package week2;

public class ThreeDim {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int sale[][][] = new int [][][]{ {{63, 84, 140, 130},{157, 209, 251, 312}},
										{{59, 80, 130, 135},{149, 187, 239, 310}}
			};


			for(int i=0; i<2; i++)
				for(int j=0; j<2; j++)
					for(int k=0; k<4; k++)
		
				System.out.println(sale[i][j][k]);
				
	}

}

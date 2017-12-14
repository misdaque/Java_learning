
public class TwoDimentionalArray {
	public static void main(String args[]) {
		int i,j,k=1;
		int twoD[][]= new int[4][5];
		
		for(i=0;i<=3;i++) {
			for(j=0;j<=4;j++) {
				twoD[i][j]=k;
				k++;
			}
		}
		for(i=0; i<=3; i++) {
			for(j=0; j<=4; j++) {
				System.out.print(twoD[i][j] +" ");
					}
			System.out.println();
		}
	}

}
import java.util.Scanner;

public class array2D {
	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		System.out.println("Enter the size:");
		int n=s.nextInt();
		System.out.println("Enter start row position:");
		int startR=s.nextInt();
		System.out.println("Enter start column position:");
		int startC=s.nextInt();
		int[][] array=new int[n][n];
		
		int tempR=0,tempC=0;
		for(int num=1;num<=n*n;num++) {
			if(array[startR][startC]==0)
			{
				array[startR][startC]=num;
				tempR=startR;
				tempC=startC;
				
			}
			else
			{
				startR=tempR;
				startC=tempC;
				startR=++startR> n-1?0:startR;
				array[startR][startC]=num;
				
			}
			startR=--startR < 0 ? (n-1):startR;
			startC=++startC>n-1 ?0:startC;
			
		}
		for(int r=0;r<n;r++) {
			for(int c=0;c<n;c++) {
				System.out.print(array[r][c]+"	");
			}
			System.out.println();
		}
	}

}

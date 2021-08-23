import java.util.Scanner;

public class Game {
	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		
		int count=0,max=0;
		
		System.out.println("Enter array size:");
		int n=s.nextInt();
		int[] arr=new int[n];
		System.out.println("Enter array elements");
		for(int j=0;j<n;j++) {
			arr[j]=s.nextInt();
		}
		
		
		
		for(int i=0;i<arr.length;i++) {
			if(max<arr[i]) {
				max=arr[i];
				count++;
			}
		}
		System.out.println(count %2==0 ? "A wins" :"B wins");
	}

}


//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

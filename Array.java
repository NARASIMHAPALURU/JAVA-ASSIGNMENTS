import java.util.Scanner;
class Array{
	public static void main(String [] args){
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number of subjects :");
		int n = sc.nextInt();
		int [] arr = new int[n];
		for( int i=0;i<n;i++){
			arr[i] = sc.nextInt();
		}
		for(int i=0;i<n;i++){
			for (int j= i+1;j<n;j++){
				if(arr[i]>arr[j]){
					int temp = arr[i];
					arr[i]=arr[j];
					arr[j]= temp;
				}
			}
		}
		int sum =0;
		for(int i=0;i<n;i++){
		 sum = sum + arr[i];
		}
		int avg = sum/n;
		System.out.println("Avg mark is :"+avg);
		
		System.out.println("highest mark is:"+arr[n-1]);
		
	}
}
		

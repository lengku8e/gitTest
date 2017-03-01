import java.util.Scanner;


public class test2 {

	public int maxSubsequence(int[] array) {  
        if (array.length == 0) {  
            return 0;  
        }  
        int max = Integer.MIN_VALUE;  
        int[] maxSub = new int[array.length];  
        maxSub[0] = array[0];  
          
        for (int i = 1; i < array.length; i++) {  
            maxSub[i] = (maxSub[i-1] > 0) ? (maxSub[i-1] + array[i]) : array[i];   
            if (max < maxSub[i]) {  
                max = maxSub[i];  
            }  
        }  
        return max;  
    }  
	public static void main(String[] args) {
		test2 t=new test2();
		Scanner sc=new Scanner(System.in);
		while(sc.hasNext()){
			int n=sc.nextInt();
			int x=sc.nextInt();
			int y=sc.nextInt();
			for(int l=0;l<n;l++){
			for(int k=0;k<x;k++){
			int a[]=new int[y];
			for(int j=0;j<y;j++){
				 a[j]=sc.nextInt();
			}
	
		System.out.println(t.maxSubsequence(a));
			}
}
}}
}
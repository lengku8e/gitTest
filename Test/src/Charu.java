
public class Charu {

	
	public static void intsetSort(int [] a){
		for(int i  = 1;i<a.length;i++){
			int temp = a[i],j=i;
			
			if(a[j-1]>temp){
			while(j>=1&&a[j-1]>temp){
					a[j]=a[j-1];
					j--;
					
				}
			}
			a[j]=temp;
				
		
		}
	}
	public static void main(String [] args){
		int [] arry = {7,3,19,40,4,7,1};
		intsetSort(arry);
		for(int i = 0;i<arry.length;i++){
			System.out.print(arry[i]+" ");
		}
		
		
		
		
	}
		
		
		
		
	}



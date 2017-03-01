
public class Dierda {

	
	
	
	
	
	
	
	
	
	
	public static void main(String [] args){
		int [] arry = {7,3,19,40,4,7,1};
		
		
			System.out.print(intsetSort(arry)
					);
		
		
}

	private static int intsetSort(int[] arry) {
		// TODO Auto-generated method stub
		
		int maxnumber = arry[0];
		int sec_max=Integer.MIN_VALUE;
		int count=arry.length;
		for(int i=1;i<count-1;i++){
			
			if(arry[i]>maxnumber){
				sec_max=maxnumber;
				maxnumber=arry[i];
			}
			else{
				if(arry[i]>sec_max){
					
					
					sec_max=arry[i];
				}
				
				
			}
		
			
		}
		return sec_max;
		
		
		
		
	}}


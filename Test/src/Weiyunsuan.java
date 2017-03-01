
public class Weiyunsuan {

	public static void main(String [] args){
		
		System.out.print(isPower(4));
		
		
	}
	
	
	
	
	public static boolean isPower(int n ){
		if(n<1){
			
			return false;
			
		}
		
		int i = 1;
		while(i<=n){
			
			if(i==n)
				return true;
				
			
			i <<=1;
		}
		return false;
		
	}
}





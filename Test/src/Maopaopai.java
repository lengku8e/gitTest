
public  class Maopaopai {

	 
	 final StringBuffer s = new StringBuffer("sunhailong") ;
	public void intsetSort(int [] a){
		for(int i  = 0;i<a.length-1;i++){
			for(int j =0;j<a.length-1;j++){
				if(a[j]<a[j+1]){
					int temp = a[j];
					a[j] = a[j+1];
					a[j+1]=temp;
					
					
					
					
					
				}
				
				
				
			}
		
		}
	}
	public static void main(String [] args){
		int [] arry = {7,3,19,40,4,7,1};
		Maopaopai m =new Maopaopai();
		m.intsetSort(arry);
		for(int i = 0;i<arry.length;i++){
			System.out.print(arry[i]+" ");
		
		}
m.s.append("f");
		System.out.print(~5);
		int a = 3;
		double b = 3;
		short c = 1;
		int d=c+1;
/*		int c = 7/5;*/
		short n =128;
		byte o  = (byte) n;
		System.out.print(m.s.toString()+d+o);

		
	
}
	
	
	
	
}
 
 class a{
	 
	 
	 
	 
	 
 }

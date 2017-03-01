
public class Shuzuzhongzuidazuixiao {

	
	static int Max;
	static int Min;
	
	
	
	
	
	
	
	public static void main(String [] args){
		int [] arry = {7,3,19,40,4,7,1};
		intsetSort(arry);
		
			System.out.print("max="+Max);
			System.out.print("min="+Min);
		
}

	private static void intsetSort(int[] arry) {
		// TODO Auto-generated method stub
	Max=arry[0];
	Min=arry[0];
	int len = arry.length;
	/*
	 * ȡ˫Ԫ�ط�
	 * 
	 * */
	for(int i=1;i<len-1;i=i+2){

		if(i+1>len){
			if(arry[i]>Max){
				Max=arry[i];
			}
			if(arry[i]<Min){
				Min=arry[i];
			}
		}
		if(arry[i]>arry[i+1]){
			if(arry[i]>Max){
				Max=arry[i];
				
			}
			if(arry[i+1]<Min){
				Min=arry[i+1];
			}
		}
		if(arry[i]<arry[i+1]){
			if(arry[i+1]>Max){
				Max = arry[i+1];
				
			}
			if(arry[i]<Min){
				Min=arry[i];
			}
		}
		
		
		
		
	}
		
		
		
		
	}
}
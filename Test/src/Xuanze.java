import java.util.Scanner;
	
public class Xuanze {

		public static void main (String[] args)
		{
                      Scanner sc = new Scanner(System.in);
                        int [] a = new int[5];
                      
                        	for(int i = 0;i<a.length;i++){
                        	  a[i]= sc.nextInt();
                        	  }//ѭ���������֣��浽������
                      
                        selectSort(a);//ð������
                        for(int j =0;j<a.length;j++){
                        	 System.out.print(a[j]);
                        }
                       
		}
		
		
	public static void selectSort(int[] a ){
	    
	    for(int i =0;i<a.length;i++){
	        int temp= a[i];
	        
	        for(int j = i+1;j<a.length;j++){
	            
	            if(a[j]<temp){
	                temp = a[j];
	                a[j] = a[i];
	                a[i]= temp;
	            }
	            
	            
	            
	        }
	    }
	    
	    
	    
	    
	    
	}
		
		

}

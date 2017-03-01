import java.util.Scanner;


public class Test {

	
	public void testA(Integer[][]a){
		
		
		if(null==a[0]||null==a[0][0]||a[0][0]<1||a[0][0]>400000){
			
			System.out.print("参数错误");
			
		}
		if(null==a[1]||null==a[2]||a[1].length<=a[2].length){
			System.out.print("参数错误");
			
		}
		int len2=a[2].length;
		int len1=a[1].length;
		for(int j=0;j<len1;j++){
			for(int i=0;i<len2;i++){
				
				if(a[1][j]==a[2][i]){
					break;
				}
				if(a[1][j]!=a[2][i]&&j==len2-1){
					System.out.println(a[1][j]);
				}
			}
			
		}
	}
	public static void main(String[] args) {
		Test t=new Test();
		Scanner sc=new Scanner(System.in);
		while(sc.hasNext()){
			int n=sc.nextInt();
		    int  m=sc.nextInt();
			//Integer a[][]=new Integer[m][];
			//a[0][]=m;
		t.testA(new Integer[][]{{3},{2274000,2274001,2274002},{2274000,2274002}});
	}
}
}
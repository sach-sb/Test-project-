package assignment;

public class Sample2 {

	

		public static void main(String[] args) {
			
			
			for(int i=2; i<=21; i++){
				
			int no=i;
			boolean flag = true;
			for(int j=2; j<=i/2; j++){
				
				if(no%j==0){
					
					
					flag=false;
					break;
				}
			}
			
			if(flag==true)
			{
				
				
				System.out.print(no+"  ");
				
				
			}
			}
		}
}
					
					
				
				
				
				
				
				
			
				
	
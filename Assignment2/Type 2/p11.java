import java.util.Scanner;


class p11{
     public static void main(String args[]){
	 
	 
	 Scanner sc = new Scanner(System.in);
	 
	 System.out.println("Enter the no of rows ");
	 
	 int a = sc.nextInt();
	 
	 
	 for(int i=1;i<=a;i++){
	 
	 for(int j=1;j<=i-1;j++){
	 System.out.print(" ");
	 
	  }
	  
	  for(int j=1;j<=a;j++){
	 System.out.print("*");
	 
	  }
	  
	 System.out.println();
	 
	 }
	
	 
	
	 }
}


public class HelloWorld {

	public static void main(String[] args) {
	
		String []ar1= {"Aman","Shubham","Atul","Shreya"};
		  String []ar2=new String[4];
		  System.out.println("Ar1  ......");
		 
		  printArray(ar1);
		  
		  System.arraycopy(ar1,1, ar2, 2, 2);
		  
		  System.out.println("Ar2  ......");
		  printArray(ar2);
	}

}

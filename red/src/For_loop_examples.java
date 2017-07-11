
public class For_loop_examples {

	public static void main(String[] args) {
		// WAP to print values from  1 to 10
	// intilization // strt point ==>	int i=1
		// condition or end point ==>i<=10
		// increment values =i++  or i=i+1
	for(int i=1;i<=10; i=i+1)
	{
		System.out.println("values in icrement order -->"+ i*5);
	}
	System.out.println("=====================");
	// WAP to decrement values from  10 to 1
	for(int i=10; i>=1 ;i--)
	{
		System.out.println("values in cedrement order -->>"+ i);
	}
	
	System.out.println("===============================");
	int vtable=10;
	System.out.println(" table of -->>"+ vtable);
	for(int j=1;j<=10;j++)
	{
		System.out.println(vtable  +  " * " + j  + " = "   + vtable *j);
	}
	
	// WAP to print table of range 1 to 50 
	
	for( int a=1 ; a<=50;a++)  // range 1 to 50  Outer loop
	{
		System.out.println(" table of -->"+a);
		System.out.println("====================");
		for( int b=1; b<10;b++) // inner loop --> for creation of table
		{
			System.out.println(a +  "  * "+  b  +  "   = "+  a*b);
		}
	}
	
	
	
	
	
	
	
	
	
	
	
		
		

	}

}

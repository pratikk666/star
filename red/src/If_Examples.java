
public class If_Examples {

	public static void main(String[] args) {
		//  Find greater no 
		int Firstno=1000;
		int secondno=1000;
		int thirdno=1000;
		// Compersion operators -->>  &&[And] , || [OR], <,>,,=,>= ==[equal]
		int fourthvalue=30;
		
		if(Firstno> secondno  && Firstno>thirdno ) // First condition
		{
			System.out.println("First no is-->"+ Firstno);
		}else  if(secondno>Firstno  && secondno> thirdno)  // second condition 
		{
			System.out.println("Second no is ->"+ secondno);
		}  else if(thirdno> Firstno  && thirdno> secondno)
		{
			System.out.println("Third nos is greater and no is --->>"+ thirdno);
		}else
		{
			System.out.println(" Two no are or all no are same ");
		}
		
		
		
		

	}

}

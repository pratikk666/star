
public class singlearray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String emp [] = new String [3];
		
		emp[0] = "jak";
		emp[1]= "mak";
		emp[2] = "tak";
		
		for(int a=0 ; a<3 ; a++)
			
		{System.out.println("empl is.." + emp[a]);
		}
		
		String ppl [][] = new String [2][2];
		
		ppl[0][0] = "jakas";
		ppl[0][1]= "makas";
		ppl[1][0] = "takas";
	    ppl[1][1] = "bvr" ;
	    
	    for (int i=0 ; i<2 ; i++) 
	    {
	    	for (int j=0 ; j<2 ; j++)
	    	{
	    		System.out.print( "   " + ppl[i][j]);
	    		}
	       System.out.println (); 
	       }
		
	}

}

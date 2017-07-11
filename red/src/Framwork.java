
public class Framwork {

	public static void main(String[] args) {
		
		String keyword="browseropen";//  .. fetch values from .xls
		
		switch (keyword) {
		case "browseropen":
			System.out.println("call browser open functions");
			break;
			
		case "browserclose":
			System.out.println("call browserclose functions");
			// selnium code driver.close
			break;
			
		case "button click":
			System.out.println("call button click functions");
			break;
			

		default:
			break;
		}
		
		
		

	}

}

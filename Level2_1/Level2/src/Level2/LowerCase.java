package Level2;

public class LowerCase {
	  
		public String[] arr;
		
		public String[] toLowerCase(String[] arr){
			for (String element : arr){
				element.toLowerCase();
			}
			return arr;
		}	

}

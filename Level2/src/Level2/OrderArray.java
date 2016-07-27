package Level2;

public class OrderArray {
	
	public int[] array = {5,3,1,0,5,14,7,99};

	
	public int[] orderAnArray(int[] array){
		
		for (int i=0; i<array.length; i++){
			        int min = array[i];
			        int min_i = i; 
			        for (int j = i+1; j < array.length; j++) {
			            if (array[j] < min) {
			                min = array[j];
			                min_i = j;
			            }
			        }
			        if (i != min_i) {
			            int tmp = array[i];
			            array[i] = array[min_i];
			            array[min_i] = tmp;
			        }
			     }
		return array;
			}
			
	}


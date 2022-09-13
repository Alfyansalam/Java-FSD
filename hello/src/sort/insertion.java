package sort;

public class insertion {

	public static void main(String[] args) {
		int[] data = { 9, 5, 1, 4, 3 };
		int size = data.length;

	    for (int step = 1; step < size; step++) {
	      int key = data[step];
	      int j = step - 1;

	     
	      while (j >= 0 && key < data[j]) {
	        data[j + 1] = data[j];
	        --j;
	      }

	     
	     data[j + 1] = key;
	     
	   
	    }
	    for(int i=0;i<size;i++)
	    {
	    	System.out.println(data[i]);
	    }
	}
	}

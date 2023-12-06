import java.util.ArrayList;

public class PrintAllElementArraySerially {

	public static void main(String[] args) {
		  int array1[] = {1, 2, 3, 4, 5};
	        int array2[] = {1, 4, 5, 9, 8, 5, 6, 2, 1, 2, 4, 1, 5};
	        ArrayList<Integer> output = new ArrayList<>();
	        
	        for (int i : array2) {
	            for (int j : array1) {
	                if (i == j) {
	                    output.add(j);
	                    break;
	                }
	            }
	        }
	        
	        for (int i : output) {
	            System.out.print(i + " ");
	        }
	    }
	}
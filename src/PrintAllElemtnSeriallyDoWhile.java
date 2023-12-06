import java.util.ArrayList;

public class PrintAllElemtnSeriallyDoWhile {

	public static void main(String[] args) {
		        int array1[] = {1, 2, 3, 4, 5};
		        int array2[] = {1, 4, 5, 9, 8, 5, 6, 2, 1, 2, 4, 1, 5};
		        ArrayList<Integer> output = new ArrayList<>();
		        
		        int i = 0;
		        do {
		            int j = 0;
		            do {
		                if (array2[i] == array1[j]) {
		                    output.add(array1[j]);
		                    break;
		                }
		                j++;
		            } while (j < array1.length);
		            i++;
		        } while (i < array2.length);
		        
		        for (int k : output) {
		            System.out.print(k + " ");
		        }
		    }
		}
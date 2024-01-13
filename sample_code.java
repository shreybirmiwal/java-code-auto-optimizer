import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;

public class sample_code {

	public static void main(String[] args) throws FileNotFoundException {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(new File("sample_data.txt"));

		ArrayList<Integer> ar = new ArrayList<Integer>();
		while(scanner.hasNextInt()) {
			ar.add(scanner.nextInt());
		}
		Collections.sort(ar);

	
		System.out.println(ar.get((ar.size()/2)));
		
	}


}
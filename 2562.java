import java.util.Arrays;
import java.util.Scanner;
 
public class Main {
	public static void main(String[] args) {
    
		Scanner sc = new Scanner(System.in);

		int max = 0;
		int index = 0;
        
		int[] arr = new int[9];
        
		for (int i = 0; i < 9; i++) {
			arr[i] = sc.nextInt();
		}
        
		sc.close();

		for(int j=0; j<9; i++){
			if(max < arr[j]){
				max = arr[j];
				index = j+1;
			}
		}
		System.out.print(max + "\n" + index);
	}
}
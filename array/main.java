package array;
import java.util.*;
public class main {
	public static void main(String[] args) {
		try (Scanner sc = new Scanner(System.in)) {
			System.out.println("Enter the data");
			int n=sc.nextInt();
			int num[]=new int[n];
			for(int i=0;i<n;i++) {
				num[i]=sc.nextInt();
			}
			for(int j=0;j<n;j++) {
				System.out.println(num[j]);
			}
		}
	}

}

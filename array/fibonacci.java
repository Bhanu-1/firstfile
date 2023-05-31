package array;
import java.util.*;
public class fibonacci {
	public static void main(String[] args) {
		try (Scanner sc = new Scanner(System.in)) {
			int n1=0;
			int n2=1;
			int n3=0;
			System.out.println("Enter number of series:");
			int n=sc.nextInt();
			System.out.println(n1);
			System.out.println(n2);
			for(int i=1;i<=n;i++) {
				n3=n1+n2;
				System.out.println(n3);
				n1=n2;
				n2=n3;
			}
		}
	}
}

package array;
import java.util.*;
public class cubes {
	public static void main(String[] args) {
		try (Scanner sc = new Scanner(System.in)) {
			System.out.println("Enter number of cubes you want");
			 int a=sc.nextInt();
			 int j=1;
			 for(int i=1;i<=a;i++) {
				 j=i*i*i;
				 System.out.println(j);
				 
			 }
		}
	}

}

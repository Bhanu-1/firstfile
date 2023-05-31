package array;
import java.util.*;
public class fact {
	public static void main(String[] args) {
		try (Scanner sc = new Scanner(System.in)) {
			int n=sc.nextInt();
			for(int i=1;i<=n;i++) {
				if(i%2==0) {
					System.out.println(100/i);
				}else {
					System.out.println(100*i);
				}
			}
		}
	}

}

import java.util.*;
public class ParallelogramPattern {
	
	public static void main(String[] args) {
		// Write your code here
        Scanner sc =new Scanner (System.in);
        int n=  sc.nextInt();
        for(int i=1; i<=n;i++){
            for (int k=1;k<=i-1;k++){
                System.out.print(" ");
            }
            for (int j=1;j<=n;j++){
                System.out.print("*");
            }
            System.out.println();
        }
			
	}
}

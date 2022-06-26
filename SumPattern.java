import java.util.*;
public class SumPattern {
	
	public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        int n= sc.nextInt();
        int i,j,sum=0;
        for(i=1;i<=n;i++){
            for(j=1;j<=i;j++){
			sum=sum+j;
                System.out.print(j);
                if(j==i){ 
                 System.out.print("="+sum);}
             else
                 System.out.print("+");
            }
            System.out.println();
            sum=0;
        }
		// Write your code here
	}
}

import java.util.*;
public class InterestingAlphabets 
{


	public static void main(String[] args) {
		
		/* Your class should be named Solution.
	 	* Read input as specified in the question.
	 	* Print output as specified in the question.
		*/
		   Scanner sc= new Scanner(System.in);
        int n =sc.nextInt();
        for(int i=1;i<=n;i++){
            for(int j=1;j<=i;j++){
            
                System.out.print((char)('A'+n-i+j-1));
               
            }
            System.out.println();
        }
		
	}

}

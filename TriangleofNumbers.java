import java.util.Scanner;

public class TriangleofNumbers {

	public static void main(String[] args) {
		/* Your class should be named Solution.
	 	* Read input as specified in the question.
	 	* Print output as specified in the question.
        
		*/
        Scanner sc= new Scanner(System.in);
        int n= sc.nextInt();
            int gap=n-1;
        int num=1;
        for(int j=1;j<=n;j++){
             num=j;
            for(int i=1;i<=gap;i++)
                System.out.print(" ");
                gap--;
            
            for(int i=1;i<=j;i++){
                System.out.print(num);
                
            num++;
            }
            num--;
            num--;
            for(int i=1;i<j;i++){
                System.out.print(num);
                num--;
                
            }
            System.out.println();
        }
	}
}

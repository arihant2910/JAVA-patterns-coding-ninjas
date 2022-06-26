import java.util.*;
public class StarPattern {


	public static void main(String[] args) {
		
		/* Your class should be named Solution.
	 	* Read input as specified in the question.
	 	* Print output as specified in the question.
		*/
        Scanner sc= new Scanner (System.in);
        int n= sc.nextInt();
	int i=1;
        while(i<=n){
            int spaces=1;
            while(spaces<=n-i){
                System.out.print(" ");
                spaces++;
            }
            
            
           
            int j=1;
            while(j<=i){
                System.out.print("*");
               
                j++;
            }
          
            j=1;
            while(j<=i-1){
                System.out.print("*");
              
                j++;
            }
            System.out.println();
            i++;
        } 
	}

}

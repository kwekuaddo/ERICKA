import java.util.*;
public class Q3 {

public static int pow(int a, int b){
		      if (b==1){
		         return a;
		      }     
		      else {
		         return(a*pow(a,b-1));
		      }
		   }
		   public static void main(String args[]){
		      int a,b;
		      @SuppressWarnings("resource")
			Scanner s = new Scanner(System.in);
		        System.out.println("Enter the value of a and b for a^b");
		      a= s.nextInt();
		      b= s.nextInt();
		      System.out.println(pow(a,b));
		   }
}

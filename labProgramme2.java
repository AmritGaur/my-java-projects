package ITP;
import java.util.Scanner;
public class labProgramme2 {

	public static void main(String[] args) {
		
  Scanner input = new Scanner(System.in);
        double a = input.nextDouble();
        double r = input.nextDouble();
        int n = input.nextInt();
        double x = Math.pow(r, n);
        double sum = a*(x-1)/(r-1);
        System.out.println("the sum of series is="+ sum);
        
		  
  
	}

}

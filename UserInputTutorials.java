package userInput;
import java.util.Scanner;
public class UserInputTutorials {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
         Scanner input = new Scanner(System.in);
        	 {  int principal = input.nextInt();
         
         double rate = input.nextDouble();
         
         byte time= input.nextByte();
         
         double simpleinterest=rate*time*principal/100;
         System.out.println("the simple interest is=" + simpleinterest);
        	 }
	}
	}



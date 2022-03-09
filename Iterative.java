//do-while, while, for, recursion
import java.util.*;
public class Iterative extends Structure{
	Scanner input = new Scanner(System.in);
	private String type, response;
	private int respint;
	private boolean sprint = true;
	public Iterative (String newType) {
		type = newType;
	}
	
	void run() {
		switch(type) {
		case"for":
			System.out.println("How many times do you wanna do this");
			respint = input.nextInt();
			for(int i = 0; i < respint; i++) {
				System.out.print("this");
			}
		case "while":
			System.out.println("Press G");
			
			while(sprint == true){
				
				System.out.print("fear me");
				response = input.next();
				response = response.toLowerCase();
				if(response.equals("g")) {
					sprint = false;
				}
			}
			
	}
  }
}
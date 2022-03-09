//if and switch
import java.util.*;
public class Decision extends Structure{
	Scanner input = new Scanner(System.in);
	private String type, response;
	public Decision (String newType) {
		type = newType;
	}
	void run() {
		System.out.print("Do you want an example of switch or if?");
		type = input.next();
		type = type.toLowerCase();
		switch(type) {
		case"if":
			System.out.println("Are you a fan of oranges");
			response = input.next();
			response = response.toLowerCase();
			if(response.contentEquals("yes")) {
				System.out.println("Garfield enjoyer");
			}break;
		case "switch":
			System.out.println("Are you a fan of apple or orange");
			response = input.next();
			response = response.toLowerCase();
			switch(response) {
			case "apple":
				System.out.println("Nice job keeping the doctor away");
				break;
			case "orange":
				System.out.println("Garfield enjoyer");
				break;
			}break;
		}
		
			
	}
}
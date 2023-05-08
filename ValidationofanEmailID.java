package ValidationofanEmailID;
import java.util.*;
public class ValidationofanEmailID {
public static void main(String[] args) {
	        String[] emailIDs = { "tippu@gmail.com", "mickey@gmail.com", "bobby@gmail.com" };
	        Scanner sc= new Scanner(System.in);
	        System.out.print("Enter an email ID to search: ");
	        String searchEmail = sc.nextLine();
	        boolean match = false;
	        for (String email : emailIDs) {
	            if (email.equalsIgnoreCase(searchEmail)) {
	               match = true;
	                break;
	            }
	        }
	        if (match) {
	            System.out.println("Email ID found in the array");
	        } else {
	            System.out.println("Email ID not found in the array");
	        }
	    }
}


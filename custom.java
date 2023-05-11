package assistedprojects;
public class custom {
	    public static void main(String[] args) {
	        try {
	            method1();
	            method2();
	        } catch (CustomException er) {
	            System.out.println("Caught CustomException:"+ er.getMessage());
	        } finally {
	            System.out.println("executed");
	        }
	    }

	    public static void method1() throws CustomException {
	        throw new CustomException("Exception thrown in method1");
	    }

	    public static void method2() throws CustomException {
	        throw new CustomException("CustomException thrown  method2");
	    }
	}
	class CustomException extends Exception {
	    public CustomException(String message) {
	        super(message);
	    }
	}




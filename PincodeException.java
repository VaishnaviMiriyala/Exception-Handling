package m7.task2;

public class PincodeException extends Exception{
	private String message = "";

	public PincodeException() {
		super();
	}

	public PincodeException(String message) {
		super(message);
		this.message = message;
	}

	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return "Pincode Exception: "+message;
	}
	
   
}

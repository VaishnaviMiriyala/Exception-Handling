package m7.task2;

public class Location {
	public void getEmployeeLocation(String codes,String code) throws PincodeException{
			if(code.equals("011")) {
				System.out.println(code +" : "+"Delhi");
			}else if(code.equals("022")) {
				System.out.println(code +" : "+"Mumbai");
			}else if(code.equals("080")) {
				System.out.println(code +" : "+"Bangloor");
			}else if(code.equals("020")) {
				System.out.println(code +" : "+"Pune");
			}else{
				throw new PincodeException("Wrong Pincode");
			}
	}

}

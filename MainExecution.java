package m7.task2;

public class MainExecution {
	public static void main(String[] args) {
		EmployeeService service = new EmployeeService();
		String codes[] = service.getEmployeeCodes();
		Location l = new Location();
 		try {
 			String code[] = service.getLocationCode();
 			for (int i = 0;i < codes.length;i++) {
	            l.getEmployeeLocation(codes[i],code[i]);
 			}
		}
		catch(Exception e){
			System.out.println(e);
		}
    
		}

}

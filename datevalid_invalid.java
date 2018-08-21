import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Scanner;
public class DateValid {
    public static void main(String[] args) {

		Scanner input = null;
		try {
			input = new Scanner(System.in);
            int testcase=input.nextInt();
            for(int ctr=0;ctr<testcase;ctr++){
			//System.out.println("Enter date in dd/MM/yyyy format : ");
			String date = input.next();
			if (isDateValid(date)) {
				System.out.println("VALID");
			} else {
				System.out.println("NOT VALID");
			}
		} 
        }
        finally {
			if (input != null) {
				input.close();
			}
		}
	}
    

	private static boolean isDateValid(String date) {

		boolean result = false;

		if (isValidDateFormat(date)) {
            DateFormat dateFormat = new SimpleDateFormat("dd/MM/yyyy");
            dateFormat.setLenient(false);
			try {
				dateFormat.parse(date);
				result = true;
			} catch (ParseException e) {
				result = false;
			}
		}
		return result;
	}
    private static boolean isValidDateFormat(String date) {
		String pattern = "(0?[1-9]|[12][0-9]|3[01])\\/(0?[1-9]|1[0-2])\\/([0-9]{4})";
		boolean result = false;
		if (date.matches(pattern)) {
			result = true;
		}
		return result;

	}
}

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
public class Program23 {

	public static void main(String[] args) {
		SimpleDateFormat formatter = new SimpleDateFormat("dd-MMM-yyyy");
		String dateInString = "12-Dec-1998";
		try {
		Date date = formatter.parse(dateInString);
		System.out.println(date);
		System.out.println(formatter.format(date));
		}catch (ParseException e) {
		e.printStackTrace();
		}

	}

}

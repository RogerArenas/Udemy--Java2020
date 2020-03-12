package OItentaQuatro;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class Array {
	public static void main(String[] args) throws ParseException {

		SimpleDateFormat format = new SimpleDateFormat("dd/mm/yyyy");

		Date date = format.parse("23/01/2001");
		Date date1 = format.parse("20/01/2001 20:01:01");
		
		System.out.println(date.before(date1));
		System.out.println(date1);

	}
}

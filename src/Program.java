import Entities.Department;
import Entities.Seller;
import java.sql.Date;
import java.text.ParseException;
import java.text.SimpleDateFormat;

public class Program {
    public static void main(String[] args) {
        SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
        Department sc = new Department(1, "Books");
        System.out.println(sc);
        try {
            Seller sell = new Seller("Gabriel", "Gabri@gmail.com", 10000.00, 1, new Date(sdf.parse("15/06/2005").getTime()));
            System.out.println(sell);
        }
        catch(ParseException e){
            e.fillInStackTrace();
        }
        }
}
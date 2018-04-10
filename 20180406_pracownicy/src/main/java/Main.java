import java.io.FileNotFoundException;
import java.util.List;

public class Main {
    public static void main(String[] args) throws FileNotFoundException {
        System.out.println("Pracownicy");

        EmployeesArray employeesArray = new EmployeesArray();
        //System.out.println("Employee list String from file");
        //employeesArray.uploadFromFile(employeesArray.getFilename());
        //System.out.println("Employee list String");
       // System.out.println(employeesArray.fillEmployeeArray().get(0));
        employeesArray.uploadAndCreateObject(employeesArray.getFilename());
        //System.out.println(employeesArray.);
    }
}

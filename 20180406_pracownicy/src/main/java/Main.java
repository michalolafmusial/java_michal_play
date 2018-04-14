import java.io.FileNotFoundException;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

public class Main {
    public static void main(String[] args) throws FileNotFoundException {
        System.out.println("Pracownicy");

        EmployeesArray employeesArray = new EmployeesArray();
<<<<<<< HEAD
        // odpalam metode ktora zwraca kolekcje employeesow z pliku
        employeesArray.uploadObjectsToArrayList(employeesArray.getFilename());
        // tutaj juz moge sie dostawac do konkretnych wartosci obiektow employees
        System.out.println(employeesArray.getEmployeesListObjects().get(0).getFirstName());
        System.out.println(employeesArray.getEmployeesListObjects().get(2).getSecondName());
        //Collections.sort((List<Comparable>) employeesArray);
        System.out.println(employeesArray);

=======
        //System.out.println("Employee list String from file");
        //employeesArray.uploadFromFile(employeesArray.getFilename());
        //System.out.println("Employee list String");
       // System.out.println(employeesArray.fillEmployeeArray().get(0));
        employeesArray.uploadAndCreateObject(employeesArray.getFilename());
        //System.out.println(employeesArray.);
>>>>>>> bdb578545d82d555ad36b40eea39af87fef5d9be
    }
}

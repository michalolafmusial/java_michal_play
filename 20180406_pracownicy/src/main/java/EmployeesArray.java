import java.io.*;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class EmployeesArray {
    private String filename = "src/main/resources/employees.txt";
    private List<Employees> employeesListObjects = new ArrayList<Employees>();
    private List<String> employeesListString = new ArrayList<String>();

    public String getFilename() {
        return filename;
    }

    public void setFilename(String filename) {
        this.filename = filename;
    }

    public List<Employees> getEmployeesListObjects() {
        return employeesListObjects;
    }

    public void setEmployeesListObjects(List<Employees> employeesListObjects) {
        this.employeesListObjects = employeesListObjects;
    }

    public List<String> getEmployeesListString() {
        return employeesListString;
    }

    public void setEmployeesListString(List<String> employeesListString) {
        this.employeesListString = employeesListString;
    }

    public void uploadAndCreateObject (String file_name) throws FileNotFoundException {
        // Dodawanie kolejnych wierszy do tablicy ArrayList z pliku (kazdy wiersz to nowy wpis)
        Scanner s = new Scanner(new File(file_name));
        ArrayList<String> list = new ArrayList<String>();
        while (s.hasNext()) {
            list.add(s.nextLine());


        }
        s.close();

        System.out.println(list);
      //  System.out.println(list.get(1));
      //  System.out.println(list.get(3));
    }


    public void uploadFromFile(String filename)  {




           // BufferedReader br=new BufferedReader(new FileReader(filename));
           // String line= br.readLine(); // reads the first line, or nothing
            String sample = "Pies,Kot,Papuga";
           // while (line != null) {
                String[] items = sample.split(",");
                employeesListString = Arrays.asList(items);
                System.out.println(employeesListString.get(1));
         //   }

        }



    public List<Employees> fillEmployeeArray() {
        Employees employee_1 = new Employees("Michal", "Musial", 10000, "male", 1);
        Employees employee_2 = new Employees("Marcin", "Nowak", 30000, "male", 2);
        Employees employee_3 = new Employees("Agnieszka", "Adamczyk", 45000, "female", 3);
        employeesListObjects.add(employee_1);
        employeesListObjects.add(employee_2);
        employeesListObjects.add(employee_3);

        return employeesListObjects;
    }
}


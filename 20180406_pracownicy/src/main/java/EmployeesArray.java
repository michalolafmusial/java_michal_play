import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
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

    public void uploadFromFile(String filename) throws FileNotFoundException {

        File file = new File(filename);
        Scanner in = new Scanner(file);

        while (in.hasNext()) {
            employeesListString.add(in.nextLine());


        }

        for (int i = 0; i < employeesListString.size(); i++) {
            System.out.println(employeesListString.get(i));
        }


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


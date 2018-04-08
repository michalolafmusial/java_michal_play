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

    public List<String> uploadToArrayListStringFromFile(String file_name) throws FileNotFoundException {
        // Dodawanie kolejnych wierszy do tablicy ArrayList z pliku (kazdy wiersz to nowy wpis)
        Scanner s = new Scanner(new File(file_name));
        while (s.hasNext()) {
            employeesListString.add(s.nextLine());
        }
        s.close();

        System.out.println(employeesListString);
        // Moge tez pobrac pojedyncze wiersze
        //  System.out.println(list.get(1));
        //  System.out.println(list.get(3));
        return employeesListString;
    }


    public void uploadToArrayListFromString() {

        String sample = "Pies,Kot,Papuga";
        String[] items = sample.split(",");
        employeesListString = Arrays.asList(items);
        System.out.println(employeesListString.get(1));
    }

///////// !!!!!!!!!!!!!!!!!!!!!!!!!11 ////////////////
    public List<Employees> uploadObjectsToArrayList (String filename) throws FileNotFoundException {
        // Skanuje plik
        Scanner s = new Scanner(new File(filename));
        // Petla dopóki instnieje wiersz
        while (s.hasNext()) {
            // tworze tablice stringow dla kazdego wiersza w petli i rozdzielam to co w pliku po przecinku
            //dostaje na wyjsciu strong na przyklad Jan,Kowalski,2010,M,3
            String[] a = s.nextLine().split(",");
            // tworze nowy obiekt employees ktory w konstruktorze ma te piec wartosci
            // jako ze jest to string, to tam gedzie w obiekcie jest int, konwertuje stringa do inta
            Employees employees = new Employees(a[0],a[1],Integer.valueOf(a[2]),a[3],Integer.valueOf(a[4]));
            // dodaje nowo tworzone obiekty do array listy employeesow
            employeesListObjects.add(employees);
            //System.out.println(a[2]);
            //System.out.println(employeesListObjects);
        }
        s.close();
        //System.out.println(employeesListObjects);
        return employeesListObjects;
    }


    public List<Employees> fillEmployeeArrayWithPreviouslyCreatedObjects() {
        Employees employee_1 = new Employees("Michal", "Musial", 10000, "male", 1);
        Employees employee_2 = new Employees("Marcin", "Nowak", 30000, "male", 2);
        Employees employee_3 = new Employees("Agnieszka", "Adamczyk", 45000, "female", 3);
        employeesListObjects.add(employee_1);
        employeesListObjects.add(employee_2);
        employeesListObjects.add(employee_3);

        return employeesListObjects;
    }
}


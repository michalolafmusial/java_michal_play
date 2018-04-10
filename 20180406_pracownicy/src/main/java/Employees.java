public class Employees {
    private String firstName;
    private String secondName;
    private int salary;
    private String sex;
    private int section;

    public Employees(String firstName, String secondName, int salary, String sex, int section) {
        this.firstName = firstName;
        this.secondName = secondName;
        this.salary = salary;
        this.sex = sex;
        this.section = section;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getSecondName() {
        return secondName;
    }

    public void setSecondName(String secondName) {
        this.secondName = secondName;
    }

    public int getSalary() {
        return salary;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }

    public String getSex() {
        return sex;
    }

    public void setSex(String sex) {
        this.sex = sex;
    }

    public int getSection() {
        return section;
    }

    public void setSection(int section) {
        this.section = section;
    }

    @Override
    public String toString() {
        return this.firstName + " | " + this.secondName + " | " + this.sex + " | " + this.salary + " | " + this.section;
    }
}

class Employee {
    private String name;
    private int id;
    private String contact_no;
    private double salary;

    public String getName(){
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }

    public int getId() {
        return id;
    }
    public void setId(int id) {
        this.id = id;
    }

    public String getContact_no() {
        return contact_no;
    }

    public void setContact_no(String contact_no) {
        this.contact_no = contact_no;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }
}
class EmployeeDocument{
    public static void main(String[] args) {
        Employee e= new Employee();
        e.setName("Amal");
        System.out.println("Employee name is:- "+e.getName());
        e.setId(12345);
        System.out.println(e.getName()+ "'s id is:- "+e.getId());
        e.setContact_no("0710000000");
        System.out.println(e.getName()+ "'s contact number is:- "+e.getContact_no());
        e.setSalary(35000.00);
        System.out.println(e.getName()+ "'s salary is:- "+e.getSalary());

    }
}

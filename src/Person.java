class Person {
    private int salary;

    public int getSalary(){
        return salary;
    }
    public void setSalary(int salary) {
        this.salary = salary;
    }
}
class PeronSalary{
    public static void main(String[] args) {
        Person p = new Person();
        p.setSalary(50000);
        System.out.println("Salary :- "+p.getSalary());
    }
}

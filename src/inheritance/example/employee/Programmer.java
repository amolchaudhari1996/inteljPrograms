package inheritance.example.employee;

public class Programmer extends Employee{
    int bonus = 10000;
    public static void main(String args []){
        Programmer p = new Programmer();
        System.out.println("Programmers salary is "+ p.salary);
        System.out.println("Programmers salary is "+ p.bonus);
    }
}

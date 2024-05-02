import java.lang.*;
public class EmployeeOut{
    public static void main(String[] args){
        // making object 1
        Employee emp1 = new Employee("Susan Meyers", 47899, "Accounting", "Vice President");

        // making object 2
        Employee emp2 = new Employee("Mark Jones", 39119, "IT", "Programmer");

        // making object 3
        Employee emp3 = new Employee("Joy Rogers", 81774, "Manufacturing", "Engineer");


        // outputs

        System.out.println("Name: \t" + "\tID Number:\t" + "Department:" + "  Position:");
        // object 1
        System.out.println(emp1.getName()+"\t" + emp1.getIdNumber()+"\t" + emp1.getDepartment()+"\t  " + emp1.getPosition());
        // object 2
        System.out.println(emp2.getName()+"\t    " + emp2.getIdNumber()+"\t    " + emp2.getDepartment()+"\t      " + emp2.getPosition());
        // object 3
        System.out.println(emp3.getName()+"      " + emp3.getIdNumber()+"  " + emp3.getDepartment()+"  " + emp3.getPosition());

    }
}

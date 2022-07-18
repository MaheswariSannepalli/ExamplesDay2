package javaExamples;

import java.util.*;
 
class Employe {
 
    String name;
    int id;
    String dept;
 
    Employe(String name, int id, String dept)
    {
        this.name = name;
        this.id = id;
        this.dept = dept;
    }
}

// Department class contains list of Employee objects. It is associated with employee class through its Objects
class Department {
    String name;
    private List<Employe> employee;
    Department(String name, List<Employe> employee)
    {
        this.name = name;
        this.employee = employee;
    }
 
    public List<Employe> getEmployees()
    {
        return employee;
    }
}

//  Company class contains list of Department Objects. It is associated with Department class through its Objects
class Company {
	
    String companyName;
    private List<Department> departments;
 
    Company(String companyName,List<Department> departments)
    {

        this.companyName =companyName;
        this.departments = departments;
    }
 
    public int getTotalEmployeesInInstitute()
    {
        int noOfEmployees = 0;
        List<Employe> employee;
 
        for (Department dept : departments) {
            employee = dept.getEmployees();
 
            for (Employe s : employee) {
                noOfEmployees++;
            }
        }
        return noOfEmployees;
    }
}
 
public class EmpDetails {
 
    public static void main(String[] args)
    {
        Employe e1 = new Employe("Maheswari", 123, "APPX mail");
        Employe e2 = new Employe("Priya", 112, "Automata");
        Employe e3 = new Employe("Chandu", 1, "Automata");
        Employe e4 = new Employe("shanu ", 2, "APPX mail");
 
        // Creating a List of Appx mail employees
        List<Employe> APPX_MAIL = new ArrayList<Employe>();
 
        // Adding APPX_MAIL employees
        APPX_MAIL.add(e1);
        APPX_MAIL.add(e4);
 
        // Creating a List of Automata Employees
        List<Employe> Automata = new ArrayList<Employe>();
 
        // Adding Automata students
        Automata.add(e2);
        Automata.add(e3);
 
        Department  APPXMAIL = new Department(" APPX_MAIL",  APPX_MAIL);
        Department  AUTOMATA = new Department("EE", Automata);
 
        List<Department> departments = new ArrayList<Department>();
        departments.add(AUTOMATA);
        departments.add( APPXMAIL);
 
        Company oho = new Company("OHO", departments);
 
        System.out.print("Total Employees in Company are : ");
 
        System.out.print(oho.getTotalEmployeesInInstitute());
    }
}

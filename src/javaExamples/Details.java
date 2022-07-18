package javaExamples;
//parent class
class Person {

    protected String name;
    protected int age;
    private long phone_num;

    public Person(String p_name, int p_age,long phone_num) {
        name = p_name;
        age = p_age;
        //need to use this keyword as both variables have same name
        this.phone_num = phone_num ;
    }

    public void display() {
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
        System.out.println("Phone number: " +phone_num);
    }
}

// child class - IS-A relationship
class Intern extends Person {

    private int stipend;

    public Intern(String s_name, int s_age, long s_phoneNum ,int s_stipend) {
        super(s_name, s_age,s_phoneNum);
        stipend =  s_stipend;
    }
    //method overriding
    public void display() {
        System.out.println("#### Details of internt ####");
        super.display();
        System.out.println("Stipend: " + stipend);
    }
}

//child class 2 - IS-A relationship
class Employer extends Person {

    private int salary;

    public Employer(String e_name, int e_age, long e_phoneNum, int e_salary) {
        super(e_name, e_age,e_phoneNum);
        salary = e_salary;
    }

    public void display() {
        System.out.println("#### Details of intern ####");
        super.display();
        System.out.println("Salary: " + salary);
    }
}

public class Details {

    public static void main(String[] args) {
        // creating object of subclass Student
        Intern intern1 = new Intern("Maheswari", 19, 1235232542,10000);
        intern1.display();

        // creating object of subclass Teacher
        Employer emp1 = new Employer("Julie", 40, 1348907654,200000);
        emp1.display();
    }
}
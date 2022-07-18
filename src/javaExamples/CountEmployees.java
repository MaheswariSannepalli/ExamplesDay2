package javaExamples;

class EmployeeDetails
{
  private int ID;
  private String name;
  //we declare it static because it should be common among all and shared by all the objects
  private static int count=0;
  public EmployeeDetails(String name,int ID)
  {
    this.ID = ID;
    this.name= name;
    count = count+1;
  }
  public void show()
  {
    System.out.println("Id="+ID+"name = "+name);
  }
  public void count()
  {
    System.out.println(" employees count is "+count);
  }
  //overriding abstract method finalize
  protected void finalize()
  {
	  //Here gc will call finalize() for 2 times for 2 objects.
    count = count-1;
    System.out.println(" employees count is decreased to :  "+count);
  }
}
public class CountEmployees
{
  public static void main(String args[])
  {
	  EmployeeDetails A=new EmployeeDetails("maheswari",1209);
	  EmployeeDetails B=new EmployeeDetails("sree",1342);
	  EmployeeDetails C=new EmployeeDetails("thanuja",2422);
     A.show();
     B.show();
     C.show();
    {
      //It is a sub-block to keep all those interns.
    	EmployeeDetails X=new EmployeeDetails("chandu",5432);
    	EmployeeDetails Y=new EmployeeDetails("dimpu",1234);
        X.show();
        Y.show();
        Y.count(); 
        X = Y = null;
      System.gc();
    }
  }
}
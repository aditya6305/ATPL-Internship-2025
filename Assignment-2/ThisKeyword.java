// 9.b: Use this to resolve naming conflicts between instance variables and parameters.
class Employee{
    String name;
    String EmpId;
 Employee(String name,String EmpId){
    this.name=name;
    this.EmpId=EmpId;
}
void show(){
    System.out.println("Name of the employee is: "+name + " Employee id is: "+EmpId);
}
    
}
public class ThisKeyword{
    public static void main(String[] args) {
        Employee employee=new Employee("Aditya","ATPLD18");
        employee.show();
    }
}

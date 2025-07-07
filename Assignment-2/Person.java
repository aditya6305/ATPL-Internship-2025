class Persons {
    String name;
    int age;
    void displayDetails(){
        System.out.println("Name: "+name+ " Age:"+age );
    }
}
class Student extends Persons{
    String studentId;
    void setDetails(String name,int age,String studentId){
        this.name=name;
        this.age=age;
        this.studentId=studentId;
    }
void role(){
    System.out.println("StudentId:"+studentId);
}
}
class Teacher extends Persons{
    String Subject;
    void setDetails(String name,int age,String Subject){
        this.name=name;
        this.age=age;
        this.Subject=Subject;
    }
void role(){
    System.out.println("Subject:"+Subject);
}
}
public class Person{
    public static void main(String[] args) {
        Student student=new Student();
        student.setDetails("Aditya",21,"ATPLD18");
        student.displayDetails();
        student.role();
        Teacher teacher=new Teacher();
        teacher.setDetails("Srikanth",34,"Java");
        teacher.displayDetails();
        teacher.role();
    }
}
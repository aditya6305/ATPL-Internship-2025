class School {
    void education(){
        System.out.println("Education is part of schooling");
    }
    
}
class Student extends School{
    void education(){
        super.education();
        System.out.println("Student is studied in school");
    }
}
public class SuperClass{
    public static void main(String[] args) {
        Student school=new Student();
        school.education();
    }
}
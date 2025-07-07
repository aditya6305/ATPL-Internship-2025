class Student{
    String name;
    static String schoolName="New Central School";
    Student(String name){
        this.name=name;
    }
    void show(){
        System.out.println("Name of the student is:"+name+" studying at "+schoolName);
    }
}
public class StudentClass{
    public static void main(String[] args) {
        Student student1=new Student("A");
        Student student2=new Student("B");
        Student.schoolName="Sri chaitanya";
        student1.show();
        Student.schoolName="Naranyana school";
        student2.show();
        Student student3=new Student("C");
        student3.show();
    }
}

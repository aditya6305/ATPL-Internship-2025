import java.util.*;
class Student {
     String name;
     int age;
     int marks;
     public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public int getMarks() {
		return marks;
	}
	public void setMarks(int marks) {
		this.marks = marks;
	}
	Student (String name, int age, int marks){
        super();
        this.name=name;
        this.age=age;
        this.marks=marks;
    }
    public String toString(){
        return "Student [name=" +name+ ",age=" +age+"]";
    }
    

}

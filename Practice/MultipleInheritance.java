interface A {
    void show();

    default void greet() {
        System.out.println("Private method in Interface A"); // moved from private method
        System.out.println("Hello from Interface A");
    }
}

interface B {
    default void greet() {
        System.out.println("Hello from Interface B");
    }
}

class MyClass implements A, B {
    public void show() {
        System.out.println("Implemented show() in MyClass");
    }

    public void greet() {
        A.super.greet();
        B.super.greet();
        System.out.println("Hello from MyClass");
    }
}

public class MultipleInheritance {
    public static void main(String[] args) {
        MyClass obj = new MyClass();
        obj.show();
        obj.greet();
    }
}
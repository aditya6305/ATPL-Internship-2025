package Access_Modifiers.A.B;

import Access_Modifiers.A.DeclareClass;

public class ClassB extends DeclareClass{
    public void Access(){
        DeclareClass dc=new DeclareClass();
        System.out.println("Public variable:"+dc.a);
        // System.out.println("private variable:"+dc.b);
        System.out.println("Protected variable:"+dc.c);
        // System.out.println("default variable:"+dc.d);

    }
}

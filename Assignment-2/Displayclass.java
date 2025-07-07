class DisplayClass{
    void show(int num){
        System.out.println("Integer:"+num);
    }
    void show(String text){
        System.out.println("String:"+text);
    }
    void show(int[] a){
        System.out.print("Array: ");
        for(int n:a) {
            System.out.print(n+" ");
        }
        System.out.println();
    }
    public static void main(String[] args) {
        DisplayClass d = new DisplayClass();
        d.show(18);
        d.show("Hey Aditya");
        d.show(new int[]{1,2,3});
    }
}
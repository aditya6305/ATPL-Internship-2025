class Books{
    String title;
    String author;
    double price;
    Books(String title,String author,long price){
        this.title=title;
        this.author=author;
        this.price=price;
    }
    void Discount(double percentage){
        price=price-(price*(percentage/100));
    }
    void show(){
        System.out.println("Title:" +title+ " Author:" +author+ " Price:" +price);
    }
    public static void main(String[] args){
        Books book1=new Books("Java","A",1000);
        Books book2=new Books("Python","B",500);
        Books book3=new Books("sql","C",700);
        book1.Discount(10);
        book2.Discount(20);
        book3.Discount(30);
        book1.show();
        book2.show();
        book3.show();
    }  
}
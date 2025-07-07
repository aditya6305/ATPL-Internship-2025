class Library{
    String library="City library";
    class Book{
        String Bookname="Java";
        void show(){
            System.out.println(""+library+" has the Book with name "+Bookname);
        }
        }
        public static void main(String[] args){
            Library library1=new Library();
            Library.Book book=library1.new Book();
            book.show();
    }
}
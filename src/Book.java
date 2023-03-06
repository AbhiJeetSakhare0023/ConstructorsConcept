public class Book {
    String name,author;
    int price,pages;
    public Book(String name,int price) // constructor-1
    {
        this.name=name;
        this.price=price;
    }
    public Book(String name,String author)// constructor-2
    {
        this.name=name;
        this.author=author;
    }
    public Book(String name,int price,int pages)// constructor-3
    {
        this.name=name;
        this.price=price;
        this.pages=pages;
    }
    public Book(String name,String author,int pages,int price) // constructor-4
    {
        this.name=name;
        this.author=author;
        this.pages=pages;
        this.price=price;
    }
    public void Display1()  // non-static method
    {
        System.out.println("Book Name: "+name +", Book Price: "+price);
    }
    public void Display2()  // non-static method
    {
        System.out.println("Book Name: "+name+", Book Author: "+author);
    }
    public void Display3()  // non-static method
    {
        System.out.println("Book Name : "+name +", price : "+price+", Pages :"+pages);
    }
    public  void Display4() // non-static method
    {
        System.out.println("Book Name : "+name+ ", Author : "+author+", Pages :"+pages+", Price :"+price);
    }
    public static void main(String[] args) {
        Book b1 = new Book("Java",555);
        b1.Display1();
        Book b2 = new Book("C++","Dennis");
        b2.Display2();
        Book b3 = new Book("Python",999,201);
        b3.Display3();
        Book b4 = new Book("ReactJs","Facebook",111,503);
        b4.Display4();
    }
}

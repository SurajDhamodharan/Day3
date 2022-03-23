
public class JavaAssignment 
{

	public static void main(String[] args) 
	{
		Book book1 = new Book(1,999,200);
		Book book2 = new Book(2,599,250);
		System.out.println("The details of the Book no 1: "+book1);
		System.out.println("The details of the Book no 2: "+book2);
		book1.readBook();
		System.out.println("The book with details "+book1+" is read");
		FictionBook f1 = new FictionBook(1,999,200,"The Alchemist", "Paulo Coelho");
		System.out.println("The details of the Book no 1: "+f1);
		f1.gotoPage(100);
		System.out.println("Page no: 100 of "+f1.nameOfBook+" is accessed.");
		NonFictionBook f2 = new NonFictionBook(2,599,95,"The Secret", "Rhonda Byrne");
		System.out.println("The details of book no 2 :"+ f2);
		f2.gotoPage(150);
	}

}

class Book
{
	int bookid;
	int price;
	int noOfPages;
	Book()
	{
		
	}
	
	Book(int bookid, int price, int noOfPages)
	{
		this.bookid=bookid;
		this.price= price;
		this.noOfPages = noOfPages;
	}
	void readBook()
	{
		System.out.println("The Book is read.");
	}
	void gotoPage(int i)
	{
		System.out.println("Current page is set to "+i);
	}
	@Override
	public String toString() {
		return "[BookId=" + bookid + ", Price=" + price + ", No Of Pages=" + noOfPages + "]";
	}
}

class FictionBook extends Book
{
	String nameOfBook;
	String authorOfBook;
	FictionBook(int bookid, int price, int noOfPages,String nameOfBook, String authorOfBook)
	{
		super(bookid,price, noOfPages);
		this.nameOfBook = nameOfBook ; 
		this.authorOfBook = authorOfBook;
	}
	@Override
	public String toString() {
		return " Bookid=" + bookid
				+" --> FictionBook - NameOfBook=" + nameOfBook + ", AuthorOfBook=" + authorOfBook +  ", Price=" + price + ", NoOfPages=" + noOfPages + "<--";
	}
	
	
	
}

class NonFictionBook extends Book
{
	String nameOfBook;
	String authorOfBook;
	NonFictionBook(int bookid, int price, int noOfPages,String nameOfBook, String authorOfBook)
	{
		super(bookid,price, noOfPages);
		this.nameOfBook = nameOfBook ; 
		this.authorOfBook = authorOfBook;
	}
	@Override
	public String toString() {
		return " Bookid=" + bookid
				+" --> NonFictionBook - NameOfBook=" + nameOfBook + ", AuthorOfBook=" + authorOfBook +  ", Price=" + price + ", NoOfPages=" + noOfPages + "<--";
	}	
}



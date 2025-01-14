package classesandobjects;

public class Books {
	
	String title;
	
	String author;
	
	String isbn;
	
	static int totalBooks;
	
	boolean isBorrowed;
	
	static {
		totalBooks = 0;
	}
	{
		totalBooks++;
	}
	
	Books(String title, String author, String isbn){
		
		this.title = title;
		this.author = author;
		this.isbn = isbn;
		
	}
	
    Books(String isbn){
		this.isbn = isbn;
		
    }
    
    static int getTotalNoOfBooks() {
    	return totalBooks;
    }
    
    void borrowBook() {
    	if (isBorrowed) {
    		System.out.println("Book is alrady borrowed");
    	}else {
    		this.isBorrowed = true;
    		System.out.println("Enjoy the book: " +this.title);
    	}
    }
    
    void returnBook() {
    	if(isBorrowed) {
    		this.isBorrowed = false;
    		System.out.println("hope you enjoyed");
    	}else {
    		System.out.println("this book already in library");
    	}
    }

    
   public static void main (String[] args) {
	   
	   Books designThings = new Books ("Design","Author","1");
	   Books myBook = new Books ("2");
	   System.out.println(Books.getTotalNoOfBooks());
	   designThings.borrowBook();
	   myBook.borrowBook();
	   designThings.borrowBook();
	   designThings.returnBook();
	   designThings.returnBook();
	   
   }
}



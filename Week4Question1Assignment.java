package weeklyassignment;

class Book {
	String title;
	String author;	
	final int ISBN = 12345;
	
	Book(String title,String author) {
		this.title = title;
		this.author = author;
	}
	
	void display() {
		System.out.println("Title" + ":" + title + "\nAuthor" + ":" + author);
	}	
	
	void getDescription() {
		System.out.println("This is a physical book");
	}
	
	static String libraryName;
	static void showLibrary() {
		System.out.println("Library" + ":" + libraryName);		
	}
	
}

class Ebook extends Book {
	String filesize;
	
	Ebook(String title,String author,String filesize) {
		super(title,author);
		this.filesize = filesize;		
	}
	
	@Override
	void getDescription() {
		System.out.println("This is an electronic book");
	}		
	
}

public class Week4Question1Assignment {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Book obj = new Book("Atomic Habits","James Clear");
		obj.display();
		
		Ebook obj1 = new Ebook("Atomic Habits","James Clear","5MB");
		System.out.println("File size" + ":" + obj1.filesize);
		obj.getDescription();
		obj1.getDescription();
		
		Book.libraryName = "City Library";
		Book.showLibrary();
		
		System.out.println("ISBN" + ":" + obj.ISBN);
		//obj.ISBN = 56639; written to observe error since ISBN value is already declared as final
		
		String bookTitle = "Java Programming";
		System.out.println("Uppercase" + ":" + bookTitle.toUpperCase());
		System.out.println("Length" + ":" + bookTitle.length());
		System.out.println("Contains Java" + ":" + bookTitle.contains("Java"));		

	}

}

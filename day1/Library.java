package homeassignmentweek1.day1;

public class Library {
	public String addBook(String bookTitle)
	{
		System.out.println("Book added Successfully");
		return bookTitle;
		
		
	}
	public void issueBook() {
	System.out.println("Book issued successfully");
	}
	public static void main(String[] args) {
		Library lb=new Library();
		lb.addBook("The Beloved");
		lb.issueBook();
		
}
	
	
	

}

//@author Peyton Starr
//@unit Module 4
//@assignment Programming Problems
//@problem PROBLEM 2 - READING MATERIALS

package csc201mod4;

import java.util.Arrays;

public class Mod4Problem2 {

	public static void main(String[] args) {
		// Create reading material objects
		String[] bookAuthors = {"Madam Dowdry", "Prudence Bishop"};
		Book myBook = new Book(false, bookAuthors, "Nonfiction", "The Dallies of Sufferage", "Winston's Publishing House", 1920, 185);
		Magazine myMag = new Magazine(33, true, "Fishing Enthusiast", "Myer's Reading, NC", 2011, 41);
		Journal myJour = new Journal(564, true, true, "Nature", "Springer Nature", 2018, 600);
		String[] textbookAuthors = {"Y.D. Liang"};
		Textbook myText = new Textbook(textbookAuthors, 11, "Computer Science", "Introduction to Java Programming", "Pearson", 2017, 799);

		// Print reading material objects
		System.out.println(myBook.toString());
		System.out.println(myMag.toString());
		System.out.println(myJour.toString());
		System.out.println(myText.toString());
	}
}

class ReadingMaterial {
	// Define variables
	private String materialType;
	private String title;
	private String publisher;
	private int pubYear;
	private int pageNo;

	// Define default constructor
	ReadingMaterial() {
	}
	
	// Define constructor
	ReadingMaterial(String materialType, String title, String publisher, int pubYear, int pageNo) {
		this.materialType = materialType;
		this.title = title;
		this.publisher = publisher;
		this.pubYear = pubYear;
		this.pageNo = pageNo;
	}

	// Set reading material type
	public void setMaterialType(String materialType) {
		this.materialType = materialType;
	}
	
	// Set title
	public void setTitle(String title) {
		this.title = title;
	}
	
	// Set publisher
	public void setPublisher(String publisher) {
		this.publisher = publisher;
	}
	
	// Set published year
	public void setPubYear(int pubYear) {
		this.pubYear = pubYear;
	}
	
	// Set number of pages
	public void setPageNo(int pageNo) {
		this.pageNo = pageNo;
	}
	
	// Return a string representation of this object
	public String toString() {
		return "----------\nReading Material Type: " + materialType + "\nTitle: " + title + 
				"\nPublisher: " + publisher + "\nPublished Year: " + pubYear + "\nNumber of Pages: " + pageNo;
	}
}


class Book extends ReadingMaterial {
	// Define variables
	private boolean isHardback;
	private String[] authors;
	private String genre;
	
	// Define default constructor
	public Book() {
		setMaterialType("Book");
	}
	
	// Define constructor with this class's parms
	public Book(boolean isHardback, String[] authors, String genre) {
		this.isHardback = isHardback;
		this.authors = authors;
		this.genre = genre;
		setMaterialType("Book");
	}
	
	// Define constructor with all parms
	public Book(boolean isHardback, String[] authors, String genre, String title, String publisher, int pubYear, int pageNo) {
		this.isHardback = isHardback;
		this.authors = authors;
		this.genre = genre;
		setMaterialType("Book");
		setTitle(title);
		setPublisher(publisher);
		setPubYear(pubYear);
		setPageNo(pageNo);
	}
	
	// Set the Is Hardback? boolean
	public void setIsHardback(boolean isHardback) {
		this.isHardback = isHardback;
	}
	
	// Set author or authors
	public void setAuthors(String[] authors) {
		this.authors = authors;
	}	
	
	// Set genre
	public void setGenre(String genre) {
		this.genre = genre;
	}
	
	// Return a string representation of this object
	public String toString() {
		return super.toString() + "\nIs a Hardcover?: " + isHardback + "\nAuthor(s): " + Arrays.toString(authors) + "\nGenre: " + genre;
	}	
}

class Magazine extends ReadingMaterial {
	// Define variables
	private int issueNo;
	private boolean isDiscontinued;
	
	// Define default constructor
	public Magazine() {
		setMaterialType("Magazine");
	}
	
	// Define constructor with this class's parms
	public Magazine(int issueNo, boolean isDiscontinued) {
		this.issueNo = issueNo;
		this.isDiscontinued = isDiscontinued;
		setMaterialType("Magazine");
	}
	
	// Define constructor with all parms
	public Magazine(int issueNo, boolean isDiscontinued, String title, String publisher, int pubYear, int pageNo) {
		this.issueNo = issueNo;
		this.isDiscontinued = isDiscontinued;
		setMaterialType("Magazine");
		setTitle(title);
		setPublisher(publisher);
		setPubYear(pubYear);
		setPageNo(pageNo);
	}
	
	// Set issue number
	public void setIssueNo(int issueNo) {
		this.issueNo = issueNo;
	}
	
	// Set the Is Discontinued? boolean
	public void setIsDiscontinued(boolean isDiscontinued) {
		this.isDiscontinued = isDiscontinued;
	}	
	
	// Return a string representation of this object
	public String toString() {
		return super.toString() + "\nIssue No.: " + issueNo + "\nIs Discontinued?: " + isDiscontinued;
	}	
}

class Journal extends ReadingMaterial {
	// Define variables
	private int issueNo;
	private boolean isOnline;
	private boolean isPeerReviewed;
	
	// Define default constructor
	public Journal() {
		setMaterialType("Journal");
	}
	
	// Define constructor with this class's parms
	public Journal(int issueNo, boolean isOnline, boolean isPeerReviewed) {
		this.issueNo = issueNo;
		this.isOnline = isOnline;
		this.isPeerReviewed = isPeerReviewed;
		setMaterialType("Journal");
	}
	
	// Define constructor with all parms
	public Journal(int issueNo, boolean isOnline, boolean isPeerReviewed, String title, String publisher, int pubYear, int pageNo) {
		this.issueNo = issueNo;
		this.isOnline = isOnline;
		this.isPeerReviewed = isPeerReviewed;
		setMaterialType("Journal");
		setTitle(title);
		setPublisher(publisher);
		setPubYear(pubYear);
		setPageNo(pageNo);
	}
	
	// Set issue number
	public void setIssueNo(int issueNo) {
		this.issueNo = issueNo;
	}
	
	// Set the Is Online? boolean
	public void setIsOnline(boolean isOnline) {
		this.isOnline = isOnline;
	}	

	// Set the Is Peer Reviewed? boolean
	public void setIsPeerReviewed(boolean isPeerReviewed) {
		this.isPeerReviewed = isPeerReviewed;
	}		
	
	// Return a string representation of this object
	public String toString() {
		return super.toString() + "\nIssue No.: " + issueNo + "\nIs Online?: " + isOnline + "\nIs Peer Reviewed?: " + isPeerReviewed;
	}	
}

class Textbook extends ReadingMaterial {
	// Define variables
	private String[] authors;
	private int edition;
	private String subject;
	
	// Define default constructor
	public Textbook() {
		setMaterialType("Textbook");
	}
	
	// Define constructor with this class's parms
	public Textbook(String[] authors, int edition, String subject) {
		this.authors = authors;
		this.edition = edition;
		this.subject = subject;
		setMaterialType("Textbook");
	}
	
	// Define constructor with all parms
	public Textbook(String[] authors, int edition, String subject, String title, String publisher, int pubYear, int pageNo) {
		this.authors = authors;
		this.edition = edition;
		this.subject = subject;
		setMaterialType("Textbook");
		setTitle(title);
		setPublisher(publisher);
		setPubYear(pubYear);
		setPageNo(pageNo);
	}

	// Set author or authors
	public void setAuthors(String[] authors) {
		this.authors = authors;
	}	
	
	// Set edition
	public void setEdition(int edition) {
		this.edition = edition;
	}

	// Set subjectmatter
	public void setSubject(String subject) {
		this.subject = subject;
	}		
	
	// Return a string representation of this object
	public String toString() {
		return super.toString() + "\nAuthor(s): " + Arrays.toString(authors) + "\nEdition No.: " + edition + "\nSubject: " + subject;
	}	
}
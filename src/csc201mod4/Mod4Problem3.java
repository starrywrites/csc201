//@author Peyton Starr
//@unit Module 4
//@assignment Programming Problems
//@problem PROBLEM 3 - COURSES

package csc201mod4;

public class Mod4Problem3 {

	public static void main(String[] args) {
		// Create courses
		CSCCourse myCSC = new CSCCourse(8, true, "Computer Science I", 201, "Department of Engineering", "Yingjin Cui");
		Course pysLab = new Course("Lab I: Applications in Albatross", "PSY", 187, "Department of Theoretical Sciences", "Mohammad Jinnah", true);
		PYSCourse myPYS = new PYSCourse(pysLab, "Physics 99", 222, "Department of Theoretical Sciences", "Chetna Kumar");

		// Print reading material objects
		System.out.println(myCSC.toString());
		System.out.println(myPYS.toString());
	}
}

class Course {
	// Define variables
	private String title;
	private String prefix;
	private int id;
	private String dept;
	private String instructor;
	private boolean isLab;

	// Define default constructor
	Course() {
	}
	
	// Define constructor
	Course(String title, String prefix, int id, String dept, String instructor, boolean isLab) {
		this.title = title;
		this.prefix = prefix;
		this.id = id;
		this.dept = dept;
		this.instructor = instructor;
		this.isLab = isLab;
	}

	// Set course title
	public void setTitle(String title) {
		this.title = title;
	}

	// Set course prefix
	public void setPrefix(String prefix) {
		this.prefix = prefix;
	}	
	
	// Set course ID
	public void setID(int id) {
		this.id = id;
	}
	
	// Set department that the course is in
	public void setDept(String dept) {
		this.dept = dept;
	}

	// Set the instructor of this course
	public void setInstructor(String instructor) {
		this.instructor = instructor;
	}

	// Set the instructor of this course
	public void setIsLab(boolean isLab) {
		this.isLab = isLab;
	}	
	
	// Return a string representation of this object
	public String toString() {
		return "----------\nCourse Title: " + title + "\nCourse No.: " + prefix + " " + id + 
				"\nDepartment: " + dept + "\nCourse Instructor: " + instructor + "\nIs a lab?: " + isLab;
	}
}


class CSCCourse extends Course {
	// Define variables
	private int moduleNo;
	private boolean hasFinalProject;
	
	// Define default constructor
	public CSCCourse() {
		setPrefix("CSC");
	}
	
	// Define constructor with this class's parms
	public CSCCourse(int moduleNo, boolean hasFinalProject) {
		this.moduleNo = moduleNo;
		this.hasFinalProject = hasFinalProject;
		setPrefix("CSC");
	}

	// Define constructor with all parms
	public CSCCourse(int moduleNo, boolean hasFinalProject, String title, int id, String dept, String instructor) {
		this.moduleNo = moduleNo;
		this.hasFinalProject = hasFinalProject;
		setPrefix("CSC");
		setTitle(title);
		setID(id);
		setDept(dept);
		setInstructor(instructor);
		setIsLab(false);
	}
	
	// Return a string representation of this object
	public String toString() {
		return super.toString() + "\nNumber of Modules: " + moduleNo + "\nHas Final Project?: " + hasFinalProject;
	}	
}


class PYSCourse extends Course {
	// Define variables
	private Course attachedLab;
	
	// Define default constructor
	public PYSCourse() {
		setPrefix("PYS");
	}
	
	// Define constructor with this class's parms
	public PYSCourse(Course attachedLab, String title, int id, String dept, String instructor) {
		this.attachedLab = attachedLab;
		setPrefix("PYS");
		setTitle(title);
		setID(id);
		setDept(dept);
		setInstructor(instructor);
		setIsLab(false);
	}
	
	// Return a string representation of this object
	public String toString() {
		return super.toString() + "\nThis course has an attached lab. See below...\n" + attachedLab;
	}	
}
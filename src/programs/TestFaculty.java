package programs;

class Faculties {

	private String facultyName;
	private String subject;
	private static String hod;

	public String getFacultyName() {
		return facultyName;
	}

	public void setFacultyName(String facultyName) {
		this.facultyName = facultyName;
	}

	public String getSubject() {
		return subject;
	}

	public void setSubject(String subject) {
		this.subject = subject;
	}

	public static String getHod() {
		return hod;
	}

	public static void setHod(String hod) {
		Faculties.hod = hod;
	}

	@Override
	public String toString() {
		return "Faculties [facultyName=" + facultyName + ", subject=" + subject +", hod=" + hod + "]";
	}

}

public class TestFaculty {
	public static void main(String[] args) {
		Faculties f1 = new Faculties();
		f1.setFacultyName("f1");
		f1.setSubject("cn");
		f1.setHod("REDDY");
		System.out.println(f1);
		
		Faculties f2 = new Faculties();
		f2.setFacultyName("f2");
		f2.setSubject("dbms");
		f2.setHod("SINHA");
		System.out.println(f2);
		System.out.println(f1);

	}

}

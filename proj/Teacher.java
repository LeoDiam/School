package gr.school.proj;

public class Teacher {
	
	private String name ; 
	private int AMKA;
	private String id;
	private String classroom;
	private String classroom2;
	private int companionofclassroom;
	
	public Teacher(String name, int AMKA, String id,String classroom, String classroom2) {
		this.classroom2 = classroom2;
		this.classroom=classroom;
		this.name = name;
		this.AMKA = AMKA;
		this.id = id;
		this.companionofclassroom = 1;
	}
	
	public String toString2() {
		
		return "Teacher [name=" + name + ", AMKA=" + AMKA + ", id=" + id + ", classroom1=" + classroom + "classroom2=" + classroom2 + "]";
	}
	
	public Teacher(String name, int AMKA, String id,String classroom) {
		this.classroom=classroom;
		this.name = name;
		this.AMKA = AMKA;
		this.id = id;
		this.companionofclassroom = 0;
	}

	public String getCl() {
		return classroom;
	}

	public void setCl(String classroom) {
		this.classroom = classroom;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAMKA() {
		return AMKA;
	}

	public void setAMKA(int AMKA) {
		this.AMKA = AMKA;
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}
	

	public String getClassroom2() {
		return classroom2;
	}

	public void setClassroom2(String classroom2) {
		this.classroom2 = classroom2;
	}

	public int getCompanionofclassroom() {
		return companionofclassroom;
	}

	public void setCompanionofclassroom(int companionofclassroom) {
		this.companionofclassroom = companionofclassroom;
	}

	@Override
	public String toString() {
		return "Teacher [name=" + name + ", AMKA=" + AMKA + ", id=" + id + ", classroom=" + classroom + "]";
	}
	
	
	


}


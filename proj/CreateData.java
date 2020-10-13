package gr.school.proj;



import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.Scanner;





public class CreateData {

	Scanner sc = new Scanner(System.in);
	String birth;
	String id;
	String name;
	String AMKA;
//		public static int total2019n = 0;
//		public static int total2019p = 0;
//		public static int total2018n = 0;
//		public static int total2018p = 0;
	private Student[] studenttotal = new Student[100];
	public Student[] getAllstudents() {
		return allstudents;
	}

	public void setAllstudents(Student[] allstudents) {
		this.allstudents = allstudents;
	}

	public Student[] allstudents = new Student [100];
	public int newstudentscount2019n = 0;
	public int newstudentscount2019p = 0;

	public int pointer2019n=2;
	public int pointer2019p=2;
	public int point=8;
	public int pointcompanion=8;


	private static Student[] student2018p = new Student[25];
	private static Student[] student2018n = new Student[25];
	private static Student[] student2019p = new Student[25];
	private static Student[] student2019n = new Student[25];
	private static Teacher[] teachers2018p = new Teacher[100];
	private static Teacher[] teachers2018n = new Teacher[100];
	private static Teacher[] teachers2019p = new Teacher[100];
	private static Teacher[] teachers2019n = new Teacher[100];
	private static SchoolYear[] shoolYears = new SchoolYear[100];
	public int total2019n=0;
	public int total2019p=0;

	public Student[] getStudent2018p() {
		return student2018p;
	}

	public void setStudent2018p(Student[] student2018p) {
		this.student2018p = student2018p;
	}

	public Student[] getStudent2018n() {
		return student2018n;
	}

	public void setStudent2018n(Student[] student2018n) {
		this.student2018n = student2018n;
	}

	public Student[] getStudent2019p() {
		return student2019p;
	}

	public void setStudent2019p(Student[] student2019p) {
		this.student2019p = student2019p;
	}

	public Student[] getStudent2019n() {
		return student2019n;
	}

	public void setStudent2019n(Student[] student2019n) {
		this.student2019n = student2019n;
	}

	public Teacher[] getTeachers2018p() {
		return teachers2018p;
	}

	public void setTeachers2018p(Teacher[] teachers2018p) {
		this.teachers2018p = teachers2018p;
	}

	public Teacher[] getTeachers2018n() {
		return teachers2018n;
	}

	public void setTeachers2018n(Teacher[] teachers2018n) {
		this.teachers2018n = teachers2018n;
	}

	public Teacher[] getTeachers2019p() {
		return teachers2019p;
	}

	public void setTeachers2019p(Teacher[] teachers2019p) {
		this.teachers2019p = teachers2019p;
	}

	public Teacher[] getTeachers2019n() {
		return teachers2019n;
	}

	public void setTeachers2019n(Teacher[] teachers2019n) {
		this.teachers2019n = teachers2019n;
	}

	public SchoolYear[] getShoolYears() {
		return shoolYears;
	}

	public void setShoolYears(SchoolYear[] shoolYears) {
		this.shoolYears = shoolYears;
	}
	
	public void Studentsconection() {
		int i;
		int y;
		for (i = point ; i<point+newstudentscount2019n; i++) {
			allstudents[point] = student2019n[pointer2019n];
			pointer2019n = pointer2019n+1;
			pointcompanion=pointcompanion+1;
			
		}
		point = pointcompanion;
		for (y = point ; y<point+newstudentscount2019p;  y++) {
			//if (studenttotal[y]==null) {
				allstudents[y] = student2019p[pointer2019p];
				pointer2019p = pointer2019p+1;
				pointcompanion = pointcompanion+1;
			//}
			//System.out.println(studenttotal[i]);
		}
		point = pointcompanion;
	
		//for (int n = 0; n< Last.total; n++) {
			//System.out.println(studenttotal[n]);
		//}
	
	
		
		newstudentscount2019n = 0;
		newstudentscount2019p = 0;

	}

	Teacher teacher2019n = new Teacher("Νίκος Χρήστου", 1323, "2394", "Νήπιο(2019-2020)", "Νήπιο(2018-2019)");
	Teacher teacher2019p = new Teacher("Μαρία Ευθυμίου", 1345, "2313", "Προνήπιο(2019-2020)");

	Teacher teacher2018n = new Teacher("Νίκος Χρήστου", 1323, "2394", "Νήπιο(2018-2019)", "Νήπιο(2019-2020)");
	Teacher teacher2018p = new Teacher("Δήμητρα Καλατζή", 7882, "6513", "Προνήπιο(2018-2019)");

	Teacher[] teachers = { teacher2019n, teacher2019p, teacher2018n, teacher2018p };

	public void infoTeacher() {
		int z=0;
		for (int i = 0; i < 4; i++) {
			int x=0;

			for(int y = 0 ; y<4; y++) {
				if (teachers[i].getAMKA()== teachers[y].getAMKA()) {
					x++;
				}
				}
			if(x==0 || x==1) {
				if(teachers[i].getCompanionofclassroom()==0) {
				System.out.println(teachers[i].getName() + ":  " + teachers[i].getCl());
				}
				else {
				System.out.println(teachers[i].getName() + ":  " + teachers[i].getCl() +" και " + teachers[i].getClassroom2());

				}
				
			}
			else {
				z++;
				if(z==1) {
					if(teachers[i].getCompanionofclassroom()==0) {
						System.out.println(teachers[i].getName() + ":  " + teachers[i].getCl());
						}
						else {
						System.out.println(teachers[i].getName() + ":  " + teachers[i].getCl() +" και " + teachers[i].getClassroom2());

						}
						
				}
			}
			}
		

			
		}
	
	

	public void findTeacher(int AMKA) {
		int x = 0;
		for (int i = 0; i < 4; i++) {
			if (teachers[i].getAMKA() == AMKA) {
				System.out.println("Τα στοιχεία του δασκάλου που επιλέξατε είναι τα εξής:");
				System.out.println(teachers[i]);

			} else {
				x ++;
			}
		}
		if (x == 4) {
			System.out.println("Ο δάσκαλος που πληκτρολογήσατε δεν υπάρχει!");
		}
	}

	public void Studentsprint(int year) {

		switch (year) {
		case 2019:
			printclass2019();
			break;
		case 2018:
			printclass2018();
			break;
		case 7:
			System.out.println("Επιλέξατε έξοδο!Ελπίζουμε να σας ξαναδούμε σύντομα!");
			break;
		default:
			System.out.println("Δυστυχώς δεν υπάρχουν στοιχεία για την χρονιά που αναζητήσατε!");
			break;
		}
	}

	

	public void Delete(int id, int choose) {

		int deletedStudents = 0;
		if (choose == 1) {
			for (int i = 0; i < student2019n.length; i++) {

				if (student2019n[i] != null && student2019n[i].getId() == id) {
					student2019n[i] = null;
					System.out.println("Ο μαθητής διαγράφηκε επιτυχώς.Καλή συνέχεια!");
					deletedStudents++;
					break;
				}
			}

			if (deletedStudents == 0) {
				System.out.println("Ο μαθητής δεν βρέθηκε!");
			}

		} else if (choose == 2) {

			for (int i = 0; i < student2019p.length; i++) {
				if (student2019p[i] != null && student2019p[i].getId()==id) {
					student2019p[i] = null;
					System.out.println("Ο μαθητής διαγράφηκε επιτυχώς.Καλή συνέχεια!");
					deletedStudents += 1;
					break;
				}
			}
			if (deletedStudents == 0) {
				System.out.println("Ο μαθητής δεν βρέθηκε!");
			}
			

		} 
		
		else if (choose==7) {
			System.out.println("Έξοδος");
		
		}
	}

	public void print(Student[] arr) {
		int i;
		for (i = 0; i < arr.length; i++) {
			if (arr[i] != null)
				System.out.println(arr[i]);
		}

	}

	public void Insert() {
		
		System.out.println("Σε ποια τάξη της τρέχουσας χρονιάς(2019-2020)θέλετε να εγγραφείτε;");
		System.out.println("Πατήστε 1 για εγγραφή στο νήπιο(2019-2020).");
		System.out.println("Πατήστε 2 για εγγραφή στο προνήπιο(2019-2020).");
		System.out.println("Πατήστε 7 εάν θέλετε να αποχωρήσετε.");

		while (!sc.hasNextInt()) {
			String input = sc.next();
			System.out.println(" Η εισαγωγή σας(" + input+ ")δεν είναι αριθμός!Παρακαλώ επιλέξτε μια από τις διαθέσημες επιλογές 1,2 και 7.");
		}

		int join = sc.nextInt();
		while (join != 1 && join != 2 && join != 7) {
			System.out.println("Λανθασμένος αριθμός!Τοποθετήστε έναν από τους διαθέσημους αριθμούς 1,2 ή 7");
			join = sc.nextInt();
		}

		if (join == 1) {
			int x = 0;
			for (int i= total2019n; i < 100; i++) {
				if (student2019n[i] == null) {

					
					String name = getInput("Εισάγετε το ονοματεπώνυμο:");
					
					System.out.println("Εισάγεται έτος γέννησης: ");
					int birth = sc.nextInt();
					x = 1;
					Main.total = Main.total + 1;

					Student stun = new Student( name, birth);
					student2019n[i] = stun;
					System.out.println("Συγχαρητήρια η εγγραφή του μαθητή με τα στοιχεία πραγματοποιήθηκε με επιτυχία!");
					newstudentscount2019n++;
					total2019n++;
					break;
				}
				if (x == 0) {
					System.out.println("Δυστυχώς δεν υπάρχει κενή θέση.Αν υπάρξει θα σας ενημερώσουμε.Καλή συνέχεια!");
				}
			}
		} else if (join == 2) {

			int x = 0;
			for (int i = total2019p ; i < 100; i++) {
				if (student2019p[i] == null) {
				
					String name = getInput("Εισάγετε το ονοματεπώνυμο:");
					
					System.out.println("Εισάγεται έτος γέννησης: ");
					int birth = sc.nextInt();

					Student stup = new Student( name, birth);
					student2019p[i] = stup;

					x = 1;
					Main.total = Main.total + 1;

					System.out
							.println("Συγχαρητήρια η εγγραφή του μαθητή με τα στοιχεία πραγματοποιήθηκε με επιτυχία!");
					newstudentscount2019p++;
					total2019p++;
					break;
				}
			}
			if (x == 0) {
				System.out.println("Δυστυχώς δεν υπάρχει κενή θέση.Αν υπάρξει θα σας ενημερώσουμε.Καλή συνέχεια!");
			}

		} else if (join == 7) {
			do {
				System.out.println("Επιλέξατε έξοδο!Ελπίζουμε να σας ξαναδούμε σύντομα!");
				break;
			} while (join != 7);
		}

	}
	 private static String getInput(String prompt){
	      BufferedReader stdin = new BufferedReader(new InputStreamReader(System.in));

	      System.out.print(prompt);
	      System.out.flush();

	      try{
	          return stdin.readLine();
	      } catch (Exception e){
	        return "Error: " + e.getMessage();
	      }
	      
	      
	    }
	public void print(int i) {
		System.out.println(studenttotal[i]);
	}

	

	public void initializeStudent() {
		Student student2018p1 = new Student( "Δημήτρης Στούνος", 2015);
		student2018p[0] = student2018p1;
		allstudents[0] = student2018p1;
		Main.total++;
		Student student2018p2 = new Student( "Γιώργος Γκούμας", 2015);
		student2018p[1] = student2018p2;
		allstudents[1] = student2018p2;
		Main.total++;


		Student student2018n1 = new Student( "Ηλίας Πούλος", 2014);
		student2018n[0] = student2018n1;
		allstudents[2] = student2018n1;
		Main.total++;
		Student student2018n2 = new Student( "Νικόλαος Τσούπσης", 2014);
		student2018n[1] = student2018n2;
		allstudents[3] = student2018n2;
		Main.total++;



		Student student2019p1 = new Student( "Χρήστος Λιβανός", 2016);
		student2019p[0] = student2019p1;
		allstudents[4] = student2019p1;
		Main.total++;
		total2019p++;

		Student student2019p2 = new Student( "Γιώργος Μάλλιος", 2016);
		student2019p[1] = student2019p2;
		allstudents[5] = student2019p2;
		Main.total++;
		total2019p++;



		Student student2019n1 = new Student( "Αντρέας Χρήστου", 2015);
		student2019n[0] = student2019n1;
		allstudents[6] = student2019n1;
		Main.total++;
		total2019n++;

		Student student2019n2 = new Student( "Μάρκος Γεωργίου", 2015);
		student2019n[1] = student2019n2;
		allstudents[7] = student2019n2;
		Main.total++;
		total2019n++;



		// Main.allstudent = Connect();

	}
	
	private void printclass2018() {
		System.out.println("Επιλέξατε το σχολικό έτος 2018-2019!");
		System.out.println("Για ποια τάξη θέλετε να δείτε τα στοιχεία;");
		System.out.println("Πατήστε 1 για το νήπιο.");
		System.out.println("Πατήστε 2 για το προνήπιο.");
		System.out.println("Πατήστε 7 για έξοδο.");
		System.out.println("Παρακαλώ πληκτρολογήστε τον αντίστοιχο αριθμό");
		while (!sc.hasNextInt()) {
			String input = sc.next();
			System.out.println(" Η εισαγωγή σας(" + input
					+ ")δεν είναι αριθμός!Παρακαλώ επιλέξτε μια από τις διαθέσημες επιλογές 1,2 και 7.");
		}
		int choose = sc.nextInt();
		while (choose != 1 && choose != 2 && choose != 7) {
			System.out.println("Λανθασμένος αριθμός!Τοποθετήστε έναν από τους διαθέσημους αριθμούς 1,2 ή 7");
			choose = sc.nextInt();}
	switch (choose) {
	case 1:
		System.out.println("Σχολικό έτος(2018-2019): \n");
		
		System.out.println("\n\nΤάξη Νηπίου:\n");
		System.out.println("\nΔάσκαλος Νηπίου:\n" + teacher2018n.getName());
		System.out.println("Μαθητές Νηπίου: ");
		for (int i = 0; i < student2018n.length; i++) {
			if (student2018n[i] != null)
				
			System.out.println(student2018n[i]);
		}
		break;
	case 2:
		System.out.println("Σχολικό έτος(2018-2019): \n");
		
		System.out.println("\n\nΤάξη Προνηπίου:");
		System.out.println("\nΔασκαλος Προνηπίου:\n" + teacher2018p.getName());
	    System.out.println("Μαθητές Προνηπίου:");
		for (int i = 0; i < student2018p.length; i++) {
			if (student2018p[i] != null)
			System.out.println(student2018p[i]);
			
		}
		break;
		
	case 7:
		default:
			System.out.println("Επιλέξατε έξοδο!");
			break;
		
		
	}
	}
	private void printclass2019() {
		System.out.println("Επιλέξατε το σχολικό έτος 2019-2020!");
		System.out.println("Για ποια τάξη θέλετε να δείτε τα στοιχεία;");
		System.out.println("Πατήστε 1 για το νήπιο.");
		System.out.println("Πατήστε 2 για το προνήπιο.");
		System.out.println("Πατήστε 7 για έξοδο.");
		System.out.println("Παρακαλώ πληκτρολογήστε τον αντίστοιχο αριθμό");
		while (!sc.hasNextInt()) {
			String input = sc.next();
			System.out.println(" Η εισαγωγή σας(" + input
					+ ")δεν είναι αριθμός!Παρακαλώ επιλέξτε μια από τις διαθέσημες επιλογές 1,2 και 7.");
		}
		int choose = sc.nextInt();
		while (choose != 1 && choose != 2 && choose != 7) {
			System.out.println("Λανθασμένος αριθμός!Τοποθετήστε έναν από τους διαθέσημους αριθμούς 1,2 ή 7");
			choose = sc.nextInt();
		}
		switch(choose){
		
		case 1:
		System.out.println("Σχολικό έτος(2019-2020): \n");
		System.out.println("\n\nΤάξη Νηπίου\n");
		System.out.println("\nΔάσκαλος Νηπίου:\n" + teacher2019n.getName());
		System.out.println("Μαθητές Νηπίου: ");
		for (int i = 0; i < student2019n.length; i++) {
			if (student2019n[i] != null)
			System.out.println(student2019n[i]);
		}
		break;
		case 2:
		System.out.println("Σχολικό έτος(2019-2020): \n");
		System.out.println("\n\nΤάξη Προνηπίου:\n");
		System.out.println("\nΔάσκαλος Προνηπίου:\n" + teacher2019p.getName());
		System.out.println("Μαθητές Προνηπίου");
		for (int i = 0; i < student2019p.length; i++) {
			if (student2019p[i] != null)
			System.out.println(student2019p[i]);
		}
		break;
		case 7:
			default:
				System.out.println("Επιλέξατε έξοδο!");
				break;
			
		}
	
	}
}

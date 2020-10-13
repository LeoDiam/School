package gr.school.proj;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Main {

	public static int total = 0;
	static String deleteid;

	public static void main(String[] args) {
		CreateData data = new CreateData();
		data.initializeStudent();

		SchoolYear year2019 = new SchoolYear(data.getStudent2019p(), data.getStudent2019n(), data.teacher2019p,
				data.teacher2019n, 2019);
		SchoolYear year2018 = new SchoolYear(data.getStudent2018p(), data.getStudent2018n(), data.teacher2018p,
				data.teacher2018n, 2018);
		SchoolYear[] years = { year2019, year2018 };

		for (;;) {
			Scanner sc = new Scanner(System.in);
			System.out.println("~~~~~~~~~~ Μενού Επιλογών ~~~~~~~~~~");
			System.out.println("1. Εκτύπωση όλων των μαθητών που έχουν φοιτήσει στο σχολείο.");
			System.out.println("2. Εγγραφή νέου μαθητή στην τρέχουσα σχολική χρονιά.");
			System.out.println("3. Διαγραφή μαθητή από την τρέχουσα σχολική χρονιά.");
			System.out.println("4. Αναζήτηση στοιχείων σχολικής χρονιάς.");
			System.out.println("5. Αναζήτηση τάξεων που έχει αναλάβει κάθε δάσκαλος του σχολείου.");
			System.out.println("6. Αναζήτηση στοιχείων δασκάλου μέσω ΑΜΚΑ.");
			System.out.println("7. Εάν θέλετε να αποχωρήσετε.");
			System.out.println("Εισάγετε επιλογή [1-6] :");

			while (!sc.hasNextInt()) {
				String input = sc.next();
				System.out.println(" Η εισαγωγή σας(" + input
						+ ")δεν είναι αριθμός!Παρακαλώ επιλέξτε έναν αριθμό μεταξύ 1 και 7.\n");
			}

			int choice = sc.nextInt();

			while (choice > 7 || choice < 1) {
				try {
					System.out.println("Λανθασμένος αριθμός!Τοποθετήστε έναν αριθμό από το 1 μέχρι το 7");

					choice = sc.nextInt();
				} catch (InputMismatchException ime) {
					// System.out.println("H εισαγωγή σας δεν είναι αριθμός!Παρακαλώ επιλέξτε έναν
					// αριθμό μεταξύ 1 και 6.\n");
					sc.next();
					continue;

				}
			}

			switch (choice) {
			case 1:
				for (int i = 0; i < total; i++) {

					System.out.println(data.allstudents[i]);

				}
				System.out.println("\n\n");
				// System.out.println("Οι παρακάτω έχουν φοιτήσει ή φοιτούν σε εμάς!");
				// data.print(data.getStudent2018n());
				// data.print(data.getStudent2019n());
				// data.print(data.getStudent2018p());
				// data.print(data.getStudent2019p());

				break;

			case 2:
				data.Insert();
				data.Studentsconection();
				System.out.println("\n\n");

				break;

			case 3:

				System.out.println("Από ποια τάξη θέλετε να διαγράψετε τον μαθητή;");
				System.out.println("Πατήστε 1 για νήπιο");
				System.out.println("Πατήστε 2 για προνήπιο");
				System.out.println("Πατήστε 7 για έξοδο");
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

				if (choose != 7) {

					System.out.println("Εισάγεται το id του μαθητή που θέλετε να διαγράψετε.");
					int deleteid = sc.nextInt();

					System.out.println(
							"Είστε σίγουροι πως θέλετε να διαγράψετε τον μαθητή;\nΕάν Ναι πατήστε 1 αλλιώς Πατήστε 2!");
					int del = sc.nextInt();
					if (del == 1) {
						data.Delete(deleteid, choose);
					} else {
						System.out.println("Χαιρόμαστε που θα συνεχίσετε μαζί μας!");
					}
				} else
					System.out.println("Επιλέξατε έξοδο!\n\n");

				break;
			case 4:
				yearsInfo(data, sc);
				System.out.println("\n\n");
				break;
			case 5:

				data.infoTeacher();
				System.out.println("\n\n");
				break;
			case 6:
				System.out.println("Εισάγεται το ΑΜΚΑ του δασκάλου που θέλετε να δείτε τα στοιχεία.");
				System.out.println("Σε περίπτωση επιθυμίας εξόδου πατήστε 7.");
				while (!sc.hasNextInt()) {
					String input = sc.next();
					System.out.println(" Η εισαγωγή σας(" + input
							+ ")δεν είναι σωστή!Παρακαλώ εισάγεται το ΑΜΚΑ ή επιλέξτε 7 για έξοδο.");
				}
				int AMKA = sc.nextInt();
				if (AMKA == 7) {
					System.out.println("Επιλέξατε έξοδο!");
				} else {
					
					data.findTeacher(AMKA);
					System.out.println("\n\n");
				}
				break;
			case 7:
			default:
				System.out.println("Επιλέξατε έξοδο!Ελπίζουμε να σας ξαναδούμε σύντομα!");
				return;

			}

		}
	}

	private static void mainMenu() {
		System.out.println("~~~~~~~~~~ Μενού Επιλογών ~~~~~~~~~~");
		System.out.println("1. Εκτύπωση όλων των μαθητών που έχουν φοιτήσει στο σχολείο.");
		System.out.println("2. Εγγραφή νέου μαθητή στην τρέχουσα σχολική χρονιά.");
		System.out.println("3. Διαγραφή μαθητή από την τρέχουσα σχολική χρονιά.");
		System.out.println("4. Αναζήτηση στοιχείων σχολικής χρονιάς.");
		System.out.println("5. Αναζήτηση τάξεων που έχει αναλάβει κάθε δάσκαλος του σχολείου.");
		System.out.println("6. Αναζήτηση στοιχείων δασκάλου μέσω ΑΜΚΑ.");
		System.out.println("7. Εάν θέλετε να αποχωρήσετε.");
		System.out.println("Εισάγετε επιλογή [1-6] :");
	}

	private static void yearsInfo(CreateData data, Scanner sc) {
		System.out.println("Για ποια χρονιά επιθυμείτε να δείτε τα στοιχεία.");
		System.out.println("Πατήστε 2019 για το 2019-2020.");
		System.out.println("Πατήστε 2018 για το 2018-2019.");
		System.out.println("Πατήστε 7 σε περίπτωση επιθυμίας εξόδου.");
		System.out.println("Eπιλέξτε τον αντίστοιχο αριθμό.");

		while (!sc.hasNextInt()) {
			String input = sc.next();
			System.out.println(" Η εισαγωγή σας(" + input
					+ ")δεν είναι αριθμός!Παρακαλώ επιλέξτε μια από τις διαθέσημες επιλογές 1,2 και 7.");
		}

		int option = sc.nextInt();
		while (option != 2019 && option != 2018 && option != 7) {
			System.out.println(
					"Δεν υπάρχουν στοιχεία για την συγκεκριμένη χρονιά!Επιλέξτε κάποια από τις διαθέσημες χρονιές!");
			option = sc.nextInt();
		}
		data.Studentsprint(option);
	}

}

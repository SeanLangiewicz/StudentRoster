import java.util.ArrayList;


public class Roster
	{

		static ArrayList<Student> myStudentList = new ArrayList<>();

		public static void main(String[] args)
			{
				add("1", "John", "Smith", "John1989@gmail.com", 20, 88, 79, 59);
				add("2", "Suzan", "Erickson", "Erickson_1990@gmailcom", 19, 91, 72, 85);
				add("3", "Jack", "Napoli", "The_Lawyer99yahoocom", 19, 85, 84, 87);
				add("4", "Eric", "Black", "Eric.black@comcast.net", 22, 91, 92, 82);
				add("5", "Sean", "Langiewicz", "slangie@wgu.edu", 28, 99, 87, 78);

				/*
				 * Extra printout method calls to add extra spacing in between method calls.
				 */

				print_all();
				System.out.println();
				print_invalid_emails();
				// System.out.println();
				print_average_grade("3");
				System.out.println();
				remove("3");
				remove("3");
				
			}

		private static void add(String id, String firstName, String lastName, String emailAddress, int age,
				double grade1, double grade2, double grade3)
			{
				double[] grades =
					{ grade1, grade2, grade3 };
				Student newStudent = new Student(id, firstName, lastName, emailAddress, age, grades);
				myStudentList.add(newStudent);

			}

		public static void print_all()
			{
				// Loop through ArrayList called myStudentList
				for (int i = 0; i < myStudentList.size(); i++)
					{
						// Get each student and call print method
						myStudentList.get(i).print();
					}
			}

		// Loops through the Array List and locates the grades for each student then
		// calculates the average.
		public static void print_average_grade(String StudentID)
			{
				for (Student s : myStudentList)
					{
						if (s.getID().equals(StudentID))
							{
								final int GRADE_COUNT = 3;
								double gradeOne = s.getGrades()[0];
								double gradeTwo = s.getGrades()[1];
								double gradeThree = s.getGrades()[2];
								String name = s.firstName + " " + s.lastName;

								// Takes the 3 student grades and divides from the grade count, which is set to
								// 3 grades
								double average = (gradeOne + gradeTwo + gradeThree) / GRADE_COUNT;
								System.out.printf("The grade point average for " + name + " is: %.2f", average);
							}
					}

			}

		// Removes a student by the student ID string that is passed in
		public static void remove(String StudentID)
			{
				for (Student s : myStudentList)
					{
						if (s.getID().equals(StudentID))
							{
								String name = s.firstName + " " + s.lastName;
								/**
								 * //Takes the String ID and parses it to an integer //Then subtracts 1 from it
								 * to remove it from the list On a second pass, the student ID is no longer in
								 * the list and the function prints out that the student is not in the list.
								 **/
								int removeID = 0;
								removeID = Integer.parseInt(StudentID) - 1;
								myStudentList.remove(removeID);

								System.out.println(name + " was removed from the list");
								return;
							}

					}
				System.out.println("Student with the ID of " + StudentID + " is not found");
			}

		/*
		 * Method searches for any ".", "@" or white spaces in the email address If a
		 * "." or a "@" is missing or if a white space is detected, method prints out
		 * the invalid email address
		 * 
		 * posOfPeriod has the value of -1 if a period is not found in the email address
		 * posOfAtSign has the value if -1 if an @ sign is not found in the email address
		 * Whitespace returns the value of the location of the white space found in the email address. Should have the value of -1
		 * if no white space is found. If the value is greater than -1, a white space is found and an invalid address is reported.
		 */
		public static void print_invalid_emails()
			{

				for (Student s : myStudentList)
					{
						String emailAddress = s.emailAddress;
						String name = s.firstName + " " + s.lastName;

						int posOfPeriod = emailAddress.indexOf(".");
						int posOfAtSign = emailAddress.indexOf("@");
						int whiteSpace = emailAddress.indexOf(" ");
						
						if (posOfAtSign <= 0 || posOfPeriod <= 0 || whiteSpace >= 0)
							{
								System.out.println(name + " Has an invalid email account of " + emailAddress);
							}

					}
			}
	}

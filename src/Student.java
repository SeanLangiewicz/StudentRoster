public class Student
	{

		String id;
		String firstName;
		String lastName;
		String emailAddress;
		int age;
		double [] grades;
		
		public Student(String id, String firstName, String lastName, String emailAddress, int age, double [] grades)
		{
			setID(id);
			setFirstName(firstName);
			setLastName(lastName);
			setEmailAddress(emailAddress);
			setAge(age);
			setGrades(grades);
		}
		// Setters and getters for the student's ID, first name, last name, email address, age and grades.
		public String getID ()
			{
				return id;
			}
		public void setID(String id)
			{
				this.id = id;
			}
		public String getFirstName()
			{
				return firstName;
			}
		public void setFirstName(String firstName)
			{
				this.firstName = firstName;
			}
		
		public String getLastName()
			{
				return lastName;
			}
		public void setLastName(String lastName)
			{
				this.lastName = lastName;
			}
		public String getEmailAddress()
			{
				return emailAddress;
			}
		public void setEmailAddress(String emailAddress)
			{
				this.emailAddress = emailAddress;
			}
		public int getAge()
			{
				return age;
			}
		public void setAge(int age)
			{
				this.age = age;
			}
		public double []getGrades()
			{
				return grades;
			}
		public void setGrades(double [] grades)
			{
				this.grades = grades;
			}
		
		// Prints all student information
		public void print()
			{
				String fullName = getFirstName() + " "+getLastName();
				System.out.println("Student: \t"+ fullName);
				System.out.println("Student ID: \t" + getID() + " \nFirst Name:\t" +getFirstName() + "\nLast Name:\t" + getLastName()
				+ "\nEmail Address:\t" + getEmailAddress() + "\nGrade1: \t" + getGrades()[0] + " \nGrade2: \t" + getGrades()[1]+ 
				" \nGrade3: \t" + getGrades()[2]);
				System.out.println();
				
				}
	}

package JavaTutorialForBeginners.Array;

public class DemoStudentArrayOfObjects {

	public static void main(String[] args) {
		
		StudentArrayOfObjects student1 = new StudentArrayOfObjects(); 
		/*StudentArrayOfObjects Student1 = new StudentArrayOfObjects();
		we know Student1 is reference and new StudentArrayOfObjects() is object.
			and Student1 hold reference of StudentArrayOfObject object.*/
		
		student1.rollnumber = 1;
		student1.name = "Suzana";
		student1.marks = 14;
		
		StudentArrayOfObjects student2 = new StudentArrayOfObjects(); 
		student2.rollnumber = 2;
		student2.name = "Marina";
		student2.marks = 65;
		
		StudentArrayOfObjects student3 = new StudentArrayOfObjects(); 
		student3.rollnumber = 3;
		student3.name = "Carey";
		student3.marks = 14;
		
		//...similarly whenever we create array of object
		StudentArrayOfObjects students[]= new StudentArrayOfObjects[3]; //We manually create the object and asign or add it to student
		//it means we can create an array of StudentArrayOfObjects reference type which can hold 3 different reference of StudentArrayOfObjects object.
		//All the object Student1, Student2,Student3 they will become a part of this array (students)
		students[0] = student1;
		students[1] = student2;
		students[2] = student3;
		
		for (int i = 0; i < students.length; i++) {
			System.out.println(students[i].name + " : " + students[i].marks );
		}
		
		System.out.println("***********");
		for(StudentArrayOfObjects stud : students) {
			System.out.println(stud.name + " : " + stud.marks);
		}
		
		
		
	}

}

class Student
{
	private int rollno;
	private string name;

	public int getRollno()
	{
		return rollno;
	}
	public void setRollno(int rollno)
	{
		this.rollno=rollno = rollno;
	}
	public void setName(String name)
	{
		this.name = name;
	}
}

public class StudentData
{
	public static void main(String[] args)
	{
		Student s1 = new Student();
		s1.setRollno(10121810007);
		s1.setName("Shankar");
		
		system.out.println(s1.getRollno());
		system.out.println(s1.getName());
	}
}


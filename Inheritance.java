class calculator
{
	public int add(int a,int b)
	{
		return a+b;
	}
}

class calculator1 extends calculator
{
	public int sub(int a, int b)
	{
		return a-b;
	}
}

class calculator2 extends calculator1
{
	public int multi(int a, int b)
	{
		return a*b;
	}
}

public class inheritance
{
	public static void main(string[] args)
	{
		calculator2 c1 = new calculator2();
		int result1 = c1.add(1,2);
		int result2 = c1.sub(3,2);
		int result3 = c1.multi(1,2);

		system.out.println(result1);
		system.out.println(result2);
		system.out.println(result3);
	}
}
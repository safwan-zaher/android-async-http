class file2
{
	private String name;
	file2()
	{
		name = "student";
	}
	public String getname()
	{
		return name;
	}
	public void setname(String n)
	{
		name = n;
	}
}

public class file1
{
	public static void main(String[] args) {
		file2 f = new file2();
		f.setname("teacher");
		System.out.println(f.getname());
	}
}
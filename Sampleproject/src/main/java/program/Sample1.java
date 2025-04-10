package program;

public class Sample1 {
String Value;
	String Name;
	
	public Sample1(String Value) {
	Name=Value;
}
	public void show()
	{
		System.out.println(Name);
	}
	public static void main(String[] args) {
		
Sample1 obj=new Sample1("Hai");
obj.show();
	}

}

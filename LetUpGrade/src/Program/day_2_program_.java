package Program;


class employee 
{

	String Name;
	int Age;
	String City;
	
	void Disp() {
		
		System.out.println("The Name is "+Name);
		System.out.println("The Age is "+Age);
		System.out.println("The City is "+City);
	}
}


public class day_2_program_ {
	
public static void main(String[] args) {
		
        employee e1 = new employee();
		employee e2 = new employee();
		
		e1.Name="Jairaj";
		e1.Age=19;
		e1.City="Nagpur";
		e1.Disp();
		
	}


}

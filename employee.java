import java.util.Scanner;

public class Employee {
	String yoj,name,adress;
	int number=3;
	void read() {
	Scanner in=new Scanner(System.in);
	
	System.out.println("Enter name of Employee");
	name=in.nextLine();
	System.out.println("Enter the year of joining of employee");
	yoj=in.nextLine();
	System.out.println("Enter the address of employee");
	adress=in.nextLine();
		
	}
	void display() {
		System.out.printf("%20-s, %20-s, %20-s","name","year of joining","address");
		System.out.printf("%20-s, %20-s, %20-s",name,yoj,adress);
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	Employee e[]=new Employee[3];
	for (int i=0;i<3;i++) {
		e[i]=new Employee();
		e[i].read();
	}	
	for(int i=0;i<3;i++) {
		e[i].display();
	}
		
	
	
	}
}


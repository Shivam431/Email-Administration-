package emailApp;

import java.util.Scanner;

public class EmailApp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Enter employee name: ");
		Scanner sc=new Scanner(System.in);
		String fn=sc.next();
		String ln=sc.next();
        Email em1=new Email(fn,ln);
       System.out.println( em1.showInfo());
	}

}

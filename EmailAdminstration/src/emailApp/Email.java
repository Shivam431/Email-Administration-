package emailApp;

import java.util.Scanner;

public class Email {
	private String firstname;
	private String lastname;
	private String dept;
	private String email;
	private int mailboxcapacity=500;
    private String password;
    private String alternateemail;
    private String companyname="company.com";
    
   public  Email(String firstname,String lastname )
   {
	   this.firstname=firstname;
	   this.lastname=lastname;
	 //  System.out.println("EMAIL CREATED :"+this.firstname+" "+this.lastname);
	   this.dept=setDept();
	  // System.out.println("Department :"+this.dept);
	   email=firstname.toLowerCase()+"."+lastname.toLowerCase()+"@"+this.dept+"."+companyname;
	  // System.out.println("Email: "+email);
	   this.password=randomPassword(8);
	   //System.out.println("password is: "+this.password);
	   

   }
   
   private  String setDept() {
	   System.out.println("Department Codes\n1 for sales\n2 for IT\n3 for accounting\n Enter Department Code: ");
	   Scanner sc=new Scanner(System.in);
	   int choice=sc.nextInt();
	   if(choice ==1)
	   {
		   return "sales";
	   }
	   else if(choice ==2)
	   {
		   return "IT";
	   }
	   else
	   {
		   return "accounting";
	   }
   }
   
   private String randomPassword(int length)
   {
	   String passwordset="ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz1234567890!@#$%&";
	   char[] password=new char[length];
	   for(int i=0;i<length;i++)
	   {
		   int rand=(int)(Math.random()*passwordset.length());
		   password[i]=passwordset.charAt(rand);
	   }
	   return new String(password);
   }
   
   public void capacity(int capacity)
   {
	   this.mailboxcapacity=capacity;
   }
   
   public void alterEmail(String email)
   {
	   this.alternateemail=email;
   }
   
   public void changePassword(String Password)
   {
	   this.password=Password;
   }
   
   public int getCapacity() {
	   return mailboxcapacity;
   }
   
   public String getAlterEmail() {
	   return alternateemail;
   }
   
   public String getPassword() {
	   return password;
   }
   
   public String showInfo()
   {
	   return "DISPLAY NAME: "+firstname+" "+lastname+"\nEMAIL: "+email+"\nPASSWORD IS: "+password+"\nMAILBOX CAPACITY: "+mailboxcapacity+" mb";
   }

}

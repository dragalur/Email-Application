import java.util.Scanner;

public class Email {

	private String firstName;	
	private String lastName;
	private String department;
	private String password;
	private String email;
	private int mailCapasiti=500;
	private String alternativeEmail;
	private int length=10;
	
	
	Email(String firstName,String lastName){
		this.firstName=firstName;
		this.lastName=lastName;
		
		this.department=setDepartment();
		
		this.password=setPassword(length);
		System.out.println("Password : "+password);
		
		email=firstName.toLowerCase()+"."+lastName.toLowerCase()+"@"+department+".company.com";
	}
	
	private String setDepartment() {
		System.out.print("DEPARTMENT CODE:\n1 for Sales\n2 for Development \n3 for Accounting\n0 none\nEntered depatment code: ");
		Scanner sc=new Scanner(System.in);
		int choise=sc.nextInt();
		
			 if(choise==1) {return "sales";}
		else if(choise==2) {return "dev";}
		else if(choise==3) {return "acct";}
		else               {return "";}
}
	
	String setPassword(int length) {
		String elem="ZXCVBNMLKJHGFDSAQWERTYUIOP0987654321";
		char password[]=new char[length];
		for(int i=0; i< password.length;i++) {
			int index=(int)(Math.random()*elem.length());
			password[i]=elem.charAt(index);
		}
		return new String (password);
	}
	
	public void setCapasiti(int capasyti) {
		this.mailCapasiti=capasyti;
	}
	
	public void setAltEmail(String altEmail) {
		this.alternativeEmail=altEmail;
	}
	
	public void setChangePassword(String pas) {
		this.password=pas;
	}
	
	public int getCapasiti()   {return mailCapasiti;}
	public String getAltEmail() {return alternativeEmail;}
	public String getPassword() {return password;}
	
	public String showData() {
		return "DISPLAY NAME : "+firstName+" "+lastName
				+"\nCOMPANY EMAIL : "+email
				+"\nMAIL BOX CAPACITY : "+mailCapasiti+"mb";
		}
	
	
	
	
	
	
	
	
	
	
	
}